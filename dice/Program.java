package dice;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of players:  ");
		int n = in.nextInt();
		System.out.print("Enter number of cubes:  ");
		int k = in.nextInt();
		PlayImpl play = new PlayImpl(n, k);
		/*
		 * Цикл игры, пока кто-то не выиграл 7 раз
		 */
		while (play.isSomeoneWins() == 0) {
			play.updateZeros();
			int max = 0;
			int max_winner = 1;
			boolean winnerNotFound = true;
			for (int j = play.lastWinner; j < play.lastWinner + play.players; j++) {
				int i = 0;
				if (j <= play.players) {
					i = j;
				} else {
					i = j - play.players;
				}
				System.out.print("Player " + i + ": ");
				int sum = play.roll();
				play.points[i-1] = sum;
				if (sum > max) {
					max = sum;
					max_winner = i;
					winnerNotFound = false;
				} else if (sum == max) {
					winnerNotFound = true;
				}
			}
			if (winnerNotFound == true) {
				System.out.println(">No one won");
			} else {
				play.lastWinner = max_winner;
				play.wins[max_winner-1]++;
				System.out.println(">Player " + max_winner + " won");
			}
			System.out.println();
			
		}
		System.out.println("Player " + play.isSomeoneWins() + " won the game!");
		in.close();
	}
}
