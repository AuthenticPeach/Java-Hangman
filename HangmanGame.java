import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"hangman", "java", "programming", "computer", "openai"};
    private static final int MAX_GUESSES = 6;
    private static final char HIDDEN_CHAR = '_';

    private String secretWord;
    private char[] guessedWord;
    private int incorrectGuesses;

    public HangmanGame() {
        secretWord = getRandomWord();
        guessedWord = new char[secretWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = HIDDEN_CHAR;
        }
        incorrectGuesses = 0;
    }

    private String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess a letter: ");
            char guess = scanner.next().charAt(0);
            boolean found = false;

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                incorrectGuesses++;
                System.out.println("Incorrect guess. Attempts remaining: " + (MAX_GUESSES - incorrectGuesses));
            }

            System.out.println(guessedWord);

            if (isWordGuessed()) {
                System.out.println("Congratulations! You guessed the word.");
                break;
            }

            if (incorrectGuesses >= MAX_GUESSES) {
                System.out.println("Game over! You ran out of attempts. The word was: " + secretWord);
                break;
            }
        }

        scanner.close();
    }

    private boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == HIDDEN_CHAR) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");

        HangmanGame game = new HangmanGame();
        game.play();
    }
}
