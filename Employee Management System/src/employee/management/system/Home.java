//Home Is A MAIN Class
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton add,remove,update,view;
    
    Home(){
        super("Home");
        setLayout(null);
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);   
        image.setBounds(0 , 0 , 1120 , 630);  
        add(image);
        //label
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(630 , 20 , 400 , 40);
        heading.setFont(new Font("TAHOMA",Font.BOLD,25));
        image.add(heading);
        //buttons
        add = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(850,80,150,40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(850,140,150,40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(650,140,150,40);
        remove.addActionListener(this);
        image.add(remove);
        
       
        setSize(1120,630);
        setLocation(110,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            setVisible(false);
            new Addemployee();
        }
        else if(ae.getSource() == view){
            setVisible(false);
            new ViewEmployees();
            
        }
        else if(ae.getSource() == update){
            setVisible(false);
            new ViewEmployees();            
        }
        else
        {
            setVisible(false);
            new Removeemployees();
            
        }
    }
    
    public static void main(String[] args){
        new Home();
        
    }
}
