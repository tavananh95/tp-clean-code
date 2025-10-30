package com.example.tpcleancode;

import java.util.*;

public class Service {
    public static int BRELAN_POINT = 28;
    public static int CARRE_POINT = 35;
    public static int YAMS_POINT = 50;

    public static HashMap<String, Integer> mapScenarioPoint = new HashMap<>();

    public static int getSumAllDiceThrows(List<List<Integer>> diceThrowsResults) {
        mapScenarioPoint.put("yams", YAMS_POINT);
        mapScenarioPoint.put("carre", CARRE_POINT);
        mapScenarioPoint.put("brelan", BRELAN_POINT);

        HashMap<Integer, Integer> throwTurnWithPoint = new HashMap<>();
        int result = 0;
        for (List<Integer> diceThrowResult : diceThrowsResults) {
            result += convertPointForEachDiceScenario(diceThrowResult);
        }

        for (int throwTurn : throwTurnWithPoint.keySet()) {
            result += throwTurnWithPoint.get(throwTurn);
        }
        return result;
    }

    public static long countNumberOccurence(List<Integer> numbers, Integer value) {
        return numbers.stream()
                .filter(n -> Objects.equals(n, value))
                .count();
    }

    public static int convertPointForEachDiceScenario(List<Integer> diceThrowResult) {
        int result = 0;

        for (int dice : diceThrowResult) {
            long occurrences = countNumberOccurence(diceThrowResult, dice);

            if (occurrences == 5) {
                result = YAMS_POINT;
                return result;
            } else if (occurrences == 4) {
                result = CARRE_POINT;
                return result;
            } else if (occurrences == 3) {
                result = BRELAN_POINT;
                return result;
            }
        }

        return result;
    }

}
