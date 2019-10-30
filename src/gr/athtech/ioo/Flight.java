package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;
    private Time arTime;
    private Time depTime;

    //setters
    public void setArAirport(String arAirport) {this.arAirport=arAirport;}
    public void setDepAirport(String depAirport) {this.depAirport=depAirport;}

    //getters
    public String getArAirport() {return arAirport;}
    public String getDepAirport() {return depAirport;}

    //getstring


    @Override
    public String toString() {
        return "Flight{" +
                "arAirport='" + arAirport + '\'' +
                ", depAirport='" + depAirport + '\'' +
                ", arTime=" + arTime +
                ", depTime=" + depTime +
                '}';
    }

    public Time getArTime() {
        return arTime;
    }

    public void setArTime(Time arTime) {
        this.arTime = arTime;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time depTime) {
        this.depTime = depTime;
    }
}
