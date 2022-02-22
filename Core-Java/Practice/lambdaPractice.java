package Practice;

public class lambdaPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Thread myThread = new Thread(new Runnable() {
    	@Override
		public void run() {
		System.out.println("Printed inside Runnable");
		}
	});
      myThread.run();
     // using lambda 
      Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
	myLambdaThread.run();

}
}