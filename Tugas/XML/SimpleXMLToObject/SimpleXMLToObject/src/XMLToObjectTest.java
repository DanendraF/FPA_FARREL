import java.io.FileReader;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.*;

public class XMLToObjectTest {
    public static void main(String[] args) throws FileNotFoundException {
        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.processAnnotations(Breakfast.class);
        xstream.alias("food", Food.class);

        FileReader reader = new FileReader("breakfast.xml");
        Breakfast myData = (Breakfast) xstream.fromXML(reader);

        for(int i = 0; i < myData.getBreakfast().size(); i++){
            Food food = myData.getBreakfast().get(i);
            System.out.println("=============");
            System.out.println("Food Number "+(i+1));
            System.out.println("Name: "+food.getName());
            System.out.println("Price: "+food.getPrice());
            System.out.println("Description: "+food.getDescription());
            System.out.println("Calories: "+food.getCalories());
            System.out.println();
        }
    }
}
