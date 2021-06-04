package Products;

import java.util.Scanner;

public class Food extends  Products{

    Food(int id,String name,  String description, int prices, int pices, String type){
        super(id,name,  description, prices, pices, type);

    }

    public void  altaProduct(int id, String description, int prices, double pices, String type){

    }

    public void actualizaProducts(int option){

        switch (option){

            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa el nombre del producto");
                String name = sc.next();
                System.out.println("Ingresa la descripcion del producto");

                break;

            case 2:
                break;

            case 3:
                break;
        }


    }


}
