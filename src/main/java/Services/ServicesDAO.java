package Services;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicesDAO  extends JFrame implements ActionListener {

    //Constructor
    public ServicesDAO(){

        //Formularios

        register();
        delete();



}


public void delete(){
    System.out.println("Hoa estas eliminando ");
}

 // Formulario registro
    public void register(){

        JLabel tittle,  cam1L, cam2L, cam3L, cam4L, cam5L;
        JTextField cam1T, cam2T, cam3T, cam4T, cam5T;
        JButton save;


        //Propiedades de  ventana

        setTitle("Registro mercancia");
        setLayout(null);
        setSize(800, 700);
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
        save.setBounds(450, 480,100,40);


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
        //Crea evento

        ActionListener saveD  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          if (!cam1T.equals("") )
          {

            String nameD = cam1T.getText();
              System.out.println(nameD);



          }


            }
        };


        //Asigna eventos


        save.addActionListener(saveD);



        setVisible(true);
        setLocationRelativeTo(null);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
