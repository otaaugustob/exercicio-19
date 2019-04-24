package br.com.etechoracio.exercicio19;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_VEICULO")
public class Veiculo 
{
	@Id
	@GeneratedValue
	@Column(name="ID_VEICULO")
	private Long id;
	
	@Column(name="TX_PLACA")
	private String placa;
	
	@Column(name="TX_COR")
	private String cor;
	
	@Column(name="NR_ANO")
	private int ano;
	

}
