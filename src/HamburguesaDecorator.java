/**
 * Created by Victor on 5/6/16.
 */

/*
    Esta clase será nuestro decorador. Esta clase deberá ser extendida por todos los objetos que quieran decorar al obj. Hamburguesa.
    Decorar no es otra cosa que dar más capacidades a esa clase. Haciéndolo de esta manera nos aseguramos cumplir uno de los principios
    SOLID. Open-Closed Principle o OCP por sus iniciales. Clases abiertas para su extensión pero cerradas para su modificación.
 */
public abstract class HamburguesaDecorator extends Hamburguesa {
    protected Hamburguesa hamburguesa;
}
