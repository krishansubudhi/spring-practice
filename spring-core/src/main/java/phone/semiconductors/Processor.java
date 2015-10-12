package phone.semiconductors;

/**
 * Created by krishan on 8/13/15.
 */
public class Processor {
    String brand;
    String model;
    Float gigaHz;
    int cores;

    public Processor(String brand, String model, Float gigaHz, int cores) {
        this.brand = brand;
        this.model = model;
        this.gigaHz = gigaHz;
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", gigaHz=" + gigaHz +
                ", cores=" + cores +
                '}';
    }
}
