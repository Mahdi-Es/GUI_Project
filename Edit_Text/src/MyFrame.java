import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3, lblNewLabel_4 , lblNewLabel_5,lblNewLabel_6;
	private JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3,rdbtnNewRadioButton_4,rdbtnNewRadioButton_5;
	private JButton btnNewButton,btnNewButton_1;
	private JComboBox comboBox , comboBox_1 ;
	private JCheckBox chckbxNewCheckBox ,chckbxNewCheckBox_1;
	
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
		setTitle("Exercise(3)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 283);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Text Size:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		rdbtnNewRadioButton = new JRadioButton("Small");
		rdbtnNewRadioButton.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton.setBackground(Color.GRAY);
		rdbtnNewRadioButton.setMnemonic(KeyEvent.VK_S);
		rdbtnNewRadioButton.setActionCommand("Small");
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton_1 = new JRadioButton("Medium");
		rdbtnNewRadioButton_1.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBackground(Color.GRAY);
		rdbtnNewRadioButton_1.setMnemonic(KeyEvent.VK_M);
		rdbtnNewRadioButton_1.setActionCommand("Medium");
		rdbtnNewRadioButton_1.addActionListener(this);
		rdbtnNewRadioButton_2 = new JRadioButton("Large");
		rdbtnNewRadioButton_2.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setBackground(Color.GRAY);
		rdbtnNewRadioButton_2.setMnemonic(KeyEvent.VK_L);
		rdbtnNewRadioButton_2.setActionCommand("Large");
		rdbtnNewRadioButton_2.addActionListener(this);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);bg.add(rdbtnNewRadioButton_1);bg.add(rdbtnNewRadioButton_2);
		
		lblNewLabel_1 = new JLabel("Alignment:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		rdbtnNewRadioButton_3 = new JRadioButton("Left");
		rdbtnNewRadioButton_3.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton_3.setBackground(Color.GRAY);
		rdbtnNewRadioButton_3.setMnemonic(KeyEvent.VK_F);
		rdbtnNewRadioButton_3.setActionCommand("Left");
		rdbtnNewRadioButton_3.addActionListener(this);
		rdbtnNewRadioButton_4 = new JRadioButton("Center");
		rdbtnNewRadioButton_4.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton_4.setBackground(Color.GRAY);
		rdbtnNewRadioButton_4.setMnemonic(KeyEvent.VK_C);
		rdbtnNewRadioButton_4.setActionCommand("Center");
		rdbtnNewRadioButton_4.addActionListener(this);
		rdbtnNewRadioButton_4.setSelected(true);
		rdbtnNewRadioButton_5 = new JRadioButton("Right");
		rdbtnNewRadioButton_5.setFont(new Font("Serif", Font.BOLD, 12));
		rdbtnNewRadioButton_5.setBackground(Color.GRAY);
		rdbtnNewRadioButton_5.setMnemonic(KeyEvent.VK_H);
		rdbtnNewRadioButton_5.setActionCommand("Right");
		rdbtnNewRadioButton_5.addActionListener(this);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnNewRadioButton_3);bg1.add(rdbtnNewRadioButton_4);bg1.add(rdbtnNewRadioButton_5);
		
		lblNewLabel_2 = new JLabel("Font Option:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		chckbxNewCheckBox = new JCheckBox("Bold");
		chckbxNewCheckBox.setBackground(Color.GRAY);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		chckbxNewCheckBox.setActionCommand("Bold");
		chckbxNewCheckBox.addActionListener(this);
		chckbxNewCheckBox.setMnemonic(KeyEvent.VK_B);
		chckbxNewCheckBox_1 = new JCheckBox("Italic");
		chckbxNewCheckBox_1.setBackground(Color.GRAY);
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		chckbxNewCheckBox_1.addActionListener(this);
		chckbxNewCheckBox_1.setMnemonic(KeyEvent.VK_I);
		lblNewLabel_3 = new JLabel("Change Text:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.addActionListener(this);
		
		lblNewLabel_4 = new JLabel("Foreground:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		String str[]= {"Black" ,"Red" , "Blue" ,"Green"};
		comboBox = new JComboBox(str);
		comboBox.setBackground(Color.GRAY);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox.addActionListener(this);
		String str1[]= {"Gray" , "Pink" , "Yellow"};
		lblNewLabel_5 = new JLabel("Background:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		comboBox_1 = new JComboBox(str1);
		comboBox_1.setBackground(Color.GRAY);
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		comboBox_1.addActionListener(this);
		
		btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setMnemonic(KeyEvent.VK_R);
		btnNewButton.addActionListener(this);
	    btnNewButton_1 = new JButton("Exit");
	    btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.setMnemonic(KeyEvent.VK_X);
		btnNewButton_1.addActionListener(this);
		
		lblNewLabel_6 = new JLabel("Software Engineering Lab");
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(35)
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_1)
											.addGap(18)
											.addComponent(rdbtnNewRadioButton_3)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(rdbtnNewRadioButton_4))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addGap(18)
											.addComponent(rdbtnNewRadioButton)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnNewRadioButton_1)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnNewRadioButton_2)
										.addComponent(rdbtnNewRadioButton_5)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(chckbxNewCheckBox)
									.addComponent(chckbxNewCheckBox_1))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_4))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5))))
					.addGap(31))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(lblNewLabel_2)
						.addComponent(rdbtnNewRadioButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(rdbtnNewRadioButton_5)
						.addComponent(chckbxNewCheckBox)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_4))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(chckbxNewCheckBox_1))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(8)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5)
							.addGap(7)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(86))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s="Software Engineering Lab";
		if(e.getSource()==btnNewButton_1) {
			int answer=JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit Message!",  JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
			if(answer==JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}else if(e.getSource()==btnNewButton) {
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton_4.setSelected(true);
			chckbxNewCheckBox.setSelected(false);
			chckbxNewCheckBox_1.setSelected(false);
			comboBox.setSelectedItem("Black");
			comboBox_1.setSelectedItem("Gray");
			lblNewLabel_6.setBackground(Color.GRAY);
			lblNewLabel_6.setForeground(Color.BLACK);
			lblNewLabel_6.setText(s);
			textField.setText("");
			Font newFont =new Font("Serif",Font.PLAIN,12);
			lblNewLabel_6.setFont(newFont);
		}
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					String message = textField.getText();
					lblNewLabel_6.setText(message);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		if(e.getActionCommand()=="Small") {
			Font f = new Font("Serif", Font.PLAIN, 12);
			lblNewLabel_6.setFont(f);
		}else if(e.getActionCommand()=="Medium") {
			Font f = new Font("Serif", Font.PLAIN,16);
			lblNewLabel_6.setFont(f);
		}else if(e.getActionCommand()=="Large") {
			Font f = new Font("Serif", Font.PLAIN,24);
			lblNewLabel_6.setFont(f);
		}
		
		if(e.getActionCommand()=="Left") {
			lblNewLabel_6.setHorizontalAlignment(JLabel.LEFT);
		}else if(e.getActionCommand()=="Center") {
			lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		}else if(e.getActionCommand()=="Right") {
			lblNewLabel_6.setHorizontalAlignment(JLabel.RIGHT);
		}
		if(chckbxNewCheckBox.isSelected()==true && chckbxNewCheckBox_1.isSelected()==true){
			Font oldFont = lblNewLabel_6.getFont();
			Font newFont = new Font(oldFont.getName(),Font.BOLD+Font.ITALIC,oldFont.getSize());
			lblNewLabel_6.setFont(newFont);
		}else if(chckbxNewCheckBox.isSelected()) {
			Font oldFont = lblNewLabel_6.getFont();
			Font newFont = new Font(oldFont.getName(),Font.BOLD,oldFont.getSize());
			lblNewLabel_6.setFont(newFont);
		}else if(chckbxNewCheckBox_1.isSelected()) {
			Font oldFont = lblNewLabel_6.getFont();
			Font newFont = new Font(oldFont.getName(),Font.ITALIC,oldFont.getSize());
			lblNewLabel_6.setFont(newFont);
		}
		
		if(e.getSource()==comboBox) {
			if(comboBox.getSelectedItem()=="Black") {
				lblNewLabel_6.setForeground(Color.BLACK);
				
			}else if(comboBox.getSelectedItem()=="Red") {
				lblNewLabel_6.setForeground(Color.RED);
				
			}else if(comboBox.getSelectedItem()=="Blue") {
				lblNewLabel_6.setForeground(Color.BLUE);
				
			}else if(comboBox.getSelectedItem()=="Green") {
				lblNewLabel_6.setForeground(Color.GREEN);
				
			}
		}
		
		if(e.getSource()==comboBox_1) {
			lblNewLabel_6.setOpaque(true);
			if(comboBox_1.getSelectedItem()=="Gray") {
				lblNewLabel_6.setBackground(Color.GRAY);
		       
			}else if(comboBox_1.getSelectedItem()=="Pink") {
				lblNewLabel_6.setBackground(Color.PINK);
				
			}else if(comboBox_1.getSelectedItem()=="Yellow") {
				lblNewLabel_6.setBackground(Color.YELLOW);
				
			}
		}
	}
}
