/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.view;

import br.com.ifsc.projecttest.model.abstracts.Bird;
import br.com.ifsc.projecttest.model.Duck;
import br.com.ifsc.projecttest.model.Eagle;
import br.com.ifsc.projecttest.model.Pelican;
import br.com.ifsc.projecttest.model.Penguim;
import br.com.ifsc.projecttest.model.Vulture;
import br.com.ifsc.projecttest.model.Weka;
import br.com.ifsc.projecttest.model.interfaces.InterfaceFly;
import br.com.ifsc.projecttest.model.interfaces.InterfaceSwim;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Bird b1 = new Eagle();
        Bird b2 = new Vulture();
        Bird b3 = new Penguim();
        Bird b4 = new Weka();
        Bird b5 = new Duck();
        Bird b6 = new Pelican();
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(b1);
        birds.add(b2);
        birds.add(b3);
        birds.add(b4);
        birds.add(b5);
        birds.add(b6);
        for (Bird bird : birds) {
            if (bird instanceof InterfaceSwim) {
                ((InterfaceSwim) bird).swim();
            }
            if (bird instanceof InterfaceFly) {
                ((InterfaceFly) bird).fly();
            }
            bird.makeNoise();
        }
    }
}
