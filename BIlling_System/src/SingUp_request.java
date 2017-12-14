import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SingUp_request extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	 Connection con=null;
	PreparedStatement stt=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SingUp_request dialog = new SingUp_request();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
              
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SingUp_request() {
		setBounds(100, 100, 380, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name: ");
		lblUserName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(67, 59, 82, 29);
		contentPanel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblPassword.setBounds(67, 99, 82, 29);
		contentPanel.add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password:");
		lblReenterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblReenterPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblReenterPassword.setBounds(49, 140, 119, 29);
		contentPanel.add(lblReenterPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		textField.setBounds(179, 64, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Use another");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(275, 67, 79, 14);
		lblNewLabel.setVisible(false);
		
		contentPanel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(179, 104, 86, 20);
		contentPanel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Re-enter");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(277, 148, 77, 14);
		lblNewLabel_1.setVisible(false);
		contentPanel.add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(179, 145, 86, 20);
		contentPanel.add(passwordField_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!textField.getText().equals("")) {
							if(passwordField.getText().equals(passwordField_1.getText()) ) {
								lblNewLabel_1.setVisible(false);
								lblNewLabel.setVisible(false);
								try {
								String  user="root";
								String password="";
									Class.forName("com.mysql.jdbc.Driver").newInstance();
								     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signin's",user,password);
								     stt = con.prepareStatement("SELECT * FROM `people` WHERE UserName=?");
								     stt.setString(1,textField.getText());
					                 ResultSet rs = stt.executeQuery();
					                 if(!rs.next()) {
								     stt= con.prepareStatement("insert into people(UserName,Password) values(?,?)");
					                 stt.setString(1,textField.getText());
					                 stt.setString(2,passwordField.getText());
					                 stt.executeUpdate();
					                 dispose();
					                 }
					                 else {
					                	 lblNewLabel.setVisible(true);
					                	 passwordField.setText("");
					                	 passwordField_1.setText("");
					                	 textField.setText("");
					                 }
								}
								catch(Exception e1) {
									System.out.println("Error in Connection");
								}	
							}
							else {
								lblNewLabel_1.setVisible(false);
								lblNewLabel_1.setVisible(true);
							}
						}
						else {
							lblNewLabel.setVisible(true);
						}
				
					}
				});
				okButton.setBackground(Color.WHITE);
				okButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(Color.WHITE);
				cancelButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
