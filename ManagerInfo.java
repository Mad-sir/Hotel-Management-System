package hotel.management.system;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;
import java.awt.*;

public class ManagerInfo extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    
    ManagerInfo()
    {
        t1=new JTable();
        t1.setBounds(0,40,1000,500);
        add(t1);
        
        JLabel l1=new JLabel("Name");
        l1.setBounds(50,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel("Age");
        l2.setBounds(160,10,70,20);
        add(l2);
        
         JLabel l3=new JLabel("Gender");
        l3.setBounds(270,10,70,20);
        add(l3);
        
         JLabel l4=new JLabel("Department");
        l4.setBounds(380,10,70,20);
        add(l4);
        
         JLabel l5=new JLabel("Salary");
        l5.setBounds(500,10,70,20);
        add(l5);
        
         JLabel l6=new JLabel("Phone");
        l6.setBounds(610,10,70,20);
        add(l6);
        
         JLabel l7=new JLabel("Aadhar");
        l7.setBounds(720,10,70,20);
        add(l7);
        
         JLabel l8=new JLabel("Email");
        l8.setBounds(830,10,70,20);
        add(l8);
        
        b1=new JButton("Load Data");
        b1.setBounds(350,560,120,30);
        b1.addActionListener(this);
        add(b1);       
        
        b2=new JButton("Back");
        b2.setBounds(530,560,120,30);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
         setLayout(null);
        setBounds(300,100,1000,650);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==b1)
          {
             try{
                 conn c=new conn();
                 String str="Select * from employee where job='Manager'";
                 ResultSet rs=c.s.executeQuery(str);
                 
                 t1.setModel(DbUtils.resultSetToTableModel(rs));
                 
             }catch(Exception e)
             {
                 
             }
             
          }else if(ae.getSource()==b2)
          {
            new Reception().setVisible(true);  
            this.setVisible(false);
          }
         
     }
   public static void main(String[] args) 
      {
          new ManagerInfo().setVisible(true);
      }         
           
}

