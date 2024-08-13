
package hotel.management.system;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    
    Reception()
    {
        b1=new JButton("New Customer Form");
        b1.setBounds(10,30,200,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
                
        b2=new JButton("Room");
        b2.setBounds(10,80,200,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Deparment");
        b3.setBounds(10,130,200,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
                
        b4=new JButton("All Employee Info");
        b4.setBounds(10,180,200,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);
        
        b5=new JButton("Customer Info");
        b5.setBounds(10,230,200,30);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);
                
        b6=new JButton("Manager Info");
        b6.setBounds(10,280,200,30);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        add(b6);
        
        b7=new JButton("Check Out");
        b7.setBounds(10,330,200,30);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        add(b7);
                
        b8=new JButton("Update Check Status");
        b8.setBounds(10,380,200,30);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.addActionListener(this);
        add(b8);
        
        
        b9=new JButton("Update Room Status");
        b9.setBounds(10,430,200,30);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.addActionListener(this);
        add(b9);
                
        b10=new JButton("Pick Up Service");
        b10.setBounds(10,480,200,30);
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.addActionListener(this);
        add(b10);
        
        b11=new JButton("Search Room");
        b11.setBounds(10,530,200,30);
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.addActionListener(this);
        add(b11);
                
        b12=new JButton("Logout");
        b12.setBounds(10,580,200,30);
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.addActionListener(this);
        add(b12);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
        Image i2=i1.getImage().getScaledInstance(700, 600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(180,30,800,580);
        add(l1);
        
        getContentPane().setBackground(Color.WHITE);
        
         setBounds(350, 100, 1000 ,670);
        setLayout(null);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
      {
          if(ae.getSource()==b1){
                new AddCustomer().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b2){
                new Room().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b3){
                new Department().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b4){
                new EmployeeInfo().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b5){
                new CustomerInfo().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b6){
                new ManagerInfo().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b7){
                new CheckOut().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b8){
                new UpdateCheck().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b9){
                new UpdateRoom().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b10){
                new PickUp().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b11){
                new SearchRoom().setVisible(true);
                this.setVisible(false);
          }else if(ae.getSource()==b12){
                this.setVisible(false);
          }
      }
    public static void main(String args[])
    {
       new Reception().setVisible(true); 
    }
    
}
