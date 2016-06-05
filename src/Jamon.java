/**
 * Created by Victor on 5/6/16.
 */
public class Jamon extends HamburguesaDecorator {
    public static final double JAMON_PRICE = 0.60;

    public Jamon() {

    }

    public Jamon (Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public double price() {
        return hamburguesa.price() + JAMON_PRICE;
    }

    @Override
    public String description() {
        return hamburguesa.description() + " con Jamón";
    }
}
