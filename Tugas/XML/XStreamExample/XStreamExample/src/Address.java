public class Address {
    private String area;
    private String city;
    private String state;
    private String country;
    private int zipcode;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipkode() {
        return zipcode;
    }

    public void setZipkode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nAddress [ ");
        stringBuilder.append("\narea: ");
        stringBuilder.append(area);
        stringBuilder.append("\ncity: ");
        stringBuilder.append(city);
        stringBuilder.append("\nstate: ");
        stringBuilder.append(state);
        stringBuilder.append("\ncountry: ");
        stringBuilder.append(country);
        stringBuilder.append("\nzipcode: ");
        stringBuilder.append(zipcode);
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}
