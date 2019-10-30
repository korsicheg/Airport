package gr.athtech.ioo;

public class Main {

    public static void main(String[] args) {
	Flight f1 = new Flight();
	f1.setArAirport("ATH");
	f1.setDepAirport("DME");
	System.out.println(f1.getArAirport());
	System.out.println(f1.getDepAirport());
	System.out.println(f1);
    }
}
