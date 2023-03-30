public class PizzaTradicional implements Pizza {
    public float preco;

    public PizzaTradicional() {
    }

    public PizzaTradicional(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getIngrediente() {
        return "Tradicional";
    }
}
