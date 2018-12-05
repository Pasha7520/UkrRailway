package Entity;

import java.util.Date;

public class FlyghtStation {

    private Station station;
    private Date arrival;
    private Date departure;

    public FlyghtStation(Station station, Date arrival, Date departure) {
        this.station = station;
        this.arrival = arrival;
        this.departure = departure;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
