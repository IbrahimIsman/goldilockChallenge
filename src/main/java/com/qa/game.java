package com.qa;

// task2 on junit testing exercises

public class game {
	public static int play(int player1, int player2) {
        if (player1 > 21 && player2 > 21) {
            return 0;
        } else if (player1 > 21) {
            return player2;
        } else if (player2 > 21) {
            return player1;
        }
        return Math.max(player1, player2);

}
}
