package com.weaver.taskservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaver.taskservice.model.enitity.Task;
import com.weaver.taskservice.model.request.NewTask;
import com.weaver.taskservice.model.response.DataResponse;
import com.weaver.taskservice.service.TaskService;

@RestController
@RequestMapping(path = "/tasks", consumes = "application/json", produces = "application/json")
public class TaskController {

	@Autowired
	private TaskService taskService;


	@GetMapping
	public List<Task> getAll() {
		return taskService.getAll();

	}

	@GetMapping("/{id}")
	public Optional<Task> getTask(@PathVariable("id") String id) {
		return taskService.getTask(id);

	}

	@PostMapping("/")
	public DataResponse<Task> createTask(@RequestBody NewTask newTask) {
		Task task = taskService.createTask(newTask);
		return new DataResponse<Task>(task);
	}

	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable String id) {
		taskService.deleteTask(id);
		return "==> Task deleted with id: " + id;
	}

}
