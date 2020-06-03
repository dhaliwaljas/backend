package com.weaver.taskservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaver.taskservice.models.Task;
import com.weaver.taskservice.repository.TaskRepository;

@RestController
@RequestMapping("/rest/tasks")
public class TaskController {
	
//	@Autowired
	private TaskRepository taskRepo;
	
	public TaskController(TaskRepository taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	@GetMapping("/all")
	public List<Task> getAll() {
		return taskRepo.findAll();
	}
}
