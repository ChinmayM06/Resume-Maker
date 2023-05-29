import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sqlOps.resumeDB;

public class workAndSkills extends JFrame implements ActionListener {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	JLabel title2 = new JLabel("Skills");
	JLabel title = new JLabel("Work Experience");
	JLabel title3 = new JLabel("Add Photo");
	JLabel jobTitle = new JLabel("Job title:");
	JLabel employer = new JLabel("Employer:");
	JLabel jobTitle2 = new JLabel("Job title:");
	JLabel employer2 = new JLabel("Employer:");
	JLabel jobTitle3 = new JLabel("Job title:");
	JLabel employer3 = new JLabel("Employer:");
	JLabel imageLabel = new JLabel();

	JTextField jobF = new JTextField(20);
	JTextField employerF = new JTextField(20);
	JTextField jobF2 = new JTextField(20);
	JTextField employerF2 = new JTextField(20);
	JTextField jobF3 = new JTextField(20);
	JTextField employerF3 = new JTextField(20);
	JTextField skillF = new JTextField(20);
	JTextField skillF2 = new JTextField(20);
	JTextField skillF3 = new JTextField(20);
	JTextField skillF4 = new JTextField(20);

	JButton add = new JButton("ADD");
	JButton add2 = new JButton("ADD");
	JButton picture = new JButton("UPLOAD");
	JButton save = new JButton("SAVE");
	JButton gen = new JButton("GENERATE  RESUME");

	workAndSkills() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setSize(1020, 800);
		this.setTitle("Resume Builder");
		this.setLayout(null);

