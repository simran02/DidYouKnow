package com.skarora.didyouknow;

import java.util.Random;

/**
 * Created by sk on 9/7/17.
 */

class FactBook {
    //Fields (member variables) -Properties about the objects
    private String [] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for Light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };
    //methods - Actions that objects can take
    public String getFact()
    {
        //the button was clicked, so update the fact TextView with new fact.
        String fact = "";
        //randomly generate a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];

        return fact;
    }
}
