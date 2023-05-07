import java.lang.Thread;
class Sailaja extends Thread
{
  
  public void run()
  {

    System.out.println("my name is sailu");
  }
    
}
  class Hellothread
  {
     public static void main(String args[])
     {
           Sailaja s=new Sailaja();
          s.start();
          s.sleep(10);
          s.isAlive();
     }

  }
