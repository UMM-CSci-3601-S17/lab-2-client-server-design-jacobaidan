package umm3601.ToDo;

import com.google.gson.Gson;
import umm3601.user.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class ToDoController {

    private ToDo[] todos;

    public ToDoController() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/main/data/todos.json");
        todos = gson.fromJson(reader, ToDo[].class);
    }

    // List ToDos
    public ToDo[] listToDos(Map<String, String[]> queryParams) {
        ToDo[] filteredToDos = todos;

        // Filter limit if defined
        if(queryParams.containsKey("limit")) {
            // Get the value of the query
            int limit = Integer.parseInt(queryParams.get("limit")[0]);
            filteredToDos = limitToDos(filteredToDos, limit);
        }

        // Filter status if defined
        if(queryParams.containsKey("status")) {
            // Get the string value - complete or incomplete
            String status = queryParams.get("status")[0];
            filteredToDos = filterToDosByStatus(filteredToDos, status);
        }

        // Filter contains if defined
        if(queryParams.containsKey("contains")) {
            String contains = queryParams.get("contains")[0];
            filteredToDos = filterToDosByContains(filteredToDos, contains);
        }

        // Filter owner if defined
        if(queryParams.containsKey("owner")) {
            String owner = queryParams.get("owner")[0];
            filteredToDos = filterToDosByOwner(filteredToDos, owner);
        }

        // Filter category if defined
        if(queryParams.containsKey("category")) {
            String category = queryParams.get("category")[0];
            filteredToDos = filterToDosByCategory(filteredToDos, category);
        }

        return filteredToDos;
    }

    // Get a single id's todos
    public ToDo getTodo(String id) {
        return Arrays.stream(todos).filter(x -> x._id.equals(id)).findFirst().orElse(null);
    }

    public ToDo[] limitToDos(ToDo[] filteredToDos, int limit) {
        if (filteredToDos.length >= limit) return Arrays.copyOf(filteredToDos, limit);
        return filteredToDos;
    }

    public ToDo[] filterToDosByStatus(ToDo[] filteredTodos, String status) {
        boolean Status = status.equals("complete") ? true : false;
        return Arrays.stream(filteredTodos).filter(x -> x.status == Status).toArray(ToDo[]::new);
    }

    public ToDo[] filterToDosByContains(ToDo[] filteredToDos, String contain) {
        return Arrays.stream(filteredToDos).filter(x -> x.body.contains(contain)).toArray(ToDo[]::new);
    }

    public ToDo[] filterToDosByOwner(ToDo[] filteredToDos, String owner) {
        return Arrays.stream(filteredToDos).filter(x -> x.owner.equals(owner)).toArray(ToDo[]::new);
    }

    public ToDo[] filterToDosByCategory(ToDo[] filteredToDos, String category) {
        return Arrays.stream(filteredToDos).filter(x -> x.category.equals(category)).toArray(ToDo[]::new);
    }
}