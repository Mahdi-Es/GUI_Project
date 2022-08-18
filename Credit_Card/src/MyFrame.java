
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JScrollPane jsp;
	private 	JCheckBox chckbxNewCheckBox;
	private JList<String> list;
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
		setBounds(350, 150, 646, 423);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Payment Method", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setForeground(Color.GRAY);
		panel_1.setBorder(new TitledBorder(null, "Card Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		
		btnNewButton = new JButton("Accept");
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setMnemonic(KeyEvent.VK_A);
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setForeground(Color.CYAN);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setMnemonic(KeyEvent.VK_E);
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(380, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(52)
					.addComponent(btnNewButton_1)
					.addGap(82))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(23))
		);
		
		lblNewLabel = new JLabel("Card Type:");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 13));
		
		lblNewLabel_1 = new JLabel("Card Number:");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		lblNewLabel_2 = new JLabel("Expiration Date:");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		String str[]= {"April ","May ","June ","July ","August ","September ","October "
				,"November","December" ," January" ,"february","March"};
		String string[]= {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
		
		comboBox = new JComboBox(str);
		comboBox.setFont(new Font("Sitka Small", Font.BOLD, 10));
		
		comboBox_1 = new JComboBox(string);
		comboBox_1.setFont(new Font("Sitka Small", Font.BOLD, 10));
		
		textField = new JTextField();
		textField.setColumns(25);
		textField.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
		            e.consume();  // if it's not a number, ignore the event
		        }
		     }
		});
		jsp=new JScrollPane();
	
		chckbxNewCheckBox = new JCheckBox("Verified");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(109)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jsp, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField, 0, 0, Short.MAX_VALUE))
					.addContainerGap(207, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(29)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(jsp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		list = new JList<>();
		jsp.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Visa", "Master Card", "American Express", "Other"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.setLayout(gl_panel_1);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Credit card");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		rdbtnNewRadioButton = new JRadioButton("Bill customer");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ButtonGroup bg =new ButtonGroup();
		bg.add(rdbtnNewRadioButton);bg.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(this);
		rdbtnNewRadioButton.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(177)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(107)
					.addComponent(rdbtnNewRadioButton)
					.addGap(138))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyFrame frame=new MyFrame();
		if(rdbtnNewRadioButton.isSelected()) {
			lblNewLabel.setEnabled(false);
			lblNewLabel_1.setEnabled(false);
			lblNewLabel_2.setEnabled(false);
			list.setEnabled(false);
			textField.setEnabled(false);
			comboBox.setEnabled(false);
			comboBox_1.setEnabled(false);
			chckbxNewCheckBox.setEnabled(false);
			if(e.getSource()==btnNewButton) {
				JOptionPane.showMessageDialog(frame, "Customer will be billed","Message",JOptionPane.INFORMATION_MESSAGE);
			}else if(e.getSource()==btnNewButton_1) {
				System.exit(0);
			}
		}else {
			lblNewLabel.setEnabled(true);
			lblNewLabel_1.setEnabled(true);
			lblNewLabel_2.setEnabled(true);
			list.setEnabled(true);
			textField.setEnabled(true);
			comboBox.setEnabled(true);
			comboBox_1.setEnabled(true);
			chckbxNewCheckBox.setEnabled(true);
			String s1 = textField.getText();
			String str="";
			str+="Bill "+list.getSelectedValue()+"\n";
			str+="Number + "+s1+"\n";
			str +=lblNewLabel_2.getText()+" "+comboBox.getItemAt(comboBox.getSelectedIndex()) + ", "+comboBox_1.getItemAt(comboBox_1.getSelectedIndex())+"\n";
			if(chckbxNewCheckBox.isSelected()) {
				str += "Card has been verifid.";
			}else {
				str += "Card has not been verifid.";
			}
			if(e.getSource()==btnNewButton) {
				JOptionPane.showMessageDialog(frame, str,"Message",JOptionPane.INFORMATION_MESSAGE);
			}else if(e.getSource()==btnNewButton_1) {
				System.exit(0);
			}
		}
		
	}

}
