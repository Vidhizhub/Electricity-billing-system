/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Vidhita Kumari
 */
public class customer_details extends JFrame implements ActionListener{
     JTable t1;
    JButton b1;
    String x[] = {"Emp Name","Meter No","Address","State","City","Email","Phone"};
    String y[][] = new String[20][8];
    int i=0, j=0;
    customer_details(){
        super("Customer Details");
        setSize(1200,650);
        setLocation(200,200);

        try{
            conn c1  = new conn();
            String s1 = "select * from emp";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("Meter_No");
                y[i][j++]=rs.getString("Address");
                y[i][j++]=rs.getString("State");
                y[i][j++]=rs.getString("City");
                y[i][j++]=rs.getString("Email");
                y[i][j++]=rs.getString("Phone");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);

        }catch(Exception e){
            e.printStackTrace();
        }


        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new customer_details().setVisible(true);
    }

    
}
