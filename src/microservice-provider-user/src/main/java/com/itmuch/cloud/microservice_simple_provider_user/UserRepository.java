package com.itmuch.cloud.microservice_simple_provider_user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
