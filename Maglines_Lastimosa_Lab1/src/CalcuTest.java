
import java.util.Scanner;

public class CalcuTest {

	public static void main(String[] args) {
				
	calcuObjects obj1= new calcuObjects();
									
	System.out.println("Basic Calculator!!!");
										
	Scanner num1= new Scanner(System.in);
	System.out.println("Enter First Number: ");
	obj1.setFirstNumber(num1.nextDouble());
										
	Scanner num2= new Scanner(System.in);
	System.out.println("Enter Second Number: ");
		obj1.setSecondNumber(num2.nextDouble());
									
									
	Scanner operSc= new Scanner(System.in);
	System.out.println("Please choose an Operation from the following:" );
	System.out.println("");
									
	System.out.println("1. Addition \t"+"2.Subtraction \t"+"3. Multiplication \t"+"4. Division\t" );
		int operation= operSc.nextInt();
										
		switch(operation) {
				case 1:
					System.out.println();
					System.out.println(obj1.getFirstNumber() + obj1.getSecondNumber());
						break;
										
				case 2:
					System.out.println();
					System.out.println(obj1.getFirstNumber() - obj1.getSecondNumber());
					break;
										
				case 3:
					System.out.println();
					System.out.println(obj1.getFirstNumber() * obj1.getSecondNumber());
				break;
										
				case 4:
					System.out.println();
					System.out.println(obj1.getFirstNumber() / obj1.getSecondNumber());
					break;
										
				default:
										
					System.out.println("You entered an invalid number");
										
										
										
										
										

					}
				}

			
	

	}


