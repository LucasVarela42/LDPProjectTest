/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Animal;
import br.com.ifsc.projecttest.model.interfaces.InterfaceBark;
import br.com.ifsc.projecttest.model.interfaces.InterfaceRun;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;
import br.com.ifsc.projecttest.model.interfaces.InterfaceWalk;

/**
 *
 * @author Aluno
 */
public class Dog extends Animal implements InterfaceWalk, InterfaceBark, InterfaceRun, InterfaceSwim {

    @Override
    public void born() {
        System.out.println("Borning...");
    }

    @Override
    public void die() {
        System.out.println("Dying...");
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void Bark() {
        System.out.println("Barking...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public String getSpecies() {
        return "DOG";
    }
}
