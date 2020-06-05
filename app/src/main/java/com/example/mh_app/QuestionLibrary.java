package com.example.mh_app;

public class QuestionLibrary {
    public static  String nQuestions[]={
            "hello?",
            "how are you?",
            "are you sure?",
            "no way, really?"


    };
    public static String nChoices[][]={
            {"hello","not in the mood","adele?!"},
            {"as good as i can be","still no","is it really adele?"},
            {"yep","am I ever","oh okay, just normal question,wow -_-"},
            {"yes wayyy","no man, was defs lying","these are very generic"}

    };
    public static String nCorrectAnswers[]={
            "hello","still no","yep","yes wayyy"
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
