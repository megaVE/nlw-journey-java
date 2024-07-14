package com.rocketseat.planner.link;

import com.rocketseat.planner.activity.ActivityData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository<Link, UUID> {
    public List<Link> findByTripId(UUID tripId);
}
