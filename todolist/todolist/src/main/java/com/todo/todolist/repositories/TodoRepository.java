package com.todo.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todo.todolist.models.ToDo;
public interface TodoRepository extends JpaRepository<ToDo, Long>{

}
