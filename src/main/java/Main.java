import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = sc.nextLine();

        System.out.println("You entered: " + "\"" + userInput + "\"");

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        System.out.println("Reversed: " + StringUtils.reverse(userInput));

    }

}