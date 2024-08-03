package Main;

public class GenericClass2<Type1, Type2>

{
    // properties
    private Type1 password;
    private Type2 description;

    // constructors
    public GenericClass2() {
    }

    public GenericClass2(Type1 password, Type2 description) {
        this.password = password;
        this.description = description;
    }

    // Behaviors

    // getters and setters
    public Type1 getPassword() {
        return password;
    }

    public void setPassword(Type1 password) {
        this.password = password;
    }

    public Type2 getDescription() {
        return description;
    }

    public void setDescription(Type2 description) {
        this.description = description;
    }
}
