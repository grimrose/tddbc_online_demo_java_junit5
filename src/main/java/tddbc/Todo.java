package tddbc;

import java.util.Map;

import java.util.HashMap;

public class Todo {
    private Map<String, Object> todos;

    public Todo() {
        this.todos = new HashMap<String, Object>();
    }

    public Map<String, Object> getTodos() {
        return this.todos;
    }

    public void setTodos(Map<String, Object> todos) {
        this.todos = todos;
    }

}
