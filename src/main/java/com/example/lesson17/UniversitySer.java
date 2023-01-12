package com.example.lesson17;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UniversitySer {
	Univercity create(Univercity univercity);

	void delete(Long id);

	List<Univercity> findAll();

	Univercity findOne(Long id);

	Univercity update(Univercity univercity);
}
