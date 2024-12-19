import java.util.Objects;

public class Processor {
    int frequency;
    int cores;
    String manufacturer;

    public Processor(int frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return frequency == processor.frequency && cores == processor.cores && Objects.equals(manufacturer, processor.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, cores, manufacturer);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
