package com.example.application.data.repository;


import com.example.application.data.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusesRepository extends JpaRepository<Statuses, UUID> {

}
