package Services;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicesProducts  extends JFrame {

    //Items
    JButton food, cleaninProducts;
    int opType = 0;

    public ServicesProducts(){


}

    public void electionProducts(){

        //Pantalla de eleccion a ingresar
        setSize(400,200);
        setTitle("PRODUCTOS A TRANAJAR ");
        setLayout(null);

        food = new JButton("Abarrotes");
        food.setBounds(30,30, 100, 30);
        add(food);

        cleaninProducts =  new JButton("Limpieza");
        cleaninProducts.setBounds(180,30,150,30);
        add(cleaninProducts);

        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Evento al seleccionar

        ActionListener menuEvent =  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == food){
                Options operaciones = new Options();

                setVisible(false);

                }
            }
        };

        /**
         * Asignacion de eventos a botones
         * */
            food.addActionListener(menuEvent);



    }

    }
