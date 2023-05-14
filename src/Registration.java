
import java.awt.Color;
import java.util.Arrays;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration extends JFrame implements ActionListener {

	JLabel reg = new JLabel("Registration");
	JLabel name = new JLabel("First Name: ");
	JLabel name2 = new JLabel("Last Name: ");
	JLabel phno = new JLabel("Phone number: ");
	JLabel password = new JLabel("Password: ");
	JLabel password1 = new JLabel("Confirm Password: ");

	JTextField Fname = new JTextField();
	JTextField Lname = new JTextField();
	JPasswordField pw = new JPasswordField();
	JPasswordField pw1 = new JPasswordField();
	JTextField phn = new JTextField();
	JButton register = new JButton("Register");
	JPanel p1 = new JPanel();

	Registration() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(600, 650);
		this.setTitle("Resume Builder");
		this.setLayout(null);
		this.setResizable(false);

		// panel and register label
		p1.setLayout(null);
		p1.setBackground(Color.DARK_GRAY);
		reg.setFont(new Font("Lato", 20, 20));
		reg.setForeground(Color.WHITE);
		p1.setBounds(0, 0, 600, 100);
		reg.setBounds(230, 25, 130, 50);
		p1.add(reg);
		this.add(p1);

		// first and last name name labels and tf
		name.setBounds(50, 150, 100, 30);
		name.setFont(new Font("Lato", 15, 15));
		Fname.setBounds(50, 180, 200, 30);
		this.add(Fname);
		this.add(name);
		name2.setBounds(320, 150, 100, 30);
		name2.setFont(new Font("Lato", 15, 15));
		Lname.setBounds(320, 180, 200, 30);
		this.add(Lname);
		this.add(name2);

		// phno
		phno.setBounds(50, 270, 150, 30);
		phno.setFont(new Font("Lato", 15, 15));
		phn.setBounds(50, 300, 200, 30);
		this.add(phno);
		this.add(phn);

		// pw and confirm pw
		password.setBounds(50, 390, 100, 30);
		password.setFont(new Font("Lato", 15, 15));
		pw.setBounds(50, 420, 200, 30);
		this.add(password);
		this.add(pw);
		password1.setBounds(320, 390, 150, 30);
		password1.setFont(new Font("Lato", 15, 15));
		pw1.setBounds(320, 420, 200, 30);
		this.add(password1);
		this.add(pw1);

		// register button
		register.setBackground(Color.DARK_GRAY);
		register.setForeground(Color.WHITE);
		register.setFont(new Font("Lato", 18, 18));
		register.setBounds(210, 510, 150, 30);
		register.setFocusable(false);
		this.add(register);

		register.addActionListener(this);
		Fname.addActionListener(this);
		Lname.addActionListener(this);
		phn.addActionListener(this);
		pw.addActionListener(this);
		pw1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			char[] p1 = pw.getPassword();
			char[] p2 = pw1.getPassword();
			Boolean flag = Arrays.equals(p1, p2);
			if (Fname.getText().isEmpty() || Lname.getText().isEmpty() || phn.getText().isEmpty()) {
				throw new IllegalArgumentException("Make sure Name and Phone number fields are not empty.");
			} else if (pw.getPassword().length == 0 || pw1.getPassword().length == 0) {
				throw new IllegalArgumentException("Please enter a password.");
			} else if (!flag) {
				throw new IllegalArgumentException("Passwords are not same.");
			}
			this.dispose();
			Login logo = new Login();
		} catch (IllegalArgumentException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	 public static void main(String[] args) {
		 Registration r = new Registration();
	 }
}
