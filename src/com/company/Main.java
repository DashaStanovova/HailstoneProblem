package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        while (number!=1){
            if (number%2==0 ){
                number=number/2;
                System.out.println(number);
            }
            else{
                number = number*3+1;
                System.out.println(number);
            }
        }
    }
}
