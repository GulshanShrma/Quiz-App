package app;

import java.util.Scanner;
import app.util.*;

class Main{
    public static void main(String[] args) {
        playQuiz();
    }

    private static void playQuiz(){
        System.out.println("Hi!");
        System.out.println("Please enter your name.");
        Scanner sc = new Scanner(System.in);
        String strName = sc.nextLine();
        
        System.out.println("Welcome to the QUIZ.... " + strName);
        System.out.println("NOTE: enter the right options character as answer, e.g. A");
        Quiz.startQuiz();
        sc.close();
    }
}