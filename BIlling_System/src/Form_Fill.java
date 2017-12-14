import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_Fill extends JFrame {
	public int k=0,Sum=0,temp=0;
	public JPanel contentPane;
	JLabel lblNewLabel_6 = new JLabel("0");
	public  JTextField textField;
	public  JTextField txtYourCompanyName;
	public  JTextField txtAddress;
	public  JTextField textField_3;
	public  JTextField textField_4;
	public JLabel lblNewLabel_4;
	public JTextField textField_1;
	public JTextField txtBillingAddress;
	public JLabel label;
	public JTextField textField_2;
	public JLabel label_1;
	public JTextField textField_5;
	public Label label_3;
	public TextField textField_6;
	public  Label label_4;
	public  JComboBox comboBox;
	public JLabel lblNewLabel_5 = new JLabel("Total =");
	public Label label_5;
	public JButton btnNewButton = new JButton("Finish");;
	public  Button button_1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Fill frame1 = new Form_Fill();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Form_Fill() {
		 btnNewButton.setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 700);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><u>Invoice</u></html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 30));
		lblNewLabel.setBounds(420, 10, 116, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei",Font.BOLD,11));
		lblNewLabel_1.setBounds(430, 66, 40, 15);
		contentPane.add(lblNewLabel_1);
		Calendar cal = Calendar.getInstance();
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		JLabel lblNewLabel_2 = new JLabel(timeStamp);
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei",Font.BOLD,11));
		lblNewLabel_2.setBounds(475, 66, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("InvoiceNo:");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei",Font.BOLD,11));
		lblNewLabel_3.setBounds(424, 92, 70, 15);
		contentPane.add(lblNewLabel_3);
		try {
		textField.setFont(new Font("Microsoft JhengHei",Font.PLAIN,5));
		}
		catch(Exception e){
			;
		}
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(504, 92, 32, 15);
		
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtYourCompanyName = new JTextField();
		txtYourCompanyName.setText("From");
		txtYourCompanyName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		txtYourCompanyName.setHorizontalAlignment(SwingConstants.LEFT);
		txtYourCompanyName.setBounds(10, 10, 190, 45);
		contentPane.add(txtYourCompanyName);
		txtYourCompanyName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		txtAddress.setBounds(10, 66, 190, 29);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Phone  No:");
		lblPhoneNo.setBounds(10, 116, 64, 14);
		lblPhoneNo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		contentPane.add(lblPhoneNo);
		
		textField_3 = new JTextField();
		textField_3.setText("+91");
		textField_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_3.setBounds(78, 113, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFaxNo = new JLabel("Fax No:");
		lblFaxNo.setBounds(168, 116, 46, 14);
		lblFaxNo.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		contentPane.add(lblFaxNo);
		
		textField_4 = new JTextField();
		textField_4.setText("040-");
		textField_4.setBounds(224, 113, 86, 20);
		contentPane.add(textField_4);
		textField_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_4.setColumns(10);
		
		lblNewLabel_4 = new JLabel("<html><u>Bill To</u></html>");
		lblNewLabel_4.setBounds(10, 154, 154, 29);
		lblNewLabel_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField("Name");
		textField_1.setBounds(10, 194, 190, 29);
		textField_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtBillingAddress = new JTextField();
		txtBillingAddress.setText("Billing Address");
		txtBillingAddress.setBounds(10, 234, 190, 29);
		txtBillingAddress.setFont(new Font("Microsoft JhengHei", Font.BOLD, 15));
		contentPane.add(txtBillingAddress);
		txtBillingAddress.setColumns(10);
		
		label = new JLabel("Phone  No:");
		label.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		label.setBounds(10, 278, 64, 14);
		contentPane.add(label);
		
		textField_2 = new JTextField();
		textField_2.setText("+91");
		textField_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(78, 274, 86, 20);
		contentPane.add(textField_2);
		
		label_1 = new JLabel("Fax No:");
		label_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		label_1.setBounds(168, 279, 46, 14);
		contentPane.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setText("040-");
		textField_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_5.setColumns(10);
		textField_5.setBounds(224, 276, 86, 20);
		contentPane.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 403, 580,223);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		JTable table = new JTable();
		Object[] colums = {"Sno","Product","Qantity","Price"};
		DefaultTableModel model= new DefaultTableModel();
		model.setColumnIdentifiers(colums);
		table.setModel(model);
		table.setBorder(new LineBorder(Color.CYAN));
		table.setBackground(Color.WHITE);
		table.setForeground(new Color(0, 0, 0));
		table.setPreferredScrollableViewportSize(new Dimension(560,180));		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setViewportBorder(null);
		panel.add(scrollPane);
		
		String productList[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
		int cost[]= {120,150,100,100,2000,500,80,70,50,700,600,300,800};
		int i=0,j=0;
		Label label_2 = new Label("Product:");
		label_2.setFont(new Font("Microsoft JhengHei",Font.BOLD,11));
		label_2.setBounds(12, 351, 62, 22);
		contentPane.add(label_2);
		
		Button button = new Button("Add");
		button.setBackground(Color.WHITE);
		Object row[]= new Object[4];
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_6.getText().matches("\\d+")) {
					button_1.setEnabled(true);
					btnNewButton.setEnabled(true);
					row[0]=++k;
					row[1]=comboBox.getSelectedItem();
					row[2]=textField_6.getText();
					row[3]=cost[comboBox.getSelectedIndex()]*Integer.parseInt(textField_6.getText());
					label_5.setText(Integer.toString(cost[comboBox.getSelectedIndex()]*Integer.parseInt(textField_6.getText())));
					Sum =Sum+cost[comboBox.getSelectedIndex()]*Integer.parseInt(textField_6.getText());
					model.addRow(row);
				   textField_6.setText(null);
				   lblNewLabel_6.setText(Integer.toString(Sum));
				}
			}
		});
		button.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		button.setActionCommand("Add");
		button.setBounds(365, 351, 92, 22);
		contentPane.add(button);
		
		label_3 = new Label("Qantity:");
		label_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		label_3.setBounds(150, 351, 44, 22);
		contentPane.add(label_3);
		
		textField_6 = new TextField();
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(200, 351, 40, 22);
		contentPane.add(textField_6);
		
		label_4 = new Label("Price:");
		label_4.setBounds(260, 351, 40, 22);
		contentPane.add(label_4);
		
		comboBox = new JComboBox(productList);
		comboBox.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(78, 351, 66, 20);
		contentPane.add(comboBox);
		
		label_5 = new Label("0");
		label_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		label_5.setBounds(306, 351, 40, 22);
		contentPane.add(label_5);
		
		button_1 = new Button("Remove");
		button_1.setEnabled(false);
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table.getSelectedRow();
				if(i>=0)
				{
				   temp=Integer.parseInt(table.getModel().getValueAt(i,3).toString());
				   Sum =Sum-temp;  
				   System.out.println(i);
				   for(int j=i+1;j<table.getModel().getRowCount();j++) {
					   System.out.println(j);
					   temp=Integer.parseInt(table.getModel().getValueAt(j,0).toString());
					   table.getModel().setValueAt(temp-1,j,0);
				   }
				   k--;
				   model.removeRow(i);
				   lblNewLabel_6.setText(Integer.toString(Sum));
				}
				else {
					System.out.println("Delete Error");
				}
			}
		});
		button_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		button_1.setActionCommand("Add");
		button_1.setBounds(475, 351, 92, 22);
		contentPane.add(button_1);
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setEditable(false);
					txtYourCompanyName.setEditable(false);
					txtBillingAddress.setEditable(false);
					 txtAddress.setEditable(false);
					 textField_3.setEditable(false);
					 textField_4.setEditable(false);
					 textField_6.setEditable(false);
					 textField_5.setEditable(false);
					 textField_2.setEditable(false);
					 textField_1.setEditable(false);
					 button.setVisible(false);
					 button_1.setVisible(false);
					 comboBox.setVisible(false);
					 label_2.setVisible(false);
					 label_3.setVisible(false);
					 label_4.setVisible(false);
					 textField_6.setVisible(false);
				     label_5.setVisible(false);	 
				     panel.setBounds(5, 350, 580,223);
				     btnNewButton.setVisible(false);
				 	 lblNewLabel_6.setBounds(500,570, 86, 23);
				 	 lblNewLabel_5.setBounds(440,570,86,23);
				}
			});
			btnNewButton.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
			btnNewButton.setBounds(22, 637, 89, 23);
			contentPane.add(btnNewButton);
			
			
			lblNewLabel_5.setBounds(440, 637, 40, 23);
			contentPane.add(lblNewLabel_5);
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(490, 637, 77, 23);
			contentPane.add(lblNewLabel_6);
			JTextArea text = new JTextArea();
			text.setEditable(false);
	
	}
}
