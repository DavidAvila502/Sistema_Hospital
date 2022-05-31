/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
/**
 *
 * JOSE DAVID AVILA MALDONADO
 * 18320804 
 */
public class conexion {
    
    
    static String bd ="hospital";//Nombre de la bd
    static String login ="root";//Usuario de la bd 
    static String password ="123456";//Password de la bd
    static String url ="jdbc:mysql://localhost/"+bd;//Donde se localiza la base de datos
    
   
    
    //Interfaz conection
    
    Connection conn=null;
    
    public conexion(){//metodo constructor
        
        
        
    try{
        
        //obtenemos el driver para mysql
    Class.forName("com.mysql.jdbc.Driver");
    
    
    //Hacemos la conexion a la base de datos
    conn=DriverManager.getConnection(url,login,password);
    
    
    
    if(conn != null){
    
    System.out.println("Conexion a la base de datos "+bd+" OK");
    
    
    
    }
    
    
    }catch (SQLException e){
    System.out.println(e);
    
    
    }catch(ClassNotFoundException e){
        
        System.out.println(e);
    
    }catch(Exception e){
    
    System.out.println(e);
    
    
    }
    
    
    
    
    
    
    }//Fin del metodo constructor
    
    
    
    //PERMITE RETORNAR LA CONEXION
    public Connection getConnection(){
    
    
    return conn;
    
    
    
    
    }
    
    
    
    //FINALIZA LA CONEXION A LA BASE DE DATOS 
    public void desconectar(){
    
    conn = null;
    
    if(conn == null){
    
    System.out.println("Conexion terminada");
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}//FIN DE LA CALSES
