package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	int i=11100;
	double temp=0,b;
	String tax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket window = new Ticket();
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
	public Ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 953, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(249, 11, 415, 71);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblTicketBooking.setBounds(10, 11, 380, 60);
		panel.add(lblTicketBooking);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(414, 85, 506, 385);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblName_1.setBounds(10, 41, 77, 28);
		panel_1.add(lblName_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(158, 41, 140, 34);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFrom.setBounds(10, 107, 77, 26);
		panel_1.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTo.setBounds(10, 166, 46, 14);
		panel_1.add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDate.setBounds(10, 212, 77, 28);
		panel_1.add(lblDate);
		
		textField_5 = new JTextField();
		textField_5.setBounds(158, 98, 140, 34);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 152, 140, 34);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(158, 211, 140, 34);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTicketNumber = new JLabel("Ticket No");
		lblTicketNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTicketNumber.setBounds(358, 47, 77, 28);
		panel_1.add(lblTicketNumber);
		
		textField_8 = new JTextField();
		textField_8.setBounds(358, 87, 111, 28);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(358, 157, 111, 28);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(368, 126, 46, 14);
		panel_1.add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRoute.setBounds(368, 194, 63, 28);
		panel_1.add(lblRoute);
		
		textField_10 = new JTextField();
		textField_10.setBounds(358, 224, 111, 28);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(284, 243, 105, 31);
		frame.getContentPane().add(comboBox_2);
		JRadioButton rdbtnReturnTicket = new JRadioButton("AC");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnReturnTicket.setBounds(128, 195, 60, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				frame =new JFrame("Exit");
				
				 int a=JOptionPane.showConfirmDialog(frame,"Confirm?");  
				 if(a==JOptionPane.YES_OPTION){  
				     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
				 
                         String str="";
					if(rdbtnReturnTicket.isSelected()) 
						str="AC";
					else
						str="NON";
				 DefaultTableModel model=(DefaultTableModel) table_1.getModel();
					{
					model.addRow(new String[] {
					textField_4.getText(),
					textField_9.getText(),
					textField_5.getText(),
					textField_6.getText(),
					(String) comboBox_2.getSelectedItem(),
					textField_8.getText(),
					str,
					textField_7.getText(),
					
					
						
					textField_9.getText(),
					});
					}}
				
				
	
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirm.setBounds(289, 321, 111, 34);
		panel_1.add(btnConfirm);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTime.setBounds(10, 272, 63, 26);
		panel_1.add(lblTime);
		
		textField_11 = new JTextField();
		textField_11.setBounds(158, 269, 140, 34);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setBounds(14, 84, 98, 31);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(166, 85, 144, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(14, 136, 390, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnStandard.setBounds(14, 145, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Single Ticket");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(132, 145, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnAdult.setBounds(280, 145, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFirstClass.setBounds(14, 195, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
	
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnChild.setBounds(299, 195, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamilnadu", "Arunachal pradesh", "Andra pradesh", "Karnataka", "Rajasthan"}));
		comboBox.setBounds(14, 244, 105, 31);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Uttar pradesh", "Kerala", "Tamilnadu", "Arunachal pradesh", "Andra pradesh", "Karnataka", "Rajasthan"}));
		comboBox_1.setBounds(147, 244, 105, 31);
		frame.getContentPane().add(comboBox_1);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(14, 286, 390, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblSubTotal = new JLabel("Tax");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubTotal.setBounds(14, 305, 60, 14);
		frame.getContentPane().add(lblSubTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 299, 110, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSubTotal_1 = new JLabel("Sub Total");
		lblSubTotal_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubTotal_1.setBounds(14, 344, 82, 23);
		frame.getContentPane().add(lblSubTotal_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 341, 110, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setBounds(14, 390, 66, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 383, 110, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(14, 425, 390, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(410, 176, 1, 2);
		frame.getContentPane().add(separator_3);
		JRadioButton rdbtnSleeper_1 = new JRadioButton("Sleeper");
		rdbtnSleeper_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnSleeper_1.setBounds(190, 196, 109, 23);
		frame.getContentPane().add(rdbtnSleeper_1);
	
	
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				textField_4.setText(name);
				String from=(String) comboBox.getSelectedItem();
				textField_5.setText(from);
				String to=(String) comboBox_1.getSelectedItem();
				textField_6.setText(to);
				
				Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_7.setText(tTime.format(timer.getTime()));
                //Date
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_11.setText(tdate.format(timer.getTime()));
                String bkn=String.format("%d", i);
                textField_8.setText(bkn);
                i++;
                textField_10.setText("Any");
                double temp=0;
               double tot=0;
                if(rdbtnNewRadioButton.isSelected())
                     temp=temp+500;
                    else
                     temp=temp+700;
                
                if(rdbtnReturnTicket.isSelected()) 
                 temp=temp+500;
                 
                 
                 else
                 temp=temp+300;
         
                 if(rdbtnSleeper_1.isSelected())
                  temp=temp+500;
                  else
                  temp=temp+300;
                 String text = (String)comboBox_2.getSelectedItem();
                 int b = Integer.parseInt(text);
               
                 temp=temp*b;
                String ans= String.format("%.2f", temp);
                 
					textField_2.setText(ans);

					if(rdbtnReturnTicket.isSelected())
					{
						textField_1.setText("200");
						tot=temp+200;
						String an= String.format("%.2f", tot);
						textField_3.setText(an);
						textField_9.setText(an);
						
					}
					else {
						textField_1.setText("100");
					tot=temp+100;
					String an= String.format("%.2f", tot);
					textField_3.setText(an);
					textField_9.setText(an);}
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(7, 438, 89, 31);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				i--;
				
				
		
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(132, 438, 89, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) 
				{System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(265, 438, 89, 31);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-2, 136, 10, 10);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(14, 481, 913, 128);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		table = new JTable();
		table.setBounds(456, 5, 0, 0);
		panel_3.add(table);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No:of seat", "Time", "Date","AC/Non-Ac","Price"}
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(10, 11, 893, 100);
		panel_3.add(table_1);
		
	
	}
}
