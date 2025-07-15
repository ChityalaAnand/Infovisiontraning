package com.todo.todolist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.todo.todolist.models.ToDo;
import com.todo.todolist.repositories.TodoRepository;

import userExceptions.TodoNotFoundException;
@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    private TodoRepository repository;

    @Override
    public List<ToDo> getAll() {
        return repository.findAll();
    }

    @Override
    public ToDo add(ToDo todo) {
        return repository.save(todo);
    }

    @Override
    public ToDo update(Long id, ToDo updatedTodo) {
        return repository.findById(id).map(todo -> {
            todo.setTitle(updatedTodo.getTitle());
            todo.setCompleted(updatedTodo.isCompleted());
            return repository.save(todo);
        }).orElseThrow(() -> new TodoNotFoundException("Todo not found with id " + id));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}