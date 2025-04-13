package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.metierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        /* injection des dependances par instanciation statique => new */
        DaoImpl d = new DaoImpl();
        metierImpl metier=new metierImpl(d);//injection via constructeur
        /*metier.setDao(d);*///injextion via le setter
        System.out.println(metier.calcul());



    }
}
