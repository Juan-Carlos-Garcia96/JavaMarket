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
    public static void altaProducts(Food food) {
        DbConection dbConection = new DbConection();

        try (Connection conexion = dbConection.getConection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO products (`name`, `descr`, `price`, `quant`, `type`) VALUES (?,?,?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, food.getName());
                ps.setString(2, food.getDescription());
                ps.setDouble(3, food.getPrices());
                ps.setInt(4, food.getPices());
                ps.setString(5, food.getType());
                ps.executeUpdate();
                System.out.println(food.getId() + " Id agregado correctamente");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void eliminaProduct(Food food) {
        DbConection dbConection = new DbConection();
        try (Connection conexion = dbConection.getConection()) {
            try {
                PreparedStatement ps = null;
                String queryDel = "DELETE FROM products WHERE id= ?";
                ps = conexion.prepareStatement(queryDel);
                ps.setInt(1, food.getId());
                ps.executeUpdate();
            } catch (Exception e) {

            }


        } catch (SQLException ex) {

        }

    }

    // Actualizacion de productos
    public static void updateName(Food food) {
        DbConection bd_conection = new DbConection();
        try (Connection db = bd_conection.getConection()) {
            PreparedStatement ps = null;
            try {
                String queryUpdateName = "UPDATE  products set `name` = ? WHERE id = ? ";
                ps = db.prepareStatement(queryUpdateName);
                ps.setString(1, food.getName());
                ps.setInt(2, food.getId());
                ps.executeUpdate();
                System.out.println("Exito " + food.getName() + " Añadido correctamente ");
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //Actualozacion de tipo en los articulos
    public static void updatetype(Food food){
        DbConection dbConection = new DbConection();

        try(Connection db = dbConection.getConection()){
            PreparedStatement ps;

            try{
                String queryUpdateType=" UPDATE products set `type` = ? WHERE id = ?";
                ps = db.prepareStatement(queryUpdateType);
                ps.setString(1, food.getType());
                ps.setInt(2,food.getId());
                ps.executeUpdate();
            }catch (Exception e){
                System.out.println("Ups error " + e);
            }

        }catch (SQLException ex){
            System.out.println("Ups error" + ex);
        }

    }

}
