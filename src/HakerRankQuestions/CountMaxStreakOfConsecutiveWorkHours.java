package HakerRankQuestions;

import java.util.Scanner;

public class CountMaxStreakOfConsecutiveWorkHours {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int days = Integer.parseInt(sc.nextLine().trim());
		
		String workLoadStr[] = sc.nextLine().trim().split(",");
		int workLoad[] = new int[days];
		for(int i = 0 ; i < days ; i++) {
			workLoad[i] = Integer.parseInt(workLoadStr[i].trim());
		}
		
		
		int maxStreak = 0;
		int currentStreak = 0;
		
		for(int i =0 ; i < days ; i++) {
			if(workLoad[i] > 6) {
				currentStreak++;
				if(currentStreak > maxStreak) {
					maxStreak = currentStreak;
				}
				
			}else {
				currentStreak = 0;
			}
		}
		
		System.out.println(maxStreak);
	}
}
