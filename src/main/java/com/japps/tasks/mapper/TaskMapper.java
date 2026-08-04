package com.japps.tasks.mapper;

import com.japps.tasks.domain.CreateTaskRequest;
import com.japps.tasks.domain.dto.CreateTaskRequestDto;
import com.japps.tasks.domain.dto.TaskDto;
import com.japps.tasks.domain.entities.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);

}
