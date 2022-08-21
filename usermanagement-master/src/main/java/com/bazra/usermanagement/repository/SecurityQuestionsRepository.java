package com.bazra.usermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazra.usermanagement.model.SecurityQuestion;

@Repository
public interface SecurityQuestionsRepository extends JpaRepository<SecurityQuestion, Integer> {
	Optional<SecurityQuestion> findByquestionName(String settingName);
}
