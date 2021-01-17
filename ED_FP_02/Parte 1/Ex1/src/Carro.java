
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Carro {
    private String name;

    /**
     *
     * @param name
     */
    public Carro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String toString(){
        String text;
        if (name != null ) {
            text = "Nome : " + this.name;
        } else {
            text = "Carro sem Nome!";
        }
        return text;
    }
}
