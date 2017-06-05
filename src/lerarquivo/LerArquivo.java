/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 691200318
 */
public class LerArquivo {
    
    static ArrayList<Sala> salas = new ArrayList<Sala>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arquivo = "dados.txt";
        try{
            // LER ARQUIVO INTEIRO
            String ler = new Scanner(new File(arquivo), "UTF-8").useDelimiter("\\A").next();
            String[] linhas = ler.split(";");
            // LÊ A PRIMEIRA LINHA
            //String firstLine = new Scanner(new File(arquivo)).nextLine();
            //firstLine = firstLine.replace(";", "");
            
            for(int i = 0;i < linhas.length;i++){
                String[] opcoes = linhas[i].split(" ");
                Sala sala = new Sala();
                
                if(opcoes.length == 12){
                    sala.setRoom(opcoes[1]);
                    sala.setPorta1(opcoes[2] + " " + opcoes[3]);
                    sala.setPorta2(opcoes[4] + " " + opcoes[5]);
                    sala.setPorta3(opcoes[6] + " " + opcoes[7]);
                    sala.setPorta4(opcoes[8] + " " + opcoes[9] + " -> " + opcoes[10] + " " + opcoes[11]);
                    salas.add(sala);
                }else if(opcoes.length == 10){
                    sala.setRoom(opcoes[1]);
                    sala.setPorta1(opcoes[2] + " " + opcoes[3]);
                    sala.setPorta2(opcoes[4] + " " + opcoes[5]);
                    sala.setPorta3(opcoes[6] + " " + opcoes[7]);
                    if(!opcoes[8].equals("up") && !opcoes[8].equals("down"))
                        sala.setPorta4(opcoes[8] + " " + opcoes[9]);
                    else
                        sala.setPorta3(opcoes[6] + " " + opcoes[7] + " -> " + opcoes[8] + " " + opcoes[9]);
                    salas.add(sala);
                }else if(opcoes.length == 8){
                    sala.setRoom(opcoes[1]);
                    sala.setPorta1(opcoes[2] + " " + opcoes[3]);
                    sala.setPorta2(opcoes[4] + " " + opcoes[5]);
                    if(!opcoes[6].equals("up") && !opcoes[6].equals("down"))
                        sala.setPorta3(opcoes[6] + " " + opcoes[7]);
                    else
                        sala.setPorta2(opcoes[4] + " " + opcoes[5] + " -> " + opcoes[6] + " " + opcoes[7]);
                    salas.add(sala);
                }else if(opcoes.length == 6){
                    sala.setRoom(opcoes[1]);
                    sala.setPorta1(opcoes[2] + " " + opcoes[3]);
                    sala.setPorta2(opcoes[4] + " " + opcoes[5]);
                    salas.add(sala);
                }else if(opcoes.length == 4){
                    sala.setRoom(opcoes[1]);
                    sala.setPorta1(opcoes[2] + " " + opcoes[3]);                    
                    salas.add(sala);
                }
            }
            
            for (Sala sala : salas) {
                print(sala.toString());
            }
            
            print("-------------------------------------------------------------");
            print("TODAS AS SALAS FORAM CRIADAS COM SUCESSO!");
        }catch(FileNotFoundException err){
            //new FileNotFoundException("Arquivo não foi encontrado!");
            System.out.println(err.getMessage());
            System.out.println(err.getStackTrace());
        }
    }
    
    public static void print(String s){
        System.out.println(s);
    }
    
}
