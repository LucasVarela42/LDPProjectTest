/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.interfaces.InterfaceExemplo;

/**
 *
 * @author Aluno
 */
public class Exemplo implements InterfaceExemplo {

    @Override
    public void helloWorld() {
        System.out.println("Olá mundo");
    }

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

}
