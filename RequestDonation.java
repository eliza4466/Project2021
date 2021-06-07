import java.util.Scanner;
import java.util.*;
public class RequestDonation 
{
    private Entity entity;
    private double quantity;
    
    //epistrefei to id gia ena requestdonation 
    public int get_id()
    {
        return entity.getId();
    } 
    
    //τι κάνει;
    public Entity getEntity()
    {return entity;}
    
    //setter-getter για το Quantity
    public void setQuantity(double quantity)
    {this.quantity=quantity;} 
    public double getQuantity()
    {return quantity;}
    
    
    
    public String provision()
    
    {
        Scanner Quantity = new Scanner(System.in);
            System.out.println("Enter quantity : ");
            String quantity = Quantity.nextLine();
        Scanner Entity = new Scanner(System.in);
            System.out.println("Enter entity: ");
            String entity = Entity.nextLine();
            System.out.println(Quantity + "*"+ Entity);
            
            
          return quantity + "*" + entity;   
 
        // theloume na eoistrefetai to apotelesma toy scanner
    }
    
    
    
}