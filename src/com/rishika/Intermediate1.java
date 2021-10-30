//multi cursor:-Shift+ctrl+alt
package com.rishika;
import java.util.Scanner;
public class Intermediate1 {
//    public static int factorial(int n) {
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        	Find Ncr & Npr
//        System.out.println("enter the value of n");
//        int n1 = sc.nextInt();
//        System.out.println("enter the value of r");
//        int r = sc.nextInt();
//        int ncr = (factorial(n1) / (factorial(n1 - r) * factorial(r)));
//        int npr = (factorial(n1) / (factorial(n1 - r)));
//        System.out.println("nPr is :- " + npr);
//        System.out.println("nCr is :- " + ncr);

        //        	Calculate CGPA Java Program
//        System.out.println("Enter the total number of subjects:-");
//        int n=sc.nextInt();
//        double sum=0;
//        double cgpa=0;
//        System.out.println("Enter the Grades of each subject");
//        for (int i = 1; i <=n ; i++) {
//            System.out.println("Enter the Grade  of " + i + " subject:-");
//            double n1= sc.nextDouble();
//            sum=sum+n1;
//            cgpa=sum/n;
//        }
//        System.out.println("YOU'RE CGPA IS:-" + cgpa);


//          Compound Interest Java Program
//       formula:- a=p(1+r/n)^nt where a=final amount p=principal r=rate n=no of time interest applied per time t= no of time periods
//        System.out.println("Enter the principal");
//        int p= sc.nextInt();
//        System.out.println("Enter the rate of interest");
//        double r=sc.nextDouble();
//        System.out.println("Enter the no of time interest is applied");
//        double n=sc.nextDouble();
//        System.out.println("Enter the time period");
//        double t=sc.nextDouble();
//        double a=p*Math.pow(1+(r/n),n*t) ;
//        System.out.println("Compound Interest is:- " + a );


//        	Armstrong Number In Java
//        System.out.println("Enter any 3 digit number:-");
//        int num= sc.nextInt();
//        int number,temp,total=0;
//        number=num;
//        while (number!=0){
//            temp=number%10;
//            total+=temp*temp*temp;
//            number/=10;
//        }
//        if(total==num){
//            System.out.println(num + " is  an ARMSTRONG number");
//        }else {
//            System.out.println(num + " is not an ARMSTRONG number");
//        }

//        	Reverse A String In Java
//        System.out.println("Enter You are name:- ");
//        String str=sc.nextLine();
//        char str1[]=str.toCharArray();
//        System.out.println("Reverse of string is:- ");
//        for (int i = str1.length-1;i >=0 ; i--) {
//            System.out.print(str1[i]);
//        }
//        	Find if a number is palindrome or not
//        System.out.println("Enter any integer:- ");
//        int num=sc.nextInt();
//        int x,temp=0,sum=0;
//        temp=num;
//        while (num>0){
//            x=num%10;
//            num/=10;
//            sum=(sum*10)+x;
//        }
//        if(temp==sum){
//            System.out.println("palindrome number");
//        }else {
//            System.out.println("not palindrome");
//        }


//        	Future Investment Value
//        	formula= presnt value*(1+interest rate)*n via CI
//        Forumla=present value*(1+(interest rate*time)) via SI


//        	Java Program Vowel Or Consonant
//        System.out.println("Enter any character:- ");
//         char ch =sc.next().charAt(0);
//        switch (ch){ //enhanced switch syntax
//            case 'a','i','e','o','u'-> System.out.println("It's a Vowel");
//            default -> System.out.println("It's a Consonant");
//        }

//        	Perfect Number In Java
//        int num= sc.nextInt();
//        int sum=0;
//        for (int i = 1; i < num ; i++) {
//            if (num%i == 0) {
//                System.out.println("Factor of a number is:- " + i);
//                sum+=i;
//            }
//        }
//        if(sum==num){
//            System.out.println("Perfect Number");
//        }else {
//            System.out.println("Not a prefect number");
//        }
//        	Kunal is allowed to go out with his friends only on the even days of a given month.
//        Write a program to check if he can go out in the month of August.

        System.out.println("Enter the month number:-");
        int n=sc.nextInt();
        switch (n){
            case 0,1,3,5,7,9,10,11-> System.out.println("Sorry! you are not allowed");
            default -> System.out.println("Yes you can go out");
        }
    }
}

