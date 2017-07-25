package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.shuffle;

public class Jokes {
    public String getJokes()
    {
        ArrayList<String> listOfJokes =new ArrayList<String>();
        listOfJokes.add("What is the difference between a snowman and a snowwoman?   Snowballs");

        listOfJokes.add(" Anton, do you think Iam a bad mother ? my name is paul, mom");

        listOfJokes.add("Patient: Doctor! You've got to help me! Nobody ever listens to me." +
                " No one ever pays any attention to what I have to say.\n" +
                "Doctor: Next please! ");

        listOfJokes.add("Son: Dad, what is an idiot? \n" +
                "Dad: An idiot is a person who tries to explain his ideas in such a strange and long way that another" +
                " person who is listening to him can't understand him. Do you understand me? \n" +
                "Son: No.\n Dad: Exactly it is ");

        listOfJokes.add("A: Do you want to hear a dirty joke? \n" +
                "B: Ok \n" +
                "A: A white horse fell in the mud. ");

        listOfJokes.add("What is the longest word in the English language? \n" +
                "SMILES: there is a mile between the first and last letters!\" ");

        listOfJokes.add("A: Aren't you wearing your wedding ring on the wrong finger?\n" +
                "B: Yes I am, I married the wrong woman. ");
        listOfJokes.add("Do You Know The Relation Between Two Eyes? They Never See Each Other. But \n " +
                "1. They Blink Together.\n 2. They Move Together.\n 3. They Cry To");
        listOfJokes.add("guy1: my wife is an angle \n" +
                "guy2 : you are lucky my wife still alive");
        listOfJokes.add("Girl: When we get married, I want to share all your worries, troubles and\n" +
                "lighten your burden. \n" +
                "Boy: It's very kind of you, darling, But I don't have any worries or\n" +
                "troubles.\n" +
                "Girl: Well that's because we aren't married ");

        shuffleList(listOfJokes);

//        String joke =list_of_jokes.get(0);
        return listOfJokes.get(0);
    }


    static void shuffleList(List<String> list) {
        long seed = System.nanoTime();
        shuffle(list, new Random(seed));
    }

}
