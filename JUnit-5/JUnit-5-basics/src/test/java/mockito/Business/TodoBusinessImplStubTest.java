package mockito.Business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import mockito.api.TodoService;
import mockito.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBuisnessImpl todoBusinessImpl = 
				new TodoBuisnessImpl(todoServiceStub);
	 List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	 assertEquals(2, filteredTodos.size()); 
	
	}

}
