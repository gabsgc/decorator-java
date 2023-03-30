public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }
    @Override
    public float getPrecoUnitario() {
        return 2.50f;
    }
    @Override
    public String getNomeIngrediente() {
        return "Calabresa";
    }
}
