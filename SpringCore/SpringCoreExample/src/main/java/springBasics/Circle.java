package springBasics;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
     private Point centre;
     
	public Point getCentre() {
		return centre;
	}
    @Required
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public void draw() {
		System.out.println("Drawing Circle");

		 System.out.println("Circle Point is: (" + centre.getX()  + ", " + centre.getY()+")");
	}

}
