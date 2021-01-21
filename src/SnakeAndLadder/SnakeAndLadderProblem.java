package SnakeAndLadder;

public class SnakeAndLadderProblem {
	public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
    int startingPos=0;
    int currentPos=0;
    int play=0;
    int dice=0;
    int count1=0;
    int count2=0;
    int player=1;
    
	public static void main(String[] args) {
		System.out.println("-----------Welcome to Snake And Ladder Problem---------");
		SnakeAndLadderProblem s1 = new SnakeAndLadderProblem();
		
	    
	    System.out.println("Player 1 is Starting at: " + s1.startingPos);
	    System.out.println("Player 2 is Starting at: " + s1.startingPos);
	    
	    while (s1.currentPos != 100) {
	    	if (s1.player == 1) {
                s1.playCheck(1);
            } else {
                s1.playCheck(2);
            }
        }
	}
	int playerGener() {
        return (int) ((Math.floor(Math.random() * 10) % 3));
    }
    int diceGener() {
        return (int) ((Math.floor(Math.random() * 10) % 6) + 1);
    }
	void checkPosition(int p)
	{
	    	if (currentPos == 100) {
	    		System.out.println("New Position is: " + currentPos);
	    		 exitsGame(p);
            } else if (currentPos > 100) {
                currentPos -= dice;
                System.out.println("Its not valid and staying at same position.");
            } else if (currentPos < 0) {
                currentPos = startingPos; // Starting from zero again.
                System.out.println("Back to start again");
            } else {
                System.out.println("New Position is: " + currentPos);
            }
	}
	void playCheck(int p) {
        if (p == 1) {
            count1++;
        } else {
            count2++;
        }
        dice = diceGener();
        System.out.println("Current Dice Face for player " + p + ": " + dice);
        play = playerGener();
        switch (play) {
        	case IS_LADDER:
        		currentPos += dice;
        		checkPosition(p);
        		playCheck(p);
        		break;
        	case IS_SNAKE:
        		currentPos -= dice;
        		checkPosition(p);
        		switchPlayer();
        		break;
        	default:
        		System.out.println("Player " + p + ": No play");
        		switchPlayer();
        		break;
        }
	}
    void exitsGame(int p) {
	        int c = p == 1 ? count1 : count2;
	        System.out.println("Player" + p + " We have wongame and took " + c + " times to win.");
	        System.exit(0);
	}
    void switchPlayer() {
    	System.out.println("");
	    if (player == 1) {
	    	player = 2;
	    } 
	    else {
	            player = 1;
	    }
	}
}
	