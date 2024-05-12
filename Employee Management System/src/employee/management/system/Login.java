//Create a login form for my app
package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername,tfpass;   //Globally declared textfields
    Login(){
        
        super("Login");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        //create label
        JLabel lblusername = new JLabel("User Name");
        lblusername.setBounds(50 , 50 , 100 ,30);
        add(lblusername);
        
        //create text field
        tfusername = new JTextField();
        tfusername.setBounds(160 , 50 , 170 , 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50 , 110 , 100 ,30);
        add(lblpassword);
        
        tfpass = new JTextField();
        tfpass.setBounds(160 , 110 , 170 , 30);
        add(tfpass);
        
        //button
        JButton login = new JButton("Login");
        login.setBounds(160 , 180 , 170 , 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        //Image 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);   
        image.setBounds(350 , 25 , 200 , 200);  
        add(image);   
        
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        
    }
    
    //After Click Login Button Values get from Textfields and create a query and execute
    public void actionPerformed(ActionEvent a){
        try{
            String Username = tfusername.getText();
            String Password = tfpass.getText();
            
            Conn c = new Conn();
            
            String query = "Select * From login where username = '"+Username+"' and password ='"+Password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            
            if(rs.next()){
                setVisible(false);
                new Home();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Inavalid User Name Or Password");
                setVisible(false);
            }
            
        }catch(Exception e){
            e.getStackTrace();
        }
        
    }
    public static void main(String[] args){
        new Login();
    }
    
}
