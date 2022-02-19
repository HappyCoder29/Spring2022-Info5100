package edu.northeastern.ashish;

public class SamePackageNotSubClass {

    public void testSamePackageNotSubClassFunction(){
        ParentClass pc = new ParentClass();
        //Check iof variables are present
        pc.publicFunction();// Is Available
        pc.protectedFunction(); // is Available
        pc.defaultFunction(); // also Available
       // pc.privateFunction(); // Not available

        int test = pc.publicIntVariable;
        test = pc.protectedIntVariable;
        test = pc.defaultIntVariable;
        // test = privateIntVariable;// Not available
    }
}
