package com.example.carbonfootprint.controller;

import com.example.carbonfootprint.models.Activity;
import com.example.carbonfootprint.repository.ActivityRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    private final ActivityRepository activityRepository;

    public ActivityController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @CrossOrigin("*")
    @PostMapping
    public Activity create(@RequestBody Activity activity){
        Activity newActivity = activityRepository.save(activity);
        return newActivity;
    }
}
