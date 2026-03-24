import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
	String msg = "";
	MyFrame(){
		setSize(600,700);
		setTitle("MyFrame");
		setVisible(true);
		addWindowListener(new Cls());
		setLayout(new FlowLayout());
		

		// Button B1 = new Button("Submit");
		// Button B2 = new Button("Reset");
		// B1.addActionListener(this);
		// B2.addActionListener(this);
		// B1.setBounds(50,150,70,45);
		// B2.setBounds(50,200,70,45);
		// add(B1);
		// add(B2);

        Label name , Roll_No ,Age,PRN,Subject;
        name = new Label("Name" , Label.RIGHT);
        Age = new Label("Age" , Label.RIGHT);
        Roll_No = new Label("Roll_No" , Label.RIGHT);
        PRN = new Label("PRN NO" , Label.RIGHT);
        Subject = new Label("Subject" , Label.RIGHT);
        name.addActionListener(this);
        Age.addActionListener(this);
        Roll_No.addActionListener(this);
        PRN.addActionListener(this);
        Subject.addActionListener(this);
        add(name);
        add(Roll_No);
        add(Age);
        add(PRN);
        add(Subject);
	}

	public void actionPerformed(ActionEvent ae){
		// String str = ae.getActionCommand();
		// if(str.equals("Submit")){
		// 	msg = "Form submited Sucessfully";
		// 	repaint();
		// }
		// if(str.equals("Reset")){
		// 	msg = "For Reseted Sucessfully";
		// 	repaint();
		// }
        repaint();

	}
	public void paint(Graphics g){
		// g.setColor(Color.red);
		// Font f = new Font("Times New Roman" , Font.BOLD + Font.ITALIC,30);
		// g.setFont(f);
		// g.drawString("Rohit Mahale",50,100);
		// Font f2 = new Font("Times New Roman" , Font.BOLD + Font.ITALIC,15);
		// g.setFont(f2);
		// g.drawString(msg,150,200);
	}

	public static void main(String args[]){
		new MyFrame();

	}
}
class Cls extends WindowAdapter{

	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}