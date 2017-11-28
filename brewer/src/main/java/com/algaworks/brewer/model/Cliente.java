package com.algaworks.brewer.model;


import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	
private String id;
	
@NotBlank(message = "Nome é obrigatório")
private String nome;
	
private String CNPJ;

}
