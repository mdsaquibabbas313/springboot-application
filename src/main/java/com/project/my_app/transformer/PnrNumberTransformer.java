package com.project.my_app.transformer;

import com.project.my_app.domain.PnrNumber;
import com.project.my_app.dto.request.PnrNumberRequestDTO;
import com.project.my_app.dto.response.PnrNumberResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class PnrNumberTransformer {

    public static PnrNumber toEntity(PnrNumberRequestDTO dto) {
        // Transform DTO to Entity logic here
        if(dto == null) {
            return null;
        }
        PnrNumber entity = new PnrNumber();
        entity.setName(dto.name());
        entity.setAge(dto.age());
        entity.setEmail(dto.email());
        entity.setGender(dto.gender());
        entity.setPnrNumber(generatePnrNumber()); // Assuming you have a method to generate PNR number
        return entity;
    }

    private static String generatePnrNumber() {
        return "123456789"; // Placeholder for PNR number generation logic
    }

    public static PnrNumberResponseDTO toResponseDTO(PnrNumber entity) {
        // Transform Entity to Response DTO logic here
        if(entity == null) {
            return null;
        }
        return PnrNumberResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .age(entity.getAge())
                .email(entity.getEmail())
                .gender(entity.getGender())
                .pnrNumber(entity.getPnrNumber())
                .build();
    }
}
