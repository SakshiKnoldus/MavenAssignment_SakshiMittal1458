import java.lang.*;
import java.io.*;
import java.util.*;

class StringFunctions {

    void reverseString(String givenString) {

        int stringLength = givenString.length();
        String reverseOfString = "";
        for(int i = stringLength - 1; i >= 0; i--)
        {
            reverseOfString = reverseOfString + givenString.charAt(i);
        }
        System.out.println("String after being reversed: "+reverseOfString);
    }

    void getStringLength(String givenString) {

        int stringLength = givenString.length();

        System.out.println("Length of the string is: "+stringLength);
    }

}