# Java Hangman
 # Hangman Game

Hangman Game is a console-based game where players guess letters to uncover a hidden word. The game tracks the number of incorrect guesses and displays the hangman's progress.

## How to Play

1. Run the program in a Java environment that supports console input/output.
2. The game will randomly select a word from a predefined list.
3. Guess a letter by entering it in the console.
4. If the guessed letter is in the word, it will be revealed in the word's progress.
5. If the guessed letter is not in the word, the number of incorrect guesses will increase.
6. Keep guessing letters until you either guess the word correctly or run out of attempts.
7. If you guess the word correctly, you win the game.
8. If you run out of attempts, the game is over, and the word is revealed.

## Getting Started

1. Clone the repository or download the source code files.
2. Ensure you have Java installed on your system.
3. Compile the Java source files.
"$ javac HangmanGame.java"
4. Run the Hangman Game.
5. Follow the on-screen instructions to play the game.

## Customization

You can customize the Hangman Game by modifying the following aspects:

- **Word List**: The game selects a random word from a predefined list. You can modify the `WORDS` array in the code to include your own set of words.
- **Max Guesses**: The maximum number of incorrect guesses allowed before the game is over can be adjusted by modifying the `MAX_GUESSES` constant.
- **Hidden Character**: The character used to represent hidden letters in the word can be changed by modifying the `HIDDEN_CHAR` constant.

## Contributing

Contributions to the Hangman Game project are welcome! If you have any improvements or feature suggestions, feel free to open an issue or submit a pull request.

## License

This Hangman Game project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this code for personal and commercial purposes.

