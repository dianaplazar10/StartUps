package com.vinods.startups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="newsroomuser")
public class StartUpsAppUser {
    @Id
    private long id;
    private String email;
    private String name;
}
