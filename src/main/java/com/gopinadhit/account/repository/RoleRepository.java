package com.gopinadhit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopinadhit.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
