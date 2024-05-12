package employee.management.system;

import javax.swing.*;
import java.awt.*;  //color
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener{
    
    Splash(){      //constructor
        
        super("EMS");
        
        getContentPane().setBackground(Color.white);   //change background color
        setLayout(null);
        JLabel heading = new JLabel("Employee Management System"); //add txt on app but not showing
        heading.setBounds(150, 30, 1200, 70);   //itself adjust items 80
        heading.setFont(new Font("serif", Font.BOLD, 60)); //font family and size
        heading.setForeground(Color.white);  //adjust font color
        add(heading);               //need to add
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));  //background image
        Image i2 = i1.getImage().getScaledInstance(1080, 660, Image.SCALE_DEFAULT);   //scale bg
        ImageIcon i3 = new ImageIcon(i2);  //convert to imageicon
        JLabel image = new JLabel(i3);     //object of jlabel
        image.setBounds(0 , 0 , 1080 , 660);  
        add(image);     //add image
        
        JButton clickhere = new JButton("Click Here To Continue");   //create a button 
        clickhere.setBounds(400, 500, 300, 70);  //size and alignment 
        clickhere.setBackground(Color.orange);   // set abckground color
        clickhere.setForeground(Color.WHITE);
        clickhere.setFont(new Font("serif", Font.BOLD, 19));// set upper color
        clickhere.addActionListener(this);
        add(clickhere);       //add button
            
        setSize(1080,660);   //set frame size
        setLocation(150,50);   //set frame alignment
        setVisible(true);
        
        //main label hide light for one second
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){     
            }
            
            heading.setVisible(true);
              try{
                Thread.sleep(500);
            }catch(Exception e){              
            }
        }
    }
    public void actionPerformed(ActionEvent ea){
        //i MAKE this for to override splash without this function splash give me error
        setVisible(false);    //After action listner line run this will say to swing switch off this screen
        new Login();       //turn on login screen
    }
    
    public static void main(String[] args){
        
        new Splash(); //object
    }
    
}
