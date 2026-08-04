package com.japps.tasks.domain;

import com.japps.tasks.domain.entities.TaskPriority;

import java.time.LocalDateTime;

public record CreateTaskRequest(
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority
) {
}
