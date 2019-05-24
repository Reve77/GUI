import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JInternalFrame{
		
	JPanel top,mid;
	JLabel title,email,password;
	JTextField em;
	JPasswordField pass;
	JButton log;
		
	public Login() {
		// TODO Auto-generated constructor stub
		init();
		setSize(300,150);
		setTitle("Login");
		setClosable(true);
		setVisible(true);
	}

	private void init() {
    top = new JPanel(); 
		title = new JLabel("LOGIN");
		email = new JLabel("email");
		password = new JLabel("password");
		email.setSize(50,50);
		
		//email.setBounds(0,100,400,200);
		//password.setBounds(0, 300, 100, 100);
		em = new JTextField(16);
		pass = new JPasswordField(16);
		top.add(email);
    top.add(em);
    top.add(password);	
		top.add(pass);
    this.add(top);
		//setLayout(null);
	}
}
