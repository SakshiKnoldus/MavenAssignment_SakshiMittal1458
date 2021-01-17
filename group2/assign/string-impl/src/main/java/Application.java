import java.util.*;

class Application {
    public static void main(String[] args) {

        StringFunctions stringFunctions = new StringFunctions();

        Scanner sc = new Scanner(System.in);
        String givenString;
        System.out.println("Enter the String: ");
        givenString = sc.nextLine();

        stringFunctions.reverseString(givenString);
        stringFunctions.getStringLength(givenString);

    }
}