/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

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
        // Grava os dados de fluxo de entrada baseado em bytes
        gravarDadosTXTFileOutputStream(dados);

        // Grava os dados de fluxo de entrada baseado em caracteres
//        gravarDadosTXTFileWrite(dados);
    }

    /**
     * Grava os dados enviados por parâmentro em um arquivo com a extenção
     * <b>.bin</b> no diretório raiz onde está sendo executado a aplicação,
     * utilizando o conceito de se basear em bytes
     * @param dados texto a ser gravado no arquivo
     */
    public static void gravarDadosBIN(String dados) {
        gravarDadosBINFileOutputStream(dados);
    }

    /**
     * Grava os dados enviados por parâmentro em um arquivo com a extenção
     * <b>.dat</b> no diretório raiz onde está sendo executado a aplicação
     * @param dados texto a ser gravado no arquivo
     */
    public static void gravarDadoDAT(String dados) {
        gravarDadosDATRandomAccessFile(dados);
    }

    /**
     * Grava os dados enviados por parâmentro em um arquivo com a extenção
     * <b>.csv</b> no diretório raiz onde está sendo executado a aplicação
     * @param dados texto a ser gravado no arquivo
     */
    public static void gravarDadosCSV(String dados) {
        gravarDadosCSVFileOutputStream(dados);
    }
    
    /**
     * Efetua a leitura do aquivo com a extenção <b>.txt</b>
     * @return retorno os dados do arquivo lido
     */
    public static String lerDadosTXT() {
        return lerArquivoTXTFileReader();
    }
    
    /**
     * Efetua a leitura do aquivo com a extenção <b>.txt</b> em formato binário
     * @return retorno os dados do arquivo lido
     */
    public static String lerDadosBIN() {
        return lerArquivoBINFileReader();
    }
    
    /**
     * Efetua a leitura do aquivo com a extenção <b>.dat</b>
     * @return retorno os dados do arquivo lido
     */
    public static String lerDadosDAT() {
        return lerArquivoDATDataInputStream();
    }
    
    /**
     * Efetua a leitura do aquivo com a extenção <b>.csv</b>
     * @return retorno os dados do arquivo lido
     */
    public static String lerDadosCSV() {
        return lerArquivoCSVFileReader();
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
            String pathWin = "c:" + File.separator + "utfpr"; // Define o diretório onde será salvo
            String pathLinux = File.separator + "home" + File.separator + "robson" + File.separator + "Modelos" + File.separator + "utfpr"; // Define o diretório onde será salvo
            File diretorio = new File(pathLinux); // Cria e instância o diretório
            File arquivo = new File(diretorio, "myFolder.txt"); // Cria e instância o arquivo e o diretóio onde será gravado
            
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
     * Fluxo de entrada baseada em bytes de um arquivo utilizando a classe FileOutputStream
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosBINFileOutputStream(String dados) {
        try {
            // Executa o método para gravar no arquivo passando como parâmetro o retorno no método que converte a String dos dados para binário
            gravarDadosTXTFileOutputStream(converteStringParaBinario(dados));
        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe FileOutputStream");
            e.printStackTrace();
        }
    }
    
    /**
     * Grava no arquivo utilizando a classe RandomAccessFile
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosDATRandomAccessFile(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver diretórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            // O segundo parâmetro refere-se ao tipo de acesso que será executado neste arquivo sendo:
            // "r" - Abra somente para leitura. Invocando qualquer um dos métodos de gravação do objeto resultante causará um IOException para ser acionada.
            // "rw" - Abre para leitura e escrita. Se o arquivo ainda não existir, em seguida, será feita uma tentativa de criá-lo.
            // "rws" - Abre para leitura e escrita, como com "rw", e também exigem que cada atualização para o conteúdo do arquivo ou metadados ser escrito de forma síncrona para o dispositivo de armazenamento subjacente.
            // "rwd" - Abre para leitura e escrita, como com "rw", e também exigem que cada atualização para o conteúdo do arquivo ser escrito de forma síncrona para o dispositivo de armazenamento subjacente.
            RandomAccessFile randomAccessFile = new RandomAccessFile("myFolder.dat", "rw");
            
            // Adiciona os dados no arquivo escrevendo no arquivo no formato em cada tipo de dados
//            randomAccessFile.writeInt(4523);
//            randomAccessFile.writeDouble(4368.761);
            randomAccessFile.writeUTF(dados);
//            randomAccessFile.writeInt(123);
//            randomAccessFile.writeDouble(342.541);
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            randomAccessFile.close();
            
        } catch (Exception e) {
            System.err.println("Ocorreu erro na gravação do arquivo utilizando a classe RandomAccessFile");
            e.printStackTrace();
        }
    }

    /**
     * Fluxo de entrada baseado em bytes de um arquivo utilizando a classe FileOutputStream
     * @param dados texto a ser gravado no arquivo
     */
    private static void gravarDadosCSVFileOutputStream(String dados) {
        try {
            // Cria o arquivo físico e o diretório se o mesmo tiver dirtórios deixando desta forma salvará o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            File file = new File("myFolder.csv");

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
     * Fluxo de saída baseada em caracteres de um arquivo utilizando a classe FileReader
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
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
            arquivo.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }

    /**
     * Fluxo de saída baseado em bytes de um arquivo utilizando a classe FileOutputStream
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
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
     * Efetua a leitura do arquivo <b>.dat</b> retorno os dados gravados em formato texto
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
     */
    private static String lerArquivoDATDataInputStream() {
        StringBuilder toReturn = new StringBuilder(); // Cria o buffer da String de retorno
        
        try {
            FileInputStream fileInputStream = new FileInputStream("myFolder.dat"); // Cria a instância do arquivo físico
            DataInputStream dataInputStream = new DataInputStream(fileInputStream); // Cria a instância da classe que fará a trasnformação dos dado gravados no arquivo físico
            
            // Adiciona na string de retorno os dados contidos no arquivo
//            toReturn.append(dataInputStream.readInt()).append("\n");
//            toReturn.append(dataInputStream.readDouble()).append("\n");
//            while (dataInputStream.equals(null)) {
                toReturn.append(dataInputStream.readUTF());
//            }
//            toReturn.append(dataInputStream.readInt()).append("\n");
//            toReturn.append(dataInputStream.readDouble()).append("\n");
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            dataInputStream.close();
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            fileInputStream.close();
            
        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe DataInputStream");
            e.printStackTrace();
        }
        
        return toReturn.toString();
    }
    
    /**
     * Efetua a leitura do arquivo binário retornando os dados gravado em formato texto
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
     */
    private static String lerArquivoBINFileReader() {
        StringBuilder bufferLeitura = new StringBuilder(); // Armazena os dados lidos do arquivo físico
        String toReturn = "";
        
        try {
            // Lê o arquivo físico deixando desta forma será lido o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileReader arquivo = new FileReader("myFolder.txt");
            
            // Cria a instância de classe que vai armazenar os dado contidos no arquivo passando para o construtor o arquivo de leitura
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            // Lê a primeira linha
            String linha = lerArquivo.readLine();
            
            // Percorre o restante das linhas do arquivo
            while (linha != null) {
                // Adiciona a linha na string de retorno
                bufferLeitura.append(linha);
                
                // Lê da segunda até a última linha a cada volta
                linha = lerArquivo.readLine();
            }
            
            // Converte os dados lidos do arqui para o formato de texto legivel
            toReturn = converteBinarioParaString(bufferLeitura.toString());
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            lerArquivo.close();
            
            // Fecha o arquivo liberando para ser acessado por outra aplicação ou pelo próprio sistema
            arquivo.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
            e.printStackTrace();
        }
        
        return toReturn;
    }
    
    /**
     * Efetua a leitura do arquivo <b>.csv</b> retornando os dados gravado em formato texto
     * @return retorna um valor do tipo texto do que tem escrito no arquivo
     */
    private static String lerArquivoCSVFileReader() {
        StringBuilder toReturn = new StringBuilder();
        
        try {
            // Lê o arquivo físico deixando desta forma será lido o arquivo na pasta raíz do projeto ou onde estiver sendo executado a aplicação
            FileReader arquivo = new FileReader("myFolder.csv");
            
            // Cria a instância de classe que vai armazenar os dado contidos no arquivo passando para o construtor o arquivo de leitura
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            // Lê a primeira linha
            String linha = lerArquivo.readLine();
            
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
            arquivo.close();

        } catch (Exception e) {
            System.err.println("Ocorreu erro na leitura do arquivo utilizando a classe FileReader");
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
    
//    public static void main(String[] args) {
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
        
//        System.out.println(lerArquivoDATDataInputStream());
        
//        gravarDadosTXTFileWrite("teste1\nteste2");
        
//        gravarDadosTXTFileOutputStream("texto1\ntexto2\ntexto3");
        
//        System.out.println(lerArquivoTXTFileInputStream());
//    }
}
