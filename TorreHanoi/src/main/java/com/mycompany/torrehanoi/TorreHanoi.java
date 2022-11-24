/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.torrehanoi;

import javax.swing.JOptionPane; //Coletar imput do usuário
import java.time.LocalDateTime; //Fornecer a data e hora atual
import java.time.format.DateTimeFormatter; //Definir o formato de data e hora atual
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author deborah
 */
public class TorreHanoi {

    public static void main(String[] args) throws ParseException {
        int n; // número de discos
        
        Pilha Discos = new Pilha(); //Classe dos métodos
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS"); //Definindo o formato de declaração de novos objetos de data.
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm:ss:SS");
        
        LocalDateTime inicio = LocalDateTime.now(); //Recebe a data e hora atual de ínicio de execução da instância
        Date Inicial = sdf.parse(inicio.format(formatar)); //Formata e converte para string a data e hora recebidas
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de discos: ")); //Recebe o número de discos digitado pelo usuário

        Discos.hanoi(n, 1, 3, 2); //Executa o método recursivo “hanoi” movendo os n discos do pino 1 para o pino 3, usando o pino 2 como auxiliar
        Discos.Movimento(); //Imprime a quantidade de movimentos dos discos
        
        LocalDateTime fim = LocalDateTime.now(); //Recebe a data e hora atual do fim da execução da instância
        Date Final = sdf.parse(fim.format(formatar)); //Formata e converte para string a data e hora recebidas
        
        Discos.diferenca(Final, Inicial); //Calcula o tempo de execução do código subtraindo a hora inicial da final
    }
}
