package Entity;

import java.util.Date;

public class Flight {
    private Train train;
    private Date data;
    private FlyghtStation [] flyghtStation;
    private Ticket[] ticket;

    public Flight(Train train, Date data, FlyghtStation[] flyghtStation) {
        this.train = train;
        this.data = data;
        this.flyghtStation = flyghtStation;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public FlyghtStation[] getFlyghtStation() {
        return flyghtStation;
    }

    public void setFlyghtStation(FlyghtStation[] flyghtStation) {
        this.flyghtStation = flyghtStation;
    }

    public Ticket[] getTicket() {
        return ticket;
    }

    public void setTicket(Ticket[] ticket) {
        this.ticket = ticket;
    }
}
