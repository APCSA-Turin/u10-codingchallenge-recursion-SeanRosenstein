    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                while (n>0){
                return 2 + bunnyEars(n-1);
            }
            return 0;
        }
        
            public static int factorial(int n){
                if (n==0 || n==1){
                    return 1;
                }
                while (n>1){
                return n*factorial(n-1);
            }
            return 0;
        }

            public static int sumNumbers(int n){
                while (n>0){
                return n+sumNumbers(n-1);
            }
            return 0;
            }

            public static String countDown(int n){
                while (n>0){
                System.out.println(n + "\n" + countDown(n-1));
                }
                return "Blast Off!";
            }

            public static int power(int x, int n) {
                if (n == 0) {
                    return 1;
                }
                return x * power(x, n - 1);
            }

            public static int fib(int n) {
                if (n <= 0) {
                    return 0;
                } else if (n == 1) {
                    return 1;
                }
                return fib(n - 1) + fib(n - 2);
            }
            public static int countX(String s) {
                if (s.equals("")) {
                    return 0;
                }
                int count = 0;
                if (s.charAt(0) == 'x') {
                    count = 1;
                }
                return count + countX(s.substring(1));
            }
            
            

            public static String changePi(String s) {
                if (s.equals("")) {
                    return "";
                }
                if (s.length()>=2){
                if (s.substring(0,2).equals("pi")) {
                    return "3.14" + changePi(s.substring(2));
                }
            }
                return s.charAt(0) + changePi(s.substring(1));
            }
            


            public static String reverse(String s) {
                if (s.isEmpty()) {
                    return "";
                }
                return reverse(s.substring(1)) + s.charAt(0);
            }
            

            public static boolean isPalindrome(String s) {
                if (s.length() <= 1) {
                    return true;
                }
                if (s.charAt(0) != s.charAt(s.length() - 1)) {
                    return false;
                }
                return isPalindrome(s.substring(1, s.length() - 1));
            }
            

    }