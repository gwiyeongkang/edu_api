package com.example.put.controller;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId) // @PathVariable(name = "userId") Long id
    {
        System.out.println(userId);
        return putRequestDto;
    }
}
