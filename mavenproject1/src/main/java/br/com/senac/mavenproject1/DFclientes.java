/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.mavenproject1;

/**
 *
 * @author miguel62977036
 */
public class DFclientes {

    public DFclientes(String text, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12) {
    }
   

public class DFClientes {
    private String codigo;
    private String nome;
    private String cpf;
    private String contato;
    private String dataNasc;
    private String identidade;
    private String endereco;
    private String sexo;
    // adicionei esses que estavam no seu jTextField1, 2, 6, 7...
    private String bairro;
    private String cidade;
    private String cep;
    private String complemento;

        public DFClientes(String codigo, String nome, String cpf, String contato, String dataNasc, String identidade, String endereco, String sexo, String bairro, String cidade, String cep, String complemento) {
            this.codigo = codigo;
            this.nome = nome;
            this.cpf = cpf;
            this.contato = contato;
            this.dataNasc = dataNasc;
            this.identidade = identidade;
            this.endereco = endereco;
            this.sexo = sexo;
            this.bairro = bairro;
            this.cidade = cidade;
            this.cep = cep;
            this.complemento = complemento;
        }

    

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public String getDataNasc() { return dataNasc; }
    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }

    public String getIdentidade() { return identidade; }
    public void setIdentidade(String identidade) { this.identidade = identidade; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    }


    

}
