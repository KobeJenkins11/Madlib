package com.LikingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase One
        String name;//declared a variable
        String fathersName;
        String oneOf5senses;
        String smallAnimal;
        String favoriteCelebrity;
        String neighborhoodName;
        String ethnicity;
        String noun;
        String  verbEndingInATE;
        String trivialStuff;
        String socialMediaProfile;
        String randomName;
        String typeOfSpecies;
        String country;
        String typeOfCreativity;
        String favoriteFood;
        String boringDailyTask;
        String siblingName;
        String unmanageableThings;
        String adjective;
        String favoriteSuperPower;
        Scanner keyboard;

        //Phase two
        keyboard = new Scanner(System.in);

        System.out.println("Give me your fathers name");
        fathersName = keyboard.nextLine();

       System.out.println("Give me a favorite food");
       favoriteFood = keyboard.nextLine();

       System.out.println("Give me a siblings name");
       siblingName = keyboard.nextLine();

       System.out.println("Give me a type of species");
       typeOfSpecies = keyboard.nextLine();

       System.out.println("Give me your favorite superpower");
       favoriteSuperPower = keyboard.nextLine();

        System.out.println("Give me a adjective");
        adjective = keyboard.nextLine();

        System.out.println("Give me a unmanageable thing");
        unmanageableThings = keyboard.nextLine();

        System.out.println("Give me a creative thing you enjoy doing");
        typeOfCreativity = keyboard.nextLine();

        System.out.println("Give me a country ");
        country = keyboard.nextLine();

        System.out.println("Give me a random name");
        randomName = keyboard.nextLine();

        System.out.println("Give me a verb ending in ATE");
        verbEndingInATE = keyboard.nextLine();

        System.out.println("Give me a noun");
        noun = keyboard.nextLine();

        System.out.println("Give me an ethnicty");
        ethnicity = keyboard.nextLine();

        System.out.println("Give me a neighborhood name");
        neighborhoodName = keyboard.nextLine();

        System.out.println("Give me one of the 5 senses ");
        oneOf5senses = keyboard.nextLine();

        System.out.println("Give me a small animal");
        smallAnimal = keyboard.nextLine();

        System.out.println("Give me your favorite celebrity");
        favoriteCelebrity = keyboard.nextLine();

        System.out.println("Give me a social media profile you follow");
        socialMediaProfile = keyboard.nextLine();

        System.out.println("Give me something trivial related");
        trivialStuff = keyboard.nextLine();

        System.out.println(" Give me a boring daily task");
        boringDailyTask = keyboard.nextLine();



        //phase 3
        System.out.println( " " + fathersName+ " have you ever wanted to " + oneOf5senses+ " all sorts of " + smallAnimal+ " with friends, family, colleagues " );
        System.out.println("or even " + favoriteCelebrity+ " but didn't know how?" );
        System.out.println(" maybe you were just strolling the side walk of " + neighborhoodName);
        System.out.println(" past your favorite " + ethnicity+ " baker when you wish you");
        System.out.println(" could pull out your  " + noun+ " and use it to quickly " + verbEndingInATE );
       System.out.println(" all your latest " +trivialStuff+ " and post it to your " + socialMediaProfile+"?");
        System.out.println(" " + randomName+ " is the answer. The fact is we live in a world where " + typeOfSpecies);
        System.out.println(" will revolutionize " + country+ ", and pretty soon you'll be able to " + typeOfCreativity);
        System.out.println(" anything you want through the cloud. All this " + favoriteFood+ " is already changing " );
        System.out.println(" the way we " + boringDailyTask+ " but who has the tools to keep up with it? ");
        System.out.println(" " + siblingName+ " is that tool. With our beautiful, user-friendly interface, you'll ");
        System.out.println(" find that managing all your " + unmanageableThings+ " is easier than ever and " + adjective);
        System.out.println(" Utilizing the power of " + favoriteSuperPower);


    }
}
