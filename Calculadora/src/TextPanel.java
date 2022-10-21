import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextPanel extends JPanel {

	private JTextField txtNumber;

	public TextPanel() {

		txtNumber = new JTextField(25);
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);
		txtNumber.setEnabled(false);
		add(txtNumber);

	}

	public JTextField getTxtNumber() {
		return txtNumber;
	}

}
