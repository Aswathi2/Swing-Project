package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {

private JFrame frame;
private JTextField textField_1;
double num1;
double num2;
double result;
String op;
String ans;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Cal window = new Cal();
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
public Cal() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(new Color(64, 64, 64));
frame.getContentPane().setForeground(Color.WHITE);
frame.setBounds(100, 100, 450, 401);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

textField_1 = new JTextField();
textField_1.setBackground(Color.LIGHT_GRAY);
textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
textField_1.setBounds(42, 11, 352, 49);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);

JButton button = new JButton("1");
button.setBackground(Color.LIGHT_GRAY);
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button.getText();
textField_1.setText(Number);
}
});
button.setFont(new Font("Tahoma", Font.BOLD, 13));
button.setBounds(40, 71, 52, 34);
frame.getContentPane().add(button);

JButton button_1 = new JButton("2");
button_1.setBackground(Color.LIGHT_GRAY);
button_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_1.getText();
textField_1.setText(Number);
}
});
button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
button_1.setBounds(141, 71, 50, 34);
frame.getContentPane().add(button_1);

JButton button_2 = new JButton("3");
button_2.setBackground(Color.LIGHT_GRAY);
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_2.getText();
textField_1.setText(Number);
}
});
button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
button_2.setBounds(246, 71, 50, 34);
frame.getContentPane().add(button_2);

JButton button_3 = new JButton("+");
button_3.setBackground(Color.CYAN);
button_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField_1.getText());
textField_1.setText("");
op="+";
}
});
button_3.setForeground(Color.BLUE);
button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
button_3.setBounds(343, 71, 50, 34);
frame.getContentPane().add(button_3);

JButton button_4 = new JButton("4");
button_4.setBackground(Color.LIGHT_GRAY);
button_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_4.getText();
textField_1.setText(Number);
}
});
button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
button_4.setBounds(40, 129, 50, 34);
frame.getContentPane().add(button_4);

JButton button_5 = new JButton("5");
button_5.setBackground(Color.LIGHT_GRAY);
button_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_5.getText();
textField_1.setText(Number);
}
});
button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
button_5.setBounds(141, 129, 50, 34);
frame.getContentPane().add(button_5);

JButton button_6 = new JButton("6");
button_6.setBackground(Color.LIGHT_GRAY);
button_6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_6.getText();
textField_1.setText(Number);
}
});
button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
button_6.setBounds(246, 129, 50, 34);
frame.getContentPane().add(button_6);

JButton button_7 = new JButton("-");
button_7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField_1.getText());
textField_1.setText("");
op="-";

}
});
button_7.setBackground(Color.CYAN);
button_7.setForeground(Color.BLUE);
button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
button_7.setBounds(343, 129, 51, 34);
frame.getContentPane().add(button_7);

JButton button_8 = new JButton("7");
button_8.setBackground(Color.LIGHT_GRAY);
button_8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_8.getText();
textField_1.setText(Number);
}
});
button_8.setFont(new Font("Tahoma", Font.BOLD, 13));
button_8.setBounds(40, 185, 50, 32);
frame.getContentPane().add(button_8);

JButton button_9 = new JButton("8");
button_9.setBackground(Color.LIGHT_GRAY);
button_9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_9.getText();
textField_1.setText(Number);
}
});
button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
button_9.setBounds(141, 185, 50, 32);
frame.getContentPane().add(button_9);

JButton button_10 = new JButton("9");
button_10.setBackground(Color.LIGHT_GRAY);
button_10.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_10.getText();
textField_1.setText(Number);
}
});
button_10.setFont(new Font("Tahoma", Font.BOLD, 13));
button_10.setBounds(246, 185, 50, 32);
frame.getContentPane().add(button_10);

JButton button_11 = new JButton("*");
button_11.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField_1.getText());
textField_1.setText("");
op="*";
}
});
button_11.setBackground(Color.CYAN);
button_11.setForeground(Color.BLUE);
button_11.setFont(new Font("Tahoma", Font.BOLD, 13));
button_11.setBounds(343, 185, 51, 32);
frame.getContentPane().add(button_11);

JButton button_12 = new JButton("0");
button_12.setBackground(Color.LIGHT_GRAY);
button_12.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Number=textField_1.getText()+button_12.getText();
textField_1.setText(Number);
}
});
button_12.setFont(new Font("Tahoma", Font.BOLD, 13));
button_12.setBounds(40, 239, 50, 34);
frame.getContentPane().add(button_12);

JButton button_13 = new JButton(".");
button_13.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
button_13.setBackground(Color.LIGHT_GRAY);
button_13.setFont(new Font("Tahoma", Font.BOLD, 13));
button_13.setBounds(141, 239, 50, 34);
frame.getContentPane().add(button_13);

JButton button_14 = new JButton("=");
button_14.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String ans;
num2=Double.parseDouble(textField_1.getText());
if(op=="+") {
result=num1 + num2;
ans=String.format("%.2f",result);
textField_1.setText(ans);
}
if(op=="-") {
result=num1 - num2;
ans=String.format("%.2f",result);
textField_1.setText(ans);
}
if(op=="*") {
result=num1 * num2;
ans=String.format("%.2f",result);
textField_1.setText(ans);
}
if(op=="/") {
result=num1 / num2;
ans=String.format("%.2f",result);
textField_1.setText(ans);
}
if(op=="%") {
result=num1 % num2;
ans=String.format("%.2f",result);
textField_1.setText(ans);
}
}
});
button_14.setBackground(Color.LIGHT_GRAY);
button_14.setForeground(Color.RED);
button_14.setFont(new Font("Tahoma", Font.BOLD, 13));
button_14.setBounds(246, 239, 50, 34);
frame.getContentPane().add(button_14);

JButton button_15 = new JButton("/");
button_15.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField_1.getText());
textField_1.setText("");
op="/";
}
});
button_15.setBackground(Color.CYAN);
button_15.setForeground(Color.BLUE);
button_15.setFont(new Font("Tahoma", Font.BOLD, 13));
button_15.setBounds(344, 240, 50, 33);
frame.getContentPane().add(button_15);

JButton btnC = new JButton("C");
btnC.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_1.setText(null);
}
});
btnC.setBackground(new Color(192, 192, 192));
btnC.setForeground(new Color(0, 0, 255));
btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
btnC.setBounds(40, 296, 50, 32);
frame.getContentPane().add(btnC);

JButton btnB = new JButton("B");
btnB.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String b=null;
if(textField_1.getText().length()>0)
{
StringBuilder strB=new StringBuilder(textField_1.getText());
strB.deleteCharAt(textField_1.getText().length()-1);
b=strB.toString();
textField_1.setText(b);

}
}
});
btnB.setBackground(Color.LIGHT_GRAY);
btnB.setFont(new Font("Tahoma", Font.BOLD, 13));
btnB.setForeground(Color.BLUE);
btnB.setBounds(141, 296, 50, 32);
frame.getContentPane().add(btnB);

JButton button_16 = new JButton("%");
button_16.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
num1=Double.parseDouble(textField_1.getText());
textField_1.setText("");
op="%";
}
});
button_16.setBackground(Color.CYAN);
button_16.setForeground(Color.BLUE);
button_16.setFont(new Font("Tahoma", Font.BOLD, 13));
button_16.setBounds(344, 296, 50, 32);
frame.getContentPane().add(button_16);
}

}
