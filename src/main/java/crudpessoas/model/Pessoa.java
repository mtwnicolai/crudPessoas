package crudpessoas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id // defini a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // será gerada automticamente,
    private long id;                                   // usando o mecanismo de geração de indentidade

    @Column(nullable = false)  // evita que o banco armazena null
    private String nome;

    @Column(nullable = false, unique = true)  // evita que o banco armazena null e também elementos duplicados
    private String email;

    private int idade;

    public Pessoa(){
    }

    public long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}