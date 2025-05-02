package com.example.thequizapp;

public class Question {public String questions[] = {
        "Which is a Programming Language?",
        "How to pass the data between activities in Android?",
        "What is broadcast receiver in android?",
        "What is the use of content provider in android?",
        "What is JNI in android?"
};

    public String choices[][] = {
            {"HTML", "CSS", "Vala", "PHP"},
            {"Intent", "Content Provider", "Broadcast receiver", "None of the above"},
            {"It will react on broadcast announcements","It will do background functionalities as services","It will pass the data between activities","None of the Above"},
            {"A - To send the data from an application to another application","B - To store the data in a database" ,"C - To share the data between applications","D - None of the above."},
            {"A - Java network interface","B - Java interface", "C - Image editable tool","D - Java native interface."}
    };

    public String correctAnswer[] = {
            "PHP",
            "Intent",
            "It will react on broadcast announcements",
            "C - To share the data between applications",
            "D - Java native interface."
    };


    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
