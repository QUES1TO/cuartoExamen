import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Datos extends JPanel implements ActionListener
{
    private JTextField nombre,apellido,añoNacimiento;
    private JButton guardar;
    private JLabel label,label2,label3;
    public Datos()
    {
        setLayout(null);
        setBounds(0,0,480,480);
        setVisible(true);
        
        setLayout(null);
        guardar = new JButton("Guardar");
        guardar.setBounds(100,250,200,45);
        guardar.addActionListener(this);
        add(guardar);
        
        nombre = new JTextField();
        apellido = new JTextField();
        añoNacimiento = new JTextField();
        nombre.setBounds(150, 80, 200, 40);
        apellido.setBounds(150, 135, 200, 40);  
        añoNacimiento.setBounds(150, 190, 200, 40);
        add(nombre);
        add(apellido);
        add(añoNacimiento);
        setBackground(Color.gray);
        
        label = new JLabel("NOMBRE");
        label.setBounds(60,0,200,200);
        label.setVisible(true);
        add(label);
        
        label2 = new JLabel("APELLIDO");
        label2.setBounds(60,60,200,200);
        label2.setVisible(true);
        add(label2);
        
        label3 = new JLabel("AÑO NACIMIENTO");
        label3.setBounds(30,105,200,200);
        label3.setVisible(true);
        add(label3);

    }
    public void actionPerformed(ActionEvent e)
    {        
        Object objeto = e.getSource();
        if(objeto == guardar)
        {
           label3.setVisible(false);
           label2.setVisible(false);
           label.setVisible(false);
           guardar.setVisible(false);
        }
        
    }  
}
