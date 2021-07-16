package Services;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modify_Tips  extends JFrame  implements ActionListener {


    public Modify_Tips(){

    }

    /**
     * @param option  es un valor recivido de la pantalla
     *                ServiceDao el cual depende de que se necesita modificar
     * **/

    public Modify_Tips(int option){

        switch (option){

            case 1: modName();
        }


    }


    public   void modName(){

        //********************************* PROPIEDADES DE MODIFICANDO NAME ************
        setSize(600, 300);
        setResizable(false);
        setLayout(null);

        JLabel tittle, nameL;
        JButton save, del;
        JTextField date;

        //Dimensiones de elementos

        tittle = new JLabel("Modificando el nombre");
        tittle.setBounds(150,30,400,30);

        nameL = new JLabel("Ingresa el nombre a colocar");
        nameL.setBounds(30,60,300,30);

        date = new JTextField();
        date.setBounds(200,60,200,30);

        save = new JButton("Guardar");
        save.setBounds(200,100, 200,30);


        // Aadiendol al contenedor
        add(tittle);
        add(nameL);
        add(date);
        add(save);


        setLocationRelativeTo(null);
        setVisible(true);


        ActionListener saves = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Registro Exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
            }
        };

        save.addActionListener(saves);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
