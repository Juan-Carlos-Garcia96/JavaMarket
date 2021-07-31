package Products.UserInterface;

import javax.swing.*;

public class Categories extends JFrame {

    JLabel tittle, cat1, cat2, cat3, cat4,cat5;


    public Categories(){
        setSize(300,300);
        setResizable(false);
        setLayout(null);


        tittle = new JLabel("Categorias permitidas");
        tittle.setBounds(100,20,40,30);


        cat1 = new JLabel("Abarrotes");
        cat1.setBounds(40,40,200,30);

        cat2 = new JLabel("Dulceria");
        cat2.setBounds(40,80,200,30);

        cat3 = new JLabel("Limpieza");
        cat3.setBounds(40,120,200,30);


        add(tittle);
        add(cat1);
        add(cat2);
        add(cat3);

        setLocationRelativeTo(null);
        setVisible(true);
    }


}
