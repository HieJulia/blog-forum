package com.project.blogforum.dto;

public class AuthorityDTO {

    private Long id;
    private String name;

    public AuthorityDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public AuthorityDTO(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
