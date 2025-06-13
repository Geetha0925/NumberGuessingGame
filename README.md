# NumberGuessingGame
This Java program is a Number Guessing Game that allows the player to play multiple rounds. Here's how it works step-by-step:

1. Game Setup
The program begins by asking the player:
👉 “How many rounds do you want to play?”
A total score is initialized to keep track of points earned across rounds.

2. For Each Round
A random number between 1 and 100 is generated.
The player has 5 attempts to guess this number.
In each attempt:
The player inputs a guess.
If the guess is too low, the program prints "Too Low".
If the guess is too high, the program prints "Too High".
If the guess is correct:
The program prints "Correct!" and which attempt was successful.
Points are awarded based on how many attempts were used:
1st attempt → 100 points
2nd attempt → 80 points
3rd attempt → 60 points
4th attempt → 40 points
5th attempt → 20 points
The round ends immediately when the number is guessed correctly.

3. If the Player Fails All 5 Attempts
The correct number is revealed.
No points are awarded for that round.

4. After All Rounds
The total score is displayed.

Maximum possible score = (number of rounds × 100)
