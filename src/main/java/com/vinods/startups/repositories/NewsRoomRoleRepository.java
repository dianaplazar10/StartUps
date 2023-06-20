package com.vinods.startups.repositories;

import com.vinods.startups.models.StartUpsAppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRoomRoleRepository extends JpaRepository<StartUpsAppRole, Long> {
}
