package com.weaver.taskservice.models.converters;

import java.util.Date;

import com.weaver.taskservice.models.Task;
import com.weaver.taskservice.models.request.NewTask;

public class TaskConverter {

	public static Task newTaskToTask(NewTask newTask) {
		return new Task(newTask.getTitle(), newTask.getDescription(),
				newTask.getCreditValue(), "id_jas", "id_jas", newTask.getAssignedTo(), newTask.getCurrentlyDueAt(),
				newTask.getMaxDueAt(), newTask.getCurrentlyDueAt(), 0, new Date().getTime(), new Date().getTime());
	}

}
