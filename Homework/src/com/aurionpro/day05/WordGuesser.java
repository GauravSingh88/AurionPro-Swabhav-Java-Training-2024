package com.aurionpro.day05;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
    private static final String[] WORDS = {"apple", "banana", "orange", "grape", "peach"};

    private String wordToGuess;
    private char[] guessedLetters;
    private int lives;

    public WordGuesser() {
        Random random = new Random();
        wordToGuess = WORDS[random.nextInt(WORDS.length)];
        guessedLetters = new char[wordToGuess.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_'; 
        }
        lives = wordToGuess.length() * 2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        
        while (lives > 0 && !isWordGuessed()) {
            System.out.println("Word to guess: " + new String(guessedLetters)); 
            System.out.println("Its a " + wordToGuess.length() + " letter word");
            System.out.println("Lives left: " + lives);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0); 
            
            boolean correctGuess = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess && guessedLetters[i] == '_') {
                    guessedLetters[i] = guess; 
                    correctGuess = true;
                }
            }
            
            if (!correctGuess) {
                System.out.println("Incorrect guess. You lose a life.");
                lives--;
            }
        }
        
        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game over! You ran out of lives. The word was: " + wordToGuess);
        }
        
        scanner.close();
    }

    private boolean isWordGuessed() {
        for (char c : guessedLetters) {
            if (c == '_') {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        WordGuesser game = new WordGuesser();
        game.play();
    }
}

