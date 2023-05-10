import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Datos extends JPanel implements ActionListener
{
    private JTextField nombre,apellido,añoNacimiento;
    private JButton guardar, registrar;
    private String dato1,dato2,dato3;
    private JLabel label,label2,label3,label4,label5,label6,label7;
    private JPanel panel,panel2,panel3,panel4;
    private ImageIcon imagen1;
    public Datos()
    {
        setLayout(null);
        setBounds(0,0,480,480);
        setVisible(true);
        
        setLayout(null);
        guardar = new JButton("GUARDAR");
        guardar.setBounds(100,250,200,45);
        guardar.addActionListener(this);
        guardar.setVisible(true);
        add(guardar);
        
        registrar = new JButton("REGISTRAR");
        registrar.setBounds(100,250,200,45);
        registrar.addActionListener(this);
        registrar.setVisible(false);
        add(registrar);
        
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
        
        label4 = new JLabel();
        label4.setBounds(150, 80, 200, 40);
        label4.setVisible(true);
        add(label4);
        
        label5 = new JLabel();
        label5.setBounds(150, 135, 200, 40);
        label5.setVisible(true);
        add(label5);
        
        label6 = new JLabel();
        label6.setBounds(150, 190, 200, 40);
        label6.setVisible(true);
        add(label6);
        
        panel=new JPanel();
        panel.setBounds(150, 80, 200, 40);
        panel.setVisible(false);
        panel.setBackground(Color.white);
        add(panel);
        
        panel2=new JPanel();
        panel2.setBounds(150, 135, 200, 40);
        panel2.setVisible(false);
        panel2.setBackground(Color.white);
        add(panel2);
        
        panel3=new JPanel();
        panel3.setBounds(150, 190, 200, 40);
        panel3.setVisible(false);
        panel3.setBackground(Color.white);
        add(panel3);

         imagen1 = new ImageIcon(getClass().getResource("imagen1.jpg"));
        
        label7=new JLabel();
        label7.setBounds(5,5,395,395);
        label7.setVisible(false);
        add(label7);
        
        establecerImagen(imagen1);
        
        panel4=new JPanel();
        panel4.setBounds(0,0,410,400);
        panel4.setVisible(false);
        panel4.setBackground(Color.black);
        add(panel4);
    }
     public void establecerImagen(ImageIcon imagen)
    {
        label7.setIcon(imagen1);
    }
    public void actionPerformed(ActionEvent e)
    {        
        Object objeto = e.getSource();
        if(objeto == guardar)
        {
            dato1=this.nombre.getText();
            label4.setText(label4.getText()+dato1);
            panel.setVisible(true);
            nombre.setVisible(false);
            
            dato2=this.nombre.getText();
            label5.setText(label5.getText()+dato2);
            apellido.setVisible(false);
            panel2.setVisible(true);
            
            dato3=this.nombre.getText();
            label6.setText(label6.getText()+dato3);
            añoNacimiento.setVisible(false);
            panel3.setVisible(true);
            
            guardar.setVisible(false);
            registrar.setVisible(true);
            label7.setVisible(true);
            panel4.setVisible(true);
        }
        if (objeto == registrar)
        {
            nombre.setVisible(true);
            apellido.setVisible(true);
            añoNacimiento.setVisible(true);
            guardar.setVisible(true);
          
            
            panel.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            
            label7.setVisible(false);
            panel4.setVisible(false);
            
        }
        
    }  
}
