package com.project.simpleskillshare.model;

import jakarta.persistence.*;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skillName;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
