package com.lexa.atomka.controller;

import com.lexa.atomka.model.Reactor;
import com.lexa.atomka.service.ReactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reactor")
public class ReactorController {

    @Autowired
    private ReactorService reactorService;

    @GetMapping("/status")
    public List<Reactor> getReactorStatus() {
        return reactorService.getAllReactors();
    }

    @PostMapping("/update")
    public String updateReactor(@RequestBody Reactor reactor) {
        reactorService.updateReactor(reactor);
        return "Reactor updated";
    }
}
