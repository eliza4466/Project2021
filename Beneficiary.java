  import java.util.Scanner;
public class Beneficiary extends User
    {
        public int nopersons;
        public  void noPersons(String[] args) 
        {
            
            nopersons=1;
            
            Scanner MyObj = new Scanner(System.in);
            System.out.println("Enter number of persons: ");
            int nopersons = MyObj.nextInt();
            System.out.println("The number of persons is: " + nopersons);
             
            
            
            
        }
        //wrappers
    }