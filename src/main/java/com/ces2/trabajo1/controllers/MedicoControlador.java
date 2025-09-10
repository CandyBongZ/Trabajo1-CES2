package com.ces2.trabajo1.controllers;

import com.ces2.trabajo1.models.Paciente;
import com.ces2.trabajo1.repositories.Medicos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MedicoControlador {

    @GetMapping("/peticion1")
    public String peticion1(Model model) {

        String nombres = Medicos.lista.stream()
                .map(m -> m.getNombre())
                .collect(Collectors.joining(", "));

        model.addAttribute("nombres", nombres);

        return "vista1";
    }

    @GetMapping("/peticion2")
    public String peticion2(Model model) {
        IntSummaryStatistics stats = Medicos.lista.stream()
                .collect(Collectors.summarizingInt(m -> m.getPacientes().size()));

        model.addAttribute("conteo", stats.getCount());
        model.addAttribute("suma", stats.getSum());
        model.addAttribute("promedio", stats.getAverage());
        model.addAttribute("min", stats.getMin());
        model.addAttribute("max", stats.getMax());

        return "vista2";
    }

    @GetMapping("/peticion3")
    public String peticion3(Model model) {

        List<Paciente> pacientes = Medicos.lista.stream()
                .flatMap(medico -> medico.getPacientes().stream())
                .toList();

        List<String> diagnosticos = pacientes.stream()
                .map(p -> p.getDiagnostico())
                .toList();

        model.addAttribute("pacientes", pacientes);
        model.addAttribute("diagnosticos", diagnosticos);

        return "vista3";
    }

    @GetMapping("/peticion4")
    public String peticion4(Model model) {

        Boolean sinPacientes = Medicos.lista.stream()
                .anyMatch(m -> m.getPacientes().isEmpty());

        Boolean masDeDos = Medicos.lista.stream()
                .anyMatch(m -> m.getPacientes().size() > 1);

        Boolean ningunoConCincoOMas = Medicos.lista.stream()
                .noneMatch(m -> m.getPacientes().size() >= 5);

        model.addAttribute("sinPacientes", sinPacientes);
        model.addAttribute("masDeDos", masDeDos);
        model.addAttribute("ningunoConCincoOMas", ningunoConCincoOMas);

        return "vista4";
    }

    @GetMapping("/peticion5")
    public String peticion5(Model model) {

        List<Paciente> pacientes = Medicos.lista.stream()
                .flatMap(m -> m.getPacientes().stream())
                .toList();

        Paciente mayor = pacientes.stream()
                .max((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                .orElse(null);

        model.addAttribute("pacientes", pacientes);
        model.addAttribute("pacienteMayor", mayor);

        return "vista5";
    }


}

