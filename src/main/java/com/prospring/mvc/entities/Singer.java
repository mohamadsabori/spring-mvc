package com.prospring.mvc.entities;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SINGER")
public class Singer extends AbstractEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private ZonedDateTime birthDate;

    @OneToMany(mappedBy = "singer")
    private Set<Album> albums = new HashSet<>();

    @Basic(fetch = FetchType.LAZY)
    @Lob
    @Column(name = "PHOTO")
    private byte[] photo;


}
