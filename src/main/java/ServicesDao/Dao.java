package ServicesDao;

import DBconection.DbConection;
import Products.Food;
import com.mysql.cj.jdbc.ConnectionWrapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {

    //Se crea el empujador de indormacion a la base de datos


    //foods
    public  static  void altaProducts(Food food){
        DbConection dbConection = new DbConection();

        try(Connection conexion  =   dbConection.getConection()) {
            PreparedStatement ps = null;

            try{

            String query = "INSERT INTO products (`name`, `descr`, `price`, `quant`, `type`) VALUES (?,?,?,?,?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1,food.getName());
            ps.setString(2, food.getDescription());
            ps.setDouble(3,food.getPrices());
            ps.setInt(4, food.getPices());
            ps.setString(5, food.getType());

            ps.executeUpdate();
                System.out.println(food.getId() + " Id agregado correctamente");

            }catch (Exception ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }


}
