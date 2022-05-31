/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dolar
 */







/*   HACER CONSULTAS */
public class consultas_hospital {
    
    
    //OPCIONES DE CONSULTAS PARA LA TABLA ESPECIALIDADES
    public void registrarEspecialidad(int opcion,int id,String especial,conexion conex){
    
    String ls_accion="";
    
    //SE GUARDAN LAS CONSULTAS SEGUN LA VARIABLE OPCION
    
    
    
    //Registra
    if(opcion==1){
        
        ls_accion = "INSERT INTO especialidades "+
                "(especialidad) VALUES ('"+especial+"')";
    
    
    
    
    
    
    
    }
    //ACTUALIZA
    else if(opcion==2){
    
        ls_accion="UPDATE especialidades "+
                "SET especialidad ='"+especial+"'"+
                " WHERE id = "+id+"";
    
    
    
    
    }
    //ELIMINA
    else{
    
    ls_accion= "delete from especialidades "
                    +"WHERE id = "+id+"";
    
    
    
    
    }
    
    try{
    
    
     //Realiza la conexion a la base de datos
        Statement estatuto = conex.getConnection().createStatement();
        
        
        
        //ejecuta la operacion SQL, segun seleccion "ls_accion"
        estatuto.executeUpdate(ls_accion);
        
        
    
    
    
    }catch(SQLException e){
        String ls_error = e.getMessage();
        JOptionPane.showMessageDialog(null, "No se registro la transacción,"+
                                            "se produjo un error \n"+ls_error,
                                             "Error",JOptionPane.ERROR_MESSAGE);
      
        
        }
    
        //Cierra la conoexion a la base de datos
        // conex.desconectar();
    
    
 
    
    }
    
   
    
