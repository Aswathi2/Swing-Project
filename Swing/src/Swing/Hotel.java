package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class Hotel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 976, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystems = new JLabel("Hotel Management Systems");
		lblHotelManagementSystems.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelManagementSystems.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHotelManagementSystems.setBounds(179, 25, 440, 37);
		frame.getContentPane().add(lblHotelManagementSystems);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 78, 424, 278);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChickenBurger.setBounds(10, 49, 129, 25);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChickenBurgerMeal.setBounds(10, 92, 160, 17);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheeseBurger.setBounds(10, 132, 112, 14);
		panel.add(lblCheeseBurger);
		
		textField = new JTextField();
		textField.setBounds(218, 49, 150, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 87, 150, 25);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 126, 150, 25);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 161, 358, 2);
		panel.add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrink.setBounds(10, 175, 46, 25);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQty.setBounds(218, 175, 46, 25);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee", "Juice"}));
		comboBox.setBounds(10, 211, 98, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(218, 207, 150, 25);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnHomeDelivery.setBounds(13, 248, 109, 23);
		panel.add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnTax.setBounds(218, 248, 109, 23);
		panel.add(rdbtnTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(10, 565, 950, 90);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(10, 367, 424, 187);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDrinks.setBounds(10, 33, 127, 14);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfMeal.setBounds(10, 86, 101, 14);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDelivery.setBounds(10, 144, 127, 14);
		panel_2.add(lblCostOfDelivery);
		
		textField_4 = new JTextField();
		textField_4.setBounds(220, 24, 147, 28);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 77, 147, 28);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(220, 135, 147, 28);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(444, 78, 254, 278);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(444, 367, 254, 187);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(708, 78, 252, 476);
		frame.getContentPane().add(panel_5);
	}
}
