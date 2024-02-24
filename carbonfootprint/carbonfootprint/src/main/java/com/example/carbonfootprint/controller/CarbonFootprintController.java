package com.example.carbonfootprint.controller;

/*package com.example.carbonfootprint.controller;*/

import com.example.carbonfootprint.dto.CompensatingDTO;
import com.example.carbonfootprint.models.CompensatingActivity;
import com.example.carbonfootprint.repository.CompensatingActivityRepository;
import com.example.carbonfootprint.services.CarbonFootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carbonfootprint")
public class CarbonFootprintController {
    private final CompensatingActivityRepository compensatingActivityRepository;
    private final CarbonFootprintService carbonFootprintService;

    public CarbonFootprintController(CompensatingActivityRepository compensatingActivityRepository, CarbonFootprintService carbonFootprintService) {
        this.compensatingActivityRepository = compensatingActivityRepository;
        this.carbonFootprintService = carbonFootprintService;
    }
    @CrossOrigin("*")
    @GetMapping("/calculate")
    public double calculateEmission(@RequestParam String activityName, @RequestParam double amount) {
        double emissions = carbonFootprintService.calculateEmission(activityName, amount);
        return emissions;
    }
    @CrossOrigin("*")
    @GetMapping("/suggestCompensations")
    public List<CompensatingDTO> suggestCompensations(@RequestParam double totalEmissions) {
        return carbonFootprintService.suggestCompensations(totalEmissions);
}
    @CrossOrigin("*")
    @PostMapping
    public CompensatingActivity create(@RequestBody CompensatingActivity compensatingActivity){
        CompensatingActivity newCompensatingActivity = compensatingActivityRepository.save(compensatingActivity);
        return newCompensatingActivity;

    }
}

