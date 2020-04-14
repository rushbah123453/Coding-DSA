package interviewPrep.java.ComparableVsComparator;

public class Laptop implements Comparable<Laptop> {
    private String name;
    private int ram;
    private long price;


    public Laptop(String name, int ram, long price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        return (this.name).compareTo(o.name)>0?1:-1;
    }
}
