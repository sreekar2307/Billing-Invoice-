import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AddNewItems extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewItems frame = new AddNewItems();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNewItems() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 280);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 264, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 33, 91, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 77, 91, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Taxation:");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 121, 91, 33);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		textField.setBounds(128, 33, 91, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		textField_1.setBounds(128, 77, 86, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		textField_2.setBounds(128, 121, 86, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(125, 186, 89, 23);
		panel.add(btnAdd);
	}
}
