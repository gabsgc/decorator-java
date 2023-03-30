import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarPrecoPizza() {
        Pizza pizza = new PizzaTradicional(35.00f);
        assertEquals(35.00f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaCalabresa() {
        Pizza pizza = new Calabresa(new PizzaTradicional(35.00f));
        assertEquals(37.50f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaMussarela() {
        Pizza pizza = new Mussarela(new PizzaTradicional(35.00f));
        assertEquals(38.00f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaPresunto() {
        Pizza pizza = new Presunto(new PizzaTradicional(35.00f));
        assertEquals(39.00f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaCalabresaMaisMussarela() {
        Pizza pizza = new Calabresa(new Mussarela(new PizzaTradicional(35.00f)));
        assertEquals(40.50f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaCalabresaMaisPresunto() {
        Pizza pizza = new Calabresa(new Presunto(new PizzaTradicional(35.00f)));
        assertEquals(41.50f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaMussarelaMaisPresunto() {
        Pizza pizza = new Mussarela(new Presunto(new PizzaTradicional(35.00f)));
        assertEquals(42.00f, pizza.getPreco());
    }

    @Test
    void deveRetornarPrecoPizzaMussarelaMaisPresuntoMaisCalabresa() {
        Pizza pizza = new Mussarela(new Presunto(new Calabresa(new PizzaTradicional(35.00f))));
        assertEquals(44.50f, pizza.getPreco());
    }

    @Test
    void deveRetornarIngredientePizza() {
        Pizza pizza = new PizzaTradicional(35.00f);
        assertEquals("Tradicional", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaCalabresa() {
        Pizza pizza = new Calabresa(new PizzaTradicional(35.00f));
        assertEquals("Tradicional / Calabresa", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaMussarela() {
        Pizza pizza = new Mussarela(new PizzaTradicional(35.00f));
        assertEquals("Tradicional / Mussarela", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaPresunto() {
        Pizza pizza = new Presunto(new PizzaTradicional(35.00f));
        assertEquals("Tradicional / Presunto", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaCalabresaMaisMussarela() {
        Pizza pizza = new Calabresa(new Mussarela(new PizzaTradicional(35.00f)));
        assertEquals("Tradicional / Mussarela / Calabresa", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaCalabresaMaisPresunto() {
        Pizza pizza = new Calabresa(new Presunto(new PizzaTradicional(35.00f)));
        assertEquals("Tradicional / Presunto / Calabresa", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaMussarelaMaisPresunto() {
        Pizza pizza = new Mussarela(new Presunto(new PizzaTradicional(35.00f)));
        assertEquals("Tradicional / Presunto / Mussarela", pizza.getIngrediente());
    }

    @Test
    void deveRetornarIngredientePizzaMussarelaMaisPresuntoMaisCalabresa() {
        Pizza pizza = new Mussarela(new Presunto(new Calabresa(new PizzaTradicional(35.00f))));
        assertEquals("Tradicional / Calabresa / Presunto / Mussarela", pizza.getIngrediente());
    }
}