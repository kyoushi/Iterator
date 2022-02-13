package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleJavaUtilIteratorLibrary {
    public static void main( String[] args )
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> iter
                = cars.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
