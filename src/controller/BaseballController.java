package controller;

public class BaseballController {

    public static String checkNumber(int number,int computerNumber){

        int ball = checkball(number,computerNumber);
        if (ball == 0){
            return "낫띵";
        }
        int strike = checkstrike(number,computerNumber);
        ball -= strike;

        return subString(ball, strike);
    }

    private static int checkball(int number,int computerNumber){

    }

    private static int checkstrike(int number,int computerNumber){

    }

    private static String  subString(int ball,int strike){
        return  Integer.toString(ball)+"볼"+Integer.toString(ball)+"스트라이크";
    }
}
