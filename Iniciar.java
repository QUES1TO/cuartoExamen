import javax.swing.*;
import java.awt.event.*;
public class Iniciar extends JFrame implements ActionListener
{
    private JButton boton;
    public Iniciar()
    {
        setLayout(null);
        setBounds(100,100,700,350);
        setVisible(true);
        
        boton = new JButton("INICIAR");
        boton.addActionListener(this);
        boton.setBounds(100,100,100,100);
        boton.setVisible(true);
        add(boton);
    }
    public void actionPerformed(ActionEvent e)
    {
       Object objeto = e.getSource();
    }
}
