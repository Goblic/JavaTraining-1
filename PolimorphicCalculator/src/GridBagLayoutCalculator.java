import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


public class GridBagLayoutCalculator extends Calculator{
	
	public GridBagLayoutCalculator(){
		
		//constructor of the superclass creates the components
		//registers them with listeners 
		//and adds them to the frame
		super();
		
		//set constraints for the components
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints constr = new GridBagConstraints();
		Insets insets1 = new Insets(2,2,2,2); //minimum amount of space between the component and the edges of its display area (up,left,down,right)
		Insets insets2 = new Insets(2,2,2,15); //bigger space after the right edge
		Insets insets3 = new Insets(2,50,2,20);
		Insets insets4 = new Insets(2,35,2,2);
		Insets insets5 = new Insets(5,2,2,2);
		
		//default constraints' attributes
		//after using different attributes for a particular component, reset these default constraints
		
		constr.insets = insets1; 
		constr.fill = GridBagConstraints.BOTH;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		
		//set layout manager for panel
		windowContent.setLayout(gb);

//first row (menu)
		
		constr.gridx = 0;
		constr.gridy = 0;
		gb.setConstraints(edit, constr);
		
		constr.gridx = 1;
		constr.gridy = 0;
		gb.setConstraints(view, constr);
		
		constr.gridx = 2;
		constr.gridy = 0;
		gb.setConstraints(help, constr);
	
//second row (display field)
		
		constr.gridx = 0;
		constr.gridy = 1;
		constr.gridwidth = 6;
		gb.setConstraints(displayField, constr);
		
//first row of buttons (3rd row in grid)
		
		constr.gridx = 1;
		constr.gridy = 2;
		constr.gridwidth = 2;
		constr.insets = insets2;
		gb.setConstraints(backspace, constr);
		constr.gridwidth = 1;
		constr.insets = insets1;
		
		constr.gridx = 2;
		constr.gridy = 2;
		constr.gridwidth = 3;
		constr.insets = insets3;
		gb.setConstraints(ce, constr);
		constr.gridwidth = 1;
		constr.insets = insets1;
		
		constr.gridx = 4;
		constr.gridy = 2;
		constr.gridwidth = 2;
		constr.insets = new Insets(2,40,2,2);
		gb.setConstraints(c, constr);
		constr.gridwidth = 1;
		constr.insets = insets1;
		
//second row of buttons (starting with MC)
		
		constr.gridx = 0;
		constr.gridy = 3;
		constr.insets = new Insets(5,2,2,15);;
		gb.setConstraints(mc, constr);
		
		constr.gridx = 1;
		constr.gridy = 3;
		constr.insets = insets5;
		gb.setConstraints(seven, constr);
		
		constr.gridx = 2;
		constr.gridy = 3;
		gb.setConstraints(eight, constr);
		
		constr.gridx = 3;
		constr.gridy = 3;
		gb.setConstraints(nine, constr);
		
		constr.gridx = 4;
		constr.gridy = 3;
		gb.setConstraints(div, constr);
		
		constr.gridx = 5;
		constr.gridy = 3;
		gb.setConstraints(sqrt, constr);
		constr.insets = insets1;
		

//third row of buttons (starting with MR)
		
		constr.gridx = 0;
		constr.gridy = 4;
		constr.insets = insets2;
		gb.setConstraints(mr, constr);
		constr.insets = insets1;
		
		constr.gridx = 1;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		gb.setConstraints(four, constr);
		
		constr.gridx = 2;
		constr.gridy = 4;
		gb.setConstraints(five, constr);
		
		constr.gridx = 3;
		constr.gridy = 4;
		gb.setConstraints(six, constr);
		
		constr.gridx = 4;
		constr.gridy = 4;
		gb.setConstraints(mult, constr);
		
		constr.gridx = 5;
		constr.gridy = 4;
		gb.setConstraints(mod, constr);
		
//fourth row of buttons (starting with MS)
		
		constr.gridx = 0;
		constr.gridy = 5;
		constr.insets = insets2;
		gb.setConstraints(ms, constr);
		constr.insets = insets1;
		
		constr.gridx = 1;
		constr.gridy = 5;
		gb.setConstraints(one, constr);
		
		constr.gridx = 2;
		constr.gridy = 5;
		gb.setConstraints(two, constr);
		
		constr.gridx = 3;
		constr.gridy = 5;
		gb.setConstraints(three, constr);
		
		constr.gridx = 4;
		constr.gridy = 5;
		gb.setConstraints(minus, constr);
		
		constr.gridx = 5;
		constr.gridy = 5;
		gb.setConstraints(inv, constr);
		
//fifth  row of buttons (starting with M+)
		
		constr.gridx = 0;
		constr.gridy = 6;
		constr.insets = insets2;
		gb.setConstraints(mPlus, constr);
		constr.insets = insets1;
		
		constr.gridx = 1;
		constr.gridy = 6;
		gb.setConstraints(zero, constr);
		
		constr.gridx = 2;
		constr.gridy = 6;
		gb.setConstraints(plusMinus, constr);
		
		constr.gridx = 3;
		constr.gridy = 6;
		constr.ipadx = 15;
		gb.setConstraints(dot, constr);
		constr.ipadx = 0;
		
		constr.gridx = 4;
		constr.gridy = 6;
		constr.ipadx = 10;
		gb.setConstraints(plus, constr);
		constr.ipadx = 0;
		
		constr.gridx = 5;
		constr.gridy = 6;
		gb.setConstraints(equal, constr);
		
		frame.pack(); //set the size big enough to accomodate all controls
		
		//display the window
		
		frame.setVisible(true);
	}

}
