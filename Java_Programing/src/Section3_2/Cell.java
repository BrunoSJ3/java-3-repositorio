package Section3_2;

public class Cell

{
    // properties
    private String data;

    // constructors

    // getters and setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    // behaviors

    @Override
    public String toString() {
        return "Data:" + data;
    }

}
