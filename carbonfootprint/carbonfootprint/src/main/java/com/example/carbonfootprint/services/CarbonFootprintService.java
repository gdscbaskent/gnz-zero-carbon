package com.example.carbonfootprint.services;

/*package com.example.carbonfootprint.service;*/

import com.example.carbonfootprint.dto.CompensatingDTO;
import com.example.carbonfootprint.models.Activity;
import com.example.carbonfootprint.repository.ActivityRepository;
import com.example.carbonfootprint.models.CompensatingActivity;
import com.example.carbonfootprint.repository.CompensatingActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


@Service
public class CarbonFootprintService {

    private final ActivityRepository activityRepository;
    private final CompensatingActivityRepository compensatingActivityRepository;

    public CarbonFootprintService(ActivityRepository activityRepository, CompensatingActivityRepository compensatingActivityRepository) {
        this.activityRepository = activityRepository;
        this.compensatingActivityRepository = compensatingActivityRepository;
    }

    public double calculateEmission(String activityName, double amount) {
        Activity activity = activityRepository.findByName(activityName);
        return  activity.get_co2_per_unit() * amount ;
        /*return activity != null ? activity.getCo2PerUnit() * amount : 0;*/
    }

    public List<CompensatingDTO> suggestCompensations(double totalEmissions) {
        List<CompensatingActivity> allActivities = compensatingActivityRepository.findAll();
        List<CompensatingDTO> acts = allActivities.stream().map(item -> new CompensatingDTO(item.getName(),  new DecimalFormat("##.##").format((totalEmissions / item.getCo2_compensation_per_unit())))).collect(Collectors.toList());
        return acts;
    }
}

