package UserInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public   class Formularios  extends JFrame implements ActionListener {

    //Constrctor
    public Formularios(){
        setTitle("REGISTRO DE MERCANCIA");
        setSize(800,650);
        setLayout(null);


          resgistroMerca();


        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Formularia para alta de mercancia
    public    void resgistroMerca(){

        JButton save;
        JLabel titl, uno,dos,tres,cuatro;
        JTextField unoT, dosT, tresT, cuatroT;



        titl = new JLabel("REGISTRA PARA SU ALTA");
        titl.setBounds(200, 20, 400,30);
        add(titl);






    }

}
