package com.weaver.taskservice.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weaver.taskservice.model.converter.TaskConverter;
import com.weaver.taskservice.model.enitity.Task;
import com.weaver.taskservice.model.request.NewTask;
import com.weaver.taskservice.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepo;

	public Task createTask(NewTask newTask) {
		Task task = TaskConverter.newTaskToTask(newTask);
		
//		UUID.randomUUID().toString()
		
		task.setId(UUID.randomUUID().toString());
		task.setCreatedBy("id_jas");
		task.setAssignedBy("id_jas");
		task.setAssignedTo(newTask.getAssignedTo());
		task.setInitiallyDueAt(newTask.getInitiallyDueAt());
		task.setMaxDueAt(newTask.getMaxDueAt());
		task.setCurrentlyDueAt(newTask.getInitiallyDueAt());
		task.setCompletedAt(0);
		task.setCreatedAt(new Date().getTime());
		task.setUpdatedAt(new Date().getTime());

		return taskRepo.save(task);
	}

	public List<Task> getAll() {
		return taskRepo.findAll();
	}

	public Optional<Task> getTask(String id) {
		return taskRepo.findById(id);
	}

	public void deleteTask(String id) {
		taskRepo.deleteById(id);
	}
}
