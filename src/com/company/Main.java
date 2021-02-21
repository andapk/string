package com.company;


import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum CardSuits {
    SPADES, CLUBS, HEARTS, DIAMONDS
}

enum CardValue {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

public class Main {

    static String[] array = {
            "Computer",
            "Plate",
            "Chair",
            "Girl",
            "Boy",
            "Cat",
            "Dog",
            "Shirt",
            "Determination"};
    static String str = Arrays.toString(array);

    public static void main(String[] args) {
        Assignment_1();
        Assignment_2();
        Assignment_3();
        Assignment_4();
        Assignment_5();

    }

    public static void Assignment_1() {


        System.out.printf("Values are starting with 'C': %s", runRegEx("[^C]", str));
        System.out.println();
        System.out.printf("Values are ending with 'e':  %s", runRegEx("[e$]", str));
        System.out.println();
        valueWithLenght5();
        System.out.printf("Letter e occours  %s", runRegEx("e", str));
        System.out.println();
        System.out.printf("Elements consists of the subString “te”  %s", runRegEx("te", str));
        System.out.println();

    }


    public static void valueWithLenght5() {
        int count = 0;
        for (String value : array) {
            if (value.length() == 5) {
                count++;
            }
        }
        System.out.println("Value with lenght 5: " + count);
    }

    public static int runRegEx(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    public static void Assignment_2() {
        String sentence = "Climb mountains not so the world can see you, but so you can see the world";
        System.out.println("'the' words in the sentence: " + runRegEx("the", sentence));
        System.out.println("Letter 's': " + runRegEx("s", sentence));
        System.out.println(sentence.replaceAll("you", "You"));
        System.out.println("Words in sentence " + splitSentence(sentence));
        dublicateWords(sentence);
    }

    public static int splitSentence(String string) {
        String[] words = string.split("\\s+");
        return words.length;
    }

    public static void dublicateWords(String string) {

        String[] words = string.toLowerCase().split("\\s+");
        int count;
        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }


    public static void Assignment_3() {
        String name = "John";
        String userName = "s20surname";
        String personCodeOfLatvian = "121200-11311";

        System.out.println(Pattern.matches("[a-zA-Z]*", name));
        System.out.println(Pattern.matches("[a-zA-Z]{1}[0-9]{2}[A-Za-z]*", userName));
        System.out.println(Pattern.matches("[0-9]{6}[-]{1}[0-9]{5}", personCodeOfLatvian));
    }

    public static void Assignment_4() {

        String[] cardPack = card();
        System.out.println(Arrays.toString(cardPack));
        shuffle(cardPack);
        System.out.println(Arrays.toString(cardPack));
    }

    public static String[] card() {
        int count = 0;
        String[] cards = new String[52];
        for (CardSuits s : CardSuits.values()) {
            for (CardValue r : CardValue.values()) {
                cards[count] = s.toString() + r.toString();
                count++;
            }
        }
        return cards;
    }

    public static void shuffle(String[] cards) {
        Collections.shuffle(Arrays.asList(cards));
    }

    public static void Assignment_5() {
        String a = "Mom";
        String b = "Was it a car or a cat I saw?";
        String c = " Madam, in Eden, I’m Adam.";
        String d = " Yo, banana boy!";

        System.out.printf("Is string a palindrome?" +
                        "Mom: %s   Was it a car or a cat I saw?: %s  " +
                        "Madam, in Eden, I’m Adam.: %s  Yo, banana boy!: %s",
                isPalindrome(a), isPalindrome(b), isPalindrome(c), isPalindrome(d));
    }

    public static boolean isPalindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.toLowerCase().replaceAll("[^a-z]*", "");
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}





