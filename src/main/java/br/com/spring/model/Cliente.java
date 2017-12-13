package br.com.spring.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2271051358940546477L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cd;

	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String endereco;
	private String descricao;
	private String profissao;
	private BigDecimal salario;
}
