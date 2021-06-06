package Products.UserInterface;
import Products.Food;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMain extends  JFrame implements ActionListener {

    JFrame main;
    JButton sing;
    JButton exit;
    JLabel beginning;
    JLabel instructions;
    JPasswordField pas;

    /**
     * Verify admin
     * **/

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
        beginning.setBounds(100,15,400,150);

        instructions = new JLabel("Selecciona como deseas ingresar ");
        instructions.setBounds(170, 40,400,150);

        sing = new JButton("Administrador");
        sing.setBounds(20,320,180,60);

        exit = new JButton("Usuario");
        exit.setBounds(340,320,180,60);

        /**
         * Se agregan los item al contenedor
         * */
        getContentPane().add(beginning);
        add(instructions);
        getContentPane().add(sing);
        getContentPane().add(exit);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        /**
         * Creando comportamientos
         * */

        ActionListener sigIn = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String password = JOptionPane.showInputDialog(  "Ingrese la contraseña");
            VerifyAdmin.verifyPassword(password);
            setVisible(false);
            }
        };


        sing.addActionListener(sigIn);

    }

    public static void main(String[] args) {
        //Punto de entrada de aplicacion
        InterfaceMain menu = new InterfaceMain();
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
