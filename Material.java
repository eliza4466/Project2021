public class Material extends Entity
{
    private double level1;
    private double level2;
    private double level3;
    public int number; 
    public int quantity;
    //noPersons();
    public double getLevel()
    {
        
        if (number==1)
        {
            quantity=number;
            return level1;
        }
        if (number<=4 & number>=2)
        {
            quantity=number;
            return level2;
        }
        if (number>=5)
        {
            quantity=number;
            return level3;
        }
        return getLevel();
    }
    
    
    public  String getDetails()
    {
        
        return "Level is:" +getLevel() ; 
    
    }
    
    
}