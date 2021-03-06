import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator {

	//Declare Calculator's graphical components
	private JFrame frame;
	private JPanel windowContent;
	private JMenu edit;
	private JMenu view;
	private JMenu help;
	private JTextField displayField;
	private JButton backspace;
	private JButton ce;
	private JButton c;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton mc, mr, ms, mPlus;
	private JButton sqrt, mod, inv, equal;
	private JButton plus, minus, div, mult;
	private JButton dot, plusMinus;
	
	/**
	 * Constructor creates the components, registers them with listeners, 
	 * adds them to the frame and displays the window
	 * @param args
	 */
	
	public Calculator(){
		
		//create a panel and its layout manager
		
		windowContent = new JPanel();
		
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints constr = new GridBagConstraints();
		Insets insets1 = new Insets(2,2,2,2); //minimum amount of space between the component and the edges of its display area (up,left,down,right)
		Insets insets2 = new Insets(2,2,2,15); //bigger space after the right edge
		Insets insets3 = new Insets(2,50,2,15);
		Insets insets4 = new Insets(2,35,2,2);
		Insets insets5 = new Insets(5,2,2,2);
		
		//default constraints' attributes
		//after using different attributes for a particular component, reset these default constraints
		
		constr.insets = insets1; 
		constr.fill = GridBagConstraints.BOTH;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 0.0;
		constr.weighty = 0.0;
		
		//set layout manager for panel
		
		windowContent.setLayout(gb);
		
		//create the components
		
		displayField = new JTextField();
		edit = new JMenu("Edit");
		view = new JMenu("View");
		help = new JMenu("Help");
		backspace = new JButton("Backspace");
		ce = new JButton("CE");
		c = new JButton("C");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		mc = new JButton("MC");
		mr = new JButton("MR");
		ms = new JButton("MS");
		mPlus = new JButton("M+");
		plus = new JButton("+");
		minus = new JButton("-");
		div = new JButton("/");
		mult = new JButton("*");
		sqrt = new JButton("sqrt");
		mod = new JButton("%");
		inv = new JButton("1/x");
		equal = new JButton("=");
		dot = new JButton(".");
		plusMinus = new JButton("+/-");
		
		//create listener and register components with it		
		
		CalculatorEngine calcEngine = new CalculatorEngine(this);

		backspace.addActionListener(calcEngine);
		ce.addActionListener(calcEngine);
		c.addActionListener(calcEngine);
		plus.addActionListener(calcEngine);
		minus.addActionListener(calcEngine);
		div.addActionListener(calcEngine);
		mult.addActionListener(calcEngine);
		sqrt.addActionListener(calcEngine);
		mod.addActionListener(calcEngine);
		one.addActionListener(calcEngine);
		two.addActionListener(calcEngine);
		three.addActionListener(calcEngine);
		four.addActionListener(calcEngine);
		five.addActionListener(calcEngine);
		six.addActionListener(calcEngine);
		seven.addActionListener(calcEngine);
		eight.addActionListener(calcEngine);
		nine.addActionListener(calcEngine);
		zero.addActionListener(calcEngine);
		mc.addActionListener(calcEngine);
		mr.addActionListener(calcEngine);
		ms.addActionListener(calcEngine);
		mPlus.addActionListener(calcEngine);
		inv.addActionListener(calcEngine);
		equal.addActionListener(calcEngine);
		dot.addActionListener(calcEngine);
		plusMinus.addActionListener(calcEngine);
		
		//set constraints for the components

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
		constr.insets = insets4;
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
		gb.setConstraints(dot, constr);
		
		constr.gridx = 4;
		constr.gridy = 6;
		gb.setConstraints(plus, constr);
		
		constr.gridx = 5;
		constr.gridy = 6;
		gb.setConstraints(equal, constr);
		
		//add the components to the panel
		
		windowContent.add(displayField);
		windowContent.add(edit);
		windowContent.add(view);
		windowContent.add(help);
		windowContent.add(backspace);
		windowContent.add(ce);
		windowContent.add(c);
		windowContent.add(one);
		windowContent.add(two);
		windowContent.add(three);
		windowContent.add(four);
		windowContent.add(five);
		windowContent.add(six);
		windowContent.add(seven);
		windowContent.add(eight);
		windowContent.add(nine);
		windowContent.add(zero);
		windowContent.add(plus);
		windowContent.add(minus);
		windowContent.add(div);
		windowContent.add(mult);
		windowContent.add(sqrt);
		windowContent.add(mod);
		windowContent.add(inv);
		windowContent.add(equal);
		windowContent.add(mc);
		windowContent.add(mr);
		windowContent.add(ms);
		windowContent.add(mPlus);
		windowContent.add(dot);
		windowContent.add(plusMinus);
		
		//create the frame and set its content pane
		
		frame = new JFrame("Cristina's Beautiful Calculator");
		frame.setContentPane(windowContent);
		frame.pack(); //set the size big enough to accomodate all controls
		
		//display the window
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();

	}
	
	//public API

	public String getDisplayFieldValue() {
		return displayField.getText();
	}

	public void setDisplayFieldValue(String val) {
		this.displayField.setText(val);
	}


}
