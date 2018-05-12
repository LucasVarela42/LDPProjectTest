/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Animal;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;

/**
 *
 * @author Aluno
 */
public class Whale extends Animal implements InterfaceSwim {

    @Override
    public void born() {
        System.out.println("Borning...");
    }

    @Override
    public void die() {
        System.out.println("Dying...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public String getSpecies() {
        return "WHALE";
    }
}
