package br.com.automatodev.repository;

import br.com.automatodev.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    default Optional<User> fetchByName(String name) {

        return this.findByUserName(name);
    }

    Optional<User> findByUserName(String name);
}
