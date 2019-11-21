package com.switchfully.teamteam.parkshark.api.divisions.dtos;

import com.switchfully.teamteam.parkshark.api.directors.dtos.CreateDirectorDto;

public class CreateDivisionDto {

    private String name;
    private String originalName;
    private CreateDirectorDto director;
    private Long parentId;

    private CreateDivisionDto() {
    }

    String getName() {
        return name;
    }

    String getOriginalName() {
        return originalName;
    }

    CreateDirectorDto getDirector() {
        return director;
    }

    Long getParentId() {
        return parentId;
    }

    public static CreateDivisionDto createDivisionDto() {
        return new CreateDivisionDto();
    }

    public CreateDivisionDto withName(String name) {
        this.name = name;
        return this;
    }

    public CreateDivisionDto withOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }

    public CreateDivisionDto withDirector(CreateDirectorDto director) {
        this.director = director;
        return this;
    }

    public CreateDivisionDto withParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

}
