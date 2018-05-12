/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import br.com.ifsc.projecttest.model.abstracts.Animal;
import br.com.ifsc.projecttest.model.interfaces.InterfaceRun;
import br.com.ifsc.projecttest.model.interfaces.InterfaceWalk;

/**
 *
 * @author Vinicius
 */
public class Monkey extends Animal implements InterfaceRun, InterfaceWalk {

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
        return "MONKEY";
    }
}
