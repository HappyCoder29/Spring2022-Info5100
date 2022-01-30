package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        /*
         * byte
         * short
         * int
         * long
         * float
         * double
         * boolean
         * */
      /*  boolean boolValue = true;
        int iValue = 5;
        char cValue = 'a';
        float fValue = 3.45f;
        Integer bigIntValue = 45;
        Character ch = 'b';
        String str = "I am a string";

        int[] arr = {1, 0, -23, 4, 5, 7};
        arr[6] = 53;
        System.out.println(arr[6]);

        String[] strArray = {"Ashish", "mark", "Tom", "Peter"};*/

        float baseSalary = 50000.0f;
        int dependents = 0;
        float salary = -1;

        salary = calculateSalary(baseSalary, dependents, 2022);
        System.out.println("Salary = " + salary);
        dependents = 2;
        salary = calculateSalarySwitchStatement(baseSalary, dependents);
        System.out.println("Salary = " + salary);

        logicalOperators();


    }


    /// region Code for calculating Taxes
    /*
     * If Number of dependents = 0 tax is 40%
     * If Number of dependents = 1 tax is 30%
     * If Number of dependents is greater than 1 tax is 20%
     * */
     static float calculateSalary(float baseSalary, int dependents){
        float salary = 0;
        if (dependents == 0) {
            int temp = 5;
            salary = baseSalary - baseSalary * 0.4f;
        } else if (dependents == 1) {
            salary = baseSalary - baseSalary * 0.3f;
        } else {
            salary = baseSalary - baseSalary * 0.2f;
        }
        return salary;
    }



    private static float calculateSalary(float baseSalary, int dependents, int year){
        float salary = 0;

        if( year < 2000){
           return calculateSalary(baseSalary, dependents);
        }else{
            return calculateSalarySwitchStatement(baseSalary, dependents);
        }

    }

    private static float calculateSalarySwitchStatement(float baseSalary, int dependents){
        float salary = 0;
        switch (dependents){
            case 0:
                System.out.println("0 Dependents");
                salary = baseSalary - baseSalary * 0.4f;
                break;
            case 1:
            case 2:
                System.out.println("1 or 2 Dependents");
                salary = baseSalary - baseSalary * 0.3f;
                break;
            case 3:
                System.out.println("3 Dependents");
                salary = baseSalary - baseSalary * 0.2f;
                break;
            default:
                System.out.println("More than 3 Dependents");
                salary = baseSalary - baseSalary * 0.1f;
                break;
        }
        return salary;

    }
    /// endregion

    /// Logical operators
    private static void logicalOperators(){
        // < , <=, == , > , >= , !=

        int a = 5;
        int b = 10;

        if( a < b ){
            System.out.println(" A is less than B");
        }
        a = b;// a = 10
        if( a <= b ){
            System.out.println(" A is less than or equal to B");
        }

        a = 20;

        if( a > b ){
            System.out.println(" A is greater than B");
        }
        a = b;
        if( a >=  b ){
            System.out.println(" A is greater than or equal to B");
        }
        if( a == b ){
            System.out.println(" A is equal to B");
        }
        a = 34;
        if( a != b ){
            System.out.println(" A is not equal to B");
        }
    }

}
