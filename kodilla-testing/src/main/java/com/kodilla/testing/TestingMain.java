package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(13, 7);
        int resultSubtract = calculator.subtract(13, 7);

        if (resultAdd == 20) {
            System.out.println("Test add OK");
        } else {
            System.out.println("Test add ERROR");
        }

        if (resultSubtract == 6) {
            System.out.println("Test subtract OK");
        } else {
            System.out.println("Test subtract ERROR");
        }
    }
}
