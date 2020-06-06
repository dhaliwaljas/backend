package com.weaver.taskservice.model.converter;

import com.weaver.taskservice.model.enitity.Task;
import com.weaver.taskservice.model.request.NewTask;

public class TaskConverter {

	public static Task newTaskToTask(NewTask newTask) {
		Task task = new Task();

		task.setTitle(newTask.getTitle());
		task.setDescription(newTask.getDescription());
		task.setCreditValue(newTask.getCreditValue());
		task.setAssignedTo(newTask.getAssignedTo());
		task.setMaxDueAt(newTask.getMaxDueAt());
		task.setInitiallyDueAt(newTask.getInitiallyDueAt());

		return task;
	}

}
