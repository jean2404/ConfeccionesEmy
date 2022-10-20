/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sagit
 */
public class Conexion {
        public Connection getConexion(){
        Connection cn;
        try{
          //Class.forName("org.apache.derby.jdbc.ClientDriver");  
          //cn=DriverManager.getConnection("jdbc:derby://localhost:1527/ConfeccionesEmy","emy","emy");
          Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdemy", "root", "root");
        }catch(ClassNotFoundException e){
            cn=null;
        }catch(SQLException e){
            cn=null;
        }
        return cn;
    }
}
