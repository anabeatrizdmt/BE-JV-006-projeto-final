package com.cadastropetshop.bejv006projetofinal.model;

import com.cadastropetshop.bejv006projetofinal.utils.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String raca;
    private String cor;
    private Sexo sexo;
    private String nomeDono;
    private String dddTelefoneDono;
    private String numeroTelefoneDono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getDddTelefoneDono() {
        return dddTelefoneDono;
    }

    public void setDddTelefoneDono(String dddTelefoneDono) {
        this.dddTelefoneDono = dddTelefoneDono;
    }

    public String getNumeroTelefoneDono() {
        return numeroTelefoneDono;
    }

    public void setNumeroTelefoneDono(String numeroTelefoneDono) {
        this.numeroTelefoneDono = numeroTelefoneDono;
    }
}
