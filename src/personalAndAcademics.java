

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
 

public class personalAndAcademics extends JFrame implements ActionListener {

	JComboBox month, day, year;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	JLabel title = new JLabel("Personal Information *");
	JLabel title2 = new JLabel("Academic Qualifications *");
	JLabel name = new JLabel("Full name:");
	JLabel ema = new JLabel("Email: ");
	JLabel DOB = new JLabel("Date of birth:");
	JLabel gender = new JLabel("Gender:");
	JLabel nationality = new JLabel("Nationality:");
	JLabel Add = new JLabel("Address:");
	JLabel scl = new JLabel("School-");
	JLabel jrc = new JLabel("Junior College-");
	JLabel colg = new JLabel("College-");
	JLabel sclName = new JLabel("School name:");
	JLabel sclGrad = new JLabel("Passing grade/Percentage:");
	JLabel jrcName = new JLabel("Junior College name:");
	JLabel jrcGrad = new JLabel("12th Percentage:");
	JLabel colgName = new JLabel("College name:");
	JLabel colgGrad = new JLabel("CGPA:");
	JLabel profession = new JLabel("Profession:");

	static JTextField nameF = new JTextField(20);
	static JTextField email = new JTextField(20);
	static JTextField address = new JTextField(20);
	static JTextField nation = new JTextField(20);
	static JTextField Addr = new JTextField();
	static JTextField sclNameF = new JTextField(20);
	static JTextField sclGradF = new JTextField(20);
	static JTextField jrcNameF = new JTextField(20);
	static JTextField jrcGradF = new JTextField(20);
	static JTextField colgGradF = new JTextField(20);
	static JTextField colgNameF = new JTextField(20);
	static JTextField professionF = new JTextField(20);

	JButton next = new JButton("Next");
	static JRadioButton male = new JRadioButton("Male");
	static JRadioButton female = new JRadioButton("Female");
	static ButtonGroup g = new ButtonGroup();

	public personalAndAcademics() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setSize(1050, 850);
		this.setTitle("Resume Builder");
		this.setLayout(null);

