//DCPE/FT/3B/21
//P1420692
//Isaac Loo Kai Cheng


import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;		//timertask requirements
import java.util.TimerTask;	//timertask requirements

public class MPp1420692 {	
	
static Timer timer = new Timer();	//initialising timertask requirements
static int seconds = 0;				//initialising timertask requirements
	    
	//main method
	public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "Represents Work In Progress", "by Isaac Loo(P1420692)", JOptionPane.INFORMATION_MESSAGE);
	
	//global variables
	int age=0, healthindicator=0, cntrl=0;
	double weight=0, height=0;
	String name, gender, healthprob, agegroup;
	String  [] temp = new String[10];
	
	
	
	//menu selection
	while(cntrl!=1){
	String[] options = new String[] {"Set your profile", "View your profile", "Start", "Exit"};
	
    int response = JOptionPane.showOptionDialog(null, "What would you like to do? ", "by Isaac Loo(P1420692)", JOptionPane.DEFAULT_OPTION,
    			   JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	switch (response){
	case 0: temp=setprofile();							  //runs Setprofile method
			name= temp[0];								  //assigning temp[0] value to name variable
			gender= temp[1];							  //assigning temp[1] value to gender variable
			age = Integer.parseInt(temp[2]);			  //parsing and assigning temp[2] value to age variable
			weight= Double.parseDouble(temp[3]);		  //parsing temp[2] String value to Double weight variable
			height= Double.parseDouble(temp[4]);		  //parsing temp[3] String value to Double height variable
			healthindicator= Integer.parseInt(temp[5]);	  //parsing temp[4] String valye to Int healthprob variable
			healthprob= temp[6];						  //assigning temp[5] value to healthprob variable
			agegroup= temp[7];							  //assigning temp[6] value to agegroup variable
			//java.awt.Toolkit.getDefaultToolkit().beep();
			System.out.println(name+"\n"+gender+"\n"+weight+"\n"+height+"\n"+healthindicator+"\n"+healthprob+"\n"+agegroup+"\n"+age);//debug display stored values in variables
	break;
	case 1: viewprofile(temp);
	break;
	case 2: start(temp);
	break;
	case 3: System.exit(0);
	break;
	}
	}
	System.exit(0);//needed for JOptionPane.showMessageDialog to release resource
	}
	
	//setprofile method
	public static String[] setprofile(){
		String  [] temp = new String[10];
		temp[0] = JOptionPane.showInputDialog(null,  "Enter your name: ", "by Isaac Loo(P1420692)", JOptionPane.QUESTION_MESSAGE);
		String[] options = new String[] {"Male", "Female", "Other"};
	    int response = JOptionPane.showOptionDialog(null, "Gender: ", "by Isaac Loo(P1420692)", JOptionPane.DEFAULT_OPTION,
	    			   JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	    switch (response){
	    case 0: temp[1]="Male";
	    break;
	    case 1: temp[1]="Female";
	    break;
	    case 2: temp[1]="Other";
	    break;
	    }
	    temp[2] = JOptionPane.showInputDialog(null,  "Enter your age: ", "by Isaac Loo(P1420692)", JOptionPane.QUESTION_MESSAGE);
	    int age = Integer.parseInt(temp[2]);
	    response = 0;
	    temp[3]= JOptionPane.showInputDialog(null, 
	    	      "Enter your weight(kg): ", "by Isaac Loo(P1420692)", 
	    	      JOptionPane.QUESTION_MESSAGE);
	    temp[4]= JOptionPane.showInputDialog(null, 
	    		  "Enter your height(M): ", "by Isaac Loo(P1420692)", 
	    		  JOptionPane.QUESTION_MESSAGE);
	    options = new String[] {"Yes", "No"};
	    response = JOptionPane.showOptionDialog(null, "Any health problems: ", "by Isaac Loo(P1420692)", JOptionPane.DEFAULT_OPTION,
	    			   JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	    switch (response){
	    case 0: temp[5]="1";
	    break;
	    case 1: temp[5]="0";
	    break;
	    }
	    switch (Integer.parseInt(temp[5])){
	    case 1: temp[6]= JOptionPane.showInputDialog(null, 
	  		    "Health problem: ", "by Isaac Loo(P1420692)", 
	  		    JOptionPane.QUESTION_MESSAGE);
	    break;
	    case 0: break;
	    }
	    
		if(age>=13 && age<=19){
			temp[7]="Teenager";}else							//Teenager: 13-19
		if(age>=20 && age<=35){
			temp[7]="Young Adult";}else							//Young adult: 20-35
		if(age>=36 && age<=55){
			temp[7]="Adult";}else								//Adult: 36-55
		if(age>=56 && age<=100){
			temp[7]="Elderly";}									//Elderly: 55-100
		
	    return(temp);
		}
	
	//viewprofile method
	public static void viewprofile(String[] temp2){
			
		String status;
		String name= temp2[0];								  //assigning temp[0] value to name variable
		String gender= temp2[1];							  //assigning temp[1] value to gender variable
		int age = Integer.parseInt(temp2[2]);			 	  //parsing and assigning temp[2] value to age variable
		double weight= Double.parseDouble(temp2[3]);		  //parsing temp[2] String value to Double weight variable
		double height= Double.parseDouble(temp2[4]);		  //parsing temp[3] String value to Double height variable
		int healthindicator= Integer.parseInt(temp2[5]);	  //parsing temp[4] String valye to Int healthprob variable
		String healthprob= temp2[6];						  //assigning temp[5] value to healthprob variable
		String agegroup= temp2[7];							  //assigning temp[6] value to agegroup variable
		if(healthindicator==1){
		status="Yes";
		}else{
		status="No";
		}
		
		Object[][] rows = { {name, gender, age, agegroup, height+"m", weight+"kg", status, healthprob} };
		Object[] cols = { "Name","Gender","Age","Age Group", "Height", "Weight", "Any health problems?", "Health Problem" };
		JTable table = new JTable(rows, cols);
		JOptionPane.showMessageDialog(null, new JScrollPane(table));
	}
	
	public static void start(String[] temp3){
	
		String[] options = new String[] {"Dietary Recommendations", "Exercise Recommendations", "Set Reminder", "Back"};
		int response = JOptionPane.showOptionDialog(null, "What would you like to do? ", "by Isaac Loo(P1420692)", JOptionPane.DEFAULT_OPTION,
 			   JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
		switch (response){
		
		case 0: return;							  
		
		
		case 1: exrec(temp3);
		
		
		case 2: setreminder();
		break;
		
		
		case 3: return;
		
	}
		
	}
	
	public static void setreminder(){
		
		//timertask code
		//TimerTask task;
		/*long delay = 0000;
        long period = 5000;
		seconds=0;
		
		TimerTask task = new TimerTask()
		{
		     @Override
			 public void run()
		     {
		    	String  [] temp = new String[3];
		 		int duration=0;
		 		temp[0]= JOptionPane.showInputDialog(null, 
		 	  		    "Duration of reminder(seconds): ", "by Isaac Loo(P1420692)", 
		 	  		    JOptionPane.QUESTION_MESSAGE);
		 		temp[1]="60";
		 		duration= Integer.parseInt(temp[1])/Integer.parseInt(temp[0]);
		 	    System.out.println(duration);
		     }
		};

		timer.scheduleAtFixedRate(task, delay, period);*/
		
		/*String  [] temp = new String[3];
		int duration=0;
		temp[0]= JOptionPane.showInputDialog(null, 
	  		    "Duration of reminder(seconds): ", "by Isaac Loo(P1420692)", 
	  		    JOptionPane.QUESTION_MESSAGE);
		temp[1]="60";
		duration= Integer.parseInt(temp[1])/Integer.parseInt(temp[0]);
	    System.out.println(duration);
		task = new TimerTask() {
	    private final int MAX_SECONDS = Integer.parseInt(temp[0]);
	    @Override
	    public void run() { 
	    if (seconds < MAX_SECONDS) {
	    seconds++;} 
	    else{
	    Toolkit.getDefaultToolkit().beep();
	    JOptionPane.showMessageDialog(null, "Remember to take your pills");
	    //System.out.println("Boo!");
	    cancel();}}}; // stop the timer */  
	    
	    //timer.schedule(task,0,1000);
	    //timer.scheduleAtFixedRate(task, delay, period);//scheduling task to run
	    //timer.scheduleAtFixedRate(task, delay, intervalPeriod);
	    
	    //end of timertask code
	}
	

	/* public static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("FrameDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel emptyLabel = new JLabel("");
	        emptyLabel.setPreferredSize(new Dimension(175, 100));
	        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    } */
	
	public static void exrec(String[] temp4){
		
		
		int age=Integer.parseInt(temp4[2]);
		double weight = Double.parseDouble(temp4[3]);
		double height = Double.parseDouble(temp4[4]);
		int indicator = Integer.parseInt(temp4[5]);
		System.out.println(temp4[2]+temp4[3]+temp4[4]+temp4[5]);		//debug display
		if(age>=5 && age<=17){
		JOptionPane.showMessageDialog(null, 
		"1. You should accumulate at least 60 minutes of moderate- to vigorous- intensity physical activity daily."+"\n"+
		"2. Amounts of physical activity greater than 60 minutes provide additional health benefits."+"\n"+
		"3. Most of the daily physical activity should be aerobic. Vigorous-intensity activities should be incorporated, including those that strengthen muscle and bone, at least 3 times per week."
		, "by Isaac Loo(P1420692)", JOptionPane.INFORMATION_MESSAGE); //output recommendation
		}else
		if(age>=18 && age<=64){
		JOptionPane.showMessageDialog(null, 
		"1. You should do at least 150 minutes of moderate-intensity aerobic physical activity throughout the\n"
		+ "week or do at least 75 minutes of vigorous-intensity aerobic physical activity throughout the week or\n"
		+ " an equivalent combination of moderate- and vigorous-intensity activity."+"\n"+
		"2. Aerobic activity should be performed in bouts of at least 10 minutes duration. "+"\n"+
		"3. For additional health benefits, adults should increase their moderate-intensity aerobic physical activity\n"
		+ " to 300 minutes per week, or engage in 150 minutes of vigorous-intensity aerobic physical activity per week\n"
		+ ", or an equivalent combination of moderate- and vigorous-intensity activity."
		, "by Isaac Loo(P1420692)", JOptionPane.INFORMATION_MESSAGE); //output recommendation
		}
		if(age>=65){
		JOptionPane.showMessageDialog(null, 
		"1. You should do at least 150 minutes of moderate-intensity aerobic physical activity throughout the\n"+ 
		"week or do at least 75 minutes of vigorous-intensity aerobic physical activity throughout the week or\n "
		+"an equivalent combination of moderate- and vigorous- intensity activity."+"\n"+
		"2. Aerobic activity should be performed in bouts of at least 10 minutes duration."+"\n"+
		"3. For additional health benefits, adults aged 65 years and above should increase their moderate- intensity \n"
		+ "aerobic physical activity to 300 minutes per week, or engage in 150 minutes of vigorous- intensity aerobic \n"
		+ "physical activity per week, or an equivalent combination of moderate-and vigorous-intensity activity."+"\n"+
		"4. Adults of this age group, with poor mobility, should perform physical activity to enhance balance and prevent\n"
		+ "falls on 3 or more days per week."+"\n"+
		"5. Muscle-strengthening activities should be done involving major muscle groups, on 2 or more days a week."+"\n"+
		"6. When adults of this age group cannot do the recommended amounts of physical activity due to health conditions,\n"
		+ "they should be as physically active as their abilities and conditions allow."
		, "by Isaac Loo(P1420692)", JOptionPane.INFORMATION_MESSAGE); //output recommendation	
		}
		
		
		
	}
	
}
	