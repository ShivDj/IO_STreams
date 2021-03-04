package IoFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class InputOutput {

		public static void fileReader() throws IOException,ClassNotFoundException{
			FileInputStream input=null;
	        ObjectInputStream oinput=null;
	        
	         input=new FileInputStream("/home/shiv/Desktop/ShivSingh.csv");
	         oinput=new ObjectInputStream(input);
	         PogoEmp payroll = (PogoEmp)oinput.readObject();
	         
	         System.out.println(payroll.toString());
	         
	         input.close();
	         oinput.close();
	        
	        
		}
		
		private static void fileWrite(PogoEmp payroll)throws IOException  
		{
			FileOutputStream output=null;
	        ObjectOutputStream o_output=null;
	        
			output=new FileOutputStream("/home/shiv/Desktop/ShivSingh.csv");
			
			o_output = new ObjectOutputStream(output);
			
			o_output.writeObject(payroll);
			System.out.println("succesfully written");
			output.close();
			o_output.close();
			
			
		}
		public static void main(String[] args)throws IOException,ClassNotFoundException {
			
			Scanner sc= new Scanner(System.in);
			
			Integer id;
			
			String name;
			
			String last; 
		    
			Double salary;
		    
		    System.out.println("enter your id=");
		    id=sc.nextInt();
		    
		    System.out.println("enter your name=");
		    name=sc.next();
		    
		    System.out.println("enter your lastname=");
		    last=sc.next();
		    
		    System.out.println("enter your salary=");
		    salary=sc.nextDouble();
		    
		    
		    PogoEmp payroll = new PogoEmp(id,name,salary);
		    
		    fileWrite(payroll);

		    fileReader();
		    sc.close();
		    
		    
			
			
		}
		
		
	}
