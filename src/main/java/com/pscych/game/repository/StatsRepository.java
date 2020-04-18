package com.pscych.game.repository;

import com.pscych.game.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsRepository extends JpaRepository<Stats,Long> {
}
