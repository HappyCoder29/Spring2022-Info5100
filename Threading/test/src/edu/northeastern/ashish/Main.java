package edu.northeastern.ashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[][] mergeIntervals(int[][] interval) {
        if (interval.length <= 1) {
            return interval;
        }

        Arrays.sort(interval, (a, b) -> (a[0] - b[0]));

        List<int[]> result = new ArrayList<>();
        for (int[] intervals : interval) {

            if (result.isEmpty() || result.get(result.size() - 1)[1] < intervals[0]) {
                result.add(intervals);
            } else {

                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
    
}
