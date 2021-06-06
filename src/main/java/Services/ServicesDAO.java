package Services;

import javax.swing.*;

public class ServicesDAO  extends JFrame {

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


        // Definiendo dimenciones de items


        tittle = new JLabel("INGRESA LOS DATOS PARA REGISTRAR");
        tittle.setBounds(250,20,400,40);

        cam1L = new JLabel("Ingresa el nombre del producto");
        cam1L.setBounds(10,50, 400,30);

        cam2L = new JLabel("Ingresa la descripcion del producto");
        cam2L.setBounds(10,100, 400,30);

        cam3L = new JLabel("Ingresa el precio");
        cam3L.setBounds(10,150, 400,30);

        cam4L = new JLabel("Ingresa la cantidad");
        cam4L.setBounds(10,200, 400,30);

        cam5L = new JLabel("Ingresa el tipo");
        cam5L.setBounds(10,250, 400,30);




        //Agregando items al contenedor

        add(tittle);
        add(cam1L);
        add(cam2L);
        add(cam3L);
        add(cam4L);
        add(cam5L);


        //Crea evento



        //Asigna eventos






        setVisible(true);
        setLocationRelativeTo(null);



    }


}
