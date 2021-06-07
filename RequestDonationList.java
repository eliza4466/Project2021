import java.util.Scanner;
import java.util.ArrayList;
public class RequestDonationList
{
    public Entity id;
    ArrayList<RequestDonation> rdentities = new ArrayList<RequestDonation>();
    public static void rdEntities(String[] args)
    {
        ArrayList<RequestDonation> rdentities = new ArrayList<RequestDonation>();
        
    }
    
  
    public RequestDonation add()
    {
        
        Scanner addEntity = new Scanner(System.in);
            System.out.println("Add entity: ");
            String addentity= addEntity.nextLine();
            System.out.println("New entity is: " + addentity );
        rdentities.add(addentity);
    }
    public RequestDonation get(int id)
    {
        RequestDonation r;
        for (int i=0; i<rdentities.size(); i++)
        {
            if (id==rdentities.get(i).getEntity().getId())
        
        {r=rdentities.get(i);}   
        }
        return r;
    }
    
    public void reset()
    {
        ArrayList<RequestDonation> rdentities = new ArrayList<RequestDonation>();
        rdentities.clear();
    }

}
