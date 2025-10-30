package com.example.tpcleancode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TpCleanCodeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldConvertDiceScenarioToPoint() {
        List<Integer> diceThrowYams = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> diceThrowYamsCarre = Arrays.asList(1,1,1,1,2);
        List<Integer> diceThrowYamsBrelan = Arrays.asList(1,1,1,5,2);

        List<List<Integer>>  diceThrowResults = new ArrayList<>();
        diceThrowResults.add(diceThrowYams);
        diceThrowResults.add(diceThrowYamsCarre);
        diceThrowResults.add(diceThrowYamsBrelan);

        assertEquals(50, Service.convertPointForEachDiceScenario(diceThrowYams));
        assertEquals(35, Service.convertPointForEachDiceScenario(diceThrowYamsCarre));
        assertEquals(28, Service.convertPointForEachDiceScenario(diceThrowYamsBrelan));

        assertEquals(113, Service.getSumAllDiceThrows(diceThrowResults));

    }
}
