package Services;

import javax.swing.*;

public class Options extends JFrame {

    //Items
    JLabel title, nameT, descT,priceT,piecesT,typeT;
    JButton save;
    JTextField name , desc,price,  pieces, type;
    JTextArea descr;

    public Options(){
        registroProduct();


    }

    public void registroProduct(){
        setSize(700,700);
        setTitle("Registro Mercancia");
        setLayout(null);

        title = new JLabel("Bienvenido a registra mercancia");
        title.setBounds(50,15,300,40);
        add(title);


        nameT =  new JLabel("Ingresa el nombre");
        nameT.setBounds(15,40, 300, 30);
        add(nameT);



        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }}

