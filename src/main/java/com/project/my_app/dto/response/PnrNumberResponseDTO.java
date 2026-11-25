package com.project.my_app.dto.response;

import lombok.Builder;

@Builder
public record PnrNumberResponseDTO(
        Long id,
        String name,
        Integer age,
        String email,
        String gender,
        String pnrNumber
) {
}
