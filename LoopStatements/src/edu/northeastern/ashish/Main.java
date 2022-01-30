package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Ashish", "Tom", "Bill", "Peter","John","Mark"};
//        System.out.println("Name = " + names[0]);
//        System.out.println("Name = " + names[1]);
//        System.out.println("Name = " + names[2]);
//        System.out.println("Name = " + names[3]);
//        System.out.println("Name = " + names[4]);
//        System.out.println("Name = " + names[5]);

        int i = 5;
        System.out.println(++i);


       // printNamesForLoop(names);
       // forEachLoop(names);
      //  whileLoop(names, 100);
        doWhileLoop(names, 100);
    }

    private static void whileLoop(String[] names, int value) {
        int i = 0;
        while( value < names.length ){
            if(i >= names.length){
                break;
            }
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
            i ++;
        }

    }


    private static void doWhileLoop(String[] names, int value) {
        int i = 0;
        do{
            if(i >= names.length){
                break;
            }
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
            i ++;
        }
        while(value < names.length);

    }

    private static void forEachLoop(String[] names){
        for (String name : names ) {
            System.out.println("Name = " + name);
        }
    }

    private static void printNamesForLoop(String[] names){

        // Preferred method
        //for(Initialization; Condition ; Increment/decrement){
        for(int i = 0 ; i < names.length ; i++ ){
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
        }

        System.out.println("************************");
        int i = 0;
        for( ; i < names.length; i ++ ){
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
        }


        System.out.println("************************");
        i = 0;
        for( ; i < names.length; ){
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
            i++;
        }

        System.out.println("************************");
        i = 0;
        for( ; ; ){

            if(i >= names.length){
                break;
            }
            System.out.println("Value of i = " + i);
            System.out.println("names[" + i + "] = " + names[i]);
            i++;
        }
    }


}
