package com.japps.tasks.mapper;

import com.japps.tasks.domain.CreateTaskRequest;
import com.japps.tasks.domain.UpdateTaskRequest;
import com.japps.tasks.domain.dto.CreateTaskRequestDto;
import com.japps.tasks.domain.dto.TaskDto;
import com.japps.tasks.domain.dto.UpdateTaskRequestDto;
import com.japps.tasks.domain.entities.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);

}
