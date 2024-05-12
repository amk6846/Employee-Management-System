
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Removeemployees extends JFrame implements ActionListener{
    
    Choice cempid;
    JButton delete,back;
    Removeemployees(){
        super("Remove");
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel labelempid = new JLabel("Remove Employees By Id");
        labelempid.setBounds(10,20,150,30);
        add(labelempid);
        
        cempid = new Choice();
        cempid.setBounds(170,25,150,30);
        add(cempid);
        
        try{
            Conn c = new Conn();
            String query = "select * from employees";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                cempid.add(rs.getString("empid"));
            }
        }catch(Exception ea){
            ea.printStackTrace();
        }
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(30,100,150,30);
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(190,100,150,30);
        add(lblname);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(30,140,150,30);
        add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(190,140,150,30);
        add(lblphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(30,180,150,30);
        add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(190,180,150,30);
        add(lblemail);
        
          try{
            Conn c = new Conn();
            String query = "select * from employees where empid = '"+cempid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        }catch(Exception ea){
            ea.printStackTrace();
        }
          //show the data using employee id name ,phone,emaiil
        cempid.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                
                     try{
            Conn c = new Conn();
            String query = "select * from employees where empid = '"+cempid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
            }catch(Exception ea){
             ea.printStackTrace();
             
        }
            }
            
        });
        //buttons delete and back
        delete = new JButton("Delete");
        delete.setBounds(30,320,120,35);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.white);
        delete.setFont(new Font("SAN_SERIF", Font.CENTER_BASELINE, 16));
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(170,320,120,35);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setFont(new Font("SAN_SERIF", Font.CENTER_BASELINE, 16));
        back.addActionListener(this);
        add(back);
        
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png")); 
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);   
        image.setBounds(350 , 0 , 600 , 400);  
        add(image);
          
          
        setSize(1000,500);
        setLocation(250,180);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == delete){
            try{
                Conn c = new Conn();
                String query = "delete from employees where empid = '"+cempid.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employees Details Successfully Deleted");
                setVisible(false);
                new Home();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
            new Home();
        }
        
    }
    
    
    
    public static void main(String[] args){
        
        new Removeemployees();
    }
}
