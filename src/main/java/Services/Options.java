package Services;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options extends JFrame implements ActionListener {

    //Items
    JLabel title;
    JButton save, update, delete, query, insert;


    //Constructor

    public Options() {



            setSize(700,700);
            setTitle("Registro Mercancia");
            setLayout(null);

            /**
             * Se definen dimenciones de los botones para eligir la operacion
             * */

            title = new JLabel("Que desa realizar hoy");
            title.setBounds(250,15,300,100);
            add(title);


            insert = new JButton("INSERTAR PRODUCTOS");
            insert.setBounds(200,260,300,40);
            getContentPane().add(insert);


            update = new JButton("ACTUALIZAR PRODUCTOS");
            update.setBounds(200,150,300,40);
            add(update);


            delete = new JButton("ELIMINAR PRODUCTOS");
            delete.setBounds(200,200,300,40);
            add(delete);



            query = new JButton("CONSULTA DE ARTICULOS");
            query.setBounds(200,310,300,40);
            add(query);




            //Comportamiento de los botones
            ActionListener btnValidate = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(e.getSource() == insert){
                        String in = "ins";
                        ServicesDAO servRegis = new ServicesDAO(in);
                        servRegis.register();
                        setVisible(false);

                    }
                    if(e.getSource() == update){
                        String update = "update";
                        ServicesDAO servUpdate = new ServicesDAO(update);
                        servUpdate.modify();
                        setVisible(false);
                    }

                    //Al momento de oprimir acualizar direcciona a la clase
                    //Service DAO
                    if(e.getSource() == delete){
                        String del = "del";
                        ServicesDAO servRegis = new ServicesDAO(del);
                        servRegis.delete();
                        setVisible(false);

                    }
                    if (e.getSource() == query){


                        setVisible(false);
                    }
                }
            };

            /***
             * Se asignan eventos a los botones
             * */


            query.addActionListener(btnValidate);
            update.addActionListener(btnValidate);
            delete.addActionListener(btnValidate);
            insert.addActionListener(btnValidate);


            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }







    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
