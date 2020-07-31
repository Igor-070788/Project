package less4.perechisleniyz;

import java.awt.*;

public class less_enum {

    public static void main (String [] args) {
/*        dogs dog = dogs.pit;
        System.out.println(dog.toString());
        System.out.println(dog.getTranslation());
    }
    */
        dogs dog = dogs.pit;
        dogs dober = dogs.dober;
        System.out.println(dog.getWeight());
        System.out.println(dog.name());
        System.out.println(dober.ordinal());
    }
/*        dogs dog = dogs.pit;

        switch (dog){
            case pit:
                System.out.println("Это пит!");
                break;
            case corgi:
                System.out.println("Это корги!");
                break;
        }

    }
*/

}
