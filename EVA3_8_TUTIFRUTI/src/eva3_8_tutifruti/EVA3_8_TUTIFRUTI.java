/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_tutifruti;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_TUTIFRUTI {

   final static String USUARIO = "TUTI";
   final static String PASSWORD = "FRUTI";
   
    
    
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
       String usu;
       String pwd;
        do{
            usu = capturaDatos("Usuario: ");
            pwd = capturaDatos("Contraseña:  ");
           
            
            
        }while(!validarUsuario(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA");
    }
    
    public static boolean validarUsuario(String usuario, String pwd){
    if(usuario.equals(USUARIO)&&pwd.equals(PASSWORD))
        return true;
   else
        return false;
    }
   
public static String capturaDatos(String mensaje){
Scanner input = new Scanner (System.in);
    System.out.println(mensaje);
return input.nextLine();
}
    
}
