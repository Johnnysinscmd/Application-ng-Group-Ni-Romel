import java.util.*;
import java.math.*;
public class MenuConsoleApplication {
	public static final String RedBG = "\033[41m";
	public static final String Whitetxt = "\033[37m";
	public static final String Reset = "\033[0m";
	public static final String BlackBG = "\033[40m";
	public static final String Yellowtxt = "\033[33m";
    static Scanner sc= new Scanner(System.in);
    static int option;
    static double num1;
    static double num2;
    static double radius;
    static double side;
    static double Cm;
    static double result;
    static double result2;
    static boolean exit = false;

    public static void main(String[] args) throws InterruptedException {
        loading();
        Clearscreen();
        StartScreen();
        while (!exit) {
            // Check for valid numeric input
            try {
                option = sc.nextInt();
                if (option > 3|| option < 0) {
                	Clearscreen();
                	Dinosaur();
                }
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                
            }
        }
    }

    public static void StartScreen() throws InterruptedException {
    	System.out.println(Yellowtxt);
        System.out.println("\t\t\t\t\t\t"+"             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                                     [1] Start\r\n"
        		+"\t\t\t\t\t\t"+ "                                     [2] About Us\r\n"
        		+"\t\t\t\t\t\t"+ "                                     [3] Exit\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
        

        try {
            option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Aboutus();
                    break;
                case 3:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	
        }
    }

    public static void Start() throws InterruptedException {
    	Clearscreen();
    	System.out.println("\t\t\t\t\t\t"+"             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [1] Calculator\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [2] Area and Circumference\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [3] Area and Perimeter\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [4] Conversion\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [5] Back/Return\r\n"
    			+"\t\t\t\t\t\t"+ "                                   [6] Exit\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                                    \r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n");


        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Calculator();
                    break;
                case 2:
                	Clearscreen();
                    AreaAndCircumference();
                    break;
                case 3:
                	Clearscreen();
                    AreaAndPerimeter();
                    break;
                case 4:
                	Clearscreen();
                    Conversion();
                    break;
                case 5:
                	Clearscreen();
                    StartScreen();
                    break;
                case 6:
                	Clearscreen();
                    Exit();
                    break;
                default:
                    Clearscreen();
                    Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Aboutus() throws InterruptedException {
    	Clearscreen();
    	System.out.println("\t\t\t\t\t\t"+"             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                 |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                   |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                     \r\n"
    			+"\t\t\t\t\t\t"+ "                          __  __    ___   __  __    ___     ___     ___     ___   \r\n"
    			+"\t\t\t\t\t\t"+ "                         |  \\/  |  | __| |  \\/  |  | _ )   | __|   | _ \\   / __|  \r\n"
    			+"\t\t\t\t\t\t"+ "                         | |\\/| |  | _|  | |\\/| |  | _ \\   | _|    |   /   \\__ \\  \r\n"
    			+"\t\t\t\t\t\t"+ "                         |_|__|_|  |___| |_|__|_|  |___/   |___|   |_|_\\   |___/  \r\n"
    			+"\t\t\t\t\t\t"+ "                         _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+"\t\t\t\t\t\t"+ "                         \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+"\t\t\t\t\t\t"+"\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Lasanas\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Erick\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Villasis\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Paragile\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Althea\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Convis\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Guiwanon\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Roa\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Roxas\r\n"
    			+"\t\t\t\t\t\t"+ "                                           -Pantanosa\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                  _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                 |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                 |____________________________________________________________________________|");


        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Calculator() throws InterruptedException {
    	Clearscreen();
        System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
        		+"\t\t\t\t\t\t"+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
        		+"\t\t\t\t\t\t"+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
        		+"\t\t\t\t\t\t"+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
        		+"\t\t\t\t\t\t"+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
        		+"\t\t\t\t\t\t"+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [1] Addition\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [2] Subtraction\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [3] Multiplication\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [4] Division\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [5] Back/Return\r\n"
        		+"\t\t\t\t\t\t"+ "                                               [6] Exit\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
        
        

        try {
            option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    addition();
                    break;
                case 2:
                	Clearscreen();
                    subtraction();
                    break;
                case 3:
                	Clearscreen();
                    multiplication();
                    break;
                case 4:
                	Clearscreen();
                    division();
                    break;
                case 5:
                	Clearscreen();
                	Start();
                	break;
                case 6:
                	Clearscreen();
                	Exit();
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
           Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }


    public static void addition() throws InterruptedException {
    	System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                +"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                +"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                +"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                +"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
                +"\t\t\t\t\t\t"+ "\r\n"
                +"\t\t\t\t\t\t"+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
                +"\t\t\t\t\t\t"+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
                +"\t\t\t\t\t\t"+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
                +"\t\t\t\t\t\t"+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
                +"\t\t\t\t\t\t"+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
                +"\t\t\t\t\t\t"+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
        
        // Ask for num1
         try {
             // Try to parse both numbers
            
        	 System.out.print("\t\t\t\t\t\t"+"                                              num1: ");
             num1 = getUserInput();
             // Perform addition
             
         } catch (NumberFormatException e) {
             // If parsing fails, show error and call Dinosaur()
             Dinosaur();
         }// Read num1 input
         try {
             // Try to parse both numbers
            
        	 System.out.print("\t\t\t\t\t\t"+"                                              num2: ");
             num2 = getUserInput();
             // Perform addition
             
         } catch (NumberFormatException e) {
             // If parsing fails, show error and call Dinosaur()
             Dinosaur();
         }
           result = num1+num2;
        
    
         
    	System.out.println("\t\t\t\t\t\t"+"                                             Result: "+result
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
    	 try {
    		 option = (int) getUserInput1();
             switch (option) {
                 case 1:
                 	Clearscreen();
                     Start();
                     break;
                 case 2:
                     Exit();
                     break;
                 default:
                	 Clearscreen();
                 	Dinosaur();
                     break;
             }
         } catch (InputMismatchException e) {
        	 Clearscreen();
             sc.nextLine(); // Clear the invalid input from the buffer
             Dinosaur();
             
         }
     }
    	
    
   public static void subtraction() throws InterruptedException {
	   System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+"\t\t\t\t\t\t"+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+"\t\t\t\t\t\t"+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+"\t\t\t\t\t\t"+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+"\t\t\t\t\t\t"+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+"\t\t\t\t\t\t"+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num1: ");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
         result = num1-num2;
   	System.out.println("\t\t\t\t\t\t"+"                                             Result:"+result
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
   			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
    
   public static void multiplication() throws InterruptedException {
	   System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+"\t\t\t\t\t\t"+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+"\t\t\t\t\t\t"+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+"\t\t\t\t\t\t"+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+"\t\t\t\t\t\t"+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+"\t\t\t\t\t\t"+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num1: ");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
         result = num1*num2;
   	System.out.println("\t\t\t\t\t\t"+"                                             Result:"+result
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
   			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
   
   public static void division() throws InterruptedException {
	   System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
   			+"\t\t\t\t\t\t"+ "\r\n"
   			+"\t\t\t\t\t\t"+ "                           ___     ___     _       ___    _   _    _       ___    _____    ___     ___   \r\n"
   			+"\t\t\t\t\t\t"+ "                          / __|   /   \\   | |     / __|  | | | |  | |     /   \\  |_   _|  / _ \\   | _ \\  \r\n"
   			+"\t\t\t\t\t\t"+ "                         | (__    | - |   | |__  | (__   | |_| |  | |__   | - |    | |   | (_) |  |   /  \r\n"
   			+"\t\t\t\t\t\t"+ "                          \\___|   |_|_|   |____|  \\___|   \\___/   |____|  |_|_|   _|_|_   \\___/   |_|_\\  \r\n"
   			+"\t\t\t\t\t\t"+ "                          _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
   			+"\t\t\t\t\t\t"+ "                          \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ");
	   try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num1: ");
           num1 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }// Read num1 input
       try {
           // Try to parse both numbers
          
      	 System.out.print("\t\t\t\t\t\t"+"                                             Enter num2: ");
           num2 = getUserInput();
           // Perform addition
           
       } catch (NumberFormatException e) {
           // If parsing fails, show error and call Dinosaur()
           Dinosaur();
       }
   	if(num2==0) {
   		System.out.println("\t\t\t\t\t\t"+"                                             Result: Cannot Divide By 0"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
   	   			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   	   			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
   	}
   	else if(num2>0) {
   		result = num1/num2;
   		System.out.println("\t\t\t\t\t\t"+"                                             Result: "+result
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "\r\n"
   	   			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
   	   			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
   	   			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
   	}
   	 try {
   		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
        	Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
   
    

    public static void AreaAndCircumference() throws InterruptedException {
    	System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|  \r\n"
    			+"\t\t\t\t\t\t"+ "                                       ___                                _              ___   \r\n"
    			+"\t\t\t\t\t\t"+ "                                      /   \\     o O O  __ _    _ _     __| |     o O O  / __|  \r\n"
    			+"\t\t\t\t\t\t"+ "                                      | - |    o      / _` |  | ' \\   / _` |    o      | (__   \r\n"
    			+"\t\t\t\t\t\t"+ "                                      |_|_|   TS__[O] \\__,_|  |_||_|  \\__,_|   TS__[O]  \\___|  \r\n"
    			+"\t\t\t\t\t\t"+ "                                    _|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"| \r\n"
    			+"\t\t\t\t\t\t"+ "                                    \"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'  \r\n"
    			+"\t\t\t\t\t\t"+ "\r\n" 
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n");
    	try {
    	System.out.print("\t\t\t\t\t\t"+"                                        Enter Radius: "); 
    	radius = getUserInput();
    	System.out.println();
    	}
    	catch(NumberFormatException e) {
    		Dinosaur();
    	}
	       result = Math.PI*radius*2;
	       result2 = Math.PI*radius*radius;	
	    		   System.out.println("\t\t\t\t\t\t"+"\r\n"
    			+"\t\t\t\t\t\t"+ "                                        AREA: "+result2
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                                        Circumference: "+result
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");

        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Clearscreen();
                	Dinosaur();
                	break;
                    
            }
        } catch (InputMismatchException e) {
           Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void AreaAndPerimeter() throws InterruptedException {
        System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
        		+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|  \r\n"
        		+"\t\t\t\t\t\t"+ "                                    ___                                _               ___  \r\n"
        		+"\t\t\t\t\t\t"+ "                                   /   \\     o O O  __ _    _ _     __| |     o O O   | _ \\ \r\n"
        		+"\t\t\t\t\t\t"+ "                                   | - |    o      / _` |  | ' \\   / _` |    o        |  _/ \r\n"
        		+"\t\t\t\t\t\t"+ "                                   |_|_|   TS__[O] \\__,_|  |_||_|  \\__,_|   TS__[O]  _|_|_  \r\n"
        		+"\t\t\t\t\t\t"+ "                                 _|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_| \"\"\" | \r\n"
        		+"\t\t\t\t\t\t"+ "                                 \"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-' \r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n");
        try {
        System.out.print("\t\t\t\t\t\t"+"                                        Enter Sides: ");
        side = getUserInput();
        System.out.println();
        }
        catch(NumberFormatException e) {
        	Dinosaur();
        }
	       result = side*side;
	       result2 = side*4;	
        		System.out.println("\t\t\t\t\t\t"+"\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                                        AREA: "+result
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                                        PERIMETER: "+result2
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "\r\n"
        		+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
        		+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
        		+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");

        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                    Clearscreen();
                    Dinosaur();
                    break;
            }
        } catch (InputMismatchException e) {
Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }

    public static void Conversion() throws InterruptedException {
    	System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                          ___                                                      _                    \r\n"
    			+"\t\t\t\t\t\t"+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+"\t\t\t\t\t\t"+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+"\t\t\t\t\t\t"+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+"\t\t\t\t\t\t"+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+"\t\t\t\t\t\t"+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                                               [1] cm-mm\r\n"
    			+"\t\t\t\t\t\t"+ "                                               [2] cm-m\r\n"
    			+"\t\t\t\t\t\t"+ "                                               [3] Back/Return\r\n"
    			+"\t\t\t\t\t\t"+ "                                               [4] Exit\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                     |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|");
    	
    	
    	

        try {
        	option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    mm();
                    break;
                case 2:
                	Clearscreen();
                    m();
                    break;
                case 3:
                	Clearscreen();
                	Start();
                	break;
                case 4:
                	Clearscreen();
                	Exit();
                	break;
                default:
                	Clearscreen();
                    Dinosaur();
                    break;
                    
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine(); // Clear the invalid input from the buffer
            Dinosaur();
        }
    }
    public static void m() throws InterruptedException {
    	System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                          ___                                                      _                    \r\n"
    			+"\t\t\t\t\t\t"+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+"\t\t\t\t\t\t"+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+"\t\t\t\t\t\t"+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+"\t\t\t\t\t\t"+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+"\t\t\t\t\t\t"+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+"\r\n");
	        try {
	        	System.out.print("\t\t\t\t\t\t"+"                                            Enter Cm: ");
	       	 Cm = getUserInput();
	       	 System.out.println();
	            
	        } catch (InputMismatchException e) {
	           Dinosaur();
	        }
	       result = Cm/100;
    	System.out.println("\t\t\t\t\t\t"+"\r\n"
    			+"\t\t\t\t\t\t"+ "                                            m: "+result
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }
    public static void mm() throws InterruptedException {
    	System.out.println("\t\t\t\t\t\t"+"                       |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                         |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                           |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                             |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                               |___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
    			+"\t\t\t\t\t\t"+ "                          ___                                                      _                    \r\n"
    			+"\t\t\t\t\t\t"+ "                         / __|    ___    _ _     __ __    ___      _ _    ___     (_)     ___    _ _    \r\n"
    			+"\t\t\t\t\t\t"+ "                        | (__    / _ \\  | ' \\    \\ V /   / -_)    | '_|  (_-<     | |    / _ \\  | ' \\   \r\n"
    			+"\t\t\t\t\t\t"+ "                         \\___|   \\___/  |_||_|   _\\_/_   \\___|   _|_|_   /__/_   _|_|_   \\___/  |_||_|  \r\n"
    			+"\t\t\t\t\t\t"+ "                       _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \r\n"
    			+"\t\t\t\t\t\t"+ "                       \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n");
    	try {
    		System.out.print("\t\t\t\t\t\t"+"                                            Enter Cm: ");
    	   	 Cm = getUserInput();
    	   	 System.out.println();
    	}
    	catch(NumberFormatException e) {
    		Dinosaur();
    	}
   	
	       result =  Cm*10;
    	System.out.println("\t\t\t\t\t\t"+"\r\n"
    			+"\t\t\t\t\t\t"+ "                                            mm: "+result
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "\r\n"
    			+"\t\t\t\t\t\t"+ "                       _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                      |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                      |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    Start();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }

    public static void Exit() throws InterruptedException {
    	Clearscreen();
    	System.out.println(Reset);
    	System.out.println(BlackBG+Whitetxt);
    	System.out.println("\t\t\t\t\t"+"                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                            .++++=.                                                                                                                                                                                                                                                      \r\n"
    			+"\t\t\t\t\t"+ "                                                                           .=@@@@@.                                                                                                                                                                                                                                                      \r\n"
    			+"\t\t\t\t\t"+ "                                                                           .#@@@@%                                                                                                                                                                                                                                                       \r\n"
    			+"\t\t\t\t\t"+ "                                                                             :@@@#  ..:::..                                                                                                                                                                                                                                              \r\n"
    			+"\t\t\t\t\t"+ "                                                          .=+*##:@@@@@@+.    -@@@* .-@@@@+.           ...                                                                                                                                                                                                                                \r\n"
    			+"\t\t\t\t\t"+ "                                               ....:#@@+  .@@@@@+@@@@@@@@:   =@@@+.*@@@@.           .:@@@@@:                                                                                                                                                                                                                             \r\n"
    			+"\t\t\t\t\t"+ "                                            .-%@@@@@@@@@: =@@@@@+::::#@@@%.  *@@@=*@@@@:            -@@@@@*.   :%%#-.                                                                                                                                                                                                                    \r\n"
    			+"\t\t\t\t\t"+ "                        .:.               .-@@@@@@@@@@@@+   =@@@#    :@@@%:  #@@@@@@@@.              .@@@@.    =@@@%.                                                                                                                                                                                                                    \r\n"
    			+"\t\t\t\t\t"+ "                  .. .+@@@%.     ..       -@@@@#.  -@@@@@.  -@@@%.   .%@@@- .%@@@-#@@@@.            .%@@@=    .%@@@:  ...:--:...                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                .=%: .%@@@@#...+%@@@%-.  .@@@@:     .*@@@#  :@@@@:   .%@@@-..@@@@-.%@@@#.           -@@@%:   .+@@@*. .#@@@@@@@@@-.                                                                                                                                                                                                       \r\n"
    			+"\t\t\t\t\t"+ "              .-@@@#. =*@@@@++@@@@@@@@%. .@@@@.      :@@@@-..%@@@=    +@@@@@.@@@@: .%@@@%.          =@@@@=.  .@@@@-.+@@@@@@@@@@@@#.                                                                                                                                                                                                      \r\n"
    			+"\t\t\t\t\t"+ "           ..=@@@@@@-   .%@@@%@@%**%@@@%..*@@@@:.  ..:#@@@@@.#@@@=    .@@@@%.@@@@:  :%@@@*.         .%@@@@@@@%@@@#.-@@@@=.   .%@@@#.  .:-.                                                                                                                                                                                               \r\n"
    			+"\t\t\t\t\t"+ "         .-@@@@@@@#..   .-@@@@-.   .#@@@#..#@@@@@@@@@@*@@@@@.+@@@*    ............  .......          .-@@@@@*%@@@-.#@@@=.     :@@@@: :%@@@%.                                                                                                                                                                                             \r\n"
    			+"\t\t\t\t\t"+ "        :@@@@@@@@%.       -@@@@-    .@@@@*---%@@@@@@@@+=*=-.                                      .:%+.. .::=@@@#..*@@@*.    .-@@@@. :@@@@@:                                                                                                                                                                                             \r\n"
    			+"\t\t\t\t\t"+ "         +@@%*@@@@@:       =@@@@:    .%@@@@#  .:+**=.                                            .+@@@@@%+=#@@@@:  :@@@@#:..:*@@@@=..%@@@%:    .-:.                                                                                                                                                                                      \r\n"
    			+"\t\t\t\t\t"+ "         :=.  :@@@@@=.     .*@@@@.    :@@@@@.                                                     .=@@@@@@@@@@@*.   :@@@@@@@@@@@@= -@@@@*.    :@@@@+                                                                                                                                                                                     \r\n"
    			+"\t\t\t\t\t"+ "               .#@@@@*.     .*@@@%.   .:*-..                                                         .:-+%@@#=..     .:#@@@@@@%-..-@@@@+.   .:@@@@#.                                                                                                                                                                                     \r\n"
    			+"\t\t\t\t\t"+ "                .*@@@@%.     .#@@@#.                  .:-==-:.                           ...                              ...    .@@@@+    .=@@@@+.                                                                                                                                                                                      \r\n"
    			+"\t\t\t\t\t"+ "                  -@@@@@..    .%%-.                   .@+.....         ..            ... .+: ....                                .@@@@@:...*@@@@=.                                                                                                                                                                                       \r\n"
    			+"\t\t\t\t\t"+ "                  .:@@@@@=.                           .@+=+=. .*%#. +*#@%    .*. #*.+%@@..#..%+%@- .*%%+.                         .%@@@@@##@@@%:                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                    .#@@@@=                           .@*.....@-.-@.##.:+    =*..%*:@*=. :@..@*.+@:@:.:%.                          .-#@@*@@@@%..                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                     .+%=.                            .@=    .@:.-@.#*       :*..%*...:@.:@..%:.+@=@..=@.                             .:%@@@@@+.                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                      ..                              .@=     :#@*. *+       .+@#%*-%@@-..=..%: :@.:++=%.                               ..=@=.                                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                 ..-:-#=                                                                                                                                                                                                                                 \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                  ..::.                                                                                                                                                                                                                                  \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         \r\n"
    			+"\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                                         ");
    	System.out.println(Reset);
    	Thread.sleep(5000);
    	System.out.println(BlackBG+Whitetxt);
        System.out.println("\t\t\t\t\t\t"+"                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                            .......::...       .@@-.      ...::....     ....::...       ..::...     ....::...                                                                                                                                                                                                       \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-:%@%%@@@@=.     .@@-.    .=@@@%%@@@+.. ..+@@@%%@@@-   ..#@@%%%@@#.  .:@@@%%@@@*.                                                                                                                                                                                                     \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-*......:%@#.    .@@-.   .%@*......*@%...%@*.....:%@=. .*@#.....*@%..+@%:.....=@@..                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@*..     ..%@=    .@@-.  .=@#..     .#@-.:**.   ...=@@. .:@@#:.  ....:@@..    ..*@#.                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-.       .*@#.   .@@-.  .+@@@@@@@@@@@@=...*@@@@@@@@@@. ...:*@@@@#:..-@@@@@@@@@@@@%.                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@+.       .#@=.   .@@-.  .=@%.........:..:@@=......+@@...--.....:#@@.:@@:........::.                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@+=..    .#@%..   .@@-.  ..%@*.     .%@=.:@@:   ..++%@. .@@+.. ...%@-.+@%.     .#@#.                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@--@@##%@@@+...#@@@@@@@@@:..+@@@###@@%:...+@@%##@@+:@@@%.:%@@#**#@@#...-@@@###@@@=..                                                                                                                                                                                                   \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-...----:... .::::::::::. ....--=-:.... ...:-=-:....:::....:-==-:... ....:-=--...                                                                                                                                                                                                     \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-.........   ............   ........      ........ ..... .........     .........                                                                                                                                                                                                      \r\n"
        		+"\t\t\t\t\t\t"+ "                           .%@-.                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                           .....                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                      .....                                                                                                                                                                                                                                                         \r\n"
        		+"\t\t\t\t\t\t"+ "                                                     .*%@@:                                                                                                                                                                                                                                                         \r\n"
        		+"\t\t\t\t\t\t"+ "                       .         .    .  . ...    .  :@@@@-.       ...                                 .     .                                                                                                                                                                                                      \r\n"
        		+"\t\t\t\t\t\t"+ "                      .@@@@@@@@@@@-.:#@@@@@@@@+.  *@@@@@@@@@@@#. .:%@@@@@@@%-..       .*@@@#.     =@@@@..:#@@@@@@@@*..                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@@@@@@@@-+@@@@@%@@@@@@-.*@@@@@@@@@@@#..#@@@@@%@@@@@%.       .*@@@#.     =@@@@..@@@@%##@@@@@:                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@:.......@@@@:....*@@@%....:@@@@-.....*@@@+.....=@@@#.      .*@@@#.     =@@@@..@@@@%=..+***-                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@:.    ...-#@@@@@@@@@@@. ..:@@@@:.   .@@@@@@@@@@@@@@%.      .*@@@#.    .+@@@@...*@@@@@@@%+..                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@:.    ..@@@@*:...*@@@@.  .:@@@@:    .%@@@=...........      .*@@@%.   ..%@@@@.......=%@@@@@+.                                                                                                                                                                                             \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@:.    .-@@@@*==#@@=#@@**..:@@@@=-==+:.@@@@#-::-%@@@@.       -@@@@@+-=#@-#@@@.#@@@@-...*@@@%..                                                                                                                                                                                            \r\n"
        		+"\t\t\t\t\t\t"+ "                      -@@@@:.    ..%@@@@@@@@+.@@@@@..:@@@@@@@@@-..#@@@@@@@@@@*..       .=@@@@@@@@==@@@@..#@@@@@@@@@@@=.                                                                                                                                                                                             \r\n"
        		+"\t\t\t\t\t\t"+ "                      .=++=..     ..:=*##+-...:=++=...-#%##***+:....-+*##*=:...         ..-+##+-..:+++=....-=*###*=:..                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                      ......        ........ .......  ..........   ..........           ......... ......  ...........                                                                                                                                                                                               ");
                System.out.println(Reset);
                System.out.println(BlackBG+Yellowtxt);
        		System.out.println("\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                     ...          ..                                                                                                                                                                                                                                \r\n"
        		+"\t\t\t\t\t\t"+ "                                         .....         ...         .....         ....          ....                                                                                                                                                                                                                 \r\n"
        		+"\t\t\t\t\t\t"+ "                                         .:=...       ..+.         ..=-.         .:=..         .+...                                                                                                                                                                                                                \r\n"
        		+"\t\t\t\t\t\t"+ "                                     .....++-..........-+=..........:++...........++:..........=+=.....                                                                                                                                                                                                             \r\n"
        		+"\t\t\t\t\t\t"+ "                                    ..=+++++++++-..-+++++++++-..:=++++++++=...=+++++++++:..-+++++++++-..                                                                                                                                                                                                            \r\n"
        		+"\t\t\t\t\t\t"+ "                                     ...-+++++........+++++:.......=++++-.......-++++=........+++++:....                                                                                                                                                                                                            \r\n"
        		+"\t\t\t\t\t\t"+ "                                       .=+=-++:..  ..-+=:=+-...  .:++-=+=.    ..=+=-++..    .-+=:=+-..                                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                                       -:.....=..  ..-.....-...  .-.....:-    .-:.....=.    .-.....-..                                                                                                                                                                                                              \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    \r\n"
        		+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                                                                                                    ");
        exit = true;
        System.exit(0);
    }

    public static void Clearscreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println("\n");
        }
    }
    public static void Dinosaur() throws InterruptedException {
    	Clearscreen();
    	System.out.println(Reset);
    	System.out.println(Whitetxt+RedBG+"\t\t\t\t\t\t"+"                                           _______________________                                                                                                                                \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         __|  __                 |__                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |   |0_|                  |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |                         |                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |         ________________|                                                                                                                                 \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                                         |         |                                                                                                                                                                                                                       \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               ___                       |         |________                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               | |                     __|      ___________|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               | |                  ___|        |                                                                                                                                                                                                                       \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               | |___           ____|           |_______                                                                                                                                                                              \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |    |__       __|                 ___  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |      |_______|                   | |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |                                  | |__|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |                                  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |                                  |                                                                                                                                                                                                                                                                  \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "               |__                              __|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                 |__                            |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                   |__                       ___|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                     |__                   __|                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                       |__       _____    |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                         |     __|   |__  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                         |  ___|       |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                         | |           |  |                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                         | |__         |  |__                                                                                                                                                                            \r\n"
    			+Whitetxt+RedBG+"\t\t\t\t\t\t"+ "                         |____|        |_____|                                                                                                                                                                            \r\n");
    	System.out.println(Reset);
    	System.out.println("\t\t\t\t\t\t"+"                  _____________________________________________________________________________\r\n"
    			+"\t\t\t\t\t\t"+ "                 |         [1] Back/Return                        [2] Exit                    |\r\n"
    			+"\t\t\t\t\t\t"+ "                 |____________________________________________________________________________|");
    	try {
    		option = (int) getUserInput1();
            switch (option) {
                case 1:
                	Clearscreen();
                    StartScreen();
                    break;
                case 2:
                    Exit();
                    break;
                default:
                	Dinosaur();
            }
        } catch (InputMismatchException e) {
            Clearscreen();
            sc.nextLine();
             Dinosaur();
        }
    }
    public static void loading() throws InterruptedException {
    	String[] loading = {"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%########%######%#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			,
    			"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%########%######%#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@#######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			,
    			"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			,
    			"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			,
    			"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*******#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%#*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			,
    			"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*********#**********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##*****######*******#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********##################******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********#####***##########********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*******####*###############********%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******###*##########%######******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#########%######%#######*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****######%@#####%@############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*******#####################******%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#********###################*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%********##################********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*****##**###############*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%#*********###*******#*****#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**********##*********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*********#**********#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#******#%#*******#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@                                                                                                                                                                           \r\n"}; 
    	for (int i = 0; i<loading.length;i++) {
    		Clearscreen();
    		System.out.println(BlackBG+Whitetxt);
    		System.out.println("\t\t\t\t\t\t"+"██╗      ██████╗  █████╗ ██████╗ ██╗███╗   ██╗ ██████╗                                                                                                                                                                                     \r\n"
    				+"\t\t\t\t\t\t"+ "██║     ██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝                                                                                                                                                                                     \r\n"
    				+"\t\t\t\t\t\t"+ "██║     ██║   ██║███████║██║  ██║██║██╔██╗ ██║██║  ███╗                                                                                                                                                                                    \r\n"
    				+"\t\t\t\t\t\t"+ "██║     ██║   ██║██╔══██║██║  ██║██║██║╚██╗██║██║   ██║                                                                                                                                                                                    \r\n"
    				+"\t\t\t\t\t\t"+ "███████╗╚██████╔╝██║  ██║██████╔╝██║██║ ╚████║╚██████╔╝██╗██╗██╗                                                                                                                                                                           \r\n"
    				+"\t\t\t\t\t\t"+ "╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝╚═╝╚═╝                                                                                                                                                                           \r\n"
    				+"\t\t\t\t\t\t"+ "                                                                                                                                                                                                                                           ");
    		System.out.println(BlackBG+Yellowtxt);
    		System.out.println(loading[i]);
    		System.out.println(Reset);
    		Thread.sleep(1000);
    	}
    	Clearscreen();
    	System.out.println();
    	System.out.println(BlackBG+Whitetxt);
    	System.out.println("\t\t\t\t\t\t"+"......................................................................................................................................                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "................................................:=*******+-:.............:=*******+-:............................................ ....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...........................................:+**+===*%@@%#*+***=:.....-**++=+*%@@%#++****-:....................................... ....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ ".......................................:=**=+#@@%*+======+#%@@%#*-:-***%@@#*======+*#@@%*+**-.................................... ....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "....................................-+**=#@@*+==----::::*----=#@@#**@@%*==-*=-:::::::--=*@@%***=:.....................................                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............::...................=***+%@@+===--::.......=#=:::-*@@@@@%*+=-**+::.........::-=#@@%**+:...................:..............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............-**=............:+***+*@@@+===-::...........=@##***+@%##@@%%#*+@#--.............:-=%@@%***+=............:+**::............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............:@@#************+-+@@@%+===-::...............:%@@@@@+====%@@@@@==-:................:-=%@@@#+**************@@#-:...........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..............*@@@@@%%%@@@@@@%*====--::...................::-=----:..::-=----:....................:--=*%@@@@@@%%%@@@@@%+=-:...........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...............:-============---:::...................................................................::-----==========--:............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............:.....::::::::::................................................................................::::::::::-...............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...........=*-:............................:@%...............+%@@@*:.................................................=*-:.............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...........-@*=-.......:-+*-.......+........%@--:... ......*@::-----:................................................*@#-:............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............@@+=:..+%-::@@--:....*@%::......@*--:.........*@#--::...................................................:#@*+-:...........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "............@@*+--%.:::@@==-:..:@*@#=-:....@+--:.........:@@-=-.....................................................:@@*+-............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...........:@@*+:@+:::@@*=-:..**:@@#=-...:@-:-::#%%@@-...%@+=-:...+@@@@@:...-%%%@@*:...+@@#.:%@@%.=@@@*:....=%%@@#:..%@*+-............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...........+@@++:*#-::@@*=-.:@-:-@@+=:..+%::-:#@:::@@=-:-@@==-..+@:::----:=@=:::-@@#:*:.@@##-:@@%*--@@+-:.=@-::*@#-::+@#+-............                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..........=#@*+=:.::::@@*=:+%.::-@@==:-%-::::%@:=#%+-=-:#@+=-:.#@--::..::*@#--::.@@%=-:+@@+=-*@%=+-#@#==:*@+-+@*-=-:.:@@+=:...........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ ".........-*@%+=-......@@*=%=:::::@@=-%*::::.%@%*=--:::.-@@==-.#@%--:.....@@-=-...@@+=-.%@==--@@==-+@@==-=@@*+--:-::...=@%+-:..........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "........=*@@==-:......%@@%=-::..:@@*%--::..:@@#+=::#=..#@#=-*:%@%=-:..-..@@*=-..#@===:+@#==:+@*==:%@===:#@%==-:+*......+@#+-..........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ ".......+*@%==-:.......+@+==-:...-@@+=-::....@@@@@%-:::.@@%@+::#@@@%@%::::*@@#=+@=:--::@@==-:@@==-.@@%%-:+@@@@@+:::......+@#+-.........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "......**@%==-:.........:--:.....:.---:.......:===--::...:==-::.:-==--:::..:-==-::::....:--:..:--:..:==-:::-===--:........=@%*-:.......                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "....:*#@%+=-:......................:..........::::.......::......::::.......::::....................::.....:::............=@@#=:......                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...:*%@#+=-:...............................................................................................................-@@#=:.....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...=%@*+=-:...................................:-=+**************++**************+==-:.......................................:@@*=:....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...*@@%%#*+:............................:=+***==+*#%%@@@@@@@@@@@%%%@@@@@@@@@@@%%#**+****=-............................:=+***+*@%+-:...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..=%@%%@%%#**-:.....................:+***+*%@@@%#++=========-##@@@@@%*+=====-===++#@@@@%#***+-.......................**=*%%%%#@@*=:...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..+@@%*++=+@@*-:.................=***=%@@@#+====----:::::.:.:.@++**#@*=-:::::::::::---=+%@@@%***+:..................:*@@+====%@@*+-...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..#@##+=-:::#@=-............:+***-+@@@#====--::..............*::--::-=-:...............::--=#@@@****+:..............:@===--:+##@#+-...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "..:@@%##*+-:::::......:=****+-*@@@*====--::................................................::--=#@@@******=::........::-+****#@@+=-...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "...:=%@@%**+********++===#@@@#+===--:::........................................................:::--+%@@@*++++*******+++=+%@@%++=-:...                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ ".....:--=*#%@@@@@@@@@@%#*===----::..................................................................::---=*#%@@@@@@@@@@%#*====--:.....                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "........:::------=-=------:::............................................................................:::------====-----:::........                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "................:::::.............................................................................................::::................                                                                                                                                                                           \r\n"
    			+"\t\t\t\t\t\t"+ "......................................................................................................................................                                                                                                                                                                           ");
    	System.out.println(Reset);
    	Thread.sleep(3000);
    }
    public static double getUserInput() throws InterruptedException {
        double value = 0;
        boolean validInput = false;
        
        while (!validInput) {
            String input = sc.nextLine();  // Read the entire line as a string
            
            if (input.isEmpty()) {  // Check if the input is empty
                Dinosaur();
                break; // Skip the rest of the loop and prompt again
            }
            
            try {
                value = Double.parseDouble(input);  // Try to parse the input as a number
                validInput = true;  // If successful, mark it as valid input
            } catch (NumberFormatException e) {
                Dinosaur();
            }
        }
        return value;
    }
    public static double getUserInput1() throws InterruptedException {
        int value = 0;
        boolean validInput = false;
        
        while (!validInput) {
        	
        	String input = sc.nextLine();  // Read the entire line as a string
            
            if (input.isEmpty()) {  // Check if the input is empty
                Dinosaur();
                break; // Skip the rest of the loop and prompt again
            }
            
            try {
                value = Integer.parseInt(input);  // Try to parse the input as a number
                validInput = true;  // If successful, mark it as valid input
            } catch (NumberFormatException e) {
                Dinosaur();
            }
        }
        return value;
    }
}
