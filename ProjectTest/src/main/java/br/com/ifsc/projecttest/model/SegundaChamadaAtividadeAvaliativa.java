/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifsc.projecttest.model;

import java.time.LocalDateTime;

/**
 *
 * @author admin
 */
public class SegundaChamadaAtividadeAvaliativa {
    private int id;
    private String local;
    private String turno;
    private LocalDateTime dataPedido;
    private String motivoProva;
    private LocalDateTime dataAvaliacao;
    private String justificativaProfessor;
    private String professorAplicadorProva;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getMotivoProva() {
        return motivoProva;
    }

    public void setMotivoProva(String motivoProva) {
        this.motivoProva = motivoProva;
    }

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDateTime dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getJustificativaProfessor() {
        return justificativaProfessor;
    }

    public void setJustificativaProfessor(String justificativaProfessor) {
        this.justificativaProfessor = justificativaProfessor;
    }

    public String getProfessorAplicadorProva() {
        return professorAplicadorProva;
    }

    public void setProfessorAplicadorProva(String professorAplicadorProva) {
        this.professorAplicadorProva = professorAplicadorProva;
    }
    
}
