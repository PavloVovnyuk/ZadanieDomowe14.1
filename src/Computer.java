import java.lang.reflect.Array;

public class Computer implements Comparable<Computer> {
    private String name;
    private double procSpeed;
    private double memoryCapacity;

    public Computer(String name, double procSpeed, double memoryCapacity) {
        this.name = name;
        this.procSpeed = procSpeed;
        this.memoryCapacity = memoryCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(double procSpeed) {
        this.procSpeed = procSpeed;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                " procSpeed=" + procSpeed +
                " memoryCapacity=" + memoryCapacity +
                "\n";
    }

    @Override
    public int compareTo(Computer o) {
        if (this.procSpeed > o.procSpeed)
            return 1;
        else if (this.procSpeed < o.procSpeed)
            return -1;
        else {
            if (this.memoryCapacity > o.memoryCapacity)
                return 1;
            else if (this.memoryCapacity < o.memoryCapacity)
                return -1;
            else {
                return this.name.compareTo (o.name);
            }
        }
    }
}
