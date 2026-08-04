package com.japps.tasks.domain;

import com.japps.tasks.domain.entities.TaskPriority;
import com.japps.tasks.domain.entities.TaskStatus;

import java.time.LocalDateTime;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
