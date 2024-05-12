package employee.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class ViewEmployees extends JFrame implements ActionListener{
    
    JTable table;
    Choice employeeid;
    JButton search,print,update,back;
    ViewEmployees(){
        super("View");
    setLayout(null);
    getContentPane().setBackground(Color.white);
    
    JLabel searchid = new JLabel("Search By Employee Id");
    searchid.setBounds(10,15,150,20);
    add(searchid);
    
    employeeid = new Choice();
    employeeid.setBounds(170,15,150,20);
//    employeeid.setBackground(Color.white);
    add(employeeid);
    
    table = new JTable();
    
        
     try{
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("Select * from employees");
        
        while(rs.next()){
            employeeid.add(rs.getString("Empid"));    
        }    
    }catch(Exception ae){
        ae.printStackTrace();
    }
    
    try{
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("Select * from employees");
        table.setModel(DbUtils.resultSetToTableModel(rs));
        
    }catch(Exception ae){
        ae.printStackTrace();
    }

    JScrollPane jsp = new JScrollPane(table);
    jsp.setBounds(0,100,900,600);
    add(jsp);
    //nuttons like search,print,update,back
    search = new JButton("Search");
    search.setBounds(10,55,80,30);
    search.addActionListener(this);
    add(search);
    //print
    print = new JButton("Print");
    print.setBounds(90,55,80,30);
    print.addActionListener(this);
    add(print);
    //update
    update = new JButton("Update");
    update.setBounds(170,55,80,30);
    update.addActionListener(this);
    add(update);
    //back
    back = new JButton("back");
    back.setBounds(250,55,80,30);
    back.addActionListener(this);
    add(back);
    //image
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(900, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);   
        image.setBounds(0 , 0 , 900 , 150);  
        add(image);
    
    
    setSize(900, 650);
    setLocation(250,50);
    setVisible(true);
            
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == search){
            
            String query = "select * from employees where Empid = '"+employeeid.getSelectedItem()+"'"; //query
                try{    //use reason is database work so chances of errors
                Conn c = new Conn();   //connection
                ResultSet rs = c.s.executeQuery(query);  //statement
                table.setModel(DbUtils.resultSetToTableModel(rs));  //data into table
                
            }catch(Exception ea){
                ea.printStackTrace();
                
            }
            
        }else if(ae.getSource() == print){
            
            try{
                
                table.print();
            }catch(Exception e){
                e.printStackTrace();
                
            }
            
        }
        else if(ae.getSource() == update){
            setVisible(false);
            new Updateemployees(employeeid.getSelectedItem());
            
        }
        else{
            setVisible(false);
            new Home();
        }
        
    }
        public static void main(String[] args){
        new ViewEmployees();
    }
    
}
