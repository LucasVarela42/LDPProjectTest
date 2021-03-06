/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Animal;
import br.com.ifsc.projecttest.model.interfaces.InterfaceFly;
import br.com.ifsc.projecttest.model.interfaces.InterfaceRun;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;
import br.com.ifsc.projecttest.model.interfaces.InterfaceWalk;

/**
 *
 * @author Aluno
 */
public class Duck extends Animal implements InterfaceFly, InterfaceSwim, InterfaceWalk, InterfaceRun {

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void born() {
        System.out.println("Borning...");
    }

    @Override
    public void die() {
        System.out.println("Dying...");
    }

    @Override
    public String getSpecies() {
        return "DUCK";
    }
}
