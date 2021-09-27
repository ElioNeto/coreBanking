package com.en.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.en.core.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
