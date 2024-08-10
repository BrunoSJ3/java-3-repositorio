package Main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // não mude a ordem entre esses dois...
@Target(ElementType.METHOD) // não mude a ordem entre esses dois...

public @interface Anotation1

{
    String value();
}
