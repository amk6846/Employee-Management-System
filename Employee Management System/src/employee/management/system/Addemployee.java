package employee.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;  //add lobrary for calender
//import java.awt.*;


public class Addemployee extends JFrame implements ActionListener{
    //generate random number
    Random ran = new Random();
    int num = ran.nextInt(999999);
    
    JTextField tfname,tffname,tfdob,tfsalary,tfaddress,tfphone,tfemail,tfdesignation,tfcnic;
    JComboBox tfeducation;
    JButton addetail,back;
    JLabel lbrandom;
    JDateChooser dcdob;   //calender variable and also add calender jar file
    
    Addemployee(){
    super("Add");
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel addemployee = new JLabel("Add Employees Details");
        addemployee.setBounds(320,30,500,50);
        addemployee.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        addemployee.setForeground(Color.DARK_GRAY);
        add(addemployee);
        //name
        JLabel lbname = new JLabel("Name");
        lbname.setBounds(50, 120 , 120 , 30);
        lbname.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbname);
        
        tfname = new JTextField();
        tfname.setBounds(180, 120, 160 ,30 );
        add(tfname);
        //father
           JLabel lbfname = new JLabel("Father Name");
        lbfname.setBounds(470, 120 , 120 , 30);
        lbfname.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbfname.setForeground(Color.white);
        add(lbfname);
        
        tffname = new JTextField();
        tffname.setBounds(630, 120, 160 ,30 );
        add(tffname);
        //Date of birth  /calender required
             JLabel lbdob = new JLabel("Date OF Birth");
        lbdob.setBounds(50, 180 , 120 , 30);
        lbdob.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbdob);
        
        dcdob = new JDateChooser();    //for calender we use JDateChooser Function and get data from here
        dcdob.setBounds(180, 180, 160 ,30 );
        add(dcdob);
        //salary
        
             JLabel lbsalary = new JLabel("Salary");
        lbsalary.setBounds(470, 180 , 120 , 30);
        lbsalary.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbsalary.setForeground(Color.white);
        add(lbsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(630, 180, 160 ,30 );
        add(tfsalary);
        //address
             JLabel lbaddress = new JLabel("Address");
        lbaddress.setBounds(50, 250, 120 , 30);
        lbaddress.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbaddress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(180, 250, 160 ,30 );
        add(tfaddress);
        //phone
              JLabel lbphone = new JLabel("Phone");
        lbphone.setBounds(470, 250 , 120 , 30);
        lbphone.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbphone.setForeground(Color.white);
        add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(630, 250, 160 ,30 );
        add(tfphone);
        //email
              JLabel lbemail = new JLabel("Email");
        lbemail.setBounds(50, 310, 120 , 30);
        lbemail.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(180, 310, 160 ,30 );
        add(tfemail);
        //education
               JLabel lbeducation = new JLabel("Highest Education");
        lbeducation.setBounds(470, 310 , 190 , 30);
        lbeducation.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbeducation.setForeground(Color.white);
        add(lbeducation);
        
        String courses[] = {"BBA","BCA","B.A","B.COM","B.TECH","MBA","MCA","M.A","CA","MSC"};
        tfeducation = new JComboBox(courses);
        tfeducation.setBounds(630, 310, 160 ,30 );
        tfeducation.setBackground(Color.white);
        add(tfeducation);
        //designation
              JLabel lbdesignation = new JLabel("Designation");
        lbdesignation.setBounds(50, 370, 120 , 30);
        lbdesignation.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbdesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(180, 370, 160 ,30 );
        add(tfdesignation);
        //Cnic
         JLabel lbcnic = new JLabel("CNIC Number");
        lbcnic.setBounds(470, 370 , 190 , 30);
        lbcnic.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbcnic.setForeground(Color.white);
        add(lbcnic);
        
        tfcnic = new JTextField();
        tfcnic.setBounds(630, 370, 160 ,30 );
        add(tfcnic);
        //employee id
        JLabel lbempid = new JLabel("Employee Id");
        lbempid.setBounds(50, 420 , 190 , 30);
        lbempid.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        lbempid.setForeground(Color.white);
        add(lbempid);
        //genearate random number
        lbrandom = new JLabel("" + num);
        lbrandom.setBounds(188, 410, 160 ,50 );
        lbrandom.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE, 18));
        add(lbrandom);
//        button
        addetail = new JButton("Add Detail");
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
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg")); 
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String)tfeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String cnic = tfcnic.getText();
            String Empid = lbrandom.getText();
            
            //try catch must bcause database may be error in furure
            try{
                Conn c = new Conn();  //create object of conncetion class which i also created
                //write a query to insert data in db
                String Query = "insert into employees values ('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+cnic+"','"+Empid+"')";
                //to update my db
                c.s.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Details Added Successfully"); //after add data dialog box show
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
        new Addemployee();  //call constructor
    }
}
