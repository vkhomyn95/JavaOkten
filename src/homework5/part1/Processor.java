package homework5.part1;

import java.util.Objects;

public class Processor {
    private String type;
    private int cores;
    private double qHer;
    private Country country;

    public Processor() {
    }

    public Processor(String type, int cores, double qHer, Country country) {
        this.type = type;
        this.cores = cores;
        this.qHer = qHer;
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getqHer() {
        return qHer;
    }

    public void setqHer(double qHer) {
        this.qHer = qHer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", cores=" + cores +
                ", qHer=" + qHer +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return cores == processor.cores &&
                Double.compare(processor.qHer, qHer) == 0 &&
                Objects.equals(type, processor.type) &&
                country == processor.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cores, qHer, country);
    }
}
