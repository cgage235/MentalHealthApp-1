package com.example.mh_app;

public class QuestionLibrary {
    public static  String nQuestions[]={
            "Cold weather and snow can kill the new coronavirus.",
            "The new coronavirus cannot be transmitted through mosquito bites and houseflies.",
            "Ultra-violet (UV) lamps should be used to disinfect hands or other areas of your skin",
            "Vaccines against pneumonia protect you against the new coronavirus."



    };
    public static String nChoices[][]={
            {"MYTH","FACT","adele?!"},
            {"MYTH","FACT","is it really adele?"},
            {"MYTH","FACT","oh okay, just normal question,wow -_-"},
            {"MYTH","FACT","these are very generic"}

    };
    public static String nCorrectAnswers[]={
            "MYTH","FACT","MYTH","MYTH"
    };
    public String getQuestion(int a) {
        String question= nQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 =nChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 =nChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 =nChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer= nCorrectAnswers[a];
        return answer;

    }

}
