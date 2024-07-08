
public class Food {
    private String name, price, description;
    private int calories;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Food [ ");
        stringBuilder.append("\nname: ");
        stringBuilder.append(name);
        stringBuilder.append("\nprice: ");
        stringBuilder.append(price);
        stringBuilder.append("\ndescription: ");
        stringBuilder.append(description);
        stringBuilder.append("\ncalories: ");
        stringBuilder.append(calories);
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}


