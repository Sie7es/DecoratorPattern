/**
 * Created by Victor on 5/6/16.
 */
public class Queso extends HamburguesaDecorator{
    public static final double QUESO_PRICE = 0.60;

    public Queso() {

    }

    public Queso (Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public double price() {
        return hamburguesa.price() + QUESO_PRICE;
    }

    @Override
    public String description() {
        return hamburguesa.description() + " con queso";
    }
}
