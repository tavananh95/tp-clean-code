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
        List<Integer> diceThrowResult = Arrays.asList(1, 1, 1, 2, 2);

        List<List<Integer>>  diceThrowResults = new ArrayList<>();
        diceThrowResults.add(diceThrowResult);

        assertEquals(28, Service.convertDiceScenarioToPoint(diceThrowResults));

    }
}
