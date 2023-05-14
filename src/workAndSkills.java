import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class workAndSkills extends JFrame implements ActionListener{

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
    JButton resume = new JButton("SAVE");
	
	workAndSkills(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setSize(1020, 800);
		this.setTitle("Resume Builder");
		this.setLayout(null);
		
		//panels
		p1.setLayout(null);
		p1.setBounds(100, 50, 800, 250);
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);
		p2.setBounds(100, 350, 350, 300);
		p2.setBackground(Color.LIGHT_GRAY);
		p3.setLayout(null);
		p3.setBounds(550, 350, 350, 300);
		p3.setBackground(Color.LIGHT_GRAY);
		
		//headings
		title.setBounds(30, 15, 200, 30);
		title.setFont(new Font("Lato",Font.BOLD,20));
		title.setForeground(Color.BLACK);
		title2.setBounds(30, 10, 200, 30);
		title2.setFont(new Font("Lato",Font.BOLD,20));
		title2.setForeground(Color.BLACK);
		title3.setBounds(30, 10, 200, 60);
		title3.setFont(new Font("Lato",Font.BOLD,20));
		title3.setForeground(Color.BLACK);
		p1.add(title);
		p2.add(title2);
		p3.add(title3);
		
		//labels
		//p1
		jobTitle.setBounds(30, 45, 80, 50);
		jobTitle.setFont(new Font("Lato",Font.PLAIN,17));
		employer.setBounds(300, 45, 80, 50);
		employer.setFont(new Font("Lato",Font.PLAIN,17));
		p1.add(jobTitle);
		p1.add(employer);
		jobTitle2.setBounds(30, 110, 80, 50);
		jobTitle2.setFont(new Font("Lato",Font.PLAIN,17));
		employer2.setBounds(300, 110, 80, 50);
		employer2.setFont(new Font("Lato",Font.PLAIN,17));
		jobTitle2.setVisible(false);
		employer2.setVisible(false);
		p1.add(jobTitle2);
		p1.add(employer2);
		jobTitle3.setBounds(30, 170, 80, 50);
		jobTitle3.setFont(new Font("Lato",Font.PLAIN,17));
		employer3.setBounds(300, 170, 80, 50);
		employer3.setFont(new Font("Lato",Font.PLAIN,17));
		jobTitle3.setVisible(false);
		employer3.setVisible(false);
		p1.add(jobTitle3);
		p1.add(employer3);
		
		//text fields
		//p1
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
		//p2
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
		
		//button
		//p1
		add.setFont(new Font("Lato",Font.BOLD,15));
		add.setBounds(630, 55, 70, 30);
		add.setBackground(Color.WHITE);
		add.setFocusable(false);
		p1.add(add);
		add.addActionListener(this);
		//p2
		add2.setFont(new Font("Lato",Font.BOLD,15));
		add2.setBounds(265, 50, 70, 20);
		add2.setBackground(Color.WHITE);
		add2.setFocusable(false);
		p2.add(add2);
		add2.addActionListener(this);
		//p3
		resume.setFont(new Font("Lato",Font.BOLD,15));
		resume.setBounds(140, 230,80, 40);
		resume.setBackground(Color.WHITE);
		resume.setFocusable(false);
		p3.add(resume);
		resume.addActionListener(this);
		
		this.add(p3);
		this.add(p2);
		this.add(p1);
	}
	
	static int clicked=0;
	void addButton(ActionEvent e) {
		if((e.getSource()==add) && (clicked==0)) {
			add.setBounds(630, 120, 70, 30);
			jobTitle2.setVisible(true);
			employer2.setVisible(true);
			jobF2.setVisible(true);
			employerF2.setVisible(true);
			clicked++;
			return;
		}
		if((clicked==1) && (e.getSource()==add)) {
			add.setBounds(630, 180, 70, 30);
			jobTitle3.setVisible(true);
			employer3.setVisible(true);
			jobF3.setVisible(true);
			employerF3.setVisible(true);
			add.setEnabled(false);
			return;
		}
	}
	
	static int clicked2=0;
	void add2Button (ActionEvent e) {
		if((e.getSource()==add2) && (clicked2==0)){
			add2.setBounds(265, 110, 70, 20);
			skillF2.setVisible(true);
			clicked2++;
			return;
		}
		if((e.getSource()==add2) && (clicked2==1)){
			add2.setBounds(265, 170, 70, 20);
			skillF3.setVisible(true);
			clicked2++;
			return;
		}
		if((e.getSource()==add2) && (clicked2==2)){
			add2.setVisible(false);
			skillF4.setVisible(true);
			clicked2++;
			return;
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
			System.out.println("Nme: ");
			addButton(e);
		}
		if(e.getSource()==add2) {
			add2Button(e);
		}
	}
	
	public static void main(String []args) {
		workAndSkills p = new workAndSkills();
	}

}
