package springBasics;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//class Triangle implements ApplicationContextAware , BeanNameAware {
//class Triangle implements InitializingBean , DisposableBean  {
class Triangle implements Shape   {
	/*private String type;
	private int Height;
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type , int Height ) {
		this.type = type;
		this.Height = Height;
	}
	
	

	public int getHeight() {
		return Height;
	}

	public String getType() {
		return type;
	}

	//public void setType(String type) {
	//	this.type = type;
	//}

	public void draw() {
		System.out.println(getType() + " Triangle Drawn of Height " + getHeight());
	}
	
	
	
	
	
	
	//**************************************Injection Objects************************
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("PointA = (" + getPointA().getX() +", " + getPointA().getY() + ")" );
		System.out.println("PointB = (" + getPointB().getX() +", " + getPointB().getY() + ")" );
		System.out.println("PointC = (" + getPointC().getX() +", " + getPointC().getY() + ")" );

	}
	
	
	
	
	
	
	//***********************************Spring Framework********************************
	private List<Point> points;
    
	
	
	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw() {
		for(Point point : points) {
			System.out.println("Point = (" + point.getX() +", " + point.getY() + ")" );

		}
		 
	}*/
	
	
	
	
	
	
	
	
	//*************************************Bean Autowiring*********************************
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null; 
	
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	//if name of member variable  is same as that of beans then we can use beansWire="byName"
	//if there is only one member variable  of point and only one bean then we can use beanWiring="byType"
	//if there is a constructor instead of getter Setter then we can beanWire ="constructor"
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("PointA = (" + getPointA().getX() +", " + getPointA().getY() + ")" );
		System.out.println("PointB = (" + getPointB().getX() +", " + getPointB().getY() + ")" );
		System.out.println("PointC = (" + getPointC().getX() +", " + getPointC().getY() + ")" );

	}
	
	
	
	
	
	//***************Using ApplicationContextAware**************************
	/*public void setApplicationContext(ApplicationContext applicationContext) 
			throws BeansException {
     this.context = context;		
	}
	public void setBeanName(String beanName) {
		System.out.println("Bean name is : " + beanName );
	}*/
	
	
	
	
	/*
	// Below methods are called using interfaces
	//below method is called when bean of triangle is initialized using InitilizeBean Interface
	public void afterPropertiesSet() throws Exception {
          System.out.println("Initializing Beans init method called for Triangle");		
	}
	//below method is called when bean of triangle is Disposed using DisposableBean Interface

	public void destroy() throws Exception {
        System.out.println("Disposable Beans destroy method called for Triangle");		
   
	}
	*/
	
	
	// if you dont want to implement any interface but you want to initialize any method then 
	public void myInit() {
		System.out.println("My init method called for triangle without using interfaces");
	}
	
	
	public void cleanUp() {
		System.out.println("My cleanUp method called for triangle without using interfaces");
	}
	
	
}

public class DrawingApplication {

	public static void main(String[] args) {
           //Triangle triangle = new Triangle();
          // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		 Shape shape = (Shape)context.getBean("circle");
		    shape.draw();
	}

}
