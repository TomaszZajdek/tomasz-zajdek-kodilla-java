package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void TestBigmacBuilder () {

        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.Bun.WITH_SESAME)
                .sauce(Bigmac.Sauce.BARBECUE)
                .burgers(2)
                .ingredient(Bigmac.Ingredient.CHEESE)
                .ingredient(Bigmac.Ingredient.CHILI_PEPPERS)
                .build();

        //when
        int burgersNum = bigmac.getBurgers();
        int ingredientsNum = bigmac.getIngredients().size();

        //then
        assertEquals(burgersNum, 2);
        assertEquals(ingredientsNum, 2);

    }
}
