package com.marcusvbr.productapi.dto;

import com.marcusvbr.productapi.model.Category;

import javax.validation.constraints.NotNull;

public class CategoryDTO {

    @NotNull
    private Long id;

    @NotNull
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static CategoryDTO convert(Category category) {

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());

        return categoryDTO;

    }

}
