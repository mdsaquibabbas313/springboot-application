package com.project.my_app.service;

import com.project.my_app.domain.PnrNumber;
import com.project.my_app.dto.response.PnrNumberResponseDTO;

import java.util.List;

public interface IPnrService {
    List<PnrNumber> getAllPnrNumbers();
}
