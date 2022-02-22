package OOPSAssignment;
abstract class Persistence {
	abstract public String persist();
}

class FilePersistence extends Persistence {
	@Override
	public String persist() {
		String a = "file";
		return a;
	}
}
class DatabasePersistence extends Persistence {
	@Override
	public String persist() {
		String b = "dataPersist";
		return b;
	}
}

class client {
	Persistence p1 = new FilePersistence();
	String f = p1.persist();
	Persistence p2=new DatabasePersistence();
String g=p2.persist();
}

public class Assignment2Q6 {

	public static void main(String[] args) {
		client cc=new client();
		
		System.out.println(cc.g);
	}

}
