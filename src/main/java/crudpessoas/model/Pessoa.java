package crudpessoas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "pessoa")

public class Pessoa{

    @Id // defini a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // será gerada automticamente,
    private long id;                                   // usando o mecanismo de geração de indentidade


    @Column(nullable = false)
    @CPF
    @NotBlank(message = "O CPF é obrigatório para realizar o cadastro!")
    @Size(min = 11, max = 11, message = "O CPF tem 11 dígitos, há algo de errado...")
    private String CPF;

    @Column(nullable = false)  // evita que o banco armazena null
    @NotBlank(message = "O nome é obrigatório para realizar o cadastro!")
    @Size(min = 3, max = 100, message = "O nome pode ter de 3 à 100 caracteres")
    private String nome;

    @Column(nullable = false, unique = true)  // evita que o banco armazena null e também elementos duplicados
    @NotBlank(message = "O e-mail é obrigatório para realizar o cadastro!")
    @Email(message = "este e-mail é inválido.")
    @Size(min = 3, max = 100, message = "O e-mail pode ter de 3 à 100 caracteres")
    private String email;

    @NotNull(message = "A idade é obrigatória para realizar o cadastro!")
    @Min(value = 0, message = "A Idade não pode ser negativa.")
    @Max(value = 120, message = "Acho que tem algum erro na idade...")
    private int idade;

    public Pessoa(){}

    // ID
    public long getId(){
        return id;
    }

    // CPF
    public String getCPF() { return CPF; }

    public void setCPF(String CPF) { this.CPF = CPF; }

    // NAME
    public String getNome(){ return nome; }

    public void setNome(String nome){
        this.nome = nome;
    }

    // E-MAIL
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){ this.email = email; }

    // AGE
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}