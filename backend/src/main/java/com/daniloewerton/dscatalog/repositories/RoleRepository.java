package com.daniloewerton.dscatalog.repositories;

import com.daniloewerton.dscatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
