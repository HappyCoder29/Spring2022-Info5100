package edu.northeastern.ashish;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverseString(str));

        System.out.println(base64(12345678912));
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
       

    }


    // Question 1 : Reverse a string
    private static String reverseString(String str){
        char[] arr = str.toCharArray();
        int start = 0 ;
        int end = arr.length -1;

        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return String.valueOf(arr);
    }

    private static String base64(int decimal){
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String hashStr = "";
        while(decimal > 0){
            hashStr += str.charAt(decimal%62);
            decimal /=62;
        }
        return  hashStr;

    }

}
