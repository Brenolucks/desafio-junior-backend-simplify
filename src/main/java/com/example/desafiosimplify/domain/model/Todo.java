package com.example.desafiosimplify.domain.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tb_todo")
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean accomplished;
    private String priority;
}
