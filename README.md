# Java-Snake-Ladders
Main task:
The program should allow the user to play Snakes and Ladders against 1-3 other players.
The board has 100 squares, starting from 1 and going up to 100. The players start at square 1. The first player
to reach square 100 wins the game. 
For example, if a player is on square 10 and they roll 5, they will move to square 15. A player wins if they arrive
at/land on square 100, exactly. That is, if a player is on square 97, and they roll 4, they cannot move. They must
keep playing until they roll exactly 3.

Each player should have a colour or a name assigned to them.
Before the game begins, the program should place a number of snakes and ladders on the board.
Each snake has a head and a tail on the board. If the player lands on a square where a snake’s head is, the player
should move down to the square where the end of the snake’s tail is. Similarly, if the player lands on a square
where the bottom of the ladder is, the player should move up to the square where the top of the ladder is. That
is, the head of a snake is always in a square of a higher number than the square where the end of its tail is, and
the top of a ladder is always in a square of a higher number than the square where its bottom is.
If a player rolls 6, they move the number given (moving down a snake or up a ladder if moving six squares
forward lands on one of them) and then they get an additional turn.
The game continues until all players, but one, reach square 100.
The board also contains two biscuits (one on each of two squares determined by the program before the game
begins). If a player lands on a biscuit square they can keep the biscuit and feed it to the next snake that they
encounter so that they do not have to move down to the tail square.
