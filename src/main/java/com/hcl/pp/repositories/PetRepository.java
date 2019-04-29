package com.hcl.pp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.pp.models.PetModel;

@Repository
public interface PetRepository  extends JpaRepository<PetModel,Integer> {
	
	@Query(select * from pets where pet_ownerId = userId, native = true)
	List<PetModel> findAllByCustomerId(int userId);


}
