package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRooms extends JFrame implements ActionListener {

    JTextField t1, t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;

    AddRooms() {
        JLabel l1 = new JLabel("Add Rooms");
        l1.setFont(new Font("Tahoma", Font.BOLD, 18));
        l1.setBounds(150, 20, 200, 20);
        add(l1);

        JLabel room = new JLabel("Room Number ");
        room.setFont(new Font("Tahoma", Font.PLAIN, 18));
        room.setBounds(90, 30, 200, 120);
        add(room);

        t1 = new JTextField();
        t1.setBounds(220, 80, 150, 30);
        add(t1);

        JLabel available = new JLabel("Available");
        available.setFont(new Font("Tahoma", Font.PLAIN, 18));
        available.setBounds(90, 90, 200, 120);
        add(available);
        
        c1=new JComboBox(new String[] {"Available","Occupied"});
        c1.setBounds(220,130,150,30);
        c1.setBackground(Color.WHITE);
        add(c1);

        JLabel status = new JLabel("Cleaning Status");
        status.setFont(new Font("Tahoma", Font.PLAIN, 18));
        status.setBounds(90, 140, 200, 120);
        add(status);

        c2=new JComboBox(new String[] {"Cleaned","Dirty"});
        c2.setBounds(220,190,150,30);
        c2.setBackground(Color.WHITE);
        add(c2);

       JLabel price = new JLabel("Price");
        price.setFont(new Font("Tahoma", Font.PLAIN, 18));
        price.setBounds(90, 200, 200, 120);
        add(price);

        t2 = new JTextField();
        t2.setBounds(220, 250, 150, 30);
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setFont(new Font("Tahoma", Font.PLAIN, 18));
        type.setBounds(90, 255, 200, 120);
        add(type);

        c3=new JComboBox(new String[] {"Single Bed","Double Bed"});
        c3.setBounds(220,300,150,30);
        c3.setBackground(Color.WHITE);
        add(c3);

        b1=new JButton("Add Rooms");
        b1.setBounds(92,400,130,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
                
        b2=new JButton("Cancel");
        b2.setBounds(245,400,130,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/twelve.jpg"));
        JLabel l5=new JLabel(i1);
        l5.setBounds(400,30,500,400);
        add(l5);
        
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(350, 190, 1000 ,540);
        setLayout(null);
        setVisible(true);

    }
    
      public void actionPerformed(ActionEvent ae)
      {
          if(ae.getSource()==b1)
          {
             String room=t1.getText();
             String available=(String)c1.getSelectedItem();
             String status= (String)c2.getSelectedItem();
             String price= t2.getText();
             String type=(String)c3.getSelectedItem();
             
             conn c=new conn();
             try
             {
                String str="insert into rooms values('"+room+",'"+available+",'"+status+",'"+price+",'"+type+",)"; 
                c.s.executeUpdate(str);
                this.setVisible(false);
                
             }catch(Exception e)
             {
                 
             }
             
          }else if(ae.getSource()==b2)
          {
            this.setVisible(false);
          }
      }

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }
}
