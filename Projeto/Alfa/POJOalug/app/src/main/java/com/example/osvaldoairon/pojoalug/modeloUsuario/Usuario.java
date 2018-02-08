package com.example.osvaldoairon.pojoalug.modeloUsuario;

import java.io.Serializable;

/**
 * Created by osvaldoairon on 07/02/18.
 */

public class Usuario implements Serializable{
    private String nome;
    private String endereco;
    private int telefone;
    private String login;
    private String senha;

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome ,String endereco, int telefone , String login , String senha){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setLogin(login);
        setSenha(senha);
    }
}
