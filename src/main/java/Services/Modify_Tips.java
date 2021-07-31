package Services;

import Products.Food;
import Products.UserInterface.Categories;
import ServicesDao.Dao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modify_Tips  extends JFrame  implements ActionListener {


    public Modify_Tips() {

    }

    /**
     * @param option es un valor recivido de la pantalla
     *               ServiceDao el cual depende de que se necesita modificar
     **/

    public Modify_Tips(int option, int id) {

        switch (option) {

            case 1:
                modName(id);
                break;
            case 2:
                modifyType(id);
                break;
        }


    }

    //Se recibe un valor string el cual es el id, proporcionado por la clase Service Dao
    public void modName(int idDate) {

        //********************************* PROPIEDADES DE MODIFICANDO NAME ************
        setSize(600, 300);
        setResizable(false);
        setLayout(null);

        JLabel tittle, nameL;
        JButton save, del;
        JTextField date;

        //Dimensiones de elementos

        tittle = new JLabel("Modificando el nombre");
        tittle.setBounds(150, 30, 400, 30);

        nameL = new JLabel("Ingresa el nombre a colocar");
        nameL.setBounds(30, 60, 300, 30);

        date = new JTextField();
        date.setBounds(200, 60, 200, 30);

        save = new JButton("Guardar");
        save.setBounds(200, 100, 200, 30);


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


                //Se convierte a entero el valor de id recibido
                System.out.println("Id a actualizar: " + idDate);

                //Se toma el valor del textField del nuevo nombre, de esta pantalla

                String nameUpdate = date.getText();
                Food updateName = new Food(0, "q", "q", 0, 1, "w");


                //Se asignan valores a clase Food
                updateName.setId(idDate);
                updateName.setName(nameUpdate);

                //Se envia informacion a clase DAO para enviar a base de datos
                Dao.updateName(updateName);


                JOptionPane.showMessageDialog(null, "Registro Exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
            }
        };

        save.addActionListener(saves);

    }

    public void modifyType(int id) {

        //********************************* PROPIEDADES DE MODIFICANDO Tipo ************
        setSize(600, 300);
        setResizable(false);
        setLayout(null);

        JLabel tittleU, nameLU;
        JButton saveU, info;
        JTextField dateU;


        tittleU = new JLabel("Modificando el tipo");
        tittleU.setBounds(150, 30, 400, 30);

        nameLU = new JLabel("Ingresa el tipo a modificar");
        nameLU.setBounds(30, 60, 300, 30);

        dateU = new JTextField();
        dateU.setBounds(200, 60, 200, 30);

        saveU = new JButton("Guardar");
        saveU.setBounds(100, 200, 200, 30);

        info = new JButton("Categorias");
        info.setBounds(320,200,200,30);

        // Aadiendol al contenedor
        add(tittleU);
        add(nameLU);
        add(dateU);
        add(saveU);
        add(info);

        setLocationRelativeTo(null);
        setVisible(true);


        /**
         * Creando evento de guardar moldificaciones en tipo
         * */

        ActionListener saveTipo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /**
                 * @param modType es una variable que recibe el valor ingresado en el text field
                 *                llamado nameLU
                 * */

                String modType = dateU.getText();


                if(e.getSource()== saveU){

                    Food foodType = new Food(0, "q", "q", 0, 1, "w");
                    int idType = id;
                    foodType.setType(modType);
                    foodType.setId(idType);

                    Dao.updatetype(foodType);
                    JOptionPane.showMessageDialog(null, "Registro Exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);

                }

            }


        };


        ActionListener cate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Categories cat = new Categories();

            }
        };
        saveU.addActionListener(saveTipo);
        info.addActionListener(cate);
    }



    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
