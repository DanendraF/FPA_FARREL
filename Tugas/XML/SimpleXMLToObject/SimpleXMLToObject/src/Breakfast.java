import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.*;

@XStreamAlias("breakfast")
public class Breakfast {
    
    @XStreamImplicit
    private ArrayList<Food> myFood = new ArrayList<>();

    public ArrayList<Food> getBreakfast() {
        return myFood;
    }

    public void setBreakfast(ArrayList<Food> myFood) {
        this.myFood = myFood;
    }
}



