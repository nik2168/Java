import java.util.Scanner;

public class RecursiveNonRecursiveFibonacci {

    static void printFib(int n, int i, int j){
    
        System.out.println(0);
        System.out.println(1);

        for(int y = 2; y <= n; y++){
              int t = i;
              i = j;
              j = i + t;
              System.out.println(j);
        }
        
    }

    static void printFibRecursive(int t, int n, int i, int j){
         if(t > n) return;
         if(t > 1){
            System.out.println(j);
         }
         else{
            System.out.println(i);
            System.out.println(j);
         }
         t += 1;
         printFibRecursive(t, n, j, j+i);
    }

    public static void main(String[] args) {

    int n;

    System.out.println("Enter the series count : ");

    Scanner a = new Scanner(System.in);
    n = a.nextInt();

    a.close();   
    
    System.out.println(n + " Fibonacci non-recursive is : ");
    printFib(n, 0, 1);

    System.out.println(n + " Fibonacci recursive is : ");
    printFibRecursive(1, n, 0, 1);

  }
}


// output
// Enter the series count : 
// 5

// 5 Fibonacci non-recursive is : 
// 0
// 1
// 1
// 2
// 3
// 5

// 5 Fibonacci recursive is : 
// 0
// 1
// 1
// 2
// 3
// 5