package az.et.springintro.service;

import org.springframework.stereotype.Service;

@Service
public class DependencyInjectionService {

    public String getMessage() {
        return "Hello from DependencyInjectionService #2";
    }

}
