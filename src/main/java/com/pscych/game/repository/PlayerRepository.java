package com.pscych.game.repository;

import com.pscych.game.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
