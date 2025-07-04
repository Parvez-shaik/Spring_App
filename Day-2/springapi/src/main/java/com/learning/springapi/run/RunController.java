package com.learning.springapi.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RunController {

    private final RunRepo runRepo;

    public RunController(RunRepo runRepo){
        this.runRepo = runRepo;
    }
    @GetMapping("/")
    String Home(){
        return "<h1>Home</h1>";
    }

    @GetMapping("/runs")
    List<Run> findAll(){
        return runRepo.findAll();
    }

    @GetMapping("/runs/{id}")
    Run findOne(@PathVariable Integer id){

        Optional<Run> run = runRepo.findOne(id);
        if(run.isEmpty()){
            throw new RunException();
        }
        return run.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/runs")
    void create(@Valid @RequestBody Run run){
        runRepo.create(run);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/runs/{id}")
    void update(@Valid @RequestBody Run run, @PathVariable Integer id){
        runRepo.update(run,id);
    }

}