		// panels
		p1.setLayout(null);
		p1.setBounds(100, 50, 800, 250);
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);
		p2.setBounds(100, 350, 350, 300);
		p2.setBackground(Color.LIGHT_GRAY);
		p3.setLayout(null);
		p3.setBounds(550, 350, 350, 300);
		p3.setBackground(Color.LIGHT_GRAY);

		// headings
		title.setBounds(30, 15, 200, 30);
		title.setFont(new Font("Lato", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title2.setBounds(30, 10, 200, 30);
		title2.setFont(new Font("Lato", Font.BOLD, 20));
		title2.setForeground(Color.BLACK);
		title3.setBounds(30, 10, 200, 60);
		title3.setFont(new Font("Lato", Font.BOLD, 20));
		title3.setForeground(Color.BLACK);
		p1.add(title);
		p2.add(title2);
		p3.add(title3);

		// labels
		// p1
		jobTitle.setBounds(30, 45, 80, 50);
		jobTitle.setFont(new Font("Lato", Font.PLAIN, 17));
		employer.setBounds(300, 45, 80, 50);
		employer.setFont(new Font("Lato", Font.PLAIN, 17));
		p1.add(jobTitle);
		p1.add(employer);
		jobTitle2.setBounds(30, 110, 80, 50);
		jobTitle2.setFont(new Font("Lato", Font.PLAIN, 17));
		employer2.setBounds(300, 110, 80, 50);
		employer2.setFont(new Font("Lato", Font.PLAIN, 17));
		jobTitle2.setVisible(false);
		employer2.setVisible(false);
		p1.add(jobTitle2);
		p1.add(employer2);
		jobTitle3.setBounds(30, 170, 80, 50);
		jobTitle3.setFont(new Font("Lato", Font.PLAIN, 17));
		employer3.setBounds(300, 170, 80, 50);
		employer3.setFont(new Font("Lato", Font.PLAIN, 17));
		jobTitle3.setVisible(false);
		employer3.setVisible(false);
		p1.add(jobTitle3);
		p1.add(employer3);
		// p3
		imageLabel.setPreferredSize(new Dimension(200, 200));
		imageLabel.setBounds(100, 70, 170, 170);

		// text fields
		// p1
		jobF.setBounds(100, 60, 150, 20);
		employerF.setBounds(380, 60, 150, 20);
		p1.add(employerF);
		p1.add(jobF);
		jobF2.setBounds(100, 125, 150, 20);
		employerF2.setBounds(380, 125, 150, 20);
		jobF2.setVisible(false);
		employerF2.setVisible(false);
		p1.add(employerF2);
		p1.add(jobF2);
		jobF3.setBounds(100, 185, 150, 20);
		employerF3.setBounds(380, 185, 150, 20);
		jobF3.setVisible(false);
		employerF3.setVisible(false);
		p1.add(employerF3);
		p1.add(jobF3);
		// p2
		skillF.setBounds(30, 50, 200, 20);
		skillF2.setBounds(30, 110, 200, 20);
		skillF2.setVisible(false);
		skillF3.setBounds(30, 170, 200, 20);
		skillF3.setVisible(false);
		skillF4.setBounds(30, 230, 200, 20);
		skillF4.setVisible(false);
		p2.add(skillF);
		p2.add(skillF2);
		p2.add(skillF3);
		p2.add(skillF4);

		// button
		// p1
		add.setFont(new Font("Lato", Font.BOLD, 15));
		add.setBounds(630, 55, 70, 30);
		add.setBackground(Color.WHITE);
		add.setFocusable(false);
		p1.add(add);
		add.addActionListener(this);
		// p2
		add2.setFont(new Font("Lato", Font.BOLD, 15));
		add2.setBounds(265, 50, 70, 20);
		add2.setBackground(Color.WHITE);
		add2.setFocusable(false);
		p2.add(add2);
		add2.addActionListener(this);
		// p3
		picture.setFont(new Font("Lato", Font.BOLD, 15));
		picture.setBounds(140, 250, 100, 40);
		picture.setBackground(Color.WHITE);
		picture.setFocusable(false);
		p3.add(picture);
		p3.add(imageLabel);
		picture.addActionListener(this);

		// save btn
		save.setFont(new Font("Lato", Font.BOLD, 15));
		save.setBounds(800, 700, 80, 40);
		save.setBackground(Color.BLACK);
		save.setForeground(Color.WHITE);
		save.setFocusable(false);
		save.addActionListener(this);
		this.add(save);

		// gen btn
		gen.setFont(new Font("Lato", Font.BOLD, 15));
		gen.setBounds(550, 700, 200, 40);
		gen.setBackground(Color.BLACK);
		gen.setForeground(Color.WHITE);
		gen.setFocusable(false);
		gen.addActionListener(this);
		this.add(gen);

		this.add(p3);
		this.add(p2);
		this.add(p1);
	}

	static int clicked = 0;
	// c is for getting the number of jobs entered to call the function accordingly
	static int cnt = 1;

	void addButton(ActionEvent e) {
		if ((e.getSource() == add) && (clicked == 0)) {
			add.setBounds(630, 120, 70, 30);
			jobTitle2.setVisible(true);
			employer2.setVisible(true);
			jobF2.setVisible(true);
			employerF2.setVisible(true);
			clicked++;
			cnt++;
			return;
		}
		if ((clicked == 1) && (e.getSource() == add)) {
			add.setBounds(630, 180, 70, 30);
			jobTitle3.setVisible(true);
			employer3.setVisible(true);
			jobF3.setVisible(true);
			employerF3.setVisible(true);
			add.setEnabled(false);
			cnt++;
			return;
		}
	}

	static int clicked2 = 0;
	static int cnt2 = 1;

	void add2Button(ActionEvent e) {
		if ((e.getSource() == add2) && (clicked2 == 0)) {
			add2.setBounds(265, 110, 70, 20);
			skillF2.setVisible(true);
			clicked2++;
			cnt2++;
			return;
		}
		if ((e.getSource() == add2) && (clicked2 == 1)) {
			add2.setBounds(265, 170, 70, 20);
			skillF3.setVisible(true);
			clicked2++;
			cnt2++;
			return;
		}
		if ((e.getSource() == add2) && (clicked2 == 2)) {
			add2.setVisible(false);
			skillF4.setVisible(true);
			clicked2++;
			cnt2++;
			return;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// jobs and companies
		String j1 = jobF.getText();
		String c1 = employerF.getText();
		String j2 = jobF2.getText();
		String c2 = employerF2.getText();
		String j3 = jobF3.getText();
		String c3 = employerF3.getText();

		// skills
		String s = skillF.getText();
		String s1 = skillF2.getText();
		String s2 = skillF3.getText();
		String s3 = skillF4.getText();

		// pic
		if (e.getSource() == add) {
			addButton(e);
		}
		if (e.getSource() == add2) {
			add2Button(e);
		}
		if (e.getSource() == picture) {
			JFileChooser fileChooser = new JFileChooser();
			int option = fileChooser.showOpenDialog(this);
			if (option == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
				Image scaledImage = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(),
						imageLabel.getHeight(), Image.SCALE_SMOOTH);
				imageLabel.setIcon(new ImageIcon(scaledImage));
				boolean a = resumeDB.insertImageIntoDatabase(selectedFile);
				if (a) {
					JOptionPane.showMessageDialog(this, "SUCCESSFUL done jobs!", "YAY!",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(this, "Sorry bro!", "Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if (e.getSource() == save) {
			boolean a = false, b = false;
			if (cnt == 1) {
				a = resumeDB.insertWorkDB(j1, c1);
			}
			if (cnt == 2) {
				a = resumeDB.insertWorkDB(j1, c1, j2, c2);
			}
			if (cnt == 3) {
				a = resumeDB.insertWorkDB(j1, c1, j2, c2, j3, c3);
			}
			if (cnt2 == 1) {
				b = resumeDB.insertSkillsDB(s);
			}
			if (cnt2 == 2) {
				b = resumeDB.insertSkillsDB(s, s1);
			}
			if (cnt2 == 3) {
				b = resumeDB.insertSkillsDB(s, s1, s2);
			}
			if (cnt2 == 4) {
				b = resumeDB.insertSkillsDB(s, s1, s2, s3);
			}
			if (a && b) {
				JOptionPane.showMessageDialog(this, "SUCCESSFULY SAVED YOUR INFO!", "Success!",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "There was some issue!", "Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == gen) {

		}
	}

	public static void main(String[] args) {
		new workAndSkills();
	}

}
