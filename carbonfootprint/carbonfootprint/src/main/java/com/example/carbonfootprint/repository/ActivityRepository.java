package com.example.carbonfootprint.repository;

/*package com.example.carbonfootprint.repository;*/

import com.example.carbonfootprint.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    @Query
    Activity findByName(String name);
}
