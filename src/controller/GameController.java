package controller;

import view.InputView;

import java.util.List;

//Controller는 View와 소통
public class GameController {

    public static void init(){
        //숫자 입력 Input 호출
        int number = InputView.inputNumber();

        //숫자 검증 controller 호출
        BaseballController.checkNumber(number);

        //결과 Output호출

    }
}
