package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    private static int getNumOfTimesRepeated(String bigStr, String shortStr){

        if(bigStr == null || bigStr.length() == 0 || shortStr == null || shortStr.length == 0 ||   bigStr.length < shortStr.length){
            return 0;
        }
        int count = 0 ;
        boolean bFound = true;

        for(int i = 0 ; i < bigStr.length - shortStr.length ; i ++){
            boolean bFound = true;
            for(int j = 0 ; j < shortStr.length ; j ++){
                if(bigStr.charAt(i+j) != shortStr.charAt(j)){
                    bFound = false;
                    break;
                }
            }
            if(bFound == true){
                count++;
                i = i + shortStr.length;
            }

        }
        return count;
    }
}