		// panels
		p1.setBounds(60, 100, 400, 600);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(null);
		p2.setBounds(580, 100, 400, 600);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);

		// headings
		title.setBounds(60, 40, 230, 90);
		title.setFont(new Font("Lato", Font.BOLD, 20));
		title.setForeground(Color.WHITE);
		title2.setBounds(580, 40, 250, 90);
		title2.setFont(new Font("Lato", Font.BOLD, 20));
		title2.setForeground(Color.WHITE);
		this.add(title2);
		this.add(title);

		// 1st panel labels
		name.setBounds(30, 20, 80, 30);
		name.setFont(new Font("Lato", Font.PLAIN, 17));
		ema.setBounds(30, 80, 80, 30);
		ema.setFont(new Font("Lato", Font.PLAIN, 17));
		gender.setBounds(30, 140, 80, 30);
		gender.setFont(new Font("Lato", Font.PLAIN, 17));
		DOB.setBounds(30, 200, 100, 30);
		DOB.setFont(new Font("Lato", Font.PLAIN, 17));
		nationality.setBounds(30, 260, 100, 30);
		nationality.setFont(new Font("Lato", Font.PLAIN, 17));
		Add.setBounds(30, 320, 100, 30);
		Add.setFont(new Font("Lato", Font.PLAIN, 17));
		profession.setBounds(30, 510, 100, 30);
		profession.setFont(new Font("Lato", Font.PLAIN, 17));
		p1.add(Add);
		p1.add(profession);
		p1.add(nationality);
		p1.add(DOB);
		p1.add(ema);
		p1.add(gender);
		p1.add(name);

		// 1st panel text fields
		nameF.setBounds(130, 20, 200, 25);
		email.setBounds(130, 80, 200, 25);
		p1.add(email);
		p1.add(nameF);
		male.setBounds(130, 145, 200, 25);
		male.setBackground(Color.LIGHT_GRAY);
		male.setFocusable(false);
		female.setBounds(230, 145, 200, 25);
		female.setBackground(Color.LIGHT_GRAY);
		female.setFocusable(false);
		male.setActionCommand("Male");
		female.setActionCommand("Female");
		g.add(female);
		g.add(male);
		p1.add(female);
		p1.add(male);
		nation.setBounds(130, 270, 200, 25);
		Addr.setBounds(130, 330, 200, 150);
		professionF.setBounds(130, 510, 200, 30);
		p1.add(professionF);
		p1.add(Addr);
		p1.add(nation);

		// comboBox p1
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Integer[] days = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31 };
		Integer[] years = { 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993,
				1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005 };
		month = new JComboBox(months);
		month.setLocation(210, 200);
		month.setSize(90, 30);
		day = new JComboBox(days);
		day.setLocation(150, 200);
		day.setSize(50, 30);
		year = new JComboBox(years);
		year.setLocation(310, 200);
		year.setSize(60, 30);
		year.setSelectedItem(1998);
		p1.add(month);
		p1.add(day);
		p1.add(year);

		// p2 sub headings
		scl.setBounds(30, 10, 150, 35);
		scl.setFont(new Font("Lato", Font.BOLD, 20));
		p2.add(scl);
		jrc.setBounds(30, 200, 200, 35);
		jrc.setFont(new Font("Lato", Font.BOLD, 20));
		p2.add(jrc);
		colg.setBounds(30, 390, 200, 35);
		colg.setFont(new Font("Lato", Font.BOLD, 20));
		p2.add(colg);

		// p2 Labels
		sclName.setBounds(30, 70, 110, 30);
		sclName.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(sclName);
		sclGrad.setBounds(30, 130, 210, 30);
		sclGrad.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(sclGrad);
		jrcName.setBounds(30, 260, 170, 30);
		jrcName.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(jrcName);
		jrcGrad.setBounds(30, 320, 150, 30);
		jrcGrad.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(jrcGrad);
		colgName.setBounds(30, 450, 170, 30);
		colgName.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(colgName);
		colgGrad.setBounds(30, 510, 150, 30);
		colgGrad.setFont(new Font("Lato", Font.PLAIN, 17));
		p2.add(colgGrad);

		// p2 Text fields
		sclNameF.setBounds(160, 80, 200, 20);
		p2.add(sclNameF);
		sclGradF.setBounds(260, 140, 80, 20);
		p2.add(sclGradF);
		jrcNameF.setBounds(200, 270, 180, 20);
		p2.add(jrcNameF);
		jrcGradF.setBounds(170, 330, 80, 20);
		p2.add(jrcGradF);
		colgNameF.setBounds(150, 460, 200, 20);
		p2.add(colgNameF);
		colgGradF.setBounds(100, 520, 80, 20);
		p2.add(colgGradF);

		// button
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFocusable(false);
		next.setFont(new Font("Lato", Font.BOLD, 15));
		next.setBounds(800, 750, 150, 30);
		this.add(next);
		next.addActionListener(this);

		// action listener on fields
		nameF.addActionListener(this);
		email.addActionListener(this);
		nation.addActionListener(this);
		address.addActionListener(this);
		professionF.addActionListener(this);
		sclNameF.addActionListener(this);
		sclGradF.addActionListener(this);
		jrcGradF.addActionListener(this);
		jrcNameF.addActionListener(this);
		colgNameF.addActionListener(this);
		colgGradF.addActionListener(this);

		this.add(p1);
		this.add(p2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) {
			String name = nameF.getText().trim();
			String emai = email.getText().trim();
			String cgpaValueStr = colgGradF.getText();
			String passingGradeValueStr = sclGrad.getText();

			if (name.isEmpty() || emai.isEmpty() || cgpaValueStr.isEmpty() || passingGradeValueStr.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			// Validate name
			if (!name.matches("[a-zA-Z ]+")) {
				JOptionPane.showMessageDialog(this, "Please enter a valid name with alphabets only.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			// Validate email
			if (!emai.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
				JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			try {
				double cgpa = Double.parseDouble(colgGradF.getText());
				if (cgpa < 0 || cgpa > 10) {
					JOptionPane.showMessageDialog(this, "Please enter a valid CGPA between 0 and 10.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return; // stop the method execution if CGPA value is invalid
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				return; // stop the method execution if CGPA value is not numeric
			}
			try {
				double passingGradeValue = Double.parseDouble(sclGradF.getText());
				if (passingGradeValue < 0 || passingGradeValue > 100) {
					JOptionPane.showMessageDialog(this, "Please enter a valid passing percentage between 0 and 100.",
							"Error", JOptionPane.ERROR_MESSAGE);
					return; // stop the method execution if passing grade value is invalid
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				return; // stop the method execution if passing grade value is not numeric
			}
			this.dispose();
			new workAndSkills();
		}
	}
}
