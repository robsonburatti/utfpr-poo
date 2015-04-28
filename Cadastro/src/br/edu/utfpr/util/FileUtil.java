/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 *
 * @author root
 */
public class FileUtil {

    /**
     * Grava os dados enviados por parâmetro em um arquivo com a extenção
     * <b>.txt</b> no dirtório raiz onde está sendo executado a aaplicação
     *
     * @param dados texto a ser gravado no arquivo
     */
    public static void gravarDadosTXT(String dados) {
        // Grava os dados de fluxo de entrada baseado em bytes
        gravarDadosTXTFileOutputStream(dados);

        // Grava os dados de fluxo de entrada baseado em caracteres
//        gravarDadosTXTFileWrite(dados);
    }

    public static void gravarDadosBIN(String dados) {
        //
    }

    public static void gravarDadoDB(String dados) {
        //
    }

    public static void gravarDadosCSV(String dados) {
        //
    }

    /**
     * Fluxo de entrada baseado em bytes de um arquivo
     *
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosTXTFileOutputStream(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            File file = new File("myFolder.txt");

            // Cria a instância de classe que vai escrever no arquivo passando para o construtor o arquivo que será manipulado
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            // Escrevendo no arquivo
            fileOutputStream.write(dados.getBytes());

            // Fecha a transmisão dos dados para o arquivo
            fileOutputStream.flush();

            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            fileOutputStream.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe FileOutputStream");
            e.printStackTrace();
        }
    }

    /**
     * Fluxo de entrada baseada em caracteres de um arquivo
     *
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosTXTFileWrite(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileWriter fileWriter = new FileWriter("myFolder.txt");

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
     * Fluxo de entrada baseada em caracteres de um arquivo
     *
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosBINFileWrite(String dados) {
        try {
            // Executa o método para gravar no arquivo passando como parâmetro o retorno no método que converte a String dos dados para binário
            gravarDadosTXTFileWrite(converteStringParaBinario(dados));
        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe FileWriter");
            e.printStackTrace();
        }
    }

    private static String converteStringParaBinario(String dados) {
        StringBuilder toReturn = new StringBuilder();

        // Percorre um array de caracteres transformando cada caracter em um valor binário separando cada um com um espaço
        for (char caracter : dados.toCharArray()) {
            toReturn.append(Integer.toBinaryString(caracter)).append(" ");
        }

        return toReturn.toString();
    }

    private static String converteBinarioParaString(String dados) {
        StringBuilder toReturn = new StringBuilder();

        String[] valores = dados.split(" "); // Transforma os dados do arquivo em um array de String

        // Percorre a lista recuperando caracter por caracter
        for (int posicao = 0; posicao < valores.length; posicao++) {
            char caracter = (char) Integer.parseInt(valores[posicao], 2);
            toReturn.append(caracter);
        }

        return toReturn.toString();
    }

    private static String lerArquivoTXTFileReader() {
        StringBuilder toReturn = new StringBuilder();
        
        try {
            // Lê o arquivo físico deixando desta forma será lido o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileReader arquivo = new FileReader("myFolder.txt");
            
            // Cria a instância de classe que vai armazenar os dado contidos no arquivo passando para o construtor o arquivo de leitura
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            // Lê a primeira linha
            String linha = lerArquivo.readLine();
            
            // Adiciona a linha na string de retorno
            toReturn.append(linha);
            
            // Percorre o restante das linhas do arquivo
            while (linha != null) {
                // Lê da segunda até a última linha a cada volta
                linha = lerArquivo.readLine();
                
                // Adiciona a linha na string de retorno
                toReturn.append(linha);
            }

            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            arquivo.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }

    public static void main(String[] args) {
        //
    }
}
