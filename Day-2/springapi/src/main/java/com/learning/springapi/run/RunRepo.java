package com.learning.springapi.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Repository
public class RunRepo {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }

    Optional<Run> findOne(Integer id){
        return runs.stream().filter(run -> run.Id() == id).findFirst();
    }

    void create(Run run){
        runs.add(run);
    }

    void update(Run run, Integer id){
        Optional<Run> oldRun = findOne(id);
        if (oldRun.isPresent()){
            runs.set(runs.indexOf(oldRun.get()),run);
        }
    }


    @PostConstruct
    private void init(){
        runs.add(new Run(1, "parvez", 1, Location.INDOOR));

        runs.add(new Run(2,"Shaik",2,Location.OUTDOOR));
    }
}
