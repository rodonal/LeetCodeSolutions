import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheatSheetJava {


    public static void testIntegerDouble() {

        System.out.println("Testing Integers and Doubles");

        // String to int primitive
        String integerString1 = "10";
        int integer1 = Integer.parseInt(integerString1);

        //String to Wrapped Integer
        Integer integer2 = Integer.valueOf(integerString1);

        System.out.println(integer1 + " " + integer2);

        //

    }

    public static void testStringAndChar() {

        System.out.println("Testing String");

        // int to String
        int integer1 = 100;
        String integerAsString = String.valueOf(integer1);
        System.out.println(integerAsString);


        // Integer to String
        Integer integer2 = 50;
        String IntegerAsString = String.valueOf(integer2);
        System.out.println(IntegerAsString);


        //Allocate a char array and convert it to String
        char [] charArray = {'a', 'b', 'c'};
        String charArrayToString = new String (charArray);

        System.out.println(charArrayToString);


        // String related important functions

        String testString = "*abc*123";

        char char1 = testString.charAt(0);
        int lengthString = testString.length();
        String substringFirstIndexIncludedSecondExcluded = testString.substring(0,2); //"*a"
        String substringStartingFromThatIndexUntilTheEnd = testString.substring(1); //"abc*123"

        String testString2 = "abc";
        String testString3 = "*abc*123";
        Boolean result2 = testString.equals(testString2);  //False
        Boolean result3=  testString.equals(testString3);  //True




//        s.compareTo(“b*c*d”);         // return -1 because s comes first in lexicographical order
//        s.trim(); 	                  // remove tailing and padding spaces
//        s.indexOf(“a”);               // return first index of substring “a”   indexOf(substring)
//        s.indexOf(‘a’, 2);            // indexOf(int ch, fromIndex), indexOf(String str, fromIndex)
//        s.lastIndexOf(‘a’);           // also we can use s.lastIndexOf(String str)
//        s.replaceAll(substr, target); // replace all substr to target in s
//
//        char[] arr = s.toCharArray();
//        String[] arr = s.split("\\*") // when delimiter is '*'
//        String[] arr = s.split("\\.") // when delimiter is '.'
//        String res = String.join(String delimiter, List<String> data); // use the delimiter to concatenate the string in data.
//        Objects.equals(Object a, Object b); // (1)if both parameters are null return true
//        // (2)if exactly one parameter is null return false
//        // (3)return the result of invoking the equals() method of the first parameter passing it the second parameter
//        // This behaviour means it is "null safe".






    }


    public static void testArrayAndArrayList() {

        System.out.println("Testing Array and ArrayList");

        List<String> list = new ArrayList<String>();
        list.add("elememt1");
        list.add("element2");

        //convert Arraylist to array
        String[] arrayString = list.toArray(new String[list.size()]);

        System.out.println( "list: "+list);
        System.out.println("array:  "+ Arrays.toString(arrayString));

        //Convert Array to ArrayList
        List<String > list2 = Arrays.asList(arrayString);
        System.out.println(list2);



    }


    public static void testMapAndSetAndLinkedList() {

        System.out.println("Testing Map and Sets and LinkedList");

    }


}
