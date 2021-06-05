package Services;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options extends JFrame implements ActionListener {

    //Items
    JLabel title;
    JButton save, update, delete, query, insert;


    public Options(){
        actions();


    }

    public void actions(){
        setSize(700,700);
        setTitle("Registro Mercancia");
        setLayout(null);

        /**
         * Se definen dimenciones de los botones para eligir la operacion
         * */

        title = new JLabel("Que desa realizar hoy");
        title.setBounds(250,15,300,100);
        add(title);


        update = new JButton("ACTUALIZAR PRODUCTOS");
        update.setBounds(200,150,300,40);
        add(update);
        update.addActionListener(btnValidate);

        delete = new JButton("ELIMINAR PRODUCTOS");
        delete.setBounds(200,200,300,40);
        add(delete);
        delete.addActionListener(btnValidate);

        insert = new JButton("INSERTAR PRODUCTOS");
        insert.setBounds(200,260,300,40);
        add(insert);
        insert.addActionListener(btnValidate);

        query = new JButton("CONSULTA DE ARTICULOS");
        query.setBounds(200,310,300,40);
        add(query);
        query.addActionListener(btnValidate);


        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Comportamiento de los botones
    ActionListener btnValidate = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == insert){
                ServicesProducts services = new ServicesProducts();

                setVisible(false);

            }
            if(e.getSource() == update){
                ServicesProducts services = new ServicesProducts();

                setVisible(false);
                int op = 2;
            }
            if(e.getSource() == delete){
                ServicesProducts services = new ServicesProducts();

                setVisible(false);
            }
            if (e.getSource() == query){
                ServicesProducts services = new ServicesProducts();

                setVisible(false);
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

