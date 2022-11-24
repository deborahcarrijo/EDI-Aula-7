/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torrehanoi;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author deborah
 */
public class Pilha {
    long cont;
    
    // Método que imprime o movimento de um disco entre dois pinos
    void mover(int Origem, int Destino) {
        cont++;
    }
    
    //Função que imprime a quantidade de movimentos dos discos
    Long Movimento(){
        System.out.println("Quantidade de movimentos: " + cont);
        return cont;
    }

    // Método que implementa a recursão, onde Origem, Destino e Temporário são os pinos e n é a quantidade de discos
    void hanoi(int n, int Origem, int Destino, int Temporario) {

        if (n > 0) {
            hanoi(n - 1, Origem, Temporario, Destino); //executa hanoi para mover n-1 discos da origem para o temporário
            mover(Origem, Destino); //mover disco do pino origem atual para o pino destino atual
            hanoi(n - 1, Temporario, Destino, Origem); //executa hanoi para mover n-1 discos do temporário para destino
        }
    }
    
    //Método que calcula o tempo total de execução da instância baseado na hora de ínicio e de fim da execução
    void diferenca(Date Final, Date Inicial){
        long diferencaTempo = Final.getTime() - Inicial.getTime(); //Calcula a diferença de tempo
        long Milissegundos = TimeUnit.MILLISECONDS.toMillis(diferencaTempo) % 1000; //Quantidade de milissegundos
        long Segundos = TimeUnit.MILLISECONDS.toSeconds(diferencaTempo) % 60; //Quantidade de segundos
        long Minutos = TimeUnit.MILLISECONDS.toMinutes(diferencaTempo) % 60; //Quantidade de Minutos
        long Horas = TimeUnit.MILLISECONDS.toHours(diferencaTempo) % 24; //Quantidade de horas
        
        //Imprime os dados obtidos no formato desejado
        System.out.println("Tempo de execução da instância: " + Horas + ":" + Minutos + ":" + Segundos + ":" + Milissegundos);
    }
}
