package Services;

import javax.swing.*;

public class ServicesProducts  extends JFrame {

    //Items
    JLabel ti;
    private JButton save;
    private JTextField name, desc, price,pieces, type;
     private  JTextArea descr;

    ServicesProducts(){


}

    public void registroProduct(){
        setSize(700,700);
        setTitle("Registro Mercancia");
        setLayout(null);

        ti = new JLabel("Bienvenido a registra mercancia");
        ti.setBounds(50,15,300,40);
        add(ti);


        name = new JTextField();



        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JButton getSave() {
        return save;
    }

    public void setSave(JButton save) {
        this.save = save;
    }

    @Override
    public JTextField getName() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getDesc() {
        return desc;
    }

    public void setDesc(JTextField desc) {
        this.desc = desc;
    }

    public JTextField getPrice() {
        return price;
    }

    public void setPrice(JTextField price) {
        this.price = price;
    }

    public JTextField getPieces() {
        return pieces;
    }

    public void setPieces(JTextField pieces) {
        this.pieces = pieces;
    }

    @Override
    public JTextField getType() {
        return type;
    }

    public void setType(JTextField type) {
        this.type = type;
    }

    public JTextArea getDescr() {
        return descr;
    }

    public void setDescr(JTextArea descr) {
        this.descr = descr;
    }
}
