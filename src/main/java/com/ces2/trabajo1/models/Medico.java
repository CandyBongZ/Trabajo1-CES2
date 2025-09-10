package com.ces2.trabajo1.models;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private String especialidad;
    private int experiencia;
    private List<Paciente> pacientes;

    public Medico(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.pacientes = new ArrayList<>();
    }

    public Medico(String nombre, String especialidad, int experiencia, List<Paciente> pacientes) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void agregarPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad + " (" + experiencia + " años exp.)";
    }
}
