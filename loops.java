 import java.util.*;

// public class loops{
//     public static void main(String[] args) {
//         for(int i = 0;i <=4; i++){
//             for(int j = 1;j <= i;j--){
//                 System.out.println("*");
//             }
//         }
//     }
// }

// Print Reverse of A number
// class loops{
//     public static void main(String[] args) {
//         int n = 70603;
//         while(n > 0){
//             int last_digit = n % 10;
//             System.out.print(last_digit);
//             n = n / 10;
//         }
//         System.out.println();
//     }
// }

// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// class loops{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int even_sum = 0;
//         int odd_sum = 0;
//         System.out.println("Enter the number of integers you want");
//         int n = sc.nextInt();
//         System.out.println("Enter the integer");

//         for(int i = 0; i < n ; i++){
//             int num = sc.nextInt();
//             if(num % 2 == 0 ){
//                 even_sum += num;
//             }
//             else{
//                 odd_sum += num;
//             }
            

//         }
//         System.out.println("The Even sum is :"+even_sum);
//         System.out.println("The Odd sum is :"+odd_sum);


//     }
// }

// Write a program to find the factorial of any number entered by the user.

// class loops{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i = 0 ;i < n;i++){
//             fact = fact * (i+1);
//         }
//         System.out.println("The factorial of the number is:" +fact);
//     }
// }

// Write a program to print the multiplication table of a number N, entered by the user.
// class loops{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number you want table of ");
//         int n = sc.nextInt();
//         for(int i = 0 ;i <= 10; i++ ){
//             System.out.println(n*i);
//         }
//     }
// }

// class loops{
//     public static void main(String[]args){
//         int n = 4;
//         for(int i = 1; i <= n;i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }

// class loops{
//     public static void main(String[]args){
//         int n = 4;
//         for(int i = n; i >=1 ;i--){
//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }

// class loops{
//     public static void main(String[]args){
//         int n = 4;
//         for(int i = 1; i <= n;i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print(j*n);
//             }
//             System.out.println();
//         }
//     }
// }

// class loops{
//     public static void main(String[]args){
//         int n = 4;
//         char ch = 'A';
//         for(int i = 1; i <= n;i++){
//             for(int j = 1; j <= i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }