package Products.UserInterface;

import Services.ServicesProducts;

import javax.swing.*;

public class VerifyAdmin {



    /**
     *  Metodo que autentifica al administrador
     * @param passwod  se obtiene al momento de seleccionar la opcion de administrador
     *                 en la pantalla inicial
     * */

    public static void  verifyPassword(String passwod)
    {
    switch (passwod)
    {

        case "12345":

            JOptionPane.showMessageDialog(null, "Bienvenido Administrador!", "Inicio correcto",JOptionPane.INFORMATION_MESSAGE );
            ServicesProducts sev = new ServicesProducts();
            sev.electionProducts();
            break;

        case "13523":
            System.out.println("Contraseña correcta");
            break;

        default:
            JOptionPane.showMessageDialog(null,"Error", "Error de acceso", JOptionPane.ERROR_MESSAGE,null);
            break;
    }

    }
}
