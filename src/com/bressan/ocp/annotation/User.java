package com.bressan.ocp.annotation;

import java.time.LocalDate;

public class User {
    private String name;
    private String cpf;
    @MinimumAge(value = 18)
    private LocalDate dateOfBirth;

    public User(String name, String cpf, LocalDate dateOfBirth) {
        this.name = name;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
