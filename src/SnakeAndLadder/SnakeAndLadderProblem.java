package SnakeAndLadder;

public class SnakeAndLadderProblem {

	public static void main(String[] args) {
		System.out.println("-----------Welcome to Snake And Ladder Problem---------");
		int startingPos=0;
	    int currentPos=0;
	    System.out.println("Player is Starting at: " + startingPos);
	    int dice = (int) ((Math.floor(Math.random() * 10) % 6) + 1);
        System.out.println("Current Dice Face is: " + dice);
	}

}
