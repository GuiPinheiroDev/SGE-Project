package br.com.sge;

import br.com.sge.enums.NivelAcesso;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private String login;
    private String senha;
    
    @Enumerated(EnumType.STRING)
    private NivelAcesso nivelAcesso;
}
