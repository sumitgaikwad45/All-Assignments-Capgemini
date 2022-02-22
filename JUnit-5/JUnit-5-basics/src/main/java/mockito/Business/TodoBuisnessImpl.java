package mockito.Business;

import java.util.ArrayList;
import java.util.List;

import mockito.api.TodoService;

public class TodoBuisnessImpl {
     private TodoService todoService;

	public TodoBuisnessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>(); 
		List<String> todos = todoService.retrieveTodos(user);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
	
}
