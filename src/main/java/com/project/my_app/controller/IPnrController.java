package com.project.my_app.controller;

import com.project.my_app.dto.response.PnrNumberResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/pnr")
public interface IPnrController {
    @GetMapping(value = "/all" , produces = "application/json")
    ResponseEntity<List<PnrNumberResponseDTO>> getAllPnrNumbers();
}
