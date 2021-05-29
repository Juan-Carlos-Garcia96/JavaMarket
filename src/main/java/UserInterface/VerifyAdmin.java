package UserInterface;

import javax.swing.*;

public class VerifyAdmin {

    public static void  verifyPassword(String passwod)
    {
    switch (passwod)
    {
        case "12345":
            System.out.println("Contraseña correcta");

            break;

        case "13523":

            break;

        default:
            JOptionPane.showMessageDialog(null,"Error", "Error de acceso", JOptionPane.ERROR_MESSAGE,null);
            break;
    }

    }
}
