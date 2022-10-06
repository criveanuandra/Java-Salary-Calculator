package salarycalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class salary {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtsal;
	private JTextField txttax;
	private JTextField txtnsal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salary window = new salary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public salary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 498, 343);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 58, 202, 25);
		panel.add(lblNewLabel);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalary.setBounds(10, 115, 85, 25);
		panel.add(lblSalary);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(10, 164, 85, 25);
		panel.add(lblTax);
		
		JLabel lblNetSalary = new JLabel("Net Salary");
		lblNetSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNetSalary.setBounds(21, 211, 119, 25);
		panel.add(lblNetSalary);
		
		txtName = new JTextField();
		txtName.setBounds(237, 75, 147, 30);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtsal = new JTextField();
		txtsal.setBounds(237, 115, 86, 20);
		panel.add(txtsal);
		txtsal.setColumns(10);
		
		txttax = new JTextField();
		txttax.setBounds(237, 145, 86, 20);
		panel.add(txttax);
		txttax.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double salary =  Double.parseDouble(txtsal.getText());
				double tax;
				double nsal;
				if(salary >=2550)
				{
					tax = salary * 41.5/100;
					nsal = salary - tax;		
				
					
				}
				
				else 
					if(salary > 2500  )
					{
						tax = salary *41.5/100;
						nsal = salary - tax;
						
						
					}
					else
						tax = 0;
			txttax.setText(String.valueOf(tax));
			double nsal1 = salary - tax;
			txtnsal.setText(String.valueOf(nsal1));
			}
		});
		btnNewButton.setBounds(6, 271, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
txtName.setText("");
txtsal.setText("");
txttax.setText("");
txtnsal.setText("");
txtName.requestFocus();

				
				
			}
		});
		btnClear.setBounds(136, 271, 89, 23);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setHorizontalAlignment(SwingConstants.LEFT);
		btnExit.setBounds(295, 271, 89, 23);
		panel.add(btnExit);
		
		txtnsal = new JTextField();
		txtnsal.setBounds(237, 205, 86, 20);
		panel.add(txtnsal);
		txtnsal.setColumns(10);
		
		JLabel lbIEmployeeSalaryCalculator = new JLabel("Employee Salary Calculating");
		lbIEmployeeSalaryCalculator.setForeground(Color.MAGENTA);
		lbIEmployeeSalaryCalculator.setBackground(Color.PINK);
		lbIEmployeeSalaryCalculator.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lbIEmployeeSalaryCalculator.setBounds(33, 11, 435, 36);
		panel.add(lbIEmployeeSalaryCalculator);
	}
}
