package Abstractclass;

public class thread implements Runnable 
{
    public static void main(String[] args) {
     Thread a = new Thread("Guru1");
     Thread b = new Thread("Guru2");
     a.start();
     b.start();
     System.out.println("Thread names are following:");
     System.out.println(a.getName());
     System.out.println(b.getName());
 }
 @Override
 public void run() {
 }
}