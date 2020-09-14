import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //create a Scanner for user input
   Scanner input = new Scanner(System.in);
    

    // ask user for temp
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    // variable Celsius is the temp
    int C = input.nextInt();

  // Declare and calculate the temp
  int F=(C*9)/5 +32;

  //displayes the conversion
System.out.println(C + " is the same as " + F);
  }
}
