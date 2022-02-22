package mockito.api;
//This is known as Stub(Doing dummy implementation)
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC","Learn Spring",
				"Learn to Dance") ;
	} 


}
