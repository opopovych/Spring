package com.example.les18.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.les18.dao.ParticipantRepo;
import com.example.les18.domain.Participant;

@Service
public class ServiceLayer {
	@Autowired
	private ParticipantRepo repo;



	public void create(Participant participant) {


			this.repo.save(participant);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public Iterable<Participant> findAll() {
		return repo.findAll();
	}

	public Participant findOne(Integer id) {
		Optional<Participant> optional = repo.findById(id);
		Participant participant = null;
		if (optional.isPresent()) {
			participant = optional.get();
		}else {
			throw new RuntimeException("Participant not found for id :: "+id);
		}
		return participant;
	}
	public void update(Participant participant) {

		participant.setId(participant.getId());
		participant.setName(participant.getName());
		participant.setEmail(participant.getEmail());
		participant.setLevel(participant.getLevel());
		participant.setParticipantSkill(participant.getParticipantSkill());
			repo.save(participant);
	}

}

