package UserInterface;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMain extends  JFrame implements ActionListener {

    JFrame main;
    JButton sing;
    JButton exit;
    JLabel beginning;

    /**
     * Verify admin
     * **/
    JLabel admin;

    public InterfaceMain() {

        /***
         * Se crea interface de usuario, Menu de bienvenida
         * */
        setTitle("Java Market Administrator");
        setSize(600,900);
        setLayout(null);
        setLocationRelativeTo(null);




        /**Creacion de oobjetos
         * */
        beginning = new JLabel("Bienvenido a Java Market\n te ayudamos a administrar tu inventario");
        beginning.setBounds(100,15,400,100);

        sing = new JButton("Ingresar");
        sing.setBounds(20,300,180,60);

        exit = new JButton("Salir");
        exit.setBounds(340,300,180,60);

        /**
         * Se agregan los item al contenedor
         * */
        getContentPane().add(beginning);
        getContentPane().add(sing);
        getContentPane().add(exit);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        /**
         * Creando comportamientos
         * */

        ActionListener sigIn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            VerifyScreen very = new VerifyScreen();
            }
        };


        sing.addActionListener(sigIn);

    }

    public static void main(String[] args) {
        InterfaceMain menu = new InterfaceMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
