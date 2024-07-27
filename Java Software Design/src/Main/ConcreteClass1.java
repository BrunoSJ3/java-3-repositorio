package Main;

public class ConcreteClass1 {
    // Properties
    // private int password = 1234;
    private int password;

    // constructors -> caracteristcs
    public ConcreteClass1() {
        password = 1234;
    }

    public ConcreteClass1(int password) {
        this.password = password;
        password = getPassword();
    }

    // behaviors
    public int getPassword() {
        return password;
    }

    public void setPassword(int entrada) {
        password = entrada;
    }
}
