package Threading;
class NumbersPrinting implements Runnable {
	       private Thread t;
	       private String threadName;
	      
	       NumbersPrinting( String name) {
	          threadName = name;
	        
	          System.out.println("Creating " +  threadName );
	       }
	      
	       public void run() {
	          System.out.println("Running " +  threadName );
	  
	          try {
	             for(int i = 0; i <11; i++) {
	                System.out.println(i);
	                Thread.sleep(50);
	             }
	          } catch (InterruptedException e) {
	             System.out.println("Thread " +  threadName + " interrupted.");
	          }
	          System.out.println("Thread " +  threadName + " exiting.");
	       }
	      
	       
}
public class TestRunnable {
	    public static void main(String args[]) {
	          NumbersPrinting R1 = new NumbersPrinting( "Print Numbers");
	          Thread T1=new Thread(R1);
	          T1.start();
	       }  
	}
