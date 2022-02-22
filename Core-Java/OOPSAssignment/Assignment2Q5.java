package OOPSAssignment;
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	String r = "Draw Rectangle";
    	return r;
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	String l = "Draw line";
    	return l;
    	
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	String c = "Draw Cube";
    	return c;
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		
    Cube5 C = new Cube5();
    Rectangle5 R = new Rectangle5();
    Line5 L = new Line5();
    String A = C.draw();
   String B = R.draw();
    String Z = L.draw();
    System.out.println(A);
    System.out.println(B);
    System.out.println(Z); 

	}

}
