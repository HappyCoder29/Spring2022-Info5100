package edu.northeastern.ashish;

public class ParentClass {

    private int privateIntVariable = 5;
    public int publicIntVariable = 10;
    protected int protectedIntVariable = 15;
    int defaultIntVariable = 20;



    private void  privateFunction(){
        System.out.println("This is Private Function");
    }

    public void publicFunction(){
        System.out.println("This is public Function");
    }

    protected void protectedFunction(){
        System.out.println("This is protected Function");
    }

    void  defaultFunction(){
        System.out.println("This is default Function");
    }


    void testFunction(){
        //Check iof variables are present
        publicFunction();// Is Available
        protectedFunction(); // is Available
        defaultFunction(); // also Available
        privateFunction(); // available

        int test = publicIntVariable;
        test = protectedIntVariable;
        test = defaultIntVariable;
         test = privateIntVariable;// available
    }
}
