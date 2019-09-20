package com.telixia.springboot.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telixia.springboot.todomanagement.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
