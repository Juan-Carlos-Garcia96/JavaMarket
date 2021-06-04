package DBconection;

import java.sql.Connection;
import  java.sql.DriverManager;

public class DbConection {

    public  Connection getConection(){

        //Se crea una instancia de tipo connection
        Connection conec = null;

        try {
            conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/javamarket","root", "" );

        }catch (Exception e){
            System.out.println(e);
        }
        return  conec;
    }
}
