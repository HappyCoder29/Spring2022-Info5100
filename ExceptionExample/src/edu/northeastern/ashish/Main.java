package edu.northeastern.ashish;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int divideVal = Integer.MIN_VALUE;
        int a = 10;
        int b = 2;
        try {
            divideVal = divide(a,b);

            File file = new File("NoFile.txt");
            Scanner scanner = new Scanner(file);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getLocalizedMessage());
            divideVal = 0;
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found");
        }
        catch (Exception ex){
            System.out.println("Unknown exception: " + ex.getLocalizedMessage());
        }
        finally {
            System.out.println(divideVal);
        }


    }

    private static int divide(int a, int b) throws Exception{
        return a/b;
    }

}
