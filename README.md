Code Breaker Game
Overview

Code Breaker is a simple console-based game where the player attempts to guess a randomly generated 4-digit code within 12 turns. The digits range from 1 to 8, and no digits are repeated in the code. The game provides feedback on how many digits are correct and in the correct position, as well as how many digits are correct but in the wrong position.
Project Structure

The project is structured into several classes to maintain separation of concerns and improve readability:

    CodeBreakerGame: Main class that initializes and runs the game.
    GameUtils: Utility class for common game functions such as displaying instructions and getting user input.
    CodeGenerator: Class responsible for generating the 4-digit code.
    GameResults: Class to handle and display results for each guess.

Classes and Methods
CodeBreakerGame.java

    main(String[] args): The main method that starts the game.
    runGame(): Method that contains the game loop and handles the main game logic.

GameUtils.java

    showInstructions(): Displays game instructions.
    getAnswerInput(Scanner scanner): Prompts the user for a 4-digit code input and validates it.

CodeGenerator.java

    createCode(): Generates a unique 4-digit code with digits ranging from 1 to 8.

GameResults.java

    showResults(int correctDigitsAndPosition, int correctDigitsOnly): Displays the results of the user's guess.
    takeTurn(List<Integer> code, String answer): Processes a single turn and returns the results of the guess.
    showCode(List<Integer> code): Reveals the generated code at the end of the game.

How to Play

    Launch the game: Run the CodeBreakerGame class to start the game.
    Follow instructions: The game will display instructions on the console.
    Make guesses: Input your guess for the 4-digit code when prompted. The digits must be within the range 1 to 8, and no digits are repeated.
    Get feedback: After each guess, the game will provide feedback on how many digits are correct and in the correct position, and how many digits are correct but in the wrong position.
    Win or Lose: You have 12 turns to guess the code. If you guess the code correctly, you win. If you don't guess the code within 12 turns, the game will reveal the code.

Requirements

    Java 8 or higher

How to Run

    Clone the repository or download the source code.
    Open the project in your favorite Java IDE.
    Compile and run the CodeBreakerGame class.
