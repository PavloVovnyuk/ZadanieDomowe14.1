import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<> ();
        computers.add (new Computer ("accer", 6.2, 600));
        computers.add (new Computer ("HP", 4.4, 100));
        computers.add (new Computer ("HP", 4.4, 300));
        computers.add (new Computer ("Samsung", 2.3, 500));

        Collections.sort (computers);
        System.out.println (computers);


    }
}
