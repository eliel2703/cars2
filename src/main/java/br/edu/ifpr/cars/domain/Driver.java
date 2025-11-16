package br.edu.ifpr.cars.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Driver {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @NotBlank(message = "É necessário digitar um nome")
  @Size(min = 3, max = 50, message = "Tamanho deve ser entre 3 e 50 caracteres")
  @Pattern(regexp = "^\\S+$", message = "Nome não pode conter espaços")
  String name;
  @NotBlank(message = "É necessário digitar um CPF")
  @Pattern(regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$", message = "CPF inválido")
  String cpf;
  @NotBlank(message = "É necessário digitar um email")
  @Email(message = "Email inválido")
  @Pattern(regexp = "^\\S+$", message = "Email não pode conter espaços")
  String email;
  LocalDate birthDate;

}
