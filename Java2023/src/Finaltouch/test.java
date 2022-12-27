package Finaltouch;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;	
import java.awt.Color;
import java.util.Scanner;

public class test 
{
	
	public static void main (String [] args) 	
	{
		
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("TUBEBUY"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false);//prevent frame from being resized 
		frame.setSize(720, 720); //sets the dimension of the frame 
		frame.setVisible(true); //make frame visible
		frame.setLocationRelativeTo(null);
		
		
		ImageIcon image = new ImageIcon("java logo.png"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon
		frame.getContentPane().setBackground(new Color(0x123456)); //change colour of background
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
		//5! = 5*(4*3*2*1) = 120
			
		    Scanner scanner = new Scanner(System.in);
		    
		    // Prompt the user to enter a number
		    System.out.println("Enter a number to calculate its factorial: ");
		    int num = scanner.nextInt();
		    
		    // Calculate the factorial of the number
		    int f = 1;
		    for (int i = 1; i <= num; i++) {
		      // Multiply the current value of factorial by i and print the result
		      f *= i;
		      System.out.println(+(f / i)+ " * " +i+ " = " +f);
		    }
		    
		    // Print the final result
		    System.out.println("The factorial of " + num + " is " + f);
			
		  }
		}