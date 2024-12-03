
import java.io.File;

public class Temp{

    static double divideInt(int a, int b) throws ArithmeticException{
        if(b < 1) throw new ArithmeticException("Bhai b zero nahi ho sakta samja !");
       return a/b;
    }

    public static void main(String[] args) {
// try{       
//      double res = divideInt(4, 0);
//       System.out.println(res);

// }catch(ArithmeticException e){
// System.out.println("Arithematic Exception");
// }finally{
//     System.out.println("Code Executed successfully !");
// }     

File f = new File("temp.txt");
System.out.println(f.length());


    }
}