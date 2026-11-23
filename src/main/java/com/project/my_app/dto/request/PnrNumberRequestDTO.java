package com.project.my_app.dto.request;

public record PnrNumberRequestDTO(
    String name,
    Integer age,
    String email,
    String gender,
    String pnrNumber
) {
}
