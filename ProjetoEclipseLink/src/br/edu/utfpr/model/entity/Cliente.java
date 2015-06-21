/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import mark.utils.el.annotation.Resolvable;

/**
 *
 * @author root
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.id_Cliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByTelefone", query = "SELECT c FROM Cliente c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cliente.findByEndereco", query = "SELECT c FROM Cliente c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cliente.findByAtivo", query = "SELECT c FROM Cliente c WHERE c.ativo = :ativo")})
public class Cliente extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    // Adicionado para quem utiliza banco postgres adicionar a sequence do contador automático do banco de dados
//    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cliente_idcli_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    @Resolvable(colName = "Código")
    private Integer id_Cliente;
    @Basic(optional = false)
    @Column(nullable = false, length = 40)
    @Resolvable(colName = "Nome")
    private String nome;
    @Column(length = 15)
    @Resolvable(colName = "Telefone")
    private String telefone;
    @Column(length = 150)
    @Resolvable(colName = "Endereço")
    private String endereco;
    @Resolvable(colName = "Ativo")
    private Boolean ativo;
    @JoinColumn(name = "id_cidade", referencedColumnName = "id_cidade")
    @ManyToOne
    @Resolvable(colName = "Cidade")
    private Cidade idCidade;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.id_Cliente = idCliente;
    }

    public Cliente(Integer idCliente, String nome, boolean ativo) {
        this.id_Cliente = idCliente;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Integer getIdCliente() {
        return id_Cliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.id_Cliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cidade getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Cidade idCidade) {
        this.idCidade = idCidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_Cliente != null ? id_Cliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id_Cliente == null && other.id_Cliente != null) || (this.id_Cliente != null && !this.id_Cliente.equals(other.id_Cliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.utfpr.model.entity.Cliente[ idCliente=" + id_Cliente + " ]";
    }

    @Override
    public boolean isNew() {
        return (this.getIdCliente() == null);
    }
    
}
