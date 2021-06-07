import java.util.Scanner;
public abstract class User 
{
   public static void User (String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       String name = scanner.nextLine();
       String phone = scanner.nextLine();
       System.out.println("Name: " + name);
       System.out.println("Phone: " + phone);
       

    }
    
    }


