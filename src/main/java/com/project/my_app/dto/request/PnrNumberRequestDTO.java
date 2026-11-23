package com.project.my_app.dto.request;

import jakarta.validation.constraints.Email;

public record PnrNumberRequestDTO(
    String name,
    Integer age,
    @Email(message = "Invalid email format")
    String email,
    String gender
) {
}
