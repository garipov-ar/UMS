package ru.microservice.ums.dal;

import ru.microservice.ums.dto.Roles;
import ru.microservice.ums.dto.User;

import java.util.Map;
import java.util.UUID;

public interface UmsRepository {

    Map<UUID, User> findAllUsers();

    Map<String, Roles> findAllRoles();

    User findUserByID(UUID userId);

    UUID createUser(User user);

    int deleteUser(UUID userId);
}
