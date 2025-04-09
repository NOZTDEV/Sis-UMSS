package org.umss.sis_umss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
public class UniversityController {
    @GetMapping("/universities")
    public List<University> getAll(){
        //singLetonList crea una lista a partir de un objeto
        return Collections.singletonList(new University("UMSS", "Universidad Mayor de San Simon"));
    }

    @PostMapping("/universities")
    public University create(@RequestBody University university){
        university.setUuid(UUID.randomUUID().toString());
        return university;
    }
}
