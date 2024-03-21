package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.sql.*;
import java.awt.event.*;

public class Withdrawl  extends JFrame implements ActionListener {
	
	JTextField amounttext;
	JButton withdraw , back;
	String pinnumber;
	
	Withdrawl(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to withdraw");
		text.setBounds(170, 300, 400, 20);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System" , Font.BOLD,16));
		image.add(text);
		
		 withdraw = new JButton("Withdraw");
		withdraw.setBounds(355, 485, 150, 30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		
		 back = new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		
		
		amounttext = new JTextField();
		amounttext.setFont(new Font("Raleway" , Font.BOLD, 22));
		amounttext.setBounds(170, 350, 320, 25);
		image.add(amounttext);		
		
		
		setSize(900,900);
		setLocation(300,0);
		
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {

	    if (ae.getSource() == withdraw) {

	        String number = amounttext.getText();
	        Date date = new Date();

	        if (number.equals("")) {
	            JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
	        } else {

	            try {

	                Conn conn = new Conn();
	                String balanceQuery = "select amount from bank where pin='" + pinnumber + "'";
	                ResultSet rs = conn.s.executeQuery(balanceQuery);

	                if (rs.next()) {
	                    int currentBalance = rs.getInt("amount");
	                    int withdrawalAmount = Integer.parseInt(number);

	                    if (withdrawalAmount <= currentBalance) {
	                        String query = "insert into bank values('" + pinnumber + "','" + date + "','Withdrawl','" + number + "')";
	                        conn.s.executeUpdate(query);

	                        // Deduct the withdrawn amount from the balance
	                        String updateQuery = "update bank set amount = amount - " + withdrawalAmount + " where pin ='" + pinnumber + "'";
	                        conn.s.executeUpdate(updateQuery);

	                        JOptionPane.showMessageDialog(null, "Rs " + number + " Withdrawn Successfully");
	                        setVisible(false);
	                        new Transactions(pinnumber).setVisible(true);
	                    }
	                    
	                    
	                    
	                    
	                    else {
	                        JOptionPane.showMessageDialog(null, "Insufficient Balance. You can't withdraw Rs " + number);
	                    }
	                }

	            } catch (Exception e) {
	                System.out.print(e);
	            }
	            
	            

	        }

	    }
	    
	    else if(ae.getSource() == back) {
			
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
			
		}
	}

	
	
	public static void main(String[] args) {
		
		new Withdrawl("");

	}

}

