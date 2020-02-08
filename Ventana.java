import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
public class Ventana extends JFrame implements ActionListener
{
    private JLabel texto;                  
    private JButton boton;
    
    public Ventana()
    {
    	super();                    
        configurarVentana();        
        inicializarComponentes();
    }
    
    private void configurarVentana()
   	{
   		this.setTitle("Practica1_1");                   
        this.setSize(350, 300);                                
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes()
    {
        texto = new JLabel();
        boton = new JButton(); 
           
        texto.setText("ERNESTO DIAZ MADRIGAL\n N");    
        texto.setBounds(50, 120, 200, 25);  
        boton.setText("Mensaje");   
        boton.setBounds(70, 150, 250, 30);  
        boton.addActionListener(this);       
        this.add(texto);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "No. Control\n 181160174 \nDireccion: San isidro limon \nTelefono: 9581190995. \nGenero: Masculino");
    }
    
    public static void main(String[] args) {
    	
    	Ventana V=new Ventana();
    	V.setVisible(true);
    }
}