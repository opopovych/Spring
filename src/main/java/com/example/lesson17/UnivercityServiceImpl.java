package com.example.lesson17;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UnivercityServiceImpl implements UniversitySer {

	@Autowired
	private UnivercityRepo repo;

	@Override
	public Univercity create(Univercity univercity) {

		return repo.saveAndFlush(univercity);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Univercity> findAll() {
		return repo.findAll();
	}

	@Override
	public Univercity findOne(Long id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public Univercity update(Univercity univercity) {
		// TODO Auto-generated method stub
		return repo.save(univercity);
	}

}
