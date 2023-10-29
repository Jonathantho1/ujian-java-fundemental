package com.juaracoding;

import java.util.Scanner;

public class SoalKedua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("firstValue: ");
        int firstValue = sc.nextInt();

        System.out.print("secondValue: ");
        int secondValue= sc.nextInt();

        for (int i = 0; i < firstValue; i++) {
            int num = i;

            for (int j = 0; j < secondValue-i; j++) {
                num++;

                if( num%2 == 0){
                    System.out.print("_");
                } else System.out.print(num);
            }

            secondValue--;

            System.out.println();
        }
    }
}
