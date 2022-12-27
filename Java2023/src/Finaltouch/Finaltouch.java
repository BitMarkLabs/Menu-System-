/*Utility Tool Assessment Code 
 * Markelo Rapti 17012180
 * Lecturer: Paul Begg
 * Perth College UHI
 */
package Finaltouch;
import javax.swing.JOptionPane;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Finaltouch {
	//start of class
	
	
	static DecimalFormat dec= new DecimalFormat ("#,00"); 
	static Scanner input = new Scanner(System.in);
	public static String getMenuSystem() //menu system 
	{
		
		String menu = JOptionPane.showInputDialog("Please select what you would like to do:"+"\nOption1 Generate Username             >> Press: U" + "\nOption2 Find Factorial Number  	        >> Press: F" + "\nOption3 For Long Factorial Number  >> Press: L" + "\nOption4 Quit Program                          >> Press: Q");
			
			if (menu == null) 
			{
	            System.exit(0); // exit the program if user clicks close button or cancel
	 
			}
			return menu;}	
		
	
	public static String getforename() // code to prompt the user to enter a fore-name
	{
	    String fname = ""; 
	    while (fname == null || fname.isEmpty()) {//While loop to catch the empty input from the user and give a warning 
	        fname = JOptionPane.showInputDialog("Please enter your forename");
	        if (fname == null) 
	        {
	            main(null); //  program will return to main menu menu if user clicks close or cancel button
	        }
	        else if (fname.isEmpty()) 
	        {
	            JOptionPane.showInputDialog( null, "Forename cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
	        }
	        
	       
	    }
	    return fname;
	}// end get for-name

	public static String getsurname() // Code to prompt the user to enter a surname
	{
	    String sname = "";
	    while (sname == null || sname.isEmpty()) 
	    {//While loop to catch the empty input from the user and give a warning 
	        sname = JOptionPane.showInputDialog("Please enter your surname");
	        if (sname == null) 
	        {
	            main(null); //  program will return to main menu menu if user clicks close or cancel button
	        } 
	        else if (sname.isEmpty()) 
	        {
	            JOptionPane.showInputDialog( null, "Surname cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
	        }
	    }
	   	return sname;
	}// end get-surname


	

	  public static void displayDetails(String displayforname, String displaysurname) // code to return the user-name
	  {

			char displayinitial; //character display 
			 
	
			displaysurname = displaysurname.toUpperCase();// converts the string to upper-case
			displayinitial = displayforname.charAt(0);// strips out the first character of the surname
			String displayusername =  displayinitial + displaysurname; // combine the strings together
			JOptionPane.showMessageDialog(null, "Your Username is "+displayusername);//display the user-name
			main (null); //return to main menu
	  }//end of display details

		
	  	public static void  factorial() //code to prompt the user to enter a factorial number
		{
	  		int i;
			int ii; 
			int f = 1; 
			     
	  	  try { //try catch if the user add by accident a string instead of integer											
	  		  	String dialogue_text = JOptionPane.showInputDialog ("\nEnter an integer to calculate it's factorial");
	  		  	if(dialogue_text == null)	// If user closes dialogue, go back to main
	  		  		main(null);
	  		    i = Integer.parseInt(dialogue_text);
				
				  if ( i <= 0) //if the user input is equals or above zero then (non-negative number) warning will appear  
				  {
					  JOptionPane.showInputDialog("\n Number should be non-negative.");
					  factorial();
					 
			      }
			      else if (i > 16 ) //if the (i) input is above 16 then a warning for Long factorial number will appear
			      {
			    	  JOptionPane.showInputDialog("\nOver number 16 please try choice (L) Long Factorial \nThank you"); 
			    	
			      }
			      else 
			      {
			    	  String calculation_text ="";
			    	  
			         for (ii = 1 ; ii <= i ; ii++ )//calculation for the factorial  
			        	  
			         {
			        	 
			        	 f*=ii;;
			        	 calculation_text += (f/ii)+" * " +ii+ " = " +f+"\n"; //calculation factorial process
			         }    
			         	JOptionPane.showMessageDialog(null, calculation_text + "\nThe factorial of " + i + " = " + f);//print out the calculation process and the final number
				   } main(null); //return to main menu
			      
				}
			
			catch (Throwable t) //catch the wrong input 
	  	  		{
					JOptionPane.showInputDialog( null, "\n Something is wrong please try again and enter a number", "Warning", JOptionPane.WARNING_MESSAGE);
					factorial(); //return to factorial 
				}
		}//end of factorial 

	  		public static void  longfactorial()//code to prompt the user to enter a long factorial number
	  		{
		  
	  			  int i, ii;
			      BigInteger fact = BigInteger.valueOf(1); //code to prompt bigger integer
			            
			  try {   //try catch if the user add by accident a string instead of integer		
				      String dialogue_text = JOptionPane.showInputDialog ("\nEnter an integer to calculate it's factorial");
				      if(dialogue_text == null)	// If user closes dialogue, go back to main
			  		  		main(null);
				      i = Integer.parseInt(dialogue_text);
	
				      if ( i < 0) {//if the user input is equals or above zero then (non-negative number) warning will appear  
				    	  JOptionPane.showInputDialog ("\n Number should be non-negative.");
				      		longfactorial();}
				      
				      else if (i < 16 ) //if the (i) input is lower of 16 then a warning for the user to use factorial choice will appear
				    	  JOptionPane.showInputDialog("\nUnder 16 factorial number please try (F) choice \nThank you");
				    	 
				      
				      else if (i > 20000) //if the (i) input is higher than 20000 then a warning to contact with support will appear
				    	  JOptionPane.showInputDialog("\nFor number higher than 20.000 please contact with customer support \nThank you");
				    	 
				      else
				      { 
				         for ( ii = 1 ; ii <= i ; ii++ )   
				            fact =  fact.multiply(BigInteger.valueOf(ii));;//calculation for big integer
				            JOptionPane.showInputDialog("Factorial of "+i+" is = "+fact);//print out the final number
				      }  main(null); //return to main menu
				   }
			
			   catch (Throwable t) //catch the wrong input
			   {
				   JOptionPane.showInputDialog( null, "\n Something is wrong please try again and enter a number", "Warning", JOptionPane.WARNING_MESSAGE);
				   longfactorial(); //return to long factorial 
					
						
			   }
		    } //end of long factorial
	  		
	
	
	  		public static void main(String[] args) 
			{
		
	  			
				String surname="";
				String forename="";
				
				
				String menu = getMenuSystem();// call the menu-system 
				switch (menu.toUpperCase()) // converts the string to upper-case
				{	
				
					case "U": //choice u to call the display user-name
						forename=getforename();
						surname=getsurname();
						displayDetails(forename,surname); //call display-details
			
						break; 
						
					case "F": //choice f to call for factorial number
						factorial(); //call factorial  
						
						break;
						
					case "L": //choice l to call long factorial number 
						longfactorial(); //call long factorial 
						
						break;	
						
						
					case "Q": //choice q for exit 
						JOptionPane.showInputDialog("\nThank you and goodbye."); 
						System.exit(0);
							
						break;
					
					default: //default for valid option from user 
						JOptionPane.showInputDialog(null, "Please enter a valid option","Warning", JOptionPane.WARNING_MESSAGE);
						main(null);
				}//end of Switch
	

	
			}//end of main  


}//end of class
