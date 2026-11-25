package com.project.my_app.facade.impl;

import com.project.my_app.domain.PnrNumber;
import com.project.my_app.dto.response.PnrNumberResponseDTO;
import com.project.my_app.facade.IPnrFacade;
import com.project.my_app.service.IPnrService;
import com.project.my_app.transformer.PnrNumberTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PnrFacadeImpl implements IPnrFacade {
    private final IPnrService pnrService;

    @Override
    public List<PnrNumberResponseDTO> getAllPnrNumbers() {
        List<PnrNumber> pnrNumbers = pnrService.getAllPnrNumbers();

        return pnrNumbers.stream()
                .map(PnrNumberTransformer::toResponseDTO)
                .toList();
    }
}
