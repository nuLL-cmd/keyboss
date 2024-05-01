package br.com.automatodev.repository;

import br.com.automatodev.entities.Role;
import br.com.automatodev.entities.User;
import br.com.automatodev.enums.RoleValues;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, Long> {

    default Optional<Role> fetchByName(RoleValues role) {

        return this.findByName(role.name());
    }

    Optional<Role> findByName(String name);
}
