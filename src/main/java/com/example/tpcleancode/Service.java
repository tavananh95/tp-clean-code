package com.example.tpcleancode;

public class Service {

    public static int convertDiceScenarioToPoint(int dice1, int dice2,
                                                 int dice3, int dice4, int dice5) {
        if (dice1 == dice2 && dice2 == dice3) {
            return 28;
        }
        return 1;
    }
}
