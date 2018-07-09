package com.example.rest_test.model;

public class Book {
	private Integer id;
	private String nome;
	private String genre;
	private String summaryDescription;

	public Book() {}

	public Book(Integer id, String nome, String summaryDescription, String genre) {
		super();
		this.id = id;
		this.nome = nome;
		this.genre = genre;
		this.summaryDescription = summaryDescription;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummaryDescription() {
		return summaryDescription;
	}

	public void setSummaryDescription(String summaryDescription) {
		this.summaryDescription = summaryDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
