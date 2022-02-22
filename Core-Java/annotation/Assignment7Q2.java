package annotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

 
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@interface info{
	int id();
	String author() default "Sumit";
	String supervisor()default "Sanket";
	String date();
	String time();
	int version();
	String description()default"adding some important information ";
}
@info(id =1,date="24/12/2021",version=2, time = "6:30 pm")
class Information{
	
	public void start(int a) {
		System.out.println("Enter the id "+ a);
	}
}
public class Assignment7Q2 {

	public static void main(String[] args) {
Information a =new Information();
 Class c = a.getClass();
 Annotation an= (Annotation) c.getAnnotation(info.class);
 info s =(info)an;
 System.out.println("Author : "+s.author()+"\n"+"Id : "+s.id()+"\n"+"Supervisor : "+s.supervisor()+"\n"+"date : "+s.date()+"\n"+"Time : "+s.time()+"\n"+"Version : "+s.version()+"\n"+"Description : "+s.description());
	}

}
