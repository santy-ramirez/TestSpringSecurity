package com.example.appTestSpringSecurity.Domain;

import com.example.appTestSpringSecurity.util.ERole;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NonNull
    @Enumerated(EnumType.STRING)
    private ERole name;

}
