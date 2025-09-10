package com.ces2.trabajo1.repositories;

import com.ces2.trabajo1.models.Medico;
import com.ces2.trabajo1.models.Paciente;

import java.util.Arrays;
import java.util.List;

public class Medicos {

    public final static List<Medico> lista = Arrays.asList(
            new Medico("Dr. Juan Pérez", "Cardiólogo", 12,
                    Arrays.asList(
                            new Paciente("Carlos Gómez", 45, "Hipertensión"),
                            new Paciente("Ana Torres", 52, "Arritmia")
                    )
            ),
            new Medico("Dra. María López", "Pediatra", 8,
                    Arrays.asList(
                            new Paciente("Lucía Martínez", 6, "Asma"),
                            new Paciente("Diego Sánchez", 3, "Otitis")
                    )
            ),
            new Medico("Dr. Andrés Ramírez", "Dermatólogo", 10,
                    Arrays.asList(
                            new Paciente("Paula Hernández", 28, "Psoriasis")
                    )
            ),
            new Medico("Dra. Camila Ríos", "Ginecóloga", 15,
                    Arrays.asList(
                            new Paciente("Laura Gutiérrez", 32, "Embarazo de alto riesgo")
                    )
            ),
            new Medico("Dr. Felipe Castro", "Neurólogo", 20,
                    Arrays.asList(
                            new Paciente("Miguel Serrano", 60, "Epilepsia"),
                            new Paciente("Rosa Vargas", 40, "Neuralgia")
                    )
            ),
            new Medico("Dra. Sofía Morales", "Oncóloga", 18,
                    Arrays.asList(
                            new Paciente("Fernando López", 55, "Leucemia"),
                            new Paciente("Claudia Ramírez", 47, "Cáncer de mama")
                    )
            ),
            new Medico("Dr. Javier Peña", "Ortopedista", 9,
                    Arrays.asList(
                            new Paciente("Andrés Cárdenas", 30, "Fractura de fémur")
                    )
            ),
            new Medico("Dra. Natalia Vega", "Endocrinóloga", 11,
                    Arrays.asList(
                            new Paciente("Juliana Ortiz", 25, "Hipotiroidismo"),
                            new Paciente("Camilo Ruiz", 36, "Diabetes tipo 2")
                    )
            ),
            new Medico("Dr. Oscar Silva", "Otorrinolaringólogo", 13,
                    Arrays.asList(
                            new Paciente("Pedro Gallo", 50, "Rinitis crónica")
                    )
            ),
            new Medico("Dra. Diana Flores", "Psiquiatra", 16,
                    Arrays.asList(
                            new Paciente("María Fernanda Álvarez", 29, "Depresión"),
                            new Paciente("Luis Castro", 41, "Ansiedad")
                    )
            ),
            new Medico("Dr. Manuel Ortega", "Reumatólogo", 14, Arrays.asList()),
            new Medico("Dra. Valentina Cruz", "Internista", 7, Arrays.asList()),
            new Medico("Dr. Ricardo Pardo", "Urgenciólogo", 6, Arrays.asList()),
            new Medico("Dra. Juliana Herrera", "Nefróloga", 17, Arrays.asList()),
            new Medico("Dr. Samuel Mejía", "Gastroenterólogo", 10, Arrays.asList()),
            new Medico("Dra. Daniela Suárez", "Oftalmóloga", 5, Arrays.asList()),
            new Medico("Dr. Esteban Correa", "Traumatólogo", 22, Arrays.asList()),
            new Medico("Dra. Andrea Castaño", "Infectóloga", 9, Arrays.asList()),
            new Medico("Dr. Cristian Morales", "Anestesiólogo", 12, Arrays.asList()),
            new Medico("Dra. Carolina Herrera", "Neumóloga", 19, Arrays.asList())
    );
}
