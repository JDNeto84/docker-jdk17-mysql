package app.controller;

import app.domain.entity.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record
RegisterDTO(
        @NotBlank @Email String email,
        @NotBlank String password,
        UserRole role
){

}