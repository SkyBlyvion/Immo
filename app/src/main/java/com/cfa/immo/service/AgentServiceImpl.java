package com.cfa.immo.service;

import com.cfa.immo.model.Agent;
import com.cfa.immo.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Override
    public Agent saveAgent(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Agent updateAgent(Agent agent) {
        return null;
    }

    @Override
    public void deleteAgent(Long id) {

    }

    @Override
    public List<Agent> findAllAgent() {
        return List.of();
    }
}
