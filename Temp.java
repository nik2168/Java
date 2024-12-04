
import java.io.File;


public class Temp{
    public static void main(String[] args) {
        Thread t = new Thread( new Runnable(){
          public void run(){
                   System.out.println("Hello");
           }
        
        });

        t.start();

        File f = new File("temp.txt");
        f.
    }
}