package GreedyAlgorithmsProblems;

//you are given n activities with their start and end times. select the maximum number of activities 
//that can be performed by a single person, assuming that a person can only work on a single activity at a 
//time.Activity are sorted according to end time


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionProblem {
	public static void main(String []args) {
		int []start = {10 , 12 , 20};
		int []end = {20 , 25 , 30};
		
		int activities[][] = new int[start.length][3];
		for(int i = 0 ; i < start.length ; i++) {
			activities[i][0] = i;
			activities[i][1] = start[i];
			activities[i][2] = end[i];
			
		}
		
		Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));
		
		int maxAct = 0;
		ArrayList<Integer> ans = new ArrayList<>();	
		maxAct = 1;
		ans.add(activities[0][0]);
		int lastEnd = activities[0][2];
		
		for(int i = 1 ; i < start.length ; i++) {
			if(activities[i][1] >= lastEnd) {
				maxAct++;
				ans.add(activities[i][0]);
				lastEnd = activities[i][2];
			}
		}
		
		System.out.println("max activities = " + maxAct);
		
		for(int i = 0 ; i < ans.size() ; i++) {
			System.out.print("A" + ans.get(i) + " ");
		}
		
		System.out.println();
	}
}
