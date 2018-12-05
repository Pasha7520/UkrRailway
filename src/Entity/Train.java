package Entity;

public class Train {
    private int id;
    private Wagon[] wagons;
    private TrainType trainType;

    public Train(int id, Wagon[] wagons, TrainType trainType) {
        this.id = id;
        this.wagons = wagons;
        this.trainType = trainType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wagon[] getWagons() {
        return wagons;
    }

    public void setWagons(Wagon[] wagons) {
        this.wagons = wagons;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }
}
