package dice;

import java.util.Random;

public class PlayImpl implements Play{
	/*
	 * количество игроков
	 */
	int players; 
	/*
	 * Массив очков каждого игрока на каждом коне
	 */
	int points[];
	/*
	 * Массив счетчиков выигрышей для каждого игрока
	 */
	int wins[];
	/*
	 * Поле, в котором хранится последний победитель (от 1 до players)
	 */
	int lastWinner;
	/*
	 * количество кубиков
	 */
	int cubes;
	
	public PlayImpl(int players, int cubes) {
		this.players = players;
		this.cubes = cubes;
		lastWinner = 1;
		points = new int[players];
		wins = new int[players];
	}
	
	public void updateZeros() {
		for (int i = 0; i < points.length; i++) {
			points[i] = 0;
		}
	}
	
	public int isSomeoneWins() {
		for (int i = 0; i < players; i++) {
			if (wins[i] == 7) {
				return i + 1;
			}
		}
		return 0;
	}
	
	public int roll() {
		int sum = 0;
		final Random random = new Random();
		for (int i = 0; i < cubes; i++) {
			int num = random.nextInt(6) + 1;
			sum += num;
		}
		System.out.println(sum);
		return sum;
	}
}
