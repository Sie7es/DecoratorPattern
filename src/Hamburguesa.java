/**
 * Created by Victor on 5/6/16.
 */

/*
    Creamos una clase abstracta para obligar a implementar nuestros métodos abstractos en todos los objs que hereden de ella.
    Aunque en este ejemplo todos los métodos son abstractos no se puede crear como interfaz, porque en nuestro decorador necesitamos
    extenderla y no implementarla.
 */
public abstract class Hamburguesa {

    public abstract double price ();

    public abstract String description();

}
