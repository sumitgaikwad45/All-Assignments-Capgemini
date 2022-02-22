package streams;
import java.util.Arrays;
import java.util.List;

class Fruit { 
	String name;
	int calories;
    int price;
    String color;


public Fruit(String name, int calories, int price, String color) {
	super();
	this.name = name;
	this.calories = calories;
	this.price = price;
	this.color = color;
}
}
class News { int newsId; String postedByUser; String commentByUser; String
comment;
public News(int newsId, String postedByUser, String commentByUser, String comment) {
	super();
	this.newsId = newsId;
	this.postedByUser = postedByUser;
	this.commentByUser = commentByUser;
	this.comment = comment;
} }
class Trader { 
	String name; 
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
}
class Transaction { Trader trader; int year; int value;
public Transaction(Trader trader, int year, int value) {
	super();
	this.trader = trader;
	this.year = year;
	this.value = value;
} 
}
public class Assignment9Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> S=Arrays.asList(new Fruit("Apple", 90, 150, "red"),
				new Fruit("Mango",95,200,"yellow"),
				new Fruit("Cherry", 50, 90,"red"),
				new Fruit("Watermelon", 110, 40, "green"));
		S.stream().filter(p->p.calories>100).sorted().forEach(p->System.out.println(p.calories));

	}

}
