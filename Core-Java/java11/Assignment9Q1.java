package java11;
interface Interest{
	public int cal(int p, int r, int t);
}

public class Assignment9Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Interest Simple = (var a, var b, var c)-> (a*b*c)/100;
       System.out.println("Simple intrest is "+ Simple.cal(1000, 5, 5));
	}

}
