package co.edu.uptc.helpers;

public class UtilThread {
    
  public static void sleep(int milisecond){
    try {
        Thread.sleep(milisecond);
    } catch (InterruptedException e) {        
        e.printStackTrace();
    }
  }

}
