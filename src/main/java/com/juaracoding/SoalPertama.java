package com.juaracoding;

public class SoalPertama {
    public static void main(String[] args) {
        int[] arr = new int[101];
        int num = 0;

        for (int i = 0;i < arr.length;i++){
            num++;
            arr[i] = num;
            if(arr[i]%3 == 0 && arr[i]%5 == 0){
                System.out.println(arr[i]+" adalah BIZZBUZZ,");
            } else if (arr[i]%3 == 0) {
                System.out.println(arr[i]+" adalah BIZZ,");
            } else if (arr[i]%5 == 0) {
                System.out.println(arr[i]+" adalah BUZZ,");
            }
        }
    }
}
