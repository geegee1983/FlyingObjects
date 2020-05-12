
/**
 * Write a description of interface Launchable here.
 * 
 * @author (Annamaria Galgoczi) 
 * @version (V1 03.02.2020)
 */
public interface Launchable
{
   /**
    * Performs the arbitrary action in response to message launch()
    */
   public void launch();
   
   /**
    * Performs the arbitrary action in response to message isAbleToFly()
    */
   public boolean isAbleToFly();
   
   /**
    * Performs the arbitrary action in response to message land()
    */
   public void land();   
}
