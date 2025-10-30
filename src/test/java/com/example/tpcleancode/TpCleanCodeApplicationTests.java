package com.example.tpcleancode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TpCleanCodeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldConvertDiceScenarioToPoint() {
        int dice1 = 1, dice2 = 1, dice3 = 1, dice4 = 2, dice5=2;
        assertEquals(28,Service.convertDiceScenarioToPoint(dice1, dice2, dice3, dice4, dice5));

    }
}
