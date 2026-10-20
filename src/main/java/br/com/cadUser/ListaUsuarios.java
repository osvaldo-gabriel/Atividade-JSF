
package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ListaUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> nomes = new ArrayList<>();

    public void adicionar(String nome) {
        nomes.add(nome);
    }

    public List<String> getNomes() {
        return nomes;
    }
}
