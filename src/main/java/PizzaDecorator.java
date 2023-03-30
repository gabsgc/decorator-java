public abstract class PizzaDecorator implements Pizza {
    private Pizza pizza;
    public String ingrediente;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract float getPrecoUnitario();

    @Override
    public float getPreco() {
        return this.pizza.getPreco() + this.getPrecoUnitario();
    }

    public abstract String getNomeIngrediente();
    @Override
    public String getIngrediente() {
        return this.pizza.getIngrediente() + " / " + this.getNomeIngrediente();
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
