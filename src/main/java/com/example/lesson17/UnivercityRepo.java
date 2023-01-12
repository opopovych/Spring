package com.example.lesson17;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UnivercityRepo extends CrudRepository<Univercity, Long>,JpaRepository<Univercity, Long> {

}
