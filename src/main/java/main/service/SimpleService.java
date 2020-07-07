package main.service;

import main.domain.SimpleDTO;

import java.util.List;

public interface SimpleService {

    SimpleDTO addSource(SimpleDTO simpleDTO);

    SimpleDTO editSource(SimpleDTO simpleDTO);

    void deleteSource(Integer id);

    SimpleDTO getSourceByName(String name);

    List<SimpleDTO> getAllSource();

}
