/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    chaotic(7);
  }
  
  public static void chaotic (int lineNumber){

    for (int i=0;i<lineNumber;i++){
      int randomNumber = (int)(Math.random()*(5-1+1))+1;
      for (int j=1;j<=randomNumber;j++){
        System.out.print("*");
      } 
      System.out.println();
    }

  }

}
    
  

