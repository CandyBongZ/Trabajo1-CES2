# Trabajo 1 - Evaluación de Peticiones con Spring Boot

Este proyecto es una aplicación desarrollada en **Java** utilizando el framework **Spring Boot**. La aplicación implementa cinco peticiones que permiten realizar diferentes operaciones relacionadas con médicos y pacientes. A continuación, se describen las peticiones y su funcionalidad.

## Requisitos
- **Java 21** o compatibles
- **Maven** para la gestión de dependencias
- **Thymeleaf** para las vistas HTML

## Estructura del Proyecto
El proyecto está organizado en las siguientes capas:
- **Modelos**: Clases que representan las entidades principales (`Medico` como clase A y `Paciente` como la clase B).
- **Controladores**: Clases que manejan las peticiones HTTP.
- **Vistas**: Archivos HTML que muestran los resultados al usuario.

## Peticiones Implementadas

### 1. `/peticion1`
**Descripción**: Devuelve una lista con los nombres de todos los médicos registrados.

- **Vista**: `vista1.html`
- **Lógica**: Se recorre la lista de médicos y se concatenan sus nombres en un solo string.
- **Resultado esperado**: Una cadena con los nombres de los médicos separados por comas.

---

### 2. `/peticion2`
**Descripción**: Muestra estadísticas sobre la cantidad de pacientes asignados a los médicos.

- **Vista**: `vista2.html`
- **Lógica**: Se calculan el total, promedio, mínimo, máximo y conteo de pacientes por médico.
- **Resultado esperado**: Estadísticas numéricas sobre los pacientes.

---

### 3. `/peticion3`
**Descripción**: Lista todos los pacientes y sus diagnósticos.

- **Vista**: `vista3.html`
- **Lógica**: Se recorren los médicos y se recopilan todos los pacientes y sus diagnósticos.
- **Resultado esperado**: Una lista de pacientes y otra lista con sus respectivos diagnósticos.

---

### 4. `/peticion4`
**Descripción**: Responde preguntas sobre la cantidad de pacientes asignados a los médicos.

- **Vista**: `vista4.html`
- **Lógica**:
  - ¿Hay médicos sin pacientes?
  - ¿Hay médicos con más de 1 paciente?
  - ¿Ningún médico tiene 5 o más pacientes?
- **Resultado esperado**: Respuestas booleanas (`true` o `false`) a las preguntas.

---

### 5. `/peticion5`
**Descripción**: Muestra todos los pacientes y destaca al paciente de mayor edad.

- **Vista**: `vista5.html`
- **Lógica**: Se busca el paciente con la mayor edad entre todos los pacientes registrados.
- **Resultado esperado**: Una lista de pacientes y el paciente de mayor edad.

---

## Ejecución del Proyecto
1. Clona este repositorio:
   ```bash
   git clone <https://github.com/CandyBongZ/Trabajo1-CES2.git>