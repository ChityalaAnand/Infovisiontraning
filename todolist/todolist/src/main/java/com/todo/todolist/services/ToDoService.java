package com.todo.todolist.services;
import java.util.*;
import com.todo.todolist.models.ToDo;
public interface ToDoService {
	public List<ToDo> getAll();
    public ToDo add(ToDo todo);
    public ToDo update(Long id, ToDo todo);
    public void delete(Long id);
}
