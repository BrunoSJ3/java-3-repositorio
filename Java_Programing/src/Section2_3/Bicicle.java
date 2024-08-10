package Section2_3;

public abstract class Bicicle

{
    // properties
    private String code, typeOfQuad, typeOfWheel;
    private int arch, marchQuantity;
    private double velocityMedian;

    // constructors
    public Bicicle() {
    }

    public Bicicle(String code, String typeOfQuad, String typeOfWheel, int arch, int marchQuantity,
            double velocityMedian) {
        this.code = code;
        this.typeOfQuad = typeOfQuad;
        this.typeOfWheel = typeOfWheel;
        this.arch = arch;
        this.marchQuantity = marchQuantity;
        this.velocityMedian = velocityMedian;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeOfQuad() {
        return typeOfQuad;
    }

    public void setTypeOfQuad(String typeOfQuad) {
        this.typeOfQuad = typeOfQuad;
    }

    public String getTypeOfWheel() {
        return typeOfWheel;
    }

    public void setTypeOfWheel(String typeOfWheel) {
        this.typeOfWheel = typeOfWheel;
    }

    public int getArch() {
        return arch;
    }

    public void setArch(int arch) {
        this.arch = arch;
    }

    public int getMarchQuantity() {
        return marchQuantity;
    }

    public void setMarchQuantity(int marchQuantity) {
        this.marchQuantity = marchQuantity;
    }

    public double getVelocityMedian() {
        return velocityMedian;
    }

    public void setVelocityMedian(double velocityMedian) {
        this.velocityMedian = velocityMedian;
    }

    @Override
    public String toString() {
        return "Bicicle code = " + code + ", typeOfQuad = " + typeOfQuad + ", typeOfWheel = " + typeOfWheel
                + ", arch = "
                + arch + ", marchQuantity = " + marchQuantity + ", velocityMedian = " + velocityMedian;
    }

    // behaviors

    // getters and setters

}
