package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface SmartPhone {
	String os() default "Symbian"; // default value will be stored
	int version() default 1;
}