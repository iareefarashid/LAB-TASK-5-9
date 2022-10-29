// 9.	Print a Fibonacci series. (0,1,1,2,3,5,8,13,21,34,55,89, …)

class FibonacciSeries {
  public static void main(String[] args) {
    int n = 100, firstTerm = 0, secondTerm = 1;  
    System.out.println("Fibonacci Series Upto \" + n + \": ");
    while (firstTerm <= n) {
     System.out.print(firstTerm + " ");
     int nextTerm = firstTerm + secondTerm;
     firstTerm = secondTerm;
     secondTerm = nextTerm;
    }
  }
}
