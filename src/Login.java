import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sqlOps.resumeDB;

public class Login extends JFrame implements ActionListener {

	JLabel icon = new JLabel("Welcome");
	JLabel username = new JLabel("Username: ");
	JLabel password = new JLabel("Password: ");

	JTextField name = new JTextField();
	JPasswordField pw = new JPasswordField();

	JButton register = new JButton("Register");
	JButton login = new JButton("Login");
	JPanel panel = new JPanel();

	Login() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Resume Builder");
		this.setLayout(new BorderLayout());

		panel.setBackground(Color.LIGHT_GRAY);
		panel.setSize(500, 500);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(500, 500));

		username.setBounds(130, 120, 100, 30);
		username.setFont(new Font("Lato", 15, 15));
		name.setBounds(130, 150, 230, 30);
		password.setBounds(130, 220, 100, 30);
		password.setFont(new Font("Lato", 15, 15));
		pw.setBounds(130, 250, 230, 30);
		panel.add(username);
		panel.add(password);
		panel.add(name);
		panel.add(pw);

		register.setFont(new Font("Lato", 15, 15));
		login.setFont(new Font("Lato", 15, 15));
		register.setBounds(130, 350, 100, 30);
		register.setFocusable(false);
		login.setBounds(290, 350, 75, 30);
		login.setFocusable(false);
		register.setBackground(Color.DARK_GRAY);
		login.setBackground(Color.DARK_GRAY);
		register.setForeground(Color.WHITE);
		login.setForeground(Color.WHITE);
		panel.add(login);
		panel.add(register);

		icon.setBounds(170, 0, 300, 100);
		icon.setFont(new Font("Trebuchet MS", 40, 40));
		panel.add(icon);
		this.add(panel, BorderLayout.CENTER);

		register.addActionListener(this);
		login.addActionListener(this);
		name.addActionListener(this);
		pw.addActionListener(this);
	}

	String p;

	@Override
	public void actionPerformed(ActionEvent e) {
		char[] x = pw.getPassword();
		p = new String(x);
		String n = name.getText();
		boolean f = resumeDB.getLoginDB(n);
		try {
			if (e.getSource() == login) {
				if (name.getText().isEmpty() || pw.getPassword().length == 0) {
					JOptionPane.showMessageDialog(this, "Enter the necessary details!", "Error!",
							JOptionPane.ERROR_MESSAGE);
				}
				if (f) {
					if (p.equals(resumeDB.pass)) {
						this.dispose();
						new personalAndAcademics();
					} else {
						JOptionPane.showMessageDialog(this, "Username or password is incorrect!", "Error!",
								JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		} catch (IllegalArgumentException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

		if (e.getSource() == register) {
			this.dispose();
			new Registration();
		}
	}
}
