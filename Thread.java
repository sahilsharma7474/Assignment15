import java.util.*;
class sync extends Thread {
  
  public synchronized void func1()
  {
    for(int i=1;i<=500;i++)
    {
      System.out.println(i);
    }
  }
  public synchronized void func2()
  {
    for(int i=501;i<1000;i++)
    {
      System.out.println(i);
    }
  } 
    public void run(){
      
    func1();
    func2();  
      
    
  }
  
  public static void main(String[] args) {
    
    sync m=new sync();
    m.start();
    
    
    }
}