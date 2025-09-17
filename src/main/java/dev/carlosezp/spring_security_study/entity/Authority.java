package dev.carlosezp.spring_security_study.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authority {
    @Id
    @Size(max = 50)
    private String authority;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
}
