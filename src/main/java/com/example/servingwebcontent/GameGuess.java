package com.example.servingwebcontent;

import org.springframework.stereotype.Service;

@Service
public class GameGuess {
    private int prize = 0;
    private int randomNum = 1;
    private boolean turn = true;

    private void randomNumber(){
        randomNum =  (int) (Math.random() * 10) + 1;
    }

    public boolean comparation(int userNumber){
        //randomNumber();

        return userNumber == randomNum;
    }

    public void restart (){
        prize = 0;
        turn = true;
    }

    public void reducePrize() {
        prize -= 10000;
    }

    public void maxPrize() {
        if (turn) {
            prize = 100000;
            turn = false;
        }
    }

    public int getPrize() {
        return prize;
    }

}
