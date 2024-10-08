 
package hotel.management.system;

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class AddDriver extends JFrame implements ActionListener{
    
    JTextField  t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
     AddDriver()
     {
         JLabel title=new JLabel ("Add Drivers");
         title.setBounds(150,10,150,30);
         title.setFont(new Font("Tahoma",Font.BOLD,22));
         add(title);
         
         JLabel name= new JLabel("Name");
         name.setFont(new Font("Tahoma",Font.PLAIN,20));
         name.setBounds(60,70,100,30);
         add(name);
         
          t1 = new JTextField();
        t1.setBounds(200, 70, 150, 30);
        add(t1);
         
          JLabel age= new JLabel("Age");
         age.setFont(new Font("Tahoma",Font.PLAIN,20));
        age.setBounds(60,120,100,30);
         add(age);
         
          t2 = new JTextField();
        t2.setBounds(200, 120, 150, 30);
        add(t2);
          
         JLabel gender= new JLabel("Gender");
        gender.setFont(new Font("Tahoma",Font.PLAIN,20));
         gender.setBounds(60,170,100,30);
         add(gender);
         
        c1=new JComboBox(new String[] {"Male","Female"});
        c1.setBounds(200,170,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);
         
         JLabel car= new JLabel("Car Company");
         car.setFont(new Font("Tahoma",Font.PLAIN,20));
         car.setBounds(60,220,120,30);
         add(car);
         
         t3 = new JTextField();
        t3.setBounds(200, 220, 150, 30);
        add(t3); 
        
         
         JLabel model =new JLabel("Car Model");
        model.setFont(new Font("Tahoma",Font.PLAIN,20));
         model.setBounds(60,270,100,30);
         add(model);
         
          t4 = new JTextField();
        t4.setBounds(200, 270, 150, 30);
        add(t4);
         
          JLabel available= new JLabel("Available");
        available.setFont(new Font("Tahoma",Font.PLAIN,20));
         available.setBounds(60,320,100,30);
         add(available);
         
          c2=new JComboBox(new String[] {"Available","Busy"});
        c2.setBounds(200,320,150,30);
        c2.setBackground(Color.WHITE);
        add(c2);
         
          JLabel location= new JLabel("Location");
         location.setFont(new Font("Tahoma",Font.PLAIN,20));
         location.setBounds(60,370,100,30);
         add(location);
         
         t5 = new JTextField();
        t5.setBounds(200, 370, 150, 30);
        add(t5);
        
        b1=new JButton("Add Driver");
        b1.setBounds(60,450,130,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
                
        b2=new JButton("Cancel");
        b2.setBounds(220,450,130,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleven.jpg"));
        Image i2=i1.getImage().getScaledInstance(700, 500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(330,80,850,400);
        add(l1);
         
        setLayout(null);
        setBounds(270,170,1150,600);
        setVisible(true);
     }
     
     
    
      public void actionPerformed(ActionEvent ae)
      {
          if(ae.getSource()==b1)
          {
             String name=t1.getText();
             String age=t2.getText();
             String gender= (String)c1.getSelectedItem();
             String company= t3.getText();
             String brand=t4.getText();
             String available= (String)c2.getSelectedItem();
             String location= t5.getText();
             
             conn c=new conn();
             try
             {
                String str="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')"; 
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Driver Successfully Add");
                this.setVisible(false);
                
             }catch(HeadlessException | SQLException e)
             {
                 
             }
             
          }else if(ae.getSource()==b2)
          {
            this.setVisible(false);
          }
      }
    
      public static void main(String[] args) 
      {
          new AddDriver().setVisible(true);
      }
}
