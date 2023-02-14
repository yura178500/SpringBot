package com.example.devpro.service;

import com.example.devpro.entity.Data;
import com.example.devpro.repository.DataRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

@Service("dataService")
public class DataServiceImpl implements DataService {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    @Qualifier("dataRespitory")
    private DataRepository dataRepository;

    @Override
    public boolean persist(String problem) {
        try {
            dataRepository.persist(new Data(UUID.randomUUID(), problem));
            return true;
        } catch (Exception e) {
            LOG.exiting("ERROR SAVING DATA: " + e.getMessage(), String.valueOf(e));
            return false;
        }
    }

    @Override
    public Set<String> getRandomData() {
        return dataRepository.getRandomData();
    }
}
