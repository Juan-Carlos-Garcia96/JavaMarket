package ServicesDao;

import DBconection.DbConection;
import Products.Food;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dao {

    //Se crea el empujador de indormacion a la base de datos


    //foods
    public  static void altaProducts(Food food){
        DbConection dbConection = new DbConection();

        try(Connection conexion  =   dbConection.getConection()) {
            PreparedStatement ps = null;



        }catch (Exception e){
            System.out.println(e);
        }

    }


}
