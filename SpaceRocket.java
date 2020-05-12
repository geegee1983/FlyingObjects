
/**
 * Class TMA02_Q3
 * 
 * Annamaria Galgoczi 
 * 26.01.2020
 */
public class SpaceRocket extends FlyingObject implements Launchable
{
   private int maxPowerLevel;
   private int numberOfExperiments;
   private int powerLevel;
   
   /**
    * Constructor for objects of type SpaceRocket.
    */
   public SpaceRocket(String aName, int aNumberOfExperiments)
   {
      this.name = aName;
      this.numberOfExperiments = aNumberOfExperiments;
      this.powerLevel = 0;
      this.maxPowerLevel = 15;
   }
      
   /**
    * returns maxPowerLevel
    */
   public int getMaxPowerLevel()
   {
      return this.maxPowerLevel;
   }
   
   /**
    * returns numberOfExperiments
    */
   public int getNumberOfExperiments()
   {
      return this.numberOfExperiments;
   }
   
   /**
    * returns powerLevel
    */
   public int getPowerLevel()
   {
      return this.powerLevel;
   }
   
   /**
    * Decreases the powerLevel (down to a minimum of 0) and returns a boolean.
    */
   public boolean decrementPower(int anInt)
   {
      if (anInt > this.getPowerLevel())
      {
        this.powerLevel = 0;     //If the anInt is greater than powerLevel then powerLevel set to 0
        return false;            // and false returned
      }
      else
      {
         this.powerLevel = this.getPowerLevel() - anInt;    //powerLevel reduced by the anInt
         return true;                                       // and true returned
      }      
   }
   

//    public void runExperiments()
//    {
//       int experimentNumber = 1;                          //counts the number of successful experiments
//       while (numberOfExperiments > 0)                    //loop while the numberOfExperiments is a positive integer
//       {
//          numberOfExperiments = numberOfExperiments - 1;  
//          this.decrementPower(randomInteger());           //decrementPower by a random number between 1 and 3 incl
//          if (false)
//          {
//             System.out.println(experimentNumber);        //prints the number of successful experiments
//             experimentNumber = experimentNumber + 1;     
//          }
//          if (true)
//          {
//             System.out.println("Can't decrement");       
//             numberOfExperiments = 0;                     //stops the experiments
//          }
//       }
//       System.out.println("Experiment run stopped");
//    }
   
   /**
    * The method attempts to decrement powerLevel by a random number between 1 and 3 inclusive for each experiment up to numberOfExperiments.
    */
   public void runExperiments()
   {
   for(int i = 1; i <= numberOfExperiments; i++)
   {
      this.decrementPower(randomInteger());        //decrementPower by a random number between 1 and 3 incl
      if(true)
      {
        System.out.println(i);                     //prints the number of successful experiments
      }
      if (false)
      {
        System.out.println("Can't decrement");
        numberOfExperiments = 0;                   //stops the experiments
      }
   }
   System.out.println("End of experiments");
   }
   
     
   /**
    * Increments powerLevel by 1 up to the maxPowerLevel 
    */
   public void rechargePower()
   {
      while (powerLevel < maxPowerLevel)
      {
         powerLevel = powerLevel + 1;
         System.out.println("Recharging power.....");
         delay(700);
      }
      System.out.println("Fully charged");       
   }
   
   /**
    * provided
    * Causes execution to pause by time number of milliseconds
    * You can use this method without needing to understand how it works
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }

   /**
    * provided
    * return a random integer between 1 and 3 inclusive
    * You can use this method without needing to understand how it works
    */
   public int randomInteger() 
   {
      java.util.Random r = new java.util.Random();
      return r.nextInt(3) + 1;
   }  
      
   /*
    * returns the complexity rating of the rocket
    */
    public  int getComplexityRating()
    {
       System.out.println("method not yet written");
       return 0;
    }  
    
   /**
    * provided interface method- initially commented out
    */
   public void launch()
   {
      //suitable behaviour
      System.out.println("Not yet implemented");
   }
   
   /**
    * provided interface method - initially commented out
    */
   public void land()
   {
      //suitable behaviour
      System.out.println("Not yet implemented");
   }
   
   /**
    * provided interface method- initially commented out
    */
   public boolean isAbleToFly()
   {
      return true;   //placeholder for suitable behaviour
   }


  
}