    //OBTINE LOS DATOS DE LOS MEDICOS Y REALIZA CONSULTAS
   public void registrarMEDICO(int opcion, int id,String nombre,String especial,
           String direccion,String telefono,conexion conex){
  
       String ls_accion="";
       
       
       //REGISTRA
       if(opcion==1){
       

               ls_accion="INSERT INTO medicos "+
             "(nombre,especialidad,direccion,telefono) VALUES ('"+
            nombre+"', '"+especial+"' ,'"+direccion+"' ,'"+telefono+
               "')";
         
           
       
       
       
       
       
       
       
       }else if(opcion==2){
       
       ls_accion="UPDATE medicos "+
               "SET nombre ='"+nombre+"', especialidad = '"+especial+"' ,"+
               "direccion = '"+direccion+"' , telefono = '"+telefono+"' "+
               "WHERE id = "+id+"";
       
       
       
       
       
       
       
       }else{
       
       ls_accion="delete from medicos "+
               "WHERE id = "+id+"";
       
       
       
       }
       
       
        try{
    
    
     //Realiza la conexion a la base de datos
        Statement estatuto = conex.getConnection().createStatement();
        
        
        
        //ejecuta la operacion SQL, segun seleccion "ls_accion"
        estatuto.executeUpdate(ls_accion);
        
        
    
    
    
    }catch(SQLException e){
        String ls_error = e.getMessage();
        JOptionPane.showMessageDialog(null, "No se registro la transacción,"+
                                            "se produjo un error \n"+ls_error,
                                             "Error",JOptionPane.ERROR_MESSAGE);
      
        
        }
    
        //Cierra la conoexion a la base de datos
        // conex.desconectar();
    
    
 
   
       
       
       
       
       
       
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
    
    
    
    public void registrarPACIENTE(int opcion,int id, String nombre,String direccion,
   String telefono, conexion conex ){
    
    
        String ls_accion="";
        
        if(opcion==1){
        
        
        ls_accion="INSERT INTO pacientes "+
                "( nombre, direccion, telefono ) VALUES ("+
                " ' "+nombre+" ' , '"+direccion+"' , '"+telefono+"' )";
        
        
        
        
        
        
        
        
        }else if(opcion==2){
        
        
        ls_accion="UPDATE pacientes "+
            "SET nombre = '"+nombre+"' , direccion = '"+direccion+"' ,"+       
          "telefono = '"+telefono+"' "+
                "WHERE id = "+id+"";
        
        
        
        
        
        
        
        
        
        
        
        }else{
        
        ls_accion =" delete From pacientes WHERE id = "+id+"";
        
        
        
        
        
        
            
            
            
            
            
        
        
        
        
        } try{
    
    
     //Realiza la conexion a la base de datos
        Statement estatuto = conex.getConnection().createStatement();
        
        
        
        //ejecuta la operacion SQL, segun seleccion "ls_accion"
        estatuto.executeUpdate(ls_accion);
        
        
    
    
    
    }catch(SQLException e){
        String ls_error = e.getMessage();
        JOptionPane.showMessageDialog(null, "No se registro la transacción,"+
                                            "se produjo un error \n"+ls_error,
                                             "Error",JOptionPane.ERROR_MESSAGE);
      
        
        }
    
        //Cierra la conoexion a la base de datos
        // conex.desconectar();
    
    
 
   
       
      
     
    
    
    }
    
    
    
   
    
    
    
    public void registrarCITAS(int opcion,int folio,String paciente,String medico, String especialidad,
    String fecha, String hora,conexion conex){
    
    String ls_accion ="";    
    
    
    if(opcion==1){
    
    
    ls_accion="INSERT INTO citas ( "+
    "paciente , medico , especialidad , fecha , hora )  VALUES ('"+paciente+"' ,'"+
     medico+"' , '"+especialidad+"' , '"+fecha+"' ,'"+hora+"')";
    
    
    
    
        
        
        
        
        
        
    
    }else if(opcion==2){
    
    ls_accion="UPDATE citas SET paciente = '"+paciente+"' , medico = '"+
            medico+"' , especialidad = '"+especialidad+"' , fecha = '"+fecha+"' , hora= '"+
            hora+"' WHERE folio = "+folio+"";
    
    
    
    
    
    
    
    
    
    
    
    
    
    }else{
    ls_accion ="delete FROM citas WHERE folio = "+folio+"";
    
    
    
    
    
    
    
    
    
    
    
    
    
    }try{
    
    
     //Realiza la conexion a la base de datos
        Statement estatuto = conex.getConnection().createStatement();
        
        
        
        //ejecuta la operacion SQL, segun seleccion "ls_accion"
        estatuto.executeUpdate(ls_accion);
        
        
    
    
    
    }catch(SQLException e){
        String ls_error = e.getMessage();
        JOptionPane.showMessageDialog(null, "No se registro la transacción,"+
                                            "se produjo un error \n"+ls_error,
                                             "Error",JOptionPane.ERROR_MESSAGE);
      
        
        }
    
        //Cierra la conoexion a la base de datos
        // conex.desconectar();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    //MUESTRA LOS DATOS EN LA TABLA VENTANA DE REPORTES
    public void MostrarTablaREPORTES(String medico,String fecha_inicio,String fecha_final,DefaultTableModel model,conexion conex){
    
    
    
      try{
    
        //Crea un objeto Statemen,para poder ejecutar una instruccion SQL
        Statement estatuto=conex.getConnection().createStatement();
        
        
        //genera un query o consulta de la tabla especificada
        //y regresa el resultado de la consulta en un objeto ResultSet
        ResultSet rs =estatuto.executeQuery("SELECT citas.paciente ,pacientes.direccion , pacientes.telefono,citas.fecha,citas.hora FROM citas,pacientes WHERE citas.medico ='"+
                medico+"' and citas.fecha >= '"+fecha_inicio+"' && citas.fecha <= '"+fecha_final+"'  and citas.paciente = pacientes.nombre ");
    
    
        
        //Se recorre la tabla virtual(ResultSet)en la memoria
        while(rs.next())//Mueve el cursor al siguiente registro
        {
        
        
            //es para obtener los datos y almacenar las filas
            Object[] fila=new Object[5];
            

            //es para llenar cada columna con los datos almacenados
            
            for(int i=0;i<5;i++){
                fila[i]=rs.getObject(i+1);
            
            
            
            }
        //Cargar los datos en filas a la tabla modelo
        model.addRow(fila);
        
        }
        
        estatuto.close();
        
        
        
        
    
    }catch (SQLException e){
    
    JOptionPane.showMessageDialog(null,"Error al consultar"," Error",
                                        JOptionPane.ERROR_MESSAGE);
    
    
    }
    
        
        
        
        
        
    
    
    
    
    
    
    
    }
   
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* OBTENER DATOS DE LAS TABLAS      */
    
    
   /*Obtiene los datos de la Tabla especialidades y los almacena en un Object */
    
    public void consultaEspecialidadConTableModel(DefaultTableModel model,conexion conex){
    
    try{
    
        //Crea un objeto Statemen,para poder ejecutar una instruccion SQL
        Statement estatuto=conex.getConnection().createStatement();
        
        
        //genera un query o consulta de la tabla especificada
        //y regresa el resultado de la consulta en un objeto ResultSet
        ResultSet rs =estatuto.executeQuery("SELECT id, especialidad FROM especialidades");
    
    
        
        //Se recorre la tabla virtual(ResultSet)en la memoria
        while(rs.next())//Mueve el cursor al siguiente registro
        {
        
        
            //es para obtener los datos y almacenar las filas
            Object[] fila=new Object[2];
            

            //es para llenar cada columna con los datos almacenados
            
            for(int i=0;i<2;i++){
                fila[i]=rs.getObject(i+1);
            
            
            
            }
        //Cargar los datos en filas a la tabla modelo
        model.addRow(fila);
        
        }
        
        estatuto.close();
        
        
        
        
    
    }catch (SQLException e){
    
    JOptionPane.showMessageDialog(null,"Error al consultar"," Error",
                                        JOptionPane.ERROR_MESSAGE);
    
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    /*OBTIENE LOS DATOS DE MEDICOS DE LA BASE DE DATOS PARA AGREGARLOS A LA TABLA DE LA APLICACION*/
     public void consultaMedicosConTableModel(DefaultTableModel model,conexion conex){
    
    try{
    
        //Crea un objeto Statemen,para poder ejecutar una instruccion SQL
        Statement estatuto=conex.getConnection().createStatement();
        
        
        //genera un query o consulta de la tabla especificada
        //y regresa el resultado de la consulta en un objeto ResultSet
        ResultSet rs =estatuto.executeQuery("SELECT id, nombre, especialidad,direccion,telefono FROM medicos");
    
    
        
        //Se recorre la tabla virtual(ResultSet)en la memoria
        while(rs.next())//Mueve el cursor al siguiente registro
        {
        
        
            //es para obtener los datos y almacenar las filas
            Object[] fila=new Object[5];
            

            //es para llenar cada columna con los datos almacenados
            
            for(int i=0;i<5;i++){
                fila[i]=rs.getObject(i+1);
            
            
            
            }
        //Cargar los datos en filas a la tabla modelo
        model.addRow(fila);
        
        }
        
        estatuto.close();
        
        
        
        
    
    }catch (SQLException e){
    
    JOptionPane.showMessageDialog(null,"Error al consultar"," Error",
                                        JOptionPane.ERROR_MESSAGE);
    
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  public void consultaPacientesConTableModel(DefaultTableModel model,conexion conex){
    
    try{
    
        //Crea un objeto Statemen,para poder ejecutar una instruccion SQL
        Statement estatuto=conex.getConnection().createStatement();
        
        
        //genera un query o consulta de la tabla especificada
        //y regresa el resultado de la consulta en un objeto ResultSet
        ResultSet rs =estatuto.executeQuery("SELECT id, nombre,direccion,telefono FROM pacientes");
    
    
        
        //Se recorre la tabla virtual(ResultSet)en la memoria
        while(rs.next())//Mueve el cursor al siguiente registro
        {
        
        
            //es para obtener los datos y almacenar las filas
            Object[] fila=new Object[4];
            

            //es para llenar cada columna con los datos almacenados
            
            for(int i=0;i<4;i++){
                fila[i]=rs.getObject(i+1);
            
            
            
            }
        //Cargar los datos en filas a la tabla modelo
        model.addRow(fila);
        
        }
        
        estatuto.close();
        
        
        
        
    
    }catch (SQLException e){
    
    JOptionPane.showMessageDialog(null,"Error al consultar"," Error",
                                        JOptionPane.ERROR_MESSAGE);
    
    
    }
    
    
    
    }
       
    
    
    
    
    
    
    
    
    
    
    
    
    public void consultaCitaConTableModel(DefaultTableModel model,conexion conex){
    
    try{
    
        //Crea un objeto Statemen,para poder ejecutar una instruccion SQL
        Statement estatuto=conex.getConnection().createStatement();
        
        
        //genera un query o consulta de la tabla especificada
        //y regresa el resultado de la consulta en un objeto ResultSet
        ResultSet rs =estatuto.executeQuery("SELECT folio, paciente,  medico, especialidad ,"+
                " fecha , hora FROM citas");
    
    
        
        //Se recorre la tabla virtual(ResultSet)en la memoria
        while(rs.next())//Mueve el cursor al siguiente registro
        {
        
        
            //es para obtener los datos y almacenar las filas
            Object[] fila=new Object[6];
            

            //es para llenar cada columna con los datos almacenados
            
            for(int i=0;i<6;i++){
                fila[i]=rs.getObject(i+1);
            
            
            
            }
        //Cargar los datos en filas a la tabla modelo
        model.addRow(fila);
        
        }
        
        estatuto.close();
        
        
        
        
    
    }catch (SQLException e){
    
    JOptionPane.showMessageDialog(null,"Error al consultar"," Error",
                                        JOptionPane.ERROR_MESSAGE);
    
    
    }
    
    
    
    }
    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
