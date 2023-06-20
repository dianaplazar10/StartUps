package com.vinods.startups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="roles")
public class StartUpsAppRole {
    @Id
    private String role;

}


