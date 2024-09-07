package Section2_3;

public class RoadBike extends Bicicle

{
    // propiedades específicas
    private String pedalType;

    // constructors
    public RoadBike() {
    }

    public RoadBike(String pedalType) {
        this.pedalType = pedalType;
    }

    public RoadBike(String code, String typeOfQuad, String typeOfWheel, int arch, int marchQuantity,
            double velocityMedian, String pedalType)

    {
        super(code, typeOfQuad, typeOfWheel, arch, marchQuantity, velocityMedian);
        this.pedalType = pedalType;
    }

    // behaviors

    // Getters and setters
    public String getPedalType() {
        return pedalType;
    }

    @Override
    public String toString() {
        return "RoadBike [pedalType=" + pedalType + ", toString()=" + super.toString() + "]";
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }
}
