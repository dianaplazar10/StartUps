package com.vinods.startups.repositories;

import com.vinods.startups.models.StartUpsAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRoomUserRepository extends JpaRepository<StartUpsAppUser, Long> {
}
