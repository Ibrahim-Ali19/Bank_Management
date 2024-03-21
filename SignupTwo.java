package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo  extends JFrame implements  ActionListener {
	
	
	JTextField pan , aadhar;
	JRadioButton male , female , other , married , unmarried ;
	JButton next;
	JRadioButton eyes , eno , syes , sno;
	JComboBox religion , category , income, education , occupation;
	String formno;
	
	
	SignupTwo(String formno){
		
		this.formno = formno;
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		setLayout(null);
	
		
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway" , Font.BOLD ,22));
		additionalDetails.setBounds(290, 80, 400 , 30);
		add(additionalDetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Raleway" , Font.BOLD ,20));
		name.setBounds(100, 140, 100 , 30);
		add(name);
		
		String valReligion[] = {"Islam" , "Hinduism" ,"Sikhism" , "Christianity", "Other"};
		 religion = new JComboBox(valReligion);
		religion.setBackground(Color.WHITE);
		religion.setBounds(300 , 140 , 400 , 30);
		add(religion);
		
		
		JLabel categoryjb = new JLabel("Category:");
		categoryjb.setFont(new Font("Raleway" , Font.BOLD ,20));
		categoryjb.setBounds(100, 190, 200 , 30);
		add(categoryjb);
		
		String valCategory[] = {"General" , "OBC" ,"ST" , "SC", "Other"};
	    category = new JComboBox(valCategory);
		category.setBackground(Color.WHITE);
		category.setBounds(300 , 190 , 400 , 30);
		add(category);
		
		JLabel incomejb = new JLabel("Income:");
		incomejb.setFont(new Font("Raleway" , Font.BOLD ,20));
		incomejb.setBounds(100, 240, 200 , 30);
		add(incomejb);
		
		String valIncome[] = {"Null" , "< 1,50,000" ,"< 2,50,000" , "< 5,00,000", "upto 10,00,000"};
		 income = new JComboBox(valIncome);
		income.setBackground(Color.WHITE);
		income.setBounds(300 , 240 , 400 , 30);
		add(income);
		
		
		JLabel gender = new JLabel("Educational");
		gender.setFont(new Font("Raleway" , Font.BOLD ,20));
		gender.setBounds(100, 290, 200 , 30);
		add(gender);
		
		
		JLabel email = new JLabel("Qualification:");
		email.setFont(new Font("Raleway" , Font.BOLD ,20));
		email.setBounds(100, 315, 290 , 30);
		add(email);
		
		String educationValues[] = {"Non-Graduate" , "Graduate" ,"Post-Graduate" , "Doctrate", "Other"};
		 education = new JComboBox(educationValues);
		education.setBackground(Color.WHITE);
		education.setBounds(300 , 315 , 400 , 30);
		add(education);
		
		
		JLabel martial = new JLabel("Occupation:");
		martial.setFont(new Font("Raleway" , Font.BOLD ,20));
		martial.setBounds(100, 390, 200 , 30);
		add(martial);
		
		String occupationValues[] = {"Employee" , "Freelancer" ,"Business" , "Student", "Other"};
		 occupation = new JComboBox(occupationValues);
		occupation.setBackground(Color.WHITE);
		occupation.setBounds(300 , 390 , 400 , 30);
		add(occupation);
		
		
		
		
		JLabel address = new JLabel("Pan Number:");
		address.setFont(new Font("Raleway" , Font.BOLD ,20));
		address.setBounds(100, 440, 200 , 30);
		add(address);
		

		 pan = new JTextField();
		 pan.setFont(new Font("Raleway" , Font.BOLD , 14));
		 pan.setBounds(300 , 440 , 400 , 30);
		add(pan);
		
		JLabel city = new JLabel("Aadhar Number:");
		city.setFont(new Font("Raleway" , Font.BOLD ,20));
		city.setBounds(100, 490, 200 , 30);
		add(city);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway" , Font.BOLD , 14));
		aadhar.setBounds(300 , 490 , 400 , 30);
		add(aadhar);
		
		JLabel state = new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway" , Font.BOLD ,20));
		state.setBounds(100, 540, 200 , 30);
		add(state);
		
		
		  syes = new JRadioButton("Yes");
		  syes.setBounds(300 , 540 , 60 , 30);
		  syes.setBackground(Color.WHITE);
			add(syes);
			
			 sno = new JRadioButton("No");
			 sno.setBounds(450 , 540 , 120 , 30);
			 sno.setBackground(Color.WHITE);
			add(sno);
			
			ButtonGroup gendergroup = new ButtonGroup();
			gendergroup.add(syes);
			gendergroup.add(sno);
			
			
		 
		
		JLabel pincode = new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway" , Font.BOLD ,20));
		pincode.setBounds(100, 590, 200 , 30);
		add(pincode);
		
		  eyes = new JRadioButton("Yes");
		  eyes.setBounds(300 , 590 , 60 , 30);
		  eyes.setBackground(Color.WHITE);
			add(eyes);
			
			 eno = new JRadioButton("No");
			 eno.setBounds(450 , 590 , 120 , 30);
			 eno.setBackground(Color.WHITE);
			add(eno);
			
			ButtonGroup esenior = new ButtonGroup();
			esenior.add(eyes);
			esenior.add(eno);
		
		
		 next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway" , Font.BOLD , 14));
		next.setBounds(620 , 660 , 80 , 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850 , 800);
		setLocation(350 , 10);
		setVisible(true);
		 
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		String sreligion = (String)religion.getSelectedItem();
		String scategory = (String)category.getSelectedItem();
		String sincome =  (String)income.getSelectedItem();
		String seducation = (String)education.getSelectedItem();
		String soccupation = (String)occupation.getSelectedItem();
		
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen = "Yes";
		}
		else if(sno.isSelected()) {
			seniorcitizen = "No";
		}
		
		String existingaccount = null;
		if(eyes.isSelected()) {
			existingaccount = "Yes";
		}
		else if(eno.isSelected()) {
			existingaccount = "No";
		}
		
		
		String span = pan.getText();
		String saadhar = aadhar.getText();
		
		try { 
			
 
	 
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+ "' , '"+sreligion + "' , '"+scategory+ "' , '"+ sincome + "' , '"+seducation + "' , '"+soccupation + "','"+ span + "' ,'"+ saadhar + "' ,'"+ seniorcitizen + "' , '"+existingaccount+ "' )";
				c.s.executeUpdate(query);
		    
				
				
				setVisible(false);
				new SignupThree(formno).setVisible(true);
			
		}
		
		catch(Exception e) {
			System.out.print(e);
		}
		
	}
	

	public static void main(String[] args) {

		new SignupTwo("");
	}

}

