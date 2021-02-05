/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Codigo complementario, funciones utiles.
public class Auxiliares {

    public String StringNumerico;
    private Connection con;
    
    public Auxiliares() {
    }

    public Auxiliares(String StringNumerico) {
        this.StringNumerico = StringNumerico;
    }

    public static boolean isNumeric(String StringNumerico){
	try {
		Long.parseLong(StringNumerico);              
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    public String nombreClientePorId(int id) throws SQLException {
        String nombre = new String();
        con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
        Statement stmt = con.createStatement();               
        ResultSet rs = stmt.executeQuery("SELECT Nombres,Apellidos FROM clientes WHERE IdCliente="+id);        
        if(rs.next()){
        nombre  = rs.getString(2)+" "+rs.getString(1);}
        
        return nombre;
    }
    
    public String nombreProfesionalPorId(int id) throws SQLException {
        String nombre = new String();
        con = DriverManager.getConnection("jdbc:mysql://localhost/gestionturnos", "root", "");
        Statement stmt = con.createStatement();               
        ResultSet rs = stmt.executeQuery("SELECT Apellidos, Nombres FROM profesionales WHERE IdProfesional="+id);        
        if(rs.next()){
        nombre  = rs.getString(1)+" "+rs.getString(2);}
        
        return nombre;
    }
}
