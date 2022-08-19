package proj1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.Value;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private ButtonGroup BG;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_2 = new JLabel("Address1:");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_3 = new JLabel("Address2:");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_4 = new JLabel("City:");
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_5 = new JLabel("Province:");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_6 = new JLabel("Postal Code:");
		lblNewLabel_6.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 14));

		JLabel lblNewLabel_7 = new JLabel("Visa #:");
		lblNewLabel_7.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 14));

		rdbtnNewRadioButton = new JRadioButton("Mr");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 12));

		rdbtnNewRadioButton_1 = new JRadioButton("Ms");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));

		rdbtnNewRadioButton_2 = new JRadioButton("Mrs");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 12));

		BG = new ButtonGroup();
		BG.add(rdbtnNewRadioButton);
		BG.add(rdbtnNewRadioButton_1);
		BG.add(rdbtnNewRadioButton_2);

		textField = new JTextField();
		textField.setColumns(20);

		textField_1 = new JTextField();
		textField_1.setColumns(20);

		textField_2 = new JTextField();
		textField_2.setColumns(20);

		textField_3 = new JTextField();
		textField_3.setColumns(20);

		textField_5 = new JTextField();
		textField_5.setColumns(20);

		btnNewButton = new JButton("OK");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(this);

		passwordField = new JPasswordField(20);
		String str[] = { "AB", "O+", "O-", "A+" ,"A-","B+","B-"};

		comboBox = new JComboBox(str);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(19)
							.addComponent(rdbtnNewRadioButton_2))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnNewButton)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(btnNewButton))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String str1 = "";
		if (rdbtnNewRadioButton.isSelected()) {
			str1 += "Mr";
		} else if (rdbtnNewRadioButton_1.isSelected()) {
			str1 += "Ms";
		} else if (rdbtnNewRadioButton_2.isSelected()) {
			str1 += "Mrs";
		}
		String s1 = textField.getText();
		String s5 = textField_1.getText();
		String s2 = textField_2.getText();
		String s3 = textField_3.getText();
		String s4 = textField_5.getText();
		
		char[] s6=passwordField.getPassword();
		int size = s6.length;
		String str = "";
		
		str += str1 + ".";
		str += s1 + "\n";
		str += s5 + "\n";
		str += s2 + "\n";
		str += s3 + ", ";
		str += comboBox.getItemAt(comboBox.getSelectedIndex()) + "\n";
		str += s4 + "\n" + new String(passwordField.getPassword());

		if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("")|| s5.equals("") || size==0) {
			JOptionPane.showMessageDialog(null, "You are missing an important field, please try again ", "Message",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			if (e.getSource() == btnNewButton) {
				JOptionPane.showMessageDialog(null, str, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
