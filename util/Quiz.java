package util;

import java.util.Scanner;

public class Quiz {
    public static void startQuiz(){
        Question ques[] = new Question[5];
        String strUserAnswers[] = new String[5];
        int result = 0;
        Scanner sc = new Scanner(System.in);
        ques[0] = new Question(1, "What is the capital city of India?", "Mumbai", "New Delhi", "Kolkata", "Bangalore", "B");
        ques[1] = new Question(2, "Which river is considered the holiest in Hinduism?", "Yamuna", "Ganges (Ganga)","Brahmaputra", "Godavari", "B");
        ques[2] = new Question(3, "Who was the first Prime Minister of India?", "Jawaharlal Nehru", "Mahatma Gandhi","Sardar Vallabhbhai Patel", "Indira Gandhi", "A");
        ques[3] = new Question(4, "Which Indian city is famously known as the \"City of Dreams\"?", "Mumbai", "Chennai","Jaipur", "Hyderabad", "A");
        ques[4] = new Question(5, "Which monument is considered one of the Seven Wonders of the World and is located in India?", "Eiffel Tower", "Colosseum","Taj Mahal", "Great Wall of China", "C");



        int i =0;
        for(Question q : ques){
            q = ques[i];
            System.out.println(q);
            strUserAnswers[i] = sc.nextLine();
            if(q.getStrAnswer().equalsIgnoreCase(strUserAnswers[i])){
                result++;
            }
            i++;
            System.out.println();
        }
        sc.close();
        System.out.println("Your final score is: " + result);
    }
}
