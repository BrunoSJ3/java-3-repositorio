package Section2_3;

public class MountainBike extends Bicicle

{
    // Specified properties
    private String suspensionType;

    // constructors
    public MountainBike() {
    }

    public MountainBike(String code, String typeOfQuad, String typeOfWheel, int arch, int marchQuantity,
            double velocityMedian, String suspensionType)

    {
        super(code, typeOfQuad, typeOfWheel, arch, marchQuantity, velocityMedian);
        this.suspensionType = suspensionType;
    }

    public MountainBike(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    // behaviors

    // getters and setters
    public String getSuspensionType() {
        return suspensionType;
    }

    @Override
    public String toString() {
        return "MountainBike [suspensionType=" + suspensionType + ", getSuspensionType()=" + getSuspensionType()
                + ", toString()=" + super.toString() + "]";
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }
}
