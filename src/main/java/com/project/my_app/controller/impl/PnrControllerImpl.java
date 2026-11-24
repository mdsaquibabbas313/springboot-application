package com.project.my_app.controller.impl;

import com.project.my_app.controller.IPnrController;
import com.project.my_app.dto.response.PnrNumberResponseDTO;
import com.project.my_app.facade.IPnrFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PnrControllerImpl implements IPnrController {
    private final IPnrFacade pnrFacade;
    @Override
    public ResponseEntity<List<PnrNumberResponseDTO>> getAllPnrNumbers() {
        List<PnrNumberResponseDTO> response = pnrFacade.getAllPnrNumbers();
        return ResponseEntity.ok(response);
    }
}
