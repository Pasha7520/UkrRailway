package Entity;

public class Wagon {
    private int id;
    private Place[] places;
    private WagonType wagonType;

    public Wagon(int id, Place[] places, WagonType wagonType) {
        this.id = id;
        this.places = places;
        this.wagonType = wagonType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Place[] getPlaces() {
        return places;
    }

    public void setPlaces(Place[] places) {
        this.places = places;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    public void setWagonType(WagonType wagonType) {
        this.wagonType = wagonType;
    }
}
