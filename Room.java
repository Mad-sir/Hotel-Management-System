
package hotel.management.system;

import com.mysql.cj.protocol.Resultset;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.sql.ResultSet;

public class Room extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
   
    Room()
       {
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eight.jpg"));
        Image i2=i1.getImage().getScaledInstance(700, 600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(560,40,400,550);
        Component add;
        add = add(icon);
        
        
         JLabel l1 = new JLabel("Room Number ");
         l1.setFont(new Font("Tahoma", Font.BOLD, 15));
         l1.setBounds(10, 10, 200, 80);
         add(l1);
        
         JLabel l2 = new JLabel("Availability");
         l2.setFont(new Font("Tahoma", Font.BOLD, 15));
         l2.setBounds(150, 10, 200, 80);
         add(l2);     

         JLabel l3 = new JLabel("Status ");
         l3.setFont(new Font("Tahoma", Font.BOLD, 15));
         l3.setBounds(280, 10, 200, 80);
         add(l3);
         
         JLabel l4 = new JLabel("price ");
         l4.setFont(new Font("Tahoma", Font.BOLD, 15));
         l4.setBounds(370, 10, 200, 80);
         add(l4);
         
         JLabel l5 = new JLabel("Type ");
         l5.setFont(new Font("Tahoma", Font.BOLD, 15));
         l5.setBounds(470, 10, 200, 80);
         add(l5);
           
             t1=new JTable();   
             t1.setBounds(40,40,700,500);
             add(t1);
             
        b1=new JButton("Load Data");
        b1.setBounds(100,560,120,30);
        b1.addActionListener(this);
        add(b1);       
        
        b2=new JButton("Back");
        b2.setBounds(400,560,120,30);
        b2.addActionListener(this);
        add(b2);
             
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
             setBounds(200,120,1000,650);
             setVisible(true);
       }
    
    public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==b1){
              try{
                  conn c=new conn();
                  String str="select * from room";
                  Resultset rs = (Resultset) c.s executeQuery(str);
                  b1.setModel((ButtonModel) DbUtils.resultSetToTableModel((ResultSet) rs));
              }catch(Exception e)
              {
                  
              }
              
          }else if(ae.getSource()==b2){
              
               new Reception().setVisible(true); 
               this.setVisible(false);
          }
        
    }
     public static void main(String[] args)
     {
       new Room().setVisible(true);
      
     }

    private void executeQuery(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
