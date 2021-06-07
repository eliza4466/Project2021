
public abstract class Entity 
{
    private String name ;
    private String description ;
    private int id;
    //private gia na yparxei periorismenh prosbash
     public String getEntityInfo() 
    {
        return "Name:" + name + "Description: " +description + "Id: " + id;
        
        
    }
    public abstract String getDetails();

    // String toString(){} //overrides toString

    //getters
    public String getName()
    { return name; }
    public String getDescription()
    { return description; }
    public int getId()
    { return id; }
    
    //setters
    public void setName(String newName)
    {this.name = newName; }
    public void setDescription(String newDescription)
    {this.description = newDescription;}
    public void setId(int newId)
    {this.id = newId; }
    
    public String toString()
    {
        //System.out.println(); tha kanei print apo thn main
        return getEntityInfo() + getDetails();
    }

    


}