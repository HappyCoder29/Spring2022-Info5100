package edu.northeastern.ashish;

public class SimpleStringClass implements  IStringFunctions{
    @Override
    public String upperCaseAndConcat(String str1, String str2) {
        return str1.toUpperCase() + str2.toUpperCase();
    }
}
