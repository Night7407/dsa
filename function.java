

// // // public class function{
// // //      static double sum_of_two_numbers(int a, int b){
// // //         return a+b;
// // //     }
// // //     static float product_of_two(int x,int y){
// // //         return x*y;
// // //     }
// // //     static double fact(int z){
// // //         if(z==1 || z==0){
// // //             return 1;
// // //         }
// // //         else{
// // //             return z*fact(z-1);
// // //         }
// // //     }
// // //     static int bio_coeff(int n,int r){
// // //         if (r>n){
// // //             System.out.println("Not possible");
// // //             return -1;
// // //         }
// // //         else if(n==r|| r==0){
// // //             return 1;
// // //         }
// // //         else{
// // //             return (int)(fact(n)/(fact(r)*fact(n-r)));
// // //         }

// // //     }

// // //     public static void main(String[] args) {
// // //         System.out.println(sum_of_two_numbers(10,17));
// // //         System.out.println(product_of_two(15, 16));
// // //         System.out.println(fact(6));
// // //         System.out.println(bio_coeff(5, 5));
// // //     }
// // // // }

// // public class function{
// //     public static boolean check_prime_number(int a){
// //         if(a<=1){
// //             System.out.println(a+ "is not a prime number");
// //             return false;
// //         }
// //         for(int i = 2;i<=a-1;i++){
// //             if(a% i== 0){
// //                 System.out.println(a+" is not a prime number");
// //                 return false;
// //             }
// //         }
// //         System.out.println( a +  " is a prime number");
// //         return true;
// //     }

// //     public static boolean isPrime(int x){
// //         if(x == 2){
// //             return true;
// //         }
// //         for(int i = 2;i <= Math.sqrt(x);i++){
// //             if(x%i == 0){
// //                 return false;
// //             }
// //         }
// //         return true;
// //     }

// //     static void till_prime(int n){
// //         for(int i = 2;i<=n;i++){
// //             if(isPrime(i)){
// //                 System.out.println(i);
// //             }
// //         }
// //         System.out.println();
// //     }
// //     public static void main(String[] args){
// //         // check_prime_number(4);
        
// //         System.out.println(isPrime(7));
// //         till_prime(20);
// //     }
// // }

// // public class function{
// //     public static double average(double a,double b,double c){
// //         double average = (a+b+c)/3;
// //         return average;
// //     }
// //     public static boolean isEven(int n){
// //         if(n % 2 == 0){
// //             return true;
// //         }
// //         else{
// //             return false;
// //         }

// //     }
    
// //     public static void main(String[]args){
// //         System.out.println(average(10,21,30));
// //         System.out.println(isEven(6));
// //     }
// // }


// public class function{
//     public static boolean check_palindrome(int n){
//         String temp = Integer.toString(n);
//         String rev = new StringBuilder(temp).reverse().toString();
//         return temp.equals(rev);
//     }
//     public static void main(String[]args){
//         System.out.println(check_palindrome(121));
//     }
// }