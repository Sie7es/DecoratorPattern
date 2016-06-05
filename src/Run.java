/**
 * Created by Victor on 5/6/16.
 */
public class Run {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Base(); //Creamos nuestra primera hamburguesa. En este caso una hamburgeusa base.

        System.out.println(hamburguesa.description() + " cuesta " + hamburguesa.price()); //Mensaje por pantalla del tipo de hamburguesa y su precio.

        /*
        //A la hamburguesa original (Base) le agregamos Jamón. Es decir la decoramos con el obj jamón.
          Para ellos creamos un obj de tipo Jamón y le pasamos el obj hamburguesa que queremos decorar.
          De esta manera la hamburguesa base ahora tendrá además de sus propiedades iniciales las del decorador
         */
        hamburguesa = new Jamon(hamburguesa);

        System.out.println(hamburguesa.description() + " cuesta " + hamburguesa.price()); //Mensaje por pantalla del tipo de hamburguesa y su precio.

        /*
        Decoramos ahora a nuestra hamburguesa previamente decorada con jamón ahora con queso.
         */
        hamburguesa = new Queso(hamburguesa);

        System.out.println(hamburguesa.description() + " cuesta " + hamburguesa.price()); //Mensaje por pantalla del tipo de hamburguesa y su precio.

    }
}
