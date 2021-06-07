import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class Menu
{
    protected int getPhone()
    {
        Scanner Phone = new Scanner(System.in);
            System.out.println("Enter phone number: ");
            int getphone = Phone.nextInt();
            System.out.println("The phone number is: " + getphone);
            return getphone;
    }
    //gia na doyme an einai admin, donator h beneficiary
    public String ADB()
    {
        DonatorsList();
        if (DonatorsList.contains(""))
        {
            System.out.println("");
        }
        BeneficiaryList();
        if (list.contains("a"))
        {
            System.out.println("It's there");
        }
        else
        {
            System.out.println("Do you want to register?"+" Yes or No");
            Scanner Answer = new Scanner(System.in);
            System.out.println("Enter phone number: ");
            int getAnswer = Answer.nextInt();
            System.out.println("The phone number is: " + getAnswer);
                        
        }
    }
    
}