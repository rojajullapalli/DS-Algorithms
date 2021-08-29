package com.bridgelabz.ana;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        char firstWord[] = {'h','e','a','r','t'};
        char secondWord[] = { 'e', 'a', 'r', 't','h' };
        Utility u1 = new Utility();
        if (u1.isAnagram(firstWord, secondWord))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }


}
