package com.juaracoding;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SoalKetiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp = "";
        String tag = "";
        ArrayList<String> output = new ArrayList<>();
        int flag = 0;

        do {
            for (int i = 0; i < input.length(); i++) {
                tag =Character.toString(input.charAt(0))+Character.toString(input.charAt(1))+Character.toString(input.charAt(2))+Character.toString(input.charAt(3));

                if(tag.equalsIgnoreCase(":T2:")){
                    if (i == 0) {
                        i+=4;
                    }
                    if(temp.length() < 18){
                        temp = temp+Character.toString(input.charAt(i));
                    } else {
                        output.add(temp);
                        temp = "";
                        temp = temp+Character.toString(input.charAt(i));
                    }
                    if (i == input.length()-1) {
                        output.add(temp);
                    }
                } else {
                    flag = 1;
                    System.out.println(input);
                    break;
                }
            }
            if(flag == 0){
                ArrayList<String> finalOuput = new ArrayList<>();
                finalOuput.add(tag);
                finalOuput.add(output.get(2));
                finalOuput.add(output.get(3));
                finalOuput.add(output.get(4));
                finalOuput.add(output.get(0));
                finalOuput.add(output.get(1));

                System.out.println(String.valueOf(finalOuput.get(0)+ finalOuput.get(1)+ finalOuput.get(2)+ finalOuput.get(3)+ finalOuput.get(4)+ finalOuput.get(5)));
            }
            input = sc.nextLine();
        }while (true);
    }
}
