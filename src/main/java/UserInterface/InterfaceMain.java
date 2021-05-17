package UserInterface;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class InterfaceMain extends  JFrame {

    JFrame main;
    JButton sing;
    JButton exit;
    JLabel beginning;


    public InterfaceMain() {

        /***
         * Se crea interface de usuario, Menu de bienvenida
         * */
        setTitle("Java Market Administrator");
        setSize(600,900);
        setLayout(null);
        setLocationRelativeTo(null);

        beginning = new JLabel("Bienvenido a Java Market\n te ayudamos a administrar tu inventario");
        beginning.setBounds(100,15,400,100);


        getContentPane().add(beginning);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        InterfaceMain menu = new InterfaceMain();
    }
}
