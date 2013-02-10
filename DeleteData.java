import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class DeleteData extends JFrame {

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
					DeleteData frame = new DeleteData();
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
	public DeleteData() {
		setTitle("DELETE DATA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetEmployeeName = new JLabel("Set  Employee name and ID to delete Employee");
		lblSetEmployeeName.setBounds(12, 0, 408, 16);
		contentPane.add(lblSetEmployeeName);
		
		textField = new JTextField();
		textField.setBounds(90, 29, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(22, 29, 56, 16);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 64, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(22, 58, 56, 16);
		contentPane.add(lblId);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(90, 99, 97, 25);
		contentPane.add(btnDelete);
		
		JLabel lblSetBussPlate = new JLabel("Set Buss plate to delete Buss");
		lblSetBussPlate.setBounds(12, 150, 408, 16);
		contentPane.add(lblSetBussPlate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 179, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPlate = new JLabel("PLATE");
		lblPlate.setBounds(22, 182, 56, 16);
		contentPane.add(lblPlate);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.setBounds(91, 214, 97, 25);
		contentPane.add(btnDelete_1);
	}

}
