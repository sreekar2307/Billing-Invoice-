import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Cla {

	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cla window = new Cla();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Cla() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		final JLabel lblNewLabel_2 =  new JLabel("Welcome User");
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 700, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBounds(350,0,350,524);
		panel.add(panel_1);
		panel_1.setLayout(null);
		JButton button1 = new JButton("<html><u>Create new Invoice</u></html>");
		button1.setEnabled(false);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form_Fill form = new Form_Fill();
				frame.dispose();
				form.setVisible(true);
			}
		});
		button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		button1.setBackground(new Color(0, 102, 153));
		button1.setBounds(80,175,225,50);
		panel_1.add(button1);
		JButton button2 = new JButton("<html><u>Add new Items</u></html>");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   AddNewItems items = new AddNewItems();
			   items.setVisible(true);
			}
		});
		button2.setEnabled(false);
		button2.setFont(new Font("Microsoft JhengHei",Font.BOLD, 20));
		button2.setBackground(Color.WHITE);
		button2.setForeground(Color.WHITE);
		button2.setBounds(80,275,225,50);
		button2.setBackground(new Color(0, 102, 153));
		panel_1.add(button2);	
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Productivity.jpg"));
		lblNewLabel.setBounds(0, 261, 350, 261);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei",Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 35, 92, 35);
		panel.add(lblNewLabel_1);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		textField.setBounds(150, 40, 139, 22);
		panel.add(textField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblPassword.setBounds(42, 81, 92, 35);
		panel.add(lblPassword);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		textField_1.setBounds(150, 87, 139, 22);
		panel.add(textField_1);
		
		
		Button button_1 = new Button("Sign Up");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  SingUp_request ko = new SingUp_request();
			  ko.setVisible(true);
			  ko.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  ko.toFront();
			  ko.setAlwaysOnTop(true);
			 
			}
		});
		button_1.setBounds(186, 141, 70, 35);
		panel.add(button_1);
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        int res=0;
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signin's","root","");
				    PreparedStatement stt= con.prepareStatement("SELECT * FROM `people` where UserName=? and Password=?");
	                 stt.setString(1,textField.getText());
	                 stt.setString(2,textField_1.getText());
	                 ResultSet resultSet = stt.executeQuery();
	                 if(resultSet.next()){
	                	 button1.setEnabled(true);
	                	 button_1.setEnabled(false);
	 					button1.setEnabled(true);
	 					textField.setEditable(false);
	 					button.setEnabled(false);
	 					textField_1.setEditable(false);
	 					lblNewLabel_2.setText("Welcome User");
	                    lblNewLabel_2.setVisible(true); 
	                
	                 }
	                 else {
	                	 lblNewLabel_2.setText("Retry");
	                	 lblNewLabel_2.setVisible(true); 
	                 }
				}
				catch(Exception e1) {
					System.out.println("Error");
				}	
			}
		});
		button.setBounds(64, 141, 70, 35);
		panel.add(button);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(42, 202, 247, 35);
		lblNewLabel_2.setVisible(false);
		panel.add(lblNewLabel_2);
		
	}
}
