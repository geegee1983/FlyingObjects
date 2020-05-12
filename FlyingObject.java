
/**
 * Abstract class FlyingObject 
 * 
 * @author M250 MOdule Team
 * @version 1.0
 */
public abstract class FlyingObject
{
   public String name;
   
   /*
    * Constructor for objects of type FlyingObject
    */
   public FlyingObject(String aName)
   {
      super();
      this.name = aName;  
   }
   
   public FlyingObject()
   {
      super();    
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public void setName(String aName)
   {
      this.name = aName;
   } 
   
   public String getPowerType()
   {
      return this.getPowerType();
   }   
   
   //returns a rating based on physical characteristics of the flying object
   public abstract int getComplexityRating(); 
  
   
   public String toString()
   {
      return "a FlyingObject  of type "+ this.getClass() + 
      "  with name: " + this.name;
   }  
}
