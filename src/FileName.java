import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FileName extends JFrame implements ActionListener {

	private JLabel fileName = new JLabel("File Name: ");
	private JTextField fname = new JTextField();

	private JButton save = new JButton("SAVE");

	FileName() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.GRAY);
		this.setSize(500, 300);
		this.setTitle("Resume Builder");
		this.setLayout(null);

		fileName.setBounds(30, 80, 120, 50);
		fileName.setFont(new Font("Lato", Font.BOLD, 20));
		this.add(fileName);

		fname.setBounds(150, 95, 280, 30);
		this.add(fname);

		save.setFont(new Font("Lato", Font.BOLD, 15));
		save.setBounds(180, 200, 80, 40);
		save.setBackground(Color.DARK_GRAY);
		save.setForeground(Color.WHITE);
		save.setFocusable(false);
		save.addActionListener(this);
		this.add(save);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == save) {

		}
	}

	public static void main(String[] args) {
		new FileName();
	}
}
