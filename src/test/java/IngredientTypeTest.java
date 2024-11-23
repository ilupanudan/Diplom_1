import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


public class TestIngredientType {
    public static final String SAUCE = "SAUCE";
    public static final String FILLING = "FILLING";

    @Test
    public void sauceTest(){
        System.out.println("In test: " + SAUCE);
        System.out.println("Const: " + IngredientType.SAUCE);
        assertEquals(SAUCE, IngredientType.SAUCE.toString());
    }

    @Test
    public void fillingTest(){
        System.out.println("In test: " + FILLING);
        System.out.println("Const: " + IngredientType.FILLING.toString());
        assertEquals(FILLING, IngredientType.FILLING.toString());
    }
}
