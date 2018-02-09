import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OperationPanel extends JPanel implements ActionListener {
	AnswerPanel answerPanel = new AnswerPanel();
	
	public OperationPanel(AnswerPanel answerPanel) {
		super();
		
		this.answerPanel = answerPanel;
		
		GridLayout gridLayout = new GridLayout(5, 1);
		setLayout(gridLayout);

		addButton("+");
		
		addButton("-");
		
		addButton("*");
		
		addButton("/");
		
		addButton("=");
		
	}
	
	
	
	private void addButton(String operation) {
		JButton button = new JButton();
		button.setText(operation);
		button.setFont(new Font("Arial", Font.PLAIN, 40));
		button.setPreferredSize(new Dimension(40, 40));
		add(button);
		button.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		answerPanel.display( e.getActionCommand());
	}
}
