package MainPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class RadioButton {
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton window = new RadioButton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RadioButton() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Radio Button");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(37, 13, 209, 139);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setFont(new Font("Verdana", Font.PLAIN, 30));
		buttonGroup.add(rdbtnSmall);
		rdbtnSmall.setBounds(0, 0, 169, 23);
		panel.add(rdbtnSmall);
		rdbtnSmall.setSelected(true);
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setFont(new Font("Verdana", Font.PLAIN, 30));
		buttonGroup.add(rdbtnLarge);
		rdbtnLarge.setBounds(0, 52, 169, 23);
		panel.add(rdbtnLarge);
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setFont(new Font("Verdana", Font.PLAIN, 30));
		buttonGroup.add(rdbtnMedium);
		rdbtnMedium.setBounds(0, 26, 169, 23);
		panel.add(rdbtnMedium);
	}
}