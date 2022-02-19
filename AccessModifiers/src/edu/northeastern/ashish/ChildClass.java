package edu.northeastern.ashish;

public class ChildClass  extends  ParentClass{

    private void testFunctionChild(){
        //Check iof variables are present
        publicFunction();// Is Available
        protectedFunction(); // is Available
        defaultFunction(); // also Available

        int test = publicIntVariable;
        test = protectedIntVariable;
        test = defaultIntVariable;
       // test = privateIntVariable;// Not available
    }
}
