import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame implements ActionListener{
	
	JMenuBar menubar;
	JMenu menu;
	JMenuItem login,register;
	
	public Main() {
		// TODO Auto-generated constructor stub
		menu();
		setSize(1200,600);
		setTitle("La Torta Shop");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void menu() {
		// TODO Auto-generated method stub
		menubar = new JMenuBar();
		menu = new JMenu("Menu");
		login = new JMenuItem("Login");
		register = new JMenuItem("Register");
		
		menubar.add(menu);
		menu.add(login);
		menu.add(register);
		setJMenuBar(menubar);
		
		login.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login){
			Login log = new Login();
			add(log);
		}
		else if(e.getSource()==register){
			
		}
	}

}
