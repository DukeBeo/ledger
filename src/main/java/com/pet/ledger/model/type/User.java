package com.pet.ledger.model.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pet.ledger.model.BaseModel;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel {

    @Id
    private String id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "given_name")
    private String giveName;

    @Column(name = "family_name")
    private String familyName;

    @Column(name = "picture")
    private String picture;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "skype")
    private String skype;

    @Column(name = "amount")
    private Float amount;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Trading> tradings = new ArrayList<>();

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Session> sessions;

    public User(String email, String name, String picture) {
        this.email = email;
        this.name = name;
        this.picture = picture;
    }
}
