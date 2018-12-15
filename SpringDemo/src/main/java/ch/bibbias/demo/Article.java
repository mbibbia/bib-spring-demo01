package ch.bibbias.demo;

import javax.persistence.*;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, columnDefinition = "BIGINT")
	private Long id;

	@Column(nullable = false)
	private String content;

	// getter and setters omitted
}
