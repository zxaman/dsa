import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n>0){
        int lastdigit = n%10;
        System.out.print(lastdigit + " ");
        n/=10;
      }
    //   System.out.println();
      
    }
}


// import java.util.*;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int rev = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;    // Get the last digit
//             rev = rev * 10 + lastDigit; // Build the reversed number
//             n = n / 10;                // Remove the last digit
//         }

//         System.out.println("Reversed number: " + rev);
//     }
// }
