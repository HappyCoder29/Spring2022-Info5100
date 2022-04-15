package edu.northeastern.ashish;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        ArrayList<ArrayList<String>> list = anagramsList(arr);
        System.out.println();

        for (ArrayList<String> strList: list) {
            String[] arrString =  strList.toArray(new String[0]);
            System.out.println(Arrays.toString(arrString));
        }

    }

    private static ArrayList<ArrayList<String>> anagramsList(String[] arr){
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : arr) {
           char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String anagram = String.valueOf(chArr);

            if(!map.containsKey(anagram)){
                ArrayList<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(anagram, strList);
            }
            else{
                ArrayList<String> strList = map.get(anagram);
                strList.add(str);
                map.put(anagram, strList);
            }

        }

        for (Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            list.add(entry.getValue());
        }


        return list;
    }
}
