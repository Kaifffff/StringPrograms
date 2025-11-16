package HakerRankQuestions;

import java.util.Scanner;

public class FisherProblem {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int days = Integer.parseInt(sc.nextLine().trim());
		String fishesStr[] = sc.nextLine().trim().split(",");
		int fishes[] = new int[days];
		for(int i = 0 ; i < days ; i++) {
			fishes[i] = Integer.parseInt(fishesStr[i].trim());
		}
		
		
		int happy = 0 , sad = 0;
		int maxFishes = fishes[0];
		int minFishes = fishes[0];
		
		for(int i = 0 ; i < days ; i++) {
			if(fishes[i] > maxFishes) {
				happy++;
				maxFishes = fishes[i];
			}else if(fishes[i] < minFishes) {
				sad++;
				minFishes = fishes[i];
			}
		}
		
		System.out.println(happy);
		System.out.println(sad);
	}
}
