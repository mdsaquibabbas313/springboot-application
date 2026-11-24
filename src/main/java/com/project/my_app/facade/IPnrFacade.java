package com.project.my_app.facade;

import com.project.my_app.dto.response.PnrNumberResponseDTO;

import java.util.List;

public interface IPnrFacade {
    List<PnrNumberResponseDTO> getAllPnrNumbers();
}
