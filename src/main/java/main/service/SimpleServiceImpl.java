package main.service;

import main.domain.SimpleDTO;
import main.domain.SimpleSource;
import main.repository.SimpleRepository;
import main.service.mapper.SimpleSourceDestinationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Autowired
    private  SimpleRepository simpleRepository;

    @Autowired
    private  SimpleSourceDestinationMapper simpleSourceDestinationMapper;

    @Override
    public SimpleDTO addSource(SimpleDTO simpleDTO) {
        SimpleSource simpleSource = simpleSourceDestinationMapper.destinationToSource(simpleDTO);
        simpleRepository.saveAndFlush(simpleSource);
        return simpleDTO;
    }

    @Override
    public void deleteSource(Integer id) {
        simpleRepository.deleteById(id);
    }

    @Override
    public SimpleDTO getSourceByName(String name) {
        return simpleSourceDestinationMapper.sourceToDestination(simpleRepository.findByName(name));
    }

    @Override
    public SimpleDTO editSource(SimpleDTO simpleDTO) {
        SimpleSource simpleSource = simpleSourceDestinationMapper.destinationToSource(simpleDTO);
        simpleRepository.saveAndFlush(simpleSource);
        return simpleDTO;
    }

    @Override
    public List<SimpleDTO> getAllSource() {
        //       List<SimpleDTO> simpleDTOS= simpleRepository.findAll().forEach(x->simpleSourceDestinationMapper.sourseToDestination(x));
        return null;
    }
}
