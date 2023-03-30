public class Mussarela extends PizzaDecorator {

    public Mussarela(Pizza pizza) {
        super(pizza);
    }

    @Override
    public float getPrecoUnitario() {
        return 3.00f;
    }

    @Override
    public String getNomeIngrediente() {
        return "Mussarela";
    }
}
