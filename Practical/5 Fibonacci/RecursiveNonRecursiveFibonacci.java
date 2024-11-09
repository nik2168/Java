import java.util.Scanner;

public class RecursiveNonRecursiveFibonacci {

    static void printFib(int n, int i, int j){


        for(int y = 2; y <= n; y++){
              int t = i;
              i = j;
              j = i + t;
              if(y == n) System.out.println(j);
        }
        
    }

    static void printFibRecursive(int t, int n, int i, int j){
         if(t >= n) {
            System.out.println(j);
            return;
         }
         t += 1;
         printFibRecursive(t, n, j, j+i);
    }

    public static void main(String[] args) {

    int n;

    System.out.print("Enter the series count : ");

    Scanner a = new Scanner(System.in);
    n = a.nextInt();

    a.close();   
    
    System.out.println(n + "th Fibonacci non-recursive is : ");
    printFib(n, 0, 1);

    System.out.println(n + "th Fibonacci recursive is : ");
    printFibRecursive(1, n, 0, 1);

  }
}


// output

// Enter the series count : 13
// 13th Fibonacci non-recursive is : 
// 233
// 13th Fibonacci recursive is : 
// 233