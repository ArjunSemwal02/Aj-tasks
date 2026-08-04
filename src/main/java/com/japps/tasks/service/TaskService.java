package com.japps.tasks.service;

import com.japps.tasks.domain.CreateTaskRequest;
import com.japps.tasks.domain.UpdateTaskRequest;
import com.japps.tasks.domain.entities.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
