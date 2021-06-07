   import java.util.*;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.lang.String;
public class Organisation
{
    private String name;
    private Admin admin;
    
    
    public Admin setAdmin()
    {
        return admin;
    }
    public void getAdmin(Admin newAdmin)
    {
        this.admin=newAdmin;
    }
    
    
    public void addEntity()
    {
        ArrayList<String> entities = new ArrayList<String>();
        Scanner myEntity = new Scanner(System.in);
            System.out.println("Enter new Entity: ");
            String addentity = myEntity.nextLine();
            System.out.println("The new entity is: " +addentity );
           //entities.add() ; 
    }
    public static void removeEntity(String[] args)
    {
        ArrayList<String> entities = new ArrayList<String>();
        Scanner reEntity = new Scanner(System.in);
            System.out.println("Delete Entity: ");
            String removeentity = reEntity.nextLine();
            System.out.println("The deleted is: " +removeentity );
        entities.remove(removeentity);
        System.out.println(entities);
    }
    public void insertDonator()
    {
         ArrayList<String> donators = new ArrayList<String>();
         Scanner addDonator = new Scanner(System.in);
            System.out.println("Add Donator: ");
            String insertdonator= addDonator.nextLine();
            System.out.println("The new Donator is: " +insertdonator );
    }
    public void removeDonator()
    {
        ArrayList<String> donators = new ArrayList<String>();
        Scanner reDonator = new Scanner(System.in);
            System.out.println("Remove Donator: ");
            String removedonator= reDonator.nextLine();
            System.out.println("The new Donator is: " +removedonator );
            donators.remove(removedonator);
    }
    public static void insertBeneficiary(String[] args)
    {
        ArrayList<String> beneficiary = new ArrayList<String>();
         
            Scanner addBeneficiaryplace = new Scanner(System.in);
            System.out.println("Beneficiary index number: ");
           int beneficiaryplace= addBeneficiaryplace.nextInt();
            System.out.println("The Beneficiary index number is: " +beneficiaryplace);
            
        Scanner addBeneficiary = new Scanner(System.in);
            System.out.println("Add Beneficiary: ");
            String insertbeneficiary= addBeneficiary.nextLine();
            System.out.println("The new Beneficiary is: " +insertbeneficiary );
           
            beneficiary.set(beneficiaryplace,insertbeneficiary);
            System.out.println(beneficiary);
    }
public void removeBeneficiary ()
    {
        ArrayList<String> beneficiary = new ArrayList<String>();
        Scanner reBeneficiary = new Scanner(System.in);
            System.out.println("Remove Beneficiary: ");
            String removebeneficiary= reBeneficiary.nextLine();
            System.out.println("The new Beneficiary is: " +removebeneficiary );
            beneficiary.remove(removebeneficiary);
    }
    

    public static void EntityList(String[] args)
    {
        ArrayList<String> entities = new ArrayList<String>();
        entities.add("Material1");
        entities.add("Material2");
        entities.add("Service1");
        entities.add("Service2");
        System.out.println("EntityList : " + entities);
        
        // Εμφανίζει τις υπάρχουσες κατηγορίες των entity (material, services) και
        //λίστα με όλα τα entity ανά συγκεκριμένη κατηγορία.
    }
    public static void DonatorsList(String[] args)
    {
        ArrayList<String> donators = new ArrayList<String>();
        donators.add("Donator1");
        donators.add("Donator2");
        donators.add("Donator3");
        
        System.out.println("DonatorsList : " + donators);
    }
    public static void BeneficiaryList(String[] args)
    {
        ArrayList<String> beneficiary = new ArrayList<String>();
        beneficiary.add("Beneficiary1");
        beneficiary.add("Beneficiary2");
        beneficiary.add("Beneficiary3");
        System.out.println("BeneficiaryList : " + beneficiary);
        //emfanizei tous beneficiaries kai ta eidh poy exun parei
    }
        public RequestDonationList currentDonations()
    {
        
        return currentDonations() ;
    
    }
}
