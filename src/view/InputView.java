package view;

import controller.UserController;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputNumber(){
        try {
            System.out.println("숫자를 입력해주세요");
            return UserController.checkNumber(Integer.parseInt(scanner.nextLine().trim()));
        }catch (IllegalArgumentException e){
            System.out.println("올바르지 않은 입력입니다.");
            return inputNumber();
        }
    }
}
