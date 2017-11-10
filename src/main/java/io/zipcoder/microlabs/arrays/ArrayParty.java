package io.zipcoder.microlabs.arrays;


import java.util.Collections;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***";
        for (String breakfastString : inputArray) {
            output = output + "\n" + breakfastString;
        }
        return output;
    }

    public String lastElement(String[] inputArray) {
        int lengthOfArray = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[lengthOfArray - 1];

        return output;
    }

    //TODO Define the method lastButOne

    public String lastButOne(String[] inputArray) {
        int lengthOfArray = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[lengthOfArray - 2];

        return output;
    }


    //TODO Define the method reverse

    public String reverse(String[] inputArray) {

        String output = "*** Output ***";
        for (int i = inputArray.length - 1; i >= 0; i--) {
            output = output + "\n" + inputArray[i];
        }
        return output;
    }

    //TODO Define the method isPalindrome

    public boolean isPalindrome(String[] inputArray) {

        boolean isPalindromic = true;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equalsIgnoreCase(inputArray[inputArray.length - i - 1])) {
                isPalindromic = true;
            } else {
                isPalindromic = false;
            }
        }
        return isPalindromic;

    }


    //TODO Define the method compress

    public String compress(int[] inputArray) {

        String output = "*** Output ***";
        Integer lastNumber = -100;

        for (int i = 0; i < inputArray.length; i++) {
            if (lastNumber != inputArray[i]) {
                output = output + "\n" + inputArray[i];
            }
            lastNumber = inputArray[i];
        }
        return output;

    }

    //TODO Define the method pack

    public String methodPack(char[] inputArray) {

        String output = "*** Output ***\n";
        char saved = inputArray[0];

        for (char c : inputArray) {
            if (c == saved) {
                output += c;
            } else {
                output += ", " + c;
                saved = c;
            }
        }
        return output;
    }


}

