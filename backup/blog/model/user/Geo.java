package com.tcs.blog.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Table(name = "geo")
@Getter
@Setter
public class Geo  {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lat")
	private String lat;

	@Column(name = "lng")
	private String lng;

	@JsonIgnore
	@OneToOne(mappedBy = "geo")
	private Address address;

	public Geo(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}

	}
