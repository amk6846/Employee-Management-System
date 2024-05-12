package employee.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class Updateemployees extends JFrame implements ActionListener{

    JTextField tffname ,tfsalary,tfaddress,tfphone,tfeducation,tfemail,tfdesignation;
    JButton addetail,back;
    JLabel lbrandom,dcdob,tfcnic,empid; 
    String Empid;
    
    Updateemployees(String Empid){
    super("Update");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        this.Empid = Empid;
        
        JLabel addemployee = new JLabel("Update Employees Details");
        addemployee.setBounds(300,30,500,50);
        addemployee.setFont(new Font("SAN_SERIF", Font.BOLD, 22));
        addemployee.setForeground(Color.DARK_GRAY);
        add(addemployee);
        //name
        JLabel lbname = new JLabel("Name");
        lbname.setBounds(50, 120 , 120 , 30);
        lbname.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbname);
        
        JLabel tfname = new JLabel();
        tfname.setBounds(140, 120, 140 ,30 );
        add(tfname);
        //father
           JLabel lbfname = new JLabel("Father Name");
        lbfname.setBounds(470, 120 , 120 , 30);
        lbfname.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbfname);
        
        tffname = new JTextField();
        tffname.setBounds(630, 120, 140 ,30 );
        add(tffname);
        //Date of birth  /calender required
             JLabel lbdob = new JLabel("Date OF Birth");
        lbdob.setBounds(50, 180 , 120 , 30);
        lbdob.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbdob);
        
        dcdob = new JLabel();    //for calender we use JDateChooser Function and get data from here
        dcdob.setBounds(180, 180, 140 ,30 );
        add(dcdob);
        //salary
        
             JLabel lbsalary = new JLabel("Salary");
        lbsalary.setBounds(470, 180 , 120 , 30);
        lbsalary.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(630, 180, 140 ,30 );
        add(tfsalary);
        //address
             JLabel lbaddress = new JLabel("Address");
        lbaddress.setBounds(50, 250, 120 , 30);
        lbaddress.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbaddress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(180, 250, 140 ,30 );
        add(tfaddress);
        //phone
              JLabel lbphone = new JLabel("Phone");
        lbphone.setBounds(470, 250 , 120 , 30);
        lbphone.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(630, 250, 140 ,30 );
        add(tfphone);
        //email
              JLabel lbemail = new JLabel("Email");
        lbemail.setBounds(50, 310, 120 , 30);
        lbemail.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(180, 310, 140 ,30 );
        add(tfemail);
        //education
        JLabel lbeducation = new JLabel("Highest Education");
        lbeducation.setBounds(470, 310 , 190 , 30);
        lbeducation.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbeducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(630, 310, 140 ,30 );
        tfeducation.setBackground(Color.white);
        add(tfeducation);
        //designation
              JLabel lbdesignation = new JLabel("Designation");
        lbdesignation.setBounds(50, 370, 120 , 30);
        lbdesignation.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbdesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(180, 370, 140 ,30 );
        add(tfdesignation);
        //Cnic
         JLabel lbcnic = new JLabel("CNIC Number");
        lbcnic.setBounds(470, 370 , 190 , 30);
        lbcnic.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbcnic);
        
        JLabel tfcnic = new JLabel();
        tfcnic.setBounds(630, 370, 140 ,30 );
        add(tfcnic);
        //employee id
        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(50, 420 , 190 , 30);
        empid.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(empid);
        
        lbrandom = new JLabel();
        lbrandom.setBounds(188, 410, 160 ,50 );
        lbrandom.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbrandom);
        
               try{    //use reason is database work so chances of errors
                Conn c = new Conn();   //connection
                String query = "select * from employees where empid = '"+Empid+"'";
                ResultSet rs = c.s.executeQuery(query);  //statement
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tffname.setText(rs.getString("fname"));
                    dcdob.setText(rs.getString("dob"));
                    tfsalary.setText(rs.getString("salary"));
                    tfaddress.setText(rs.getString("address"));
                    tfphone.setText(rs.getString("phone"));
                    tfemail.setText(rs.getString("email"));
                    tfeducation.setText(rs.getString("education"));
                    tfdesignation.setText(rs.getString("designation"));
                    tfcnic.setText(rs.getString("cnic"));
                    empid.setText(rs.getString("empid"));
                }
                
            }catch(Exception ea){
                ea.printStackTrace();
                
            }
        //buttons
        addetail = new JButton("Update Detail");
        addetail.setBounds(480, 520 , 150 , 40);
        addetail.setBackground(Color.black);
        addetail.setForeground(Color.white);
        addetail.setFont(new Font("SAN_SERIF", Font.CENTER_BASELINE, 16));
        addetail.addActionListener(this);
        add(addetail);
        //back button
        back = new JButton("Back");
        back.setBounds(650, 520 , 150 , 40);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("SAN_SERIF", Font.CENTER_BASELINE, 16));
        back.addActionListener(this);
        add(back);
        
        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3);   
        image.setBounds(0 , 0 , 900 , 650);  
        add(image);
 
        
    setSize(900, 650);
    setLocation(250,50);
    setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        //get values from text fields and store it on variable
        if(ae.getSource() == addetail){
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            
            //try catch must bcause database may be error in furure
            try{
                Conn c = new Conn();  //create object of conncetion class which i also created
                //write a query to insert data in db
                String query = "update employees set fname = '"+fname+"',salary = '"+salary+"',address = '"+address+"',phone = '"+phone+"',email = '"+email+"',education = '"+education+"',designation = '"+designation+"' where empid = '"+Empid+"'";
                //to update my db
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Updated Successfully"); //after add data dialog box show
                setVisible(false);  //set screen out and back to the home screen
                new Home();
                
            }catch(Exception ea){
                ea.printStackTrace();
            }
        }
        else
        {
            //when i click on back button set screen out and create a new object of home screen
            setVisible(false);
            new Home();
        }
        
    }
    
    
    
    public static void main(String[] args){
        new Updateemployees("");  //call constructor
    }
}
