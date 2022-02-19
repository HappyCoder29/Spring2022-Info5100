package edu.northeastern.differentpackage;

import edu.northeastern.ashish.ParentClass;

public class DifferentPackageSubClass extends ParentClass {

    public void testingDifferentPackageSubClass(){

        //Check iof variables are present
        publicFunction();// Is Available
        protectedFunction(); // available
//        defaultFunction(); // not available
//        privateFunction(); // not available

        int test = publicIntVariable;// available
        test = protectedIntVariable;//  available
//        test = defaultIntVariable;// not available
//        test = privateIntVariable;// not available
    }
}
