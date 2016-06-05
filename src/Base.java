/**
 * Created by Victor on 5/6/16.
 */

/*
    Este será  nuestro primer decorador para la clase Hamburguesa. Esta clase heredará de la clase HamburguesaDecorator. En el constructor
    de la clase se recibe como parámetro un obj de tipo Hamburguesa al que apuntaremos con el obj de tipo Hamburguesa que heredamos de la
    clase HamburguesaDecorator. De esta manera podremos pasarle a esta clase Base otro decorador más.
 */
public class Base extends HamburguesaDecorator {
    public static final double BASE_PRICE = 5;
    public static final String BASE_DESCRIPTION = "Hamburguesa base 300g de terna, ensalada, salsas";

    public Base() {

    }

    public Base(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public String description() {
        return BASE_DESCRIPTION;
    }
}
