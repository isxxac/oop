//DCPE/FT/3B/21
//P1420692
//Isaac Loo Kai Cheng

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.color.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

public class Mp_gui extends JFrame implements ActionListener {	
	
	  /*prepare all the GUI components first by creating objects from GUI classes*/ 
	  private JButton jbtSP = new JButton("Set Your Profile");
	  private JButton jbtVP = new JButton("View Your Profile");
	  private JButton jbtR  = new JButton("Ready");
	  private JButton jbtExit = new JButton("Exit");

	  private JLabel jlabel = new JLabel("Fitness Mate");
	  private JTextField jtext = new JTextField("Welcome:");
	  
public Mp_gui(){
	  /* Set BorderLayout for the frame
	  BorderLayout can place components in 5 different position: EAST,    
	  WEST, NORTH, SOUTH */  
	  BorderLayout b = new BorderLayout();
	  //container.setLayout(b);
	  setLayout(b);
	  //container.setLayout(new BorderLayout());

	  // Create panel to hold the buttons using Grid Layout
	  JPanel p0 = new JPanel();
	  p0.setLayout(new GridLayout(2,1));
	  JPanel p1 = new JPanel();
	  p1.setLayout(new GridLayout(1,2));
	  JPanel p2 = new JPanel();
	  p2.setLayout(new GridLayout(1,2));

	   //Change button color
	  jlabel.setForeground(Color.black);
	  //jbtRect.setBackground(Color.magenta);//change background color
	  //jbtOval.setForeground(Color.red);//change font color

	  // Add buttons to the panel
	  p0.add(jlabel);
	  p0.add(jtext);
	  p1.add(jbtSP);
	  p1.add(jbtVP);
	  p2.add(jbtR);
	  p2.add(jbtExit);
			  
	  add(p0, BorderLayout.NORTH);	  
	  add(p1, BorderLayout.CENTER);
	  add(p2, BorderLayout.SOUTH);
	  
	 
	  //Create a listener for each button
	  jbtSP.addActionListener(this);
	  jbtVP.addActionListener(this);
	  jbtR.addActionListener(this);
	  jbtExit.addActionListener(this);
			  
}

public void actionPerformed(ActionEvent e){ // find out which button was pressed

	  if (e.getSource()==jbtSP)
	  {
		 // SP();
	  }
	  else if (e.getSource() == jbtVP)
	  {
		 // VP();
	  }
	  else if (e.getSource() == jbtR)
	  {
		// R();
	  }
	  else if (e.getSource() == jbtExit)
	  {
		  JOptionPane.showMessageDialog(null,"Thanks for using the program!",
		  "By Isaac, P1420692",JOptionPane.INFORMATION_MESSAGE);
		  // end the program
		  System.exit(0);
	  }
}


/** Main Method **/
public static void main(String[] args){
	  Mp_gui frame = new Mp_gui();
	  //JFrame frame=new JFrame();
	  frame.setTitle("By Isaac, P1420692");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(300,250);
  
	  frame.setVisible(true);
	  // System.out.println("diaply window, but set is invisible");
}

}
	