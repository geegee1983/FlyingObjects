
/**
 * Kite is a class that models a gliding object controlled by a single line
 * that may or may not have a tail.
 * 
 * @author M250 Module Team
 * @version 1.0
 */
public class Kite extends FlyingObject implements Launchable
{
   private String material; //the fabric type of the kite
   private boolean hasTail; //true if the kite design has a tail   
   
   public Kite(String aName, String aMaterial, boolean aHasTail)
   {
      super(aName);
      this.material = aMaterial;
      this.hasTail = aHasTail;
   }
   
   public String getMaterial()
   {
      return this.material;
   } 
   
   public boolean getHasTail()
   {
      return this.hasTail;
   } 
   
   /*
    * returns the complexity rating of the kite
    */
    public  int getComplexityRating()
    {
       if (this.hasTail)
       {
          return 2;    //slightly more complicated kite 
       }
       else
       {
          return 1; //simple kite is flyable by children
       }      
    }
    
    /**
    * provided interface method
    */ 
   public void launch()
   {      
      //suitable behaviour
      System.out.println("Not yet implemented");
   }
   
    /**
    * provided interface method
    */
   public void land()
   {
      //suitable behaviour
      System.out.println("Not yet implemented");
   }
   
    /**
    * provided interface method
    */
   public boolean isAbleToFly()
   {
      return true;   //placeholder for suitable behaviour
   }

   

}
