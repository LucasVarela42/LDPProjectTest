/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Bird;
import br.com.ifsc.projecttest.model.interfaces.InterfaceFly;

/**
 *
 * @author Aluno
 */
public class Pelican extends Bird implements InterfaceFly {

    @Override
    public void makeNoise() {
        System.out.println("Whoaa");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

}
