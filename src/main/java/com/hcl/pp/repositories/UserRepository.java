package com.hcl.pp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.pp.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer> {

}
