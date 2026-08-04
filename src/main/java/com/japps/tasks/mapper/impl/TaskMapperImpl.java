package com.japps.tasks.mapper.impl;

import com.japps.tasks.domain.CreateTaskRequest;
import com.japps.tasks.domain.dto.CreateTaskRequestDto;
import com.japps.tasks.domain.dto.TaskDto;
import com.japps.tasks.domain.entities.Task;
import com.japps.tasks.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
