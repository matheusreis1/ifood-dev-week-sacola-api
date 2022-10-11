package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder // design pattern
@Data // getters and setters
@Embeddable
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String complemento;
}
