package com.lexa.atomka.service;

import com.lexa.atomka.model.Reactor;
import com.lexa.atomka.repository.ReactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactorService {

    @Autowired
    private ReactorRepository reactorRepository;

    public List<Reactor> getAllReactors() {
        return reactorRepository.findAll();
    }

    public void updateReactor(Reactor reactor) {
        reactorRepository.save(reactor);
    }
}
