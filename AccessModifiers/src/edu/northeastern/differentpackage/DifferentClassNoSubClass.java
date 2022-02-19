package edu.northeastern.differentpackage;

import edu.northeastern.ashish.ParentClass;

public class DifferentClassNoSubClass {
    public void testingDifferentPackageNonSubClass(){
        ParentClass pc = new ParentClass();
        //Check iof variables are present
        pc.publicFunction();// Is Available
//        pc.protectedFunction(); // not available
//        pc.defaultFunction(); // not available
//        pc.privateFunction(); // not available

        int test = pc.publicIntVariable;// available
//        test = pc.protectedIntVariable;// not available
//        test = pc.defaultIntVariable;// not available
//        test = pc.privateIntVariable;// not available
    }
}
