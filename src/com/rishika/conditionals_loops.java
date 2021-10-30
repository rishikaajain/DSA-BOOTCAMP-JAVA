package com.rishika;

import java.util.Scanner;

public class conditionals_loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//       	Fibonacci Series In Java Programs
//        int n= sc.nextInt();
//        int a=0;
//        int b=1;
//        int count= 2;
//
//        while(count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
//        	Subtract the Product and Sum of Digits of an Integer
//        int n1 = sc.nextInt();
//        int sum=0;
//        while(n1>0){
//            int remainder=n1%10;//lAST DIGIT OF A NUMBER
//            sum+=remainder;
//            System.out.println(remainder);
//            n1=n1/10;//Removing the last digit
//        }
//        System.out.println("Sum of Digit is:- "+ sum);


//  Area Of Circle ,Area Of Triangle,Volume Of Cone,

        double raidus=sc.nextDouble();
        double pi=3.14;
        double area=pi*raidus*raidus;

        System.out.println("Area of a circle is:- "+area);

        double base= sc.nextDouble();
        double height= sc.nextDouble();
       double  area1=0.5*base*height;

        System.out.println("Area of a Triangle is:- "+area1);

        double raidus1=sc.nextDouble();
        double height1= sc.nextDouble();
        System.out.println("Volume of cone is:- " + pi*(raidus1*raidus1)*height1/3 );

    }
}