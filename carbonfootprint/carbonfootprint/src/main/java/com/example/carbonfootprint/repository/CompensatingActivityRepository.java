package com.example.carbonfootprint.repository;

/*package com.example.carbonfootprint.repository;*/

import com.example.carbonfootprint.models.CompensatingActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompensatingActivityRepository extends JpaRepository<CompensatingActivity, Long> {
}

