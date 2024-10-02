/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;

/**
 *
 * @author Vidhita Kumari
 */
public class conn {
     Connection c;
    Statement s;
    public conn()
    {
        try
        {
            /*Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/3306/vidhita","root","vidhita");*/
            Class.forName("com.mysql.jdbc.Driver");
            Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/vidhita","root","vidhita");
            s=c1.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
