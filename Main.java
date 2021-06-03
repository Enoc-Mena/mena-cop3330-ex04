/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.madlib;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String noun, verb, adjective, adverb;

        Scanner userNoun = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        noun = userNoun.nextLine();

        Scanner userVerb = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        verb = userVerb.nextLine();

        Scanner userAdj = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        adjective = userAdj.nextLine();

        Scanner userAdverb = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        adverb = userAdverb.nextLine();

        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " "+ adverb + "?" + " That's cool!");

    }
}
