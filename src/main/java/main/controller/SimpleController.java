package main.controller;

import main.domain.SimpleDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface SimpleController {

    @PostMapping
    String save(@RequestBody SimpleDTO simpleDTO);

    @PutMapping
    SimpleDTO update(@RequestBody SimpleDTO simpleDTO);

    @GetMapping
    SimpleDTO get(@RequestParam String name);

    @GetMapping("/all")
    List<SimpleDTO> getAll();

    @DeleteMapping
    void delete(@RequestParam Integer id);
}
