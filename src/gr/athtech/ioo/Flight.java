package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;

    //setters
    public void setArAirport(String arAirport) {this.arAirport=arAirport;}
    public void setDepAirport(String depAirport) {this.depAirport=depAirport;}

    //getters
    public String getArAirport() {return arAirport;}
    public String getDepAirport() {return depAirport;}

    //getstring
    public String toString() {
        return "Flight- From: " + arAirport + ", To: " + depAirport;
    }

}
