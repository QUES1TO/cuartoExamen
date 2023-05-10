import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Iniciar extends JFrame implements ActionListener
{
    private JButton boton;
    private Datos datos;
    private JLabel label;
    private ImageIcon imagen1;
    private JPanel panel;
    public Iniciar()
    {
        setLayout(null);
        setBounds(0,0,480,480);
        setVisible(true);
        
        boton = new JButton("INICIAR");
        boton.addActionListener(this);
        boton.setBackground(Color.orange);
        boton.setBounds(150,170,100,30);
        boton.setVisible(true);
        add(boton);
        
        datos = new Datos();
        datos.setVisible(false);
        add(datos);
        
        imagen1 = new ImageIcon(getClass().getResource("imagen7.jpg"));
        
        label=new JLabel();
        label.setBounds(5,5,395,395);
        label.setVisible(true);
        add(label);
        
        establecerImagen(imagen1);
        
        panel=new JPanel();
        panel.setBounds(0,0,410,400);
        panel.setVisible(true);
        panel.setBackground(Color.black);
        add(panel);
    }
    public void establecerImagen(ImageIcon imagen)
    {
        label.setIcon(imagen1);
    }
   public static void main(String[] args){
        Iniciar i = new Iniciar();
    }
    public void actionPerformed(ActionEvent e)
    {
       Object objeto = e.getSource();
       if(objeto == boton)
       {
           boton.setVisible(false);
           datos.setVisible(true);
           label.setVisible(false);
           panel.setVisible(false);
       }
    }
}
