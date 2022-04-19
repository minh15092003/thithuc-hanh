package Exercise2;

public class Test_Flight {
    public static void main(String[] args) {
        Flight F1 = new Flight();
        Flight F2 = new Flight(113, "Ha Noi");

        // Test getDestination()
        System.out.println("Destination is: " + F1.getDestination());
        System.out.println("Destination is: " + F2.getDestination());
        // Test getNumber()
        System.out.println("Number is: " + F1.getNumber());
        System.out.println("Number is: " + F2.getNumber());

        // Test display()
        F1.display();
        F2.display();
    }
}
