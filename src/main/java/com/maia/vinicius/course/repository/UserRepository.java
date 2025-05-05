package com.maia.vinicius.course.repository;

import com.maia.vinicius.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
