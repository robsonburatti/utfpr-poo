/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author root
 */
public class FileUtil {

    /**
     * Grava os dados enviados por parâmetro em um arquivo com a extenção
     * <b>.txt</b> no diretório raiz onde está sendo executado a aplicação,
     * utilizando o conceito de se basear em caracteres
     * @param dados texto a ser gravado no arquivo
     */
    public static void gravarDadosTXT(String dados) {
        gravarDadosTXTFileWrite(dados);
    }

    /**
     * Efetua a leitura do aquivo com a extenção <b>.txt</b>
     * @return retorno os dados do arquivo lido
     */
    public static String lerDadosTXT() {
        return lerArquivoTXTFileReader();
    }
    
    /**
     * Fluxo de entrada baseada em caracteres de um arquivo utilizando a classe FileWrite
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosTXTFileWrite(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            String path = "relatorio" + File.separator + "dados"; // Define o diretório onde será salvo
            File diretorio = new File(path); // Cria e instância o diretório
            File arquivo = new File(diretorio, "arquivoRelatorio.txt"); // Cria e instância o arquivo e o diretóio onde será gravado
            
            // Efetua teste se existe o diretório
            if (!diretorio.exists()) {
                // Se não existe o diretório cria todos os diretórios e as suas ramificações especificadas
                diretorio.mkdirs();
                
                // Efetua teste se existe o arquivo físico no disco
                if (!arquivo.exists()) {
                    // Se caso o arquivo físico no disco não exista cria o arquivo
                    arquivo.createNewFile();
                }
            }
            
            FileWriter fileWriter = new FileWriter(arquivo); // Cria o arquivo físico no diretório especificado

            // Escrevendo no arquivo
            fileWriter.write(dados);

            // Fecha a transmisão dos dados para o arquivo
            fileWriter.flush();

            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            fileWriter.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe FileWriter");
            e.printStackTrace();
        }
    }
    
    /**
     * Fluxo de saída baseada em caracteres de um arquivo utilizando a classe FileReader
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
     */
    private static String lerArquivoTXTFileReader() {
        StringBuilder toReturn = new StringBuilder();
        
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            String path = "relatorio" + File.separator + "dados"; // Define o diretório onde será salvo
            File diretorio = new File(path); // Cria e instância o diretório
            File arquivoFisico = new File(diretorio, "arquivoRelatorio.txt"); // Cria e instância o arquivo e o diretóio onde será gravado
            
            // Lê o arquivo físico deixando desta forma será lido o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileReader arquivoLeitura = new FileReader(arquivoFisico);
            
            // Cria a instância de classe que vai armazenar os dado contidos no arquivo passando para o construtor o arquivo de leitura
            BufferedReader lerArquivo = new BufferedReader(arquivoLeitura);

            // Lê a primeira linha
            String linha = lerArquivo.readLine();
            
            // Adiciona a linha na string de retorno
//            toReturn.append(linha);
            
            // Percorre o restante das linhas do arquivo
            while (linha != null) {
                // Adiciona a linha na string de retorno
                toReturn.append(linha);
                toReturn.append("\n");
                
                // Lê da segunda até a última linha a cada volta
                linha = lerArquivo.readLine();
                
            }
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            lerArquivo.close();
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            arquivoLeitura.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }

}
