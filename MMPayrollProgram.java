//Matthew Manuel
//CS 140
//Payroll Program
//20 Jan 2021
import java.util.Scanner;

public class PayrollProgram { //This attempts to calculate payroll for employees

   public static void main(String [] args) {  //This is the main method and the beginning of the java program
      
         String name; //Employee name
         int answer; //1 hourly 2 salary
         int employeeCount;//Number of employees
         double hours; //Round hours to the nearest tenth  
         double rate;  //Hourly pay rate
         double overtime; //Hourly rate * 1.5
         double taxes; //Net pay * .2 = Gross pay
         double netpay; //rate * hours
         double grosspay; //Gross pay = Netpay * taxes
         double salarywage; //Enter non hourly salary
         
         Scanner input = new Scanner(System.in); //Scanner to input name, hours, and earnings         
         
         int count = 1;
         System.out.println("How many employees do you have to enter?");
         employeeCount = input.nextInt();//value of how many employees you have.
         
         while (count <= employeeCount) {//Begin while loop for entering how many employees you have
                     
         
         
         System.out.println("Enter Employee Name"); // Enter your Name
         name = input.next();
   
         System.out.println("What is your employee type, enter 1 for hourly, 2 for salary"); // Answer if you are a hourly or salaried employee
         answer = input.nextInt();
         
                      
          if (answer == 1) {
               
               System.out.println("Please enter your hours worked: ");
               hours = input.nextDouble();
               
               System.out.println("Please enter your hourly rate: ");
               rate = input.nextDouble();
               
               System.out.println("Do you have overtime hours? 1 for yes, 2 for no");
               answer = input.nextInt();
                  
                  if (answer == 1) {
                     System.out.println("How many overtime hours do you have?");
                     
                     overtime = input.nextDouble() * rate * 1.5;
                     }
                     
                     else { overtime = 0;
                                         
                        System.out.println("No overtime this pay period");
                        }

               netpay = rate * hours + overtime;
               
               grosspay = netpay * .8;
               
               System.out.printf("%s your net pay is: %.2f and your gross pay is: %.2f",name, netpay, grosspay);
               System.out.println();
            }
            else if (answer == 2) {
               System.out.println("You are Salary, what is your rate?");
               
               salarywage = input.nextInt();
               
               netpay = salarywage;
               
               grosspay = netpay * .8;
               
               System.out.printf("%s your net pay is: %.2f and your gross pay is: %.2f",name, netpay, grosspay);
               System.out.println();
               }
               else 
               { System.out.println("you don't work here");
                 System.out.println(); 
               }
         count++;//increase the count of the employees
            
         }
     }
    
 }   
         
         