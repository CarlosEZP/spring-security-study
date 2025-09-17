package dev.carlosezp.spring_security_study.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "username")
    @Size(max = 50)
    @NotBlank
    private String name;

    @NotBlank
    @NotNull
    @Size(max = 500)
    private String password;

    @NotNull
    private boolean enabled;

    @OneToMany(mappedBy = "user")
    private List<Authority> authorities;
}
