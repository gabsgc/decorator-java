public class Presunto extends PizzaDecorator {
    public Presunto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getPrecoUnitario() {
        return 4.00f;
    }

    @Override
    public String getNomeIngrediente() {
        return "Presunto";
    }
}
