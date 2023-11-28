package programacaoJava.exercicioJavaDia4.exercicio1;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;
        OutputStream output = null;

        try {
            input = new FileInputStream("config.properties");

            // Carregar o arquivo .properties
            prop.load(input);

            // Obter os caminhos dos arquivos de entrada e saída
            String inputFile = prop.getProperty("input");
            String outputFile = prop.getProperty("output");

            // Ler o arquivo de entrada em um array de bytes
            byte[] buffer = new byte[1024];
            int length;
            input = new FileInputStream(inputFile);
            output = new FileOutputStream(outputFile);

            // Escrever o array de bytes no arquivo de saída
            while ((length = input.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}