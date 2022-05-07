package az.et.springintro.controller;

import az.et.springintro.service.DependencyInjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DependencyInjectionController {
    private final DependencyInjectionService dependencyInjectionService;

    @Autowired
    public DependencyInjectionController(DependencyInjectionService dependencyInjectionService) {
        this.dependencyInjectionService = dependencyInjectionService;
    }

    @GetMapping
    public String getMessage() {
        return dependencyInjectionService.getMessage();
    }

}
