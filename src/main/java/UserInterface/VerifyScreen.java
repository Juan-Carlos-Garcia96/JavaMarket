package UserInterface;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class VerifyScreen  extends  JFrame{

        JLabel textOne;

    VerifyScreen() {

        setTitle("Java Market Administrator");
        setSize(600, 900);
        setLayout(null);
        setLocationRelativeTo(null);

        textOne = new JLabel("HOLA");
        textOne.setBounds(40,40,90,40);

        getContentPane().add(textOne);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }


}
