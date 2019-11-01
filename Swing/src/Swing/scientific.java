package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class scientific {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result;
	String ans,op;
	double INDIA=100.68;
	double USA=70.96;
	double FRANCE=88;
	double JAPAN=78;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientific window = new scientific();
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
	public scientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calculator");
		frame.setBounds(100, 100, 991, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 967, 28);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStanderd = new JMenuItem("Standerd");
		
		mntmStanderd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 354, 577);
				textField.setBounds(10, 27, 289, 56);
				
			}
		});
		mnFile.add(mntmStanderd);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 648, 577);
				textField.setBounds(10, 27, 957, 56);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConvertion = new JMenuItem("Unit Conversion");
		mntmUnitConvertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmUnitConvertion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Comfirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION){
					
						System.exit(0);
			}}
		});
		mnFile.add(mntmExit);
		
		textField = new JTextField();
		textField.setBounds(10, 44, 618, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				b=strB.toString();
				textField.setText(b);

				}}
		});
		btnNewButton.setBounds(10, 104, 63, 74);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(74, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(137, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+\r\n-");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				ans=String.format("%.2f", num1);
				textField.setText("-"+ans);
				
			}
		});
		btnNewButton_3.setBounds(199, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sqrt");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sqrt(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_4.setBounds(273, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("LOG");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.log(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(346, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sin");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sin(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(419, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Sinh");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sinh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_7.setBounds(492, 104, 63, 74);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Mod");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Mod";
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_8.setBounds(565, 102, 63, 74);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_9.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_9.setBounds(10, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_10.getText();
				textField.setText(num);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_10.setBounds(74, 188, 63, 75);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_11.getText();
				textField.setText(num);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_11.setBounds(137, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="/";
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_12.setBounds(199, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("%");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_13.setBounds(273, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("pi");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=num1*3.14159;
				textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_14.setBounds(346, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Cos");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cos(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_15.setBounds(419, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Cosh");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cosh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_16.setBounds(492, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("lnx");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.pow(2, num1);
				textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_17.setBounds(565, 189, 63, 74);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("4");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1=textField.getText()+btnNewButton_18.getText();
				textField.setText(num1);
			}
		});
		btnNewButton_18.setBounds(10, 276, 63, 74);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("1");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_19.getText();
				textField.setText(num);
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_19.setBounds(10, 361, 63, 74);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("5");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_20.getText();
				textField.setText(num);
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_20.setBounds(73, 276, 63, 74);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("2");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_21.getText();
				textField.setText(num);
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_21.setBounds(74, 361, 63, 74);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("6");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_22.getText();
				textField.setText(num);
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_22.setBounds(137, 275, 63, 75);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("3");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_23.getText();
				textField.setText(num);
			}
		});
		btnNewButton_23.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_23.setBounds(137, 360, 63, 75);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("*");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="*";
			}
		});
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_24.setBounds(199, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("-");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="-";
			}
		});
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_25.setBounds(199, 361, 63, 74);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("1/X");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=1/num1;;
				 textField.setText(String.valueOf(num1));	
			}
		});
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_26.setBounds(273, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("X^Y");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_27.setBounds(346, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("=");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
				result=num1 + num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="-") {
				result=num1 - num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="*") {
				result=num1 * num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="/") {
				result=num1 / num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="Mod") {
				result=num1 % num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="x^y") {
					result=Math.pow(num1,num2);
					ans=String.format("%.2f",result);
					textField.setText(ans);
					}
				if(op=="cbr") {
					result=(num1/num2)*100;
					ans=String.format("%.2f",result);
					textField.setText(ans);
					}
				if(op=="%")
				{
					result=num1 % num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			
				
	
			}
		});
		btnNewButton_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_28.setBounds(273, 361, 63, 151);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("X^2");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=num1*num1;
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_29.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_29.setBounds(346, 362, 63, 74);
		frame.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("Tan");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sin(num1);
				 textField.setText(String.valueOf(num1));	
			}
		});
		btnNewButton_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_30.setBounds(419, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("Tanh");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tanh(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_31.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_31.setBounds(492, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("Cbr");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="cbr";
			}
		});
		btnNewButton_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_32.setBounds(419, 361, 63, 74);
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Round");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.round(num1);
				 textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_33.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_33.setBounds(492, 362, 63, 75);
		frame.getContentPane().add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("C");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_34.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_34.setBounds(565, 274, 63, 76);
		frame.getContentPane().add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("2pi");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=num1*3.14159*2;
				textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_35.setBounds(565, 363, 63, 74);
		frame.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("0");
		btnNewButton_36.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnNewButton_36.getText();
				textField.setText(num);
			}
		});
		btnNewButton_36.setBounds(10, 449, 127, 63);
		frame.getContentPane().add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton(".");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_37.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_37.setBounds(137, 446, 63, 66);
		frame.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("+");
		btnNewButton_38.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="+";
				
			}
		});
		btnNewButton_38.setBounds(199, 446, 63, 66);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("X^3");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=num1*num1*num1;
				 textField.setText(String.valueOf(num1));
				
			}
		});
		btnNewButton_39.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_39.setBounds(346, 446, 63, 66);
		frame.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Bin");
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
			}
		});
		btnNewButton_40.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_40.setBounds(419, 446, 63, 66);
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("Hex");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnNewButton_41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_41.setBounds(492, 448, 63, 66);
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("Octal");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnNewButton_42.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_42.setBounds(565, 448, 63, 65);
		frame.getContentPane().add(btnNewButton_42);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(638, 39, 329, 462);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 309, 440);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vijaya", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 42, 324, 42);
		panel_1.add(lblNewLabel);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "INDIA", "FRANCE", "JAPAN", "CHINA"}));
		comboBox.setBounds(98, 95, 143, 33);
		panel_1.add(comboBox);
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setBounds(73, 282, 192, 33);
		panel_1.add(label);
		
		
		JButton btnNewButton_43 = new JButton("Convert");
		btnNewButton_43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("INDIA"));
				{
					String c=String.format("RS.%.2f",bp*INDIA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("USA"));
				{
					String c=String.format("$.%.2f",bp*USA);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("JAPAN"));
				{
					String c=String.format(".%.2f",bp*JAPAN);
					label.setText(c);
				}
				if(comboBox.getSelectedItem().equals("FRANCE"));
				{
					String c=String.format("RS.%.2f",bp*FRANCE);
					label.setText(c);
				}
			}
		});
		btnNewButton_43.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_43.setBounds(43, 369, 116, 51);
		panel_1.add(btnNewButton_43);
		
		JButton btnNewButton_44 = new JButton("Clear");
		btnNewButton_44.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_44.setBounds(187, 369, 116, 51);
		panel_1.add(btnNewButton_44);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 185, 192, 42);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
