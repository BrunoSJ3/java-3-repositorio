package Main;

public class GenericClass1<Type>

{
    // properties
    private Type password;

    // constructors
    public GenericClass1() {
    }

    public GenericClass1(Type password) {
        this.password = password;
    }

    // Behaviors

    // getters and setters
    public Type getPassword() {
        return password;
    }

    public void setPassword(Type password) {
        this.password = password;
    }
}
