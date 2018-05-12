/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.view;

import br.com.ifsc.projecttest.model.Dog;
import br.com.ifsc.projecttest.model.Duck;
import br.com.ifsc.projecttest.model.Human;
import br.com.ifsc.projecttest.model.Monkey;
import br.com.ifsc.projecttest.model.Penguim;
import br.com.ifsc.projecttest.model.Shark;
import br.com.ifsc.projecttest.model.Whale;
import br.com.ifsc.projecttest.model.abstracts.Animal;
import br.com.ifsc.projecttest.model.interfaces.InterfaceBark;
import br.com.ifsc.projecttest.model.interfaces.InterfaceFly;
import br.com.ifsc.projecttest.model.interfaces.InterfaceRun;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;
import br.com.ifsc.projecttest.model.interfaces.InterfaceWalk;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Animal a1 = new Human();
        Animal a2 = new Dog();
        Animal a3 = new Shark();
        Animal a4 = new Whale();
        Animal a5 = new Penguim();
        Animal a6 = new Duck();
        Animal a7 = new Monkey();
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);
        animals.add(a6);
        animals.add(a7);
        for (int i = 0; i < animals.size(); i++) {
            executeAllActions(animals.get(i));
        }
    }

    public static void executeAllActions(Animal animal) {
        System.out.println(animal.getSpecies());
        animal.born();
        if (animal instanceof InterfaceBark) {
            ((InterfaceBark) animal).Bark();
        }
        if (animal instanceof InterfaceFly) {
            ((InterfaceFly) animal).fly();
        }
        if (animal instanceof InterfaceSwim) {
            ((InterfaceSwim) animal).swim();
        }
        if (animal instanceof InterfaceWalk) {
            ((InterfaceWalk) animal).walk();
        }
        if (animal instanceof InterfaceRun) {
            ((InterfaceRun) animal).run();
        }
        animal.die();
        System.out.println("");
    }
}
