package com.example.les18.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String level;
	@Column
	private String ParticipantSkill;



	public Participant() {
		super();
	}

	public Participant(String name, String email, String level, String participantSkill) {
		super();
		this.name = name;
		this.email = email;
		this.level = level;
		ParticipantSkill = participantSkill;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getParticipantSkill() {
		return ParticipantSkill;
	}

	public void setParticipantSkill(String participantSkill) {
		ParticipantSkill = participantSkill;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ParticipantSkill, email, id, level, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Participant other = (Participant) obj;
		return Objects.equals(ParticipantSkill, other.ParticipantSkill) && Objects.equals(email, other.email)
				&& id == other.id && level == other.level && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", email=" + email + ", level=" + level
				+ ", ParticipantSkill=" + ParticipantSkill + "]";
	}

}
