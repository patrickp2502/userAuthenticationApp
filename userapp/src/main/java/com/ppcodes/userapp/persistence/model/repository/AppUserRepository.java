package com.ppcodes.userapp.persistence.model.repository;

import com.ppcodes.userapp.persistence.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
