package gr.athtech.ioo;

public class Main {

	public static void main(String[] args) {
		Flight f1 = new Flight();
		f1.setDepAirport("DME");
		Time t1 = new Time();
		t1.setTime(10,20,35);
		t1.displayTime();
		f1.setDepTime(t1);
		f1.setArAirport("ATH");
		Time t2 = new Time();
		t2.setTime(20,30,12);
		t2.displayTime();
		f1.setDepTime(t2);
		System.out.println("From: " + f1.getArAirport());
		System.out.println("To: " + f1.getDepAirport());
		System.out.println(f1);
	}
}