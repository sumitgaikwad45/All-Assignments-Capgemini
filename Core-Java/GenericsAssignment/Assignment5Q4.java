package GenericsAssignment;

class pair<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	
}

public class Assignment5Q4 {
	public static void main(String[] args) {
		pair <String, String> s = new pair<>();
		pair <String, java.util.Date> g = new pair<>();

		s.setKey("1");
		s.setValue("Hello");
		g.setKey("Today is");
		g.setValue(new java.util.Date());

		System.out.println(s.getKey()+" "+ s.getValue());
		System.out.println(g.getKey()+" "+ g.getValue());

	}

}
