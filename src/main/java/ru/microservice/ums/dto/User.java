package ru.microservice.ums.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private int created;
    private List<Roles> roles = new ArrayList<>();
    private LastSession lastSession;

    public void addRole(Roles role) {
        this.roles.add(role);
    }
}

