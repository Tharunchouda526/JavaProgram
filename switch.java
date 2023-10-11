package in.anudeep.mod;
import java.util.Scanner;
public class Switch
{

	public static void main(String[] args)
	{
		     Scanner sc = new Scanner(System.in);
		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Enter the name of student " + i + ": ");
		            String name = sc.nextLine();
		            
		            System.out.print("Enter the attendance percentage for " + name + ": ");
		            int attendance = sc.nextInt();
		            sc.nextLine();
		            
		            char grade;
		            
		           
		            switch ((int) attendance / 10) 
		            {
		                case 9:
		                case 10:
		                    grade = 'A';
		                    break;
		                case 8:
		                    grade = 'B';
		                    break;
		                case 7:
		                    grade = 'C';
		                    break;
		                case 6:
		                    grade = 'D';
		                    break;
		                default:
		                    grade = 'E';
		            }
		            
		            System.out.println(name + "'s grade is: " + grade);
		        }
		        
		       
		    }
		

	

}
