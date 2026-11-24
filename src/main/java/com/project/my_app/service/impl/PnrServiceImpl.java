package com.project.my_app.service.impl;

import com.project.my_app.domain.PnrNumber;
import com.project.my_app.dto.response.PnrNumberResponseDTO;
import com.project.my_app.repo.IPnrNumberRepo;
import com.project.my_app.service.IPnrService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PnrServiceImpl implements IPnrService {
    private final IPnrNumberRepo pnrNumberRepo;

    @Override
    public List<PnrNumber> getAllPnrNumbers() {
        return pnrNumberRepo.findAll();
    }
}
