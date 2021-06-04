package Services;

import javax.swing.*;

public class ServicesProducts  extends JFrame {

    //Items
    JButton food, cleaninProducts;

    public ServicesProducts(){
    registroProduct();

}

    public void registroProduct(){
        setSize(400,200);
        setTitle("Productos");
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
    }

   }
