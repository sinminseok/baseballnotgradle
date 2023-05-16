package controller;

public class UserController {
    private final static int minNumber = 0;
    private final static int maxNumber = 4;

    public static int checkNumber(int number) {
        System.out.println(number);
        if (intlength(number)<minNumber || intlength(number)>maxNumber) {

            throw new IllegalArgumentException();
        }
        return number;
    }

    private static int intlength(int number){
        return Integer.toString(number).length();
    }
}
