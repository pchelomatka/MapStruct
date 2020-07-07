package main.controller;

import main.domain.SimpleDTO;
import main.service.SimpleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simple")
public class SimpleControllerImpl implements SimpleController {


    private final SimpleService simpleService;

    public SimpleControllerImpl(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    @Override
    public String save(SimpleDTO simpleDTO) {
        simpleService.addSource(simpleDTO);
        String a = "pizda";
        return a;
    }

    @Override
    public SimpleDTO update(SimpleDTO simpleDTO) {
        return simpleService.editSource(simpleDTO);
    }

    @Override
    public SimpleDTO get(String name) {
        return simpleService.getSourceByName(name);
    }

    @Override
    public List<SimpleDTO> getAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {
        simpleService.deleteSource(id);
    }
}
