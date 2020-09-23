package hangman;

import javax.swing.*;
import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        //Variable Declaration & Initialization
        //StringBuffer
        StringBuffer strBuffer = new StringBuffer();
        int livesLost = 0, totalLives = 7, lettersRemaining, x, y, space = 1;
        boolean guessInWord = false;
        char inputGuess = 0, letter;
        char[] randomWord, guessLetter;
        Random rand = new Random();
        String[] category = {"Food", "Country", "Manga", "Tv Show", "Video Game",};
        String[][] word = new String[][]{{"PIZZA", "ICE CREAM", "SUSHI", "SPAGHETTI"
                , "POUTINE", "FRIES", "MILLE FEUILLE", "MOON CAKE", "CHEESE CAKE", "RAMEN", "MACARON"}
                , {"CANADA", "FRANCE", "CHINA", "SWITZERLAND", "GERMANY", "UNITED KINGDOM", "JAPAN"
                , "SWEDEN", "NETHERLANDS", "UNITED STATE", "ITALY", "NORWAY", "LUXEMBOURG", "LIECHTENSTEIN"}
                , {"DRAGON BALL", "NARUTO", "DEATH NOTE", "BLEACH", "FULLMETAL ALCHEMIST", "VIOLET EVERGARDEN"
                , "RECORD OF GRANCREST WAR", "FAIRY TAIL", "THE SAGA OF TANYA THE EVIL", "SWORD ART ONLINE"
                , "NO GAME NO LIFE", "TOKYO GHOUL", "BORUTO", "KONOSUBA", "THE SEVEN DEADLY SINS", "PIANO NO MORI"
                , "MY LIE IN APRIL", "ASSASSINATION CLASSROOM", "SNOW WHILE WITH RED HAIR", "FOOD WARS"
                , "HAIKYO", "ATTACK ON TITAN", "ANGELS OF DEATH"
                , "DARLING IN THE FRANXX", "GUN GALE ONLINE", "OVERLORD", "STEINS GATE"}
                , {"THE GOOD PLACE", "GREY ANATOMY", "THE BIG BANG THEORY", "THE WALKING DEAD"
                , "THE FLASH", "SUPERMAN", "SUPERGIRL", "DOCTOR WHO", "SUPERNATURAL", "FBI", "GAME OF THRONES", "MANIFEST"}
                , {"GUILD WAR", "LEAGUE OF LEGEND", "DEAD BY DAYLINE", "MAPLESTORY", "PLAYERUNKNOWN BATTLEGROUND"
                , "MINECRAFT", "COUNTER STRIKE", "CROSS FIRE", "BLACK DESSERT ONLINE", "NBA", "FIFA", "WORLD OF WARCRAFT"
                , "WWE", "DUNGEON FIGHTER ONLINE", "ASSASIN CREED", "TERRARIA"
                , "NO MAN SKY", "FARCRY", "RUST", "GRAND THEFT AUTO V", "WARFRAME", "FORTNITE"}};
        //Decoration
        System.out.printf("%s%n|%40s%32s%n%s%n%n%s%n%n"
                , "|=======================================================================|"
                , "Hangman", "|"
                , "|=======================================================================|"
                , "Welcome to Hangman game:\nYou will have only 7 lives."
                        + "\nYou cannot repeat the same wrong letter or you will lose life.\nEnjoy the game !");
        x = rand.nextInt(category.length);
        y = rand.nextInt(word[x].length);
        randomWord = (word[x][y]).toCharArray();
        guessLetter = new char[randomWord.length];
        //show the player what category of word
        System.out.println("Category : " + category[x]);
        //For loop to hide the word
        for (int i = 0; i < randomWord.length; i++) {
            guessLetter[i] = '-';
            //If statement to check if the word has a space
            if (randomWord[i] == ' ') {
                guessLetter[i] = ' ';
                space++;
            }
        }
        //Decoration
        System.out.println("Word : " + space + " Remaining : " + (guessLetter.length - space + 1));
        System.out.println(guessLetter);
        lettersRemaining = randomWord.length;
        //While loop stop when Game over
        while (lettersRemaining != 0 && livesLost < 7) {
            //Try and catch if user cancel end of the game
            try {
                //prompt user to guess a letter
                inputGuess = JOptionPane.showInputDialog(null
                        , "Number of Guesses Remaining " + (totalLives - livesLost)
                                + "\nDo not repeat the same letter !!!" + "\nClick cancel to exit" + "\nEnter a letter:"
                        , "Guess", JOptionPane.QUESTION_MESSAGE).charAt(0);
                inputGuess = Character.toUpperCase(inputGuess);
            } catch (java.lang.NullPointerException e) {
                System.err.println("EXIT GAME");
                System.exit(0);
            }

            //For loop to check if inputGuess match with the word
            for (char c : randomWord) {
                if (inputGuess == c) {
                    guessInWord = true;
                    break;
                } else {
                    guessInWord = false;
                }
            }

            if (!guessInWord) {
                livesLost++;
                System.out.printf("%n%s%d%s%n"
                        , "Sorry, you have lost a life. You still have ", totalLives - livesLost, " lives left.");
            } else {
                //For loop to check inputGuess
                for (int j = 0; j < randomWord.length; j++) {
                    //If Statement to check inputGuess to the Guess word
                    if (inputGuess == randomWord[j]) {
                        guessLetter[j] = inputGuess;
                    }
                }
                System.out.println("\nGood guess, well done!\n");
            }
            //Switch Statement to check how many life left and print the guys
            switch (totalLives - livesLost) {
                case 6 -> System.out.println("  o");
                case 5 -> System.out.println("  o" + "\n /");
                case 4 -> System.out.println("  o" + "\n /|");
                case 3 -> System.out.println("  o" + "\n /|\\");
                case 2 -> System.out.println("  o" + "\n /|\\" + "\n  |");
                case 1 -> System.out.println("  o" + "\n /|\\" + "\n  |" + "\n /");
                case 0 -> System.out.println("  o" + "\n /|\\" + "\n  |" + "\n / \\");
            }
            System.out.println("==========================================================");
            lettersRemaining = 0;

            //For loop to check letterRemaining
            for (char c : guessLetter) {
                letter = c;
                if (letter == '-') {
                    lettersRemaining++;
                }
            }
            strBuffer.append(inputGuess).append(" ");//Input the inputGuess
            //If Statement Check if it is a win or not
            if ((new String(randomWord)).equals(new String(guessLetter))) {
                System.out.print("The word was: ");
                System.out.print(guessLetter);
                System.out.printf("%n%s%n|%27S%9s%n%s%n", "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|"
                        , "Winner Winner !!! ", "|", "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            } else if (livesLost == totalLives) {
                System.out.print("The word was: ");
                System.out.print(randomWord);
                System.out.printf("%n%s%n|%28S%8s%n%s%n", "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|"
                        , "Sorry, you lose !!! ", "|", "|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
            } else {
                System.out.printf("%s%n%s%s%n%s%d%n%n", "Category : " + category[x], "Previously guessed letters: "
                        , strBuffer, "Letters remaining: ", lettersRemaining);
                System.out.println(guessLetter);
            }
        }
    }//End main
}//End class