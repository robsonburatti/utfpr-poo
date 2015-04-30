/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/**
 *
 * @author root
 */
public class FileUtil {

    /**
     * Grava os dados enviados por parâmetro em um arquivo com a extenção
     * <b>.txt</b> no dirtório raiz onde está sendo executado a aaplicação
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

    public static void gravarDadoDAT(String dados) {
        //
    }

    public static void gravarDadosCSV(String dados) {
        //
    }

    /**
     * Fluxo de entrada baseado em bytes de um arquivo utilizando a classe FileOutputStream
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
     * Fluxo de entrada baseada em caracteres de um arquivo utilizando a classe FileWrite
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosTXTFileWrite(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
//            FileWriter fileWriter = new FileWriter("myFolder.txt"); // Cria o arquivo físico na raiz onde está sendo executado o projeto
//            String pathWin = "c:\\utfpr\\myFolder.txt"; // INCORRETO
            String pathWin = "c:" + File.separator + "utfpr" + File.separator + "myFolder.txt";
            String pathLinux = File.separator + "home" + File.separator + "robson" + File.separator + "Modelos" + File.separator + "utfpr";
            File diretorio = new File(pathLinux);
            File arquivo = new File(diretorio, "myFolder.txt");
            
            if (!diretorio.exists()) {
                diretorio.mkdirs();
                
                if (!arquivo.exists()) {
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
     * Fluxo de entrada baseada em caracteres de um arquivo utilizando a classe FileWrite
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
    
    /**
     * Grava no arquivo utilizando a classe RandomAccessFile
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosDATRandomAccessFile(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            // O segundo parâmetro refere-se ao tipo de acesso que será executado neste arquivo sendo:
            // "r" - Abra somente para leitura. Invocando qualquer um dos métodos de gravação do objeto resultante causará um IOException para ser acionada.
            // "rw" - Abre para leitura e escrita. Se o arquivo ainda não existir, em seguida, será feita uma tentativa de criá-lo.
            // "rws" - Abre para leitura e escrita, como com "rw", e também exigem que cada atualização para o conteúdo do arquivo ou metadados ser escrito de forma síncrona para o dispositivo de armazenamento subjacente.
            // "rwd" - Abre para leitura e escrita, como com "rw", e também exigem que cada atualização para o conteúdo do arquivo ser escrito de forma síncrona para o dispositivo de armazenamento subjacente.
            RandomAccessFile randomAccessFile = new RandomAccessFile("myFolder.dat", "rw");
            
            // Adiciona os dados no arquivo escrevendo no arquivo no formato em cada tipo de dados
            randomAccessFile.writeInt(4523);
            randomAccessFile.writeDouble(4368.761);
            randomAccessFile.writeChars(dados);
            randomAccessFile.writeInt(123);
//            randomAccessFile.writeUTF("dados utf");
            randomAccessFile.writeDouble(342.541);
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            randomAccessFile.close();
            
        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe RandomAccessFile");
            e.printStackTrace();
        }
    }

    /**
     * Fluxo de saída baseado em bytes de um arquivo utilizando a classe FileOutputStream
     * @return retorna um valro do tipo texto do que tem escrito no arquivo
     */
    private static String lerArquivoTXTFileInputStream() {
        StringBuilder toReturn = new StringBuilder();
        
        try {
            // Lê o arquivo físico deixando desta forma será lido o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileInputStream entrada = new FileInputStream("myFolder.txt");
            
	    // Cria a instância de classe que vai armazenar os dado contidos no arquivo passando para o construtor o arquivo de leitura
            InputStreamReader entradaFormatada = new InputStreamReader(entrada);
	    
            // Armazena o valor inteiro de cada caracter lido no arquivo
            int caracter = entradaFormatada.read();
	    
            // Percorre todos os caracteres do arquivo e adiciona na string de retorno
	    while (caracter != -1) {
                // Adiciona o caracter lido na string de retorno
                toReturn.append((char) caracter);
                
                // Lê e avança o cursor de leitura para o próximo caracter
	    	caracter = entradaFormatada.read();
	    }
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            entradaFormatada.close();
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            entrada.close();
            
        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileInputStream");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }
    
    /**
     * Fluxo de saída baseada em caracteres de um arquivo utilizando a classe FileReader
     * @return retorna um valro do tipo texto do que tem escrito no arquivo
     */
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
            lerArquivo.close();
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            arquivo.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }

    private static String lerArquivoDATRandomAccessFile() {
        StringBuilder toReturn = new StringBuilder();
        
        try {
            FileInputStream fileInputStream = new FileInputStream("myFolder.dat");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            
//            randomAccessFile.writeInt(4523);
//            randomAccessFile.writeDouble(4368.761);
//            randomAccessFile.writeChars(dados);
//            randomAccessFile.writeInt(123);
//            randomAccessFile.writeUTF("dados utf");
//            randomAccessFile.writeDouble(342.541);
            
            toReturn.append(dataInputStream.readInt()).append("\n");
            toReturn.append(dataInputStream.readDouble()).append("\n");
            toReturn.append(dataInputStream.readChar()).append("\n");
            toReturn.append(dataInputStream.readInt()).append("\n");
//            toReturn.append(dataInputStream.readUTF()).append("\n");
            toReturn.append(dataInputStream.readDouble()).append("\n");
            
//            String data = dataInputStream.readLine();
//            toReturn.append(data).append("\n");
//            toReturn.append(dataInputStream.readInt());
//            toReturn.append(dataInputStream.readChar());
//            toReturn.append(dataInputStream.readDouble());
            
            dataInputStream.close();
            fileInputStream.close();
            
        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe RandomAccessFile");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }
    
    // <editor-fold desc="Conversores string -> binário e binário -> string">
    /**
     * Converte um texto em valores binários retornando em forma de texto os valores binários de cada caracter convertidos
     * @param dados texto a ser convertido em binário
     * @return retorna um texto com os valores binários de cada caracter
     */
    private static String converteStringParaBinario(String dados) {
        StringBuilder toReturn = new StringBuilder();

        // Percorre um array de caracteres transformando cada caracter em um valor binário separando cada um com um espaço
        for (char caracter : dados.toCharArray()) {
            toReturn.append(Integer.toBinaryString(caracter)).append(" ");
        }

        return toReturn.toString();
    }

    /**
     * Converte um texto com valores binários em texto normal retornando em forma de texto normal dos valores convertidos de binários
     * @param dados texto no formato binário para ser convertido para texto normal
     * @return retorna o texto no formato normal
     */
    private static String converteBinarioParaString(String dados) {
        StringBuilder toReturn = new StringBuilder();

        String[] valores = dados.split(" "); // Transforma os dados do arquivo em um array de String

        // Percorre a lista recuperando caracter por caracter
        for (int posicao = 0; posicao < valores.length; posicao++) {
            char caracter = (char) Integer.parseInt(valores[posicao], 2);
            toReturn.append(caracter);
        }

        return toReturn.toString();
    }// </editor-fold>
    
    public static void main(String[] args) {
//        gravarDadosTXTFileWrite("teste\nteste2\nteste3\nteste4\nasdasd");
//        System.out.println("dados do arquivo=" + lerArquivoTXTFileReader());
        
//        String binario = converteStringParaBinario("ola mundo");
//        
//        System.out.println("valor binario=" + binario);
//        
//        String msg = converteBinarioParaString(binario);
//        
//        System.out.println("msg=" + msg);
        
//        gravarDadosTXTFileOutputStream("teste1\nteste2\nteste3");
        
//        gravarDadosDATRandomAccessFile("teste1\nteste2");
        
//        System.out.println(lerArquivoDATRandomAccessFile());
        
        gravarDadosTXTFileWrite("teste1\nteste2");
        
//        gravarDadosTXTFileOutputStream("texto1\ntexto2\ntexto3");
        
//        System.out.println(lerArquivoTXTFileInputStream());
    }
}
