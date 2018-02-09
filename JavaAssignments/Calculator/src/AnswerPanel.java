import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnswerPanel extends JPanel {
	JTextField textField;
	
	public AnswerPanel() {
	
	super();
	
	GridLayout gridLayout = new GridLayout(1, 1);
	setLayout(gridLayout);
	
	 textField = new JTextField();
	//textField.setText("2+2=4");
	add(textField);

	
	}
	
	public void display(String input){
		textField.setText(input);
	}

}
