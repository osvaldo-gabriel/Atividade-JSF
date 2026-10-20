package br.com.cadUser;

import java.io.Serializable;
import javax.faces.view.ViewScoped; // <-- IMPORTANTE: use ViewScoped para telas JSF
import javax.inject.Inject;
import javax.inject.Named;

@Named("pessoa")
@ViewScoped // <-- Mantém o bean vivo enquanto o usuário estiver na mesma tela do JSF
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    @Inject
    private ListaUsuarios listaUsuarios;

    public void cadastrar() {
        if (nome != null && !nome.trim().isEmpty()) {
            listaUsuarios.adicionar(nome.trim());
            nome = "";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }
}