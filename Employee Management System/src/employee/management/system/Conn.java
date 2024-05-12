package employee.management.system;

import java.sql.*;   //Sql connectivity library
public class Conn {
    
    Connection c;   //interface
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");    //1st step :Register driver class
            c = DriverManager.getConnection("jdbc:mysql:///ems","root","admin");  //2nd step :creating connection string
            s = c.createStatement();  //3rd step :Creating statement 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
