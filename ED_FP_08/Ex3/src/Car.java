
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Car implements Comparable {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        try {
            Car tmp = (Car) o;
            if (this.year < tmp.year) {
                return -1;
            } else if (this.year > tmp.year) {
                return 1;
            }
            return 0;
        } catch (Exception e) {
            throw new ClassCastException();
        }
    }

    @Override
    public String toString(){
        String text = "";

        text += "Brand: " + this.brand + "- Year: " + this.year;

        return text;
    }

}
