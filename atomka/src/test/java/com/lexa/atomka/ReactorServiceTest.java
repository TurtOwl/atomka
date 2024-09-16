package com.lexa.atomka;

import com.lexa.atomka.model.Reactor;
import com.lexa.atomka.repository.ReactorRepository;
import com.lexa.atomka.service.ReactorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReactorServiceTest {

    @Mock
    private ReactorRepository reactorRepository;

    @InjectMocks
    private ReactorService reactorService;

    public ReactorServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllReactors() {
        when(reactorRepository.findAll()).thenReturn(Collections.singletonList(new Reactor()));
        assertEquals(1, reactorService.getAllReactors().size());
    }
}
