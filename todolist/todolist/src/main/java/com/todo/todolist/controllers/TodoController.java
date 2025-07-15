package com.todo.todolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todolist.models.ToDo;
import com.todo.todolist.services.ToDoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	@Autowired
	private ToDoService toDoService;
	@PostMapping
	public ResponseEntity<ToDo> createToDo(@RequestBody ToDo toDos){
		ToDo saved = toDoService.add(toDos);
		return ResponseEntity.ok(saved);
	}
	@GetMapping
	public ResponseEntity<List<ToDo>> getAllTodos(){
		return ResponseEntity.ok(toDoService.getAll());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ToDo> updateToDo(@PathVariable Long id, @RequestBody ToDo toDo){
		ToDo updatedToDo = toDoService.update(id, toDo);
		return ResponseEntity.ok(updatedToDo);
	}
	@DeleteMapping("/{id}")
	public void deleteToDo(@PathVariable Long id){
		toDoService.delete(id);
	}
	
}
