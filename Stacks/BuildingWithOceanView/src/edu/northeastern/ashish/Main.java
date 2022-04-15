package edu.northeastern.ashish;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        oceanViewStack(arr);
    }

    private static void oceanViewStack(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length -1]);
        System.out.println(arr[arr.length -1]);
        // Last building definitely has an ocean view
        // if there is only one building return
        if(arr.length == 1){
            return;
        }

        for(int i = arr.length -2;i >= 0 ; i -- ){

            while(!stack.isEmpty() && stack.peek() < arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.println(arr[i]);
            }
            stack.push(arr[i]);

        }

    }

    private static void oceanViewNoStack(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        // Last building definitely has an ocean view
        System.out.println(arr[arr.length -1]);
        // if there is only one building return
        if(arr.length == 1){
            return;
        }

        for(int i = arr.length -2;i >= 0 ; i -- ){
            int buildingLength = arr[i];
            boolean hasOceanView = true;
            for(int j = i +1; j < arr.length; j ++){
                if(buildingLength < arr[j]){
                    hasOceanView = false;
                    break;
                }
            }
            if(hasOceanView){
                System.out.println(buildingLength);
            }
        }
    }
}
