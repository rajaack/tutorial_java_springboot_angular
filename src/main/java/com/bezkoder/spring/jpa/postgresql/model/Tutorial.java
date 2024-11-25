package com.bezkoder.spring.jpa.postgresql.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tutorials")
@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

}
