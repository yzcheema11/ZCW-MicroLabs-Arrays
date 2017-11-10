package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\nMushrooms";

        String actual = arrayParty.lastElement(breakfast);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method lastButOneTest

    @Test
    public void lastButOneTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\nTomatoes";

        String actual = arrayParty.lastButOne(breakfast);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method reverseTest

    @Test
    public void reverseTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";

        String actual = arrayParty.reverse(breakfast);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTest1() {

        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\n" + true;

        boolean actual = arrayParty.isPalindrome(palindromic);

        Assert.assertTrue(true);

    }

    @Test
    public void isPalindromeTest2() {

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\n" + false;

        boolean actual = arrayParty.isPalindrome(breakfast);

        Assert.assertFalse(false);
    }

    //TODO Define the method compressTest

    @Test
    public void compressTest(){

        ArrayParty arrayParty = new ArrayParty();
        int[] numbers = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        String expected = "*** Output ***\n1\n3\n2\n1\n4";

        String actual = arrayParty.compress(numbers);

        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method packTest

    @Test
    public void methodPackTest(){

        ArrayParty arrayParty = new ArrayParty();
        char [] characters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};

        String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";


        String actual = arrayParty.methodPack(characters);

        Assert.assertEquals(expected, actual);

    }


}
