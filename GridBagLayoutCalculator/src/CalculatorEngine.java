import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalculatorEngine implements ActionListener{

	Calculator parent;
	
	CalculatorEngine(Calculator parent){
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//get the source of this action
		JButton clickedButton = (JButton) e.getSource();
		
		switch(clickedButton.getText()){
		case "Backspace":
			JOptionPane.showMessageDialog(null, "Not implemented!", "Not implemented!", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "CE":
			JOptionPane.showMessageDialog(null, "Not implemented!", "Not implemented!", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "C":
			JOptionPane.showMessageDialog(null, "Not implemented!", "Not implemented!", JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Undefined action", "Undefined action", JOptionPane.INFORMATION_MESSAGE);;	
		}
		
	}

}