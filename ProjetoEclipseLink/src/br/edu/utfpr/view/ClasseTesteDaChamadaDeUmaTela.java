/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.view;

import br.edu.utfpr.controller.CidadeController;
import br.edu.utfpr.controller.EstadoController;
import br.edu.utfpr.model.entity.Cidade;
import br.edu.utfpr.model.entity.Estado;

/**
 *
 * @author root
 */
public class ClasseTesteDaChamadaDeUmaTela {
    
    /**
     * Exemplo de como seria efetua a chamada para gravar um objeto na base de dados
     * @param args 
     */
    public static void main(String[] args) {
        // Crio a instância da controller do meu objeto
        EstadoController estadoController = new EstadoController();
        // Crio a instância do meu objeto
        Estado estado = new Estado();
        
        // Crio a instância da controller do meu objeto
        CidadeController cidadeController = new CidadeController();
        // Crio a instância do meu objeto
        Cidade cidade = new Cidade();
        
        // Seto os valore dos atributos referentes do meu ojeto que são as colunas da tabela no banco de dados
        // Observe que não esta sendo setado o valor para o atributo id pois não precisa porque no meu banco de dados esta coluna esta como auto incremento e então não tem necessidade de setar valores para o id
        estado.setEstado("Santa Catarina");
        estado.setUf("SC");
        
        // Efetuo a chamada do método gravar para que seja persistido o meu objeto na base de dados
        estadoController.gravar(estado);
        
        System.out.println("Gravado estado com sucesso!");
        System.out.println("----------------------------------------------");
        
        // Seto os valore dos atributos referentes do meu ojeto que são as colunas da tabela no banco de dados
        // Observe que não esta sendo setado o valor para o atributo id pois não precisa porque no meu banco de dados esta coluna esta como auto incremento e então não tem necessidade de setar valores para o id
        cidade.setCidade("Florianópolis");
        cidade.setIdEstado(estado);
        
        // Efetuo a chamada do método gravar para que seja persistido o meu objeto na base de dados
        cidadeController.gravar(cidade);
        
        System.out.println("Gravado cidade com sucesso!");
        
        System.out.println("----------------------------------------------");
        System.out.println("Agora efetue testes para os outros métodos como o getAll() getById() getByFiltro(String busca) \nE implemente desta mesma forma que foi implementado para as classes referentes as entidades Estado e Cidade para as outras classes referentes as entidades \nNa próxima aula explico detalhadamente novamente o código \nDesta forma se já quiserem ir montando as telas dos sistemas é só montar um objeto e mandar gravar simples assim \nLouvado seja o Java nossa ferramenta de desenvolvimento. Amém! \nBom feriado a todos!");
        
    }
    
}
