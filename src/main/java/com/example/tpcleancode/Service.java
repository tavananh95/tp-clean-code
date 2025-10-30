package com.example.tpcleancode;

import java.util.*;

public class Service {
    public static int BRELAN_POINT = 28;

    public static int convertDiceScenarioToPoint(List<List<Integer>> diceThrowsResults) {
        HashMap<Integer, Integer> throwTurnWithPoint = new HashMap<>();
        int result = 0;
        for (List<Integer> diceThrowResult : diceThrowsResults) {
            boolean hasBrelan = false;
            for (Integer dice : diceThrowResult) {
                if (countNumberOccurence(diceThrowResult, dice) == (long) 3) {
                   hasBrelan = true;
                    break;
                }
            }

            if (hasBrelan) {
                result += BRELAN_POINT;
            }
        }
        return result;
    }

    public static long countNumberOccurence(List<Integer> numbers, Integer value) {
        return numbers.stream()
                .filter(n -> Objects.equals(n, value))
                .count();
    }
}
