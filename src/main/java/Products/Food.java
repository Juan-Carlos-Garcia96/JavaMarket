package Products;

import Services.ServicesProducts;

import java.util.Scanner;

public class Food extends  Products{

    public Food(int id,String name,  String description, int prices, int pices, String type){
        super(id,name,  description, prices, pices, type);

    }

    public void  altaProduct(int id, String description, int prices, double pices, String type){

    }

    public void actualizaProducts(int option){

        switch (option){

            case 1:
                ServicesProducts register = new ServicesProducts();

                break;

            case 2:
                break;

            case 3:
                break;
        }


    }


}
