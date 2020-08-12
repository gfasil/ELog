package com.faya.co.elog.service;

import com.faya.co.elog.domain.Solution;
import com.faya.co.elog.repository.SolutionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SolutionService implements CrudService<Solution> {

    SolutionRepository solutionRepository;
            public SolutionService(SolutionRepository solutionRepository){
                this.solutionRepository=solutionRepository;
            }

    @Override
    public List<Solution> getAll() {
        return solutionRepository.findAll();
    }

    @Override
    public Solution add(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public Solution update(Long id, Solution solution) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
