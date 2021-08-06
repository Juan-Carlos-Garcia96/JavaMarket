package Services;

import Products.Food;
import ServicesDao.Dao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Interfaces donde se ejecutan las acciones de eliminar, modificar, registrar y consultar
 * */


public class ServicesDAO  extends JFrame implements ActionListener {
    String election;
    //Constructor
    public ServicesDAO( String election){


        //Formularios

        if(election == "in")
        {
            register();
        }if(election == "del")
        {
            delete();
        }if(election == "update"){
            modify();
        }

}

    // Ventana de registro
    public void register(){

        JLabel tittle,  cam1L, cam2L, cam3L, cam4L, cam5L;
        JTextField cam1T, cam2T, cam3T, cam4T, cam5T;
        JButton save,newArt;


        //Propiedades de  ventana

        setTitle("Registro mercancia");
        setLayout(null);
        setSize(900, 700);
        setResizable(false);


        // Definiendo dimenciones de items labels


        tittle = new JLabel("INGRESA LOS DATOS PARA REGISTRAR");
        tittle.setBounds(250,20,400,40);

        cam1L = new JLabel("Ingresa el nombre del producto");
        cam1L.setBounds(10,100, 400,30);

        cam2L = new JLabel("Ingresa la descripcion del producto");
        cam2L.setBounds(10,150, 400,30);

        cam3L = new JLabel("Ingresa el precio");
        cam3L.setBounds(10,200, 400,30);

        cam4L = new JLabel("Ingresa la cantidad");
        cam4L.setBounds(10,250, 400,30);

        cam5L = new JLabel("Ingresa el tipo");
        cam5L.setBounds(10,300, 400,30);

        // Definiendo dimenciones de items textField

        cam1T = new JTextField();
        cam1T.setBounds(300,100,400,30);
        cam1T.setBackground(Color.lightGray);


        cam2T = new JTextField();
        cam2T.setBounds(300,150,400,30);
        cam2T.setBackground(Color.lightGray);

        cam3T = new JTextField();
        cam3T.setBounds(300,200,400,30);
        cam3T.setBackground(Color.lightGray);


        cam4T = new JTextField();
        cam4T.setBounds(300,250,400,30);
        cam4T.setBackground(Color.lightGray);

        cam5T = new JTextField();
        cam5T.setBounds(300, 300,400,30);
        cam5T.setBackground(Color.lightGray);


        save = new JButton("Guardar articulo");
        save.setBounds(100, 480,300,40);

        newArt = new JButton("Registrar otro producto");
        newArt.setBounds(450,480,300,40);


        //Agregando items al contenedor

        add(tittle);
        add(cam1L);
        add(cam2L);
        add(cam3L);
        add(cam4L);
        add(cam5L);



        add(cam1T);
        add(cam2T);
        add(cam3T);
        add(cam4T);
        add(cam5T);


        add(save);
        add(newArt);
        //Crea evento

        ActionListener saveD  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cam1T.equals("") && !cam2T.equals("") && !cam3T.equals("") && !cam4T.equals("") && !cam5T.equals(""))
                {

                    //Se asigna el valor de cada campo a una variavle
                    String nameD = cam1T.getText();
                    String descD = cam2T.getText();
                    String pricD = cam3T.getText();
                    String picD = cam4T.getText();
                    String typeD = cam5T.getText();

                    //Se hace conversion de variables texo a enteros y decimales para almacenas en base

                    int piecesD = Integer.parseInt(picD);
                    Double pricesD = Double.parseDouble(pricD);


                    /**
                     * Se crea instancia de la clase Food para registro de productos
                     * */

                    Food foods = new Food(0,"q","q",0,1,"w");
                    foods.setName(nameD);
                    foods.setDescription(descD);
                    foods.setPices(piecesD);
                    foods.setPrices(pricesD);
                    foods.setType(typeD);


                    //Se envia a informacion a clase que envia a base de datos con el metodo altaProdcuts
                    Dao.altaProducts(foods);

                    JOptionPane.showMessageDialog(null,"Producto registrado correctamente","Exitoso", JOptionPane.INFORMATION_MESSAGE);



                }


            }
        };

        ActionListener deleteAll = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cam1T.setText("");
                cam2T.setText("");
                cam3T.setText("");
                cam4T.setText("");
                cam5T.setText("");

            }
        };


        //Asigna eventos


        save.addActionListener(saveD);

        newArt.addActionListener(deleteAll);



        setVisible(true);
        setLocationRelativeTo(null);



    }


    //ventana de delete
    public void delete(){
        JLabel  tittle,  info ;
        JTextField  data;
        JButton eliminar,clear;


        setTitle("Registro mercancia");
        setLayout(null);
        setSize(600, 300);
        setResizable(false);

        tittle = new JLabel("Eliminacion de articulos");
        tittle.setBounds(100,30,400,30);

        info = new JLabel("Ingresa el  id a eliminar ");
        info.setBounds(20,100,400,30);

        data = new JTextField();
        data.setBounds(450,100, 90, 30);

        eliminar = new JButton("ELIMINAR");
        eliminar.setBounds(50,200, 200,30);

        clear = new JButton("LIMPIAR");
        clear.setBounds(300,200,200,30);

        add(tittle);
        add(info);
        add(data);
        add(eliminar);
        add(clear);

        ActionListener del = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data1 = data.getText();

                if(e.getSource() == eliminar){
                    //conversion a enteros
                    int identify = Integer.parseInt(data1);

                    //instancia de la clase food
                    Food foods = new Food(0,"q","q",0,1,"w");
                    foods.setId(identify);

                    Dao.eliminaProduct(foods);
                    JOptionPane.showMessageDialog(null,"Borrado exitoso", "Eliminado BANG!!!",JOptionPane.WARNING_MESSAGE);


                }
                if(e.getSource() == clear){
                    data.setText("");
                }

            }
        };


        eliminar.addActionListener(del);
        clear.addActionListener(del);



     setVisible(true);
    setLocationRelativeTo(null);



}


    public void modify(){

    //elementos

    JLabel tittle , idL, instructions, tips;
    JTextField id, date;
    JButton save, del;

    //Propiedades de ventana

      setSize(600,400);
      setResizable(false);
      setLayout(null);

      /**
       * Ventana con opciones de modificar
       * esta ventana envia el id del producto a modificar asi como el tipo de modificacion
       * */


        tittle = new JLabel("Bienvenido a Modificar");
        tittle.setBounds(150,20,200,30);

        instructions = new JLabel("Ingresa el numero  necesites modificar\n 1. Nombre 2. Tipo, 3. Descripcion, 4.  Cantidad");
        instructions.setBounds(30,150, 500, 30);

        idL = new JLabel("Ingresa el id");
        idL.setBounds(15,100,200,30);

        id = new JTextField();
        id.setBounds(300, 100,100,30);

        tips = new JLabel("Accion : ");
        tips.setBounds(15, 190, 250, 30);

        date = new JTextField();
        date.setBounds(300,190, 100,30);

        save = new JButton("Modificar");
        save.setBounds(100,250,300,30);



        // Agregando elementos al contenedor

        add(id);
        add(idL);
        add(save);
        add(tittle);
        add(instructions);
        add(tips);
        add(date);

        ActionListener event = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /**
                 * Esta parte es la conversion del id quee es String a entero para asi enviarlo a la clase
                 * modify_tips para realizar el cambio
                 * */
                String idDate = id.getText();
                int idDates = Integer.parseInt(idDate);
                String dateS = date.getText();


                    if (!idDate.equals("") && !dateS.equals("")){

                        JOptionPane.showMessageDialog(null,"Vamos a modificar","Exitoso", JOptionPane.WARNING_MESSAGE);
                        System.out.println(idDate + " " + dateS );


                        /***
                         * Menu de opciones a modificar
                         */
                        Modify_Tips mod = new  Modify_Tips();


                        switch (dateS){
                            //Acciones  a realizar para modificar dependiendo
                            //dependiendo de las opciones a modificar
                            case "1":
                                mod.modName(idDates);
                                setVisible(true);
                                break;

                            case "2":
                                mod.modifyType(idDates);
                                setVisible(true);
                                break;

                            case "3":
                                mod.modDesc(idDates);
                                break;
                        }

                }else {
                        JOptionPane.showMessageDialog(null, "Lo siento te falta un dato", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
        };

        save.addActionListener(event);

      setVisible(true);
      setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
