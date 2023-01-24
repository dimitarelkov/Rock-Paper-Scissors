package PrcaticalProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        System.out.println("Choose: [r]ock, [p]aper, [s]cissors:");

        String selectedOption = scanner.nextLine();

        if (selectedOption.equals("rock") || selectedOption.equals("r") ) {
            selectedOption = rock;

        } else if (selectedOption.equals("paper") || selectedOption.equals("p") ) {
            selectedOption = paper;

        } else if (selectedOption.equals("scissors") || selectedOption.equals("s")) {
            selectedOption = scissors;

        } else {
            System.out.println("Invalid Input. Try again ...");
            return;
        }

        Random random = new Random();

        int randomNumber = random.nextInt(1,4);

        String computerSelectedOption = "";

        switch (randomNumber) {
            case 1:
                computerSelectedOption = rock;
                break;
            case 2:
                computerSelectedOption = paper;
                break;
            case 3:
                computerSelectedOption = scissors;
                break;
        }
        System.out.printf("Computer chose %s.%n", computerSelectedOption);

        if ((selectedOption.equals(rock) && computerSelectedOption.equals(scissors)) ||
        selectedOption.equals(scissors) && computerSelectedOption.equals(paper) ||
        selectedOption.equals(paper) && computerSelectedOption.equals(rock)) {
            System.out.println("You win.");
        } else if ((selectedOption.equals(scissors) && computerSelectedOption.equals(rock)) ||
                selectedOption.equals(paper) && computerSelectedOption.equals(scissors) ||
                selectedOption.equals(rock) && computerSelectedOption.equals(paper)) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }


    }

    }

