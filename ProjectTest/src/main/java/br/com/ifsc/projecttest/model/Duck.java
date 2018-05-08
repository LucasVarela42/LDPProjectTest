/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Bird;
import br.com.ifsc.projecttest.model.interfaces.InterfaceFly;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;

/**
 *
 * @author Aluno
 */
public class Duck extends Bird implements InterfaceFly, InterfaceSwim {

    @Override
    public void makeNoise() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

}
