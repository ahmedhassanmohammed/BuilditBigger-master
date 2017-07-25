package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

public class Jokes {
    public String getJokes()
    {
        ArrayList<String> list_of_jokes =new ArrayList<String>();
        list_of_jokes.add("What is the difference between a snowman and a snowwoman?   Snowballs");

        list_of_jokes.add(" Anton, do you think Iam a bad mother ? my name is paul, mom");

        list_of_jokes.add("Patient: Doctor! You've got to help me! Nobody ever listens to me." +
                " No one ever pays any attention to what I have to say.\n" +
                "Doctor: Next please! ");

        list_of_jokes.add("Son: Dad, what is an idiot? \n" +
                "Dad: An idiot is a person who tries to explain his ideas in such a strange and long way that another" +
                " person who is listening to him can't understand him. Do you understand me? \n" +
                "Son: No.\n Dad: Exactly it is ");

        list_of_jokes.add("A: Do you want to hear a dirty joke? \n" +
                "B: Ok \n" +
                "A: A white horse fell in the mud. ");

        list_of_jokes.add("What is the longest word in the English language? \n" +
                "SMILES: there is a mile between the first and last letters!\" ");

        list_of_jokes.add("A: Aren't you wearing your wedding ring on the wrong finger?\n" +
                "B: Yes I am, I married the wrong woman. ");
        list_of_jokes.add("Do You Know The Relation Between Two Eyes? They Never See Each Other. But \n " +
                "1. They Blink Together.\n 2. They Move Together.\n 3. They Cry To");
        list_of_jokes.add("guy1: my wife is an angle \n" +
                "guy2 : you are lucky my wife still alive");
        list_of_jokes.add("Girl: When we get married, I want to share all your worries, troubles and\n" +
                "lighten your burden. \n" +
                "Boy: It's very kind of you, darling, But I don't have any worries or\n" +
                "troubles.\n" +
                "Girl: Well that's because we aren't married ");

        shuffleList(list_of_jokes);

//        String joke =list_of_jokes.get(0);
        return list_of_jokes.get(0);
    }


    static void shuffleList(List<String> list) {
        long seed = System.nanoTime();
        shuffle(list, new Random(seed));
    }

}
