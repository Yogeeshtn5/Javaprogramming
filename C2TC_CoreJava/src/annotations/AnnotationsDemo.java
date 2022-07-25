package annotations;

import java.lang.annotation.Annotation;

@SmartPhone(version=6) //we have not added os type it had taken default value
class Nokia_Series
{
	String model;
	int screensize;
	public Nokia_Series(String model, int screensize) {
		this.model = model;
		this.screensize = screensize;
	}
	
}
public class AnnotationsDemo {

	public static void main(String[] args) {
		Nokia_Series obj=new Nokia_Series("fire", 4);
		System.out.println(obj.model);
		System.out.println(obj.screensize);
		Class c=obj.getClass();
		//System.out.println(c);
		//SmartPhone s=
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
	}

}