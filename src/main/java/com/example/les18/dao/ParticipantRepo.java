package com.example.les18.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.les18.domain.Participant;
@Repository
public interface ParticipantRepo extends CrudRepository<Participant, Integer> {

}
