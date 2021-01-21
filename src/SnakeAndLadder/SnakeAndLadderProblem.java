package SnakeAndLadder;

public class SnakeAndLadderProblem {
	public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
	public static void main(String[] args) {
		System.out.println("-----------Welcome to Snake And Ladder Problem---------");
		int startingPos=0;
	    int currentPos=0;
	    int play;
	    int dice;
	    
	    System.out.println("Player is Starting at: " + startingPos);
	    dice = (int) ((Math.floor(Math.random() * 10) % 6) + 1);
        System.out.println("Current Dice Face is: " + dice);
        play = (int) ((Math.floor(Math.random() * 10) % 3));
        switch (play) {
        	case IS_LADDER:
        		currentPos += dice;
        		break;
        	case IS_SNAKE:
        		currentPos -= dice;
        		break;
        	default:
        		currentPos+=0;
        		break;
        }
        System.out.println("New Position is: " + currentPos);
	}

}
