package ch.bibbias.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WineController {

    @Autowired
    private WineRespository wineRepository;

    // constructor injection also works
    // code here to use the injected articleRepository

}
