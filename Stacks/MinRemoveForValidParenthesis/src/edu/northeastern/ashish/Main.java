package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "))((";
        removeParenthesisForValidString(str);
    }

    private static void removeParenthesisForValidString(String str){
        if(str == null || str.length() == 0){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> indexesToRemove = new ArrayList<>();

        for(int i = 0 ; i < str.length(); i ++){
            Character ch = str.charAt(i);
            if( ch == '('){
                stack.push(i);
            }
            if( ch == ')'){
                if(stack.isEmpty()){
                    indexesToRemove.add(i);
                }else{
                    stack.pop();// remove the matching one
                }
            }
        }

        while(!stack.isEmpty()){
            indexesToRemove.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length(); i ++){
            if(!indexesToRemove.contains(i)){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());

    }
}
