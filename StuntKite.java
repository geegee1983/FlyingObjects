
/**
 * StuntKite models  a multi line kite.
 * 
 * @author M250 Module Team
 * @version 1.0
 */
public class StuntKite extends Kite implements Launchable
{
   private int lines; //the number of lines used to control the kite.  
   
   public StuntKite(String aName, String aMaterial, boolean aHasTail, int aLines)
   {
      super(aName, aMaterial, aHasTail);
      this.lines = aLines;
   }
   
   public int getLines()
   {
      return this.lines;
   } 
   
   @Override
   public int getComplexityRating()
   {
      return super.getComplexityRating() * this.lines;
   }
}
