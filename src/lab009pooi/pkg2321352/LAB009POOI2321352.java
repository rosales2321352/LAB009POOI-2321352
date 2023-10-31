/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab009pooi.pkg2321352;

import classes.Desarrollador;
import classes.Iniciativa;
import classes.IniciativaFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alumno
 */
public class LAB009POOI2321352 {

    static List<Desarrollador> employeeList = new ArrayList<>();
    
    public static void main(String[] args) {
        IniciativaFactory employeeFactory = new IniciativaFactory();
        employeeList = employeeFactory.getAllDesarrolladores();
    //TODO
    //1. Enumere todas las iniciativas distintas de manera descente.
        IniciativaFactory iniciativaFactory = new IniciativaFactory();
        List<Desarrollador> desarrolladores = iniciativaFactory.getAllDesarrolladores();
            List<String> iniciativasUnicas = desarrolladores.stream()
                .flatMap(d -> d.getIniciativas().stream())
                .map(Iniciativa::getNombre)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
            Collections.sort(iniciativasUnicas, Collections.reverseOrder());
            
            iniciativasUnicas.forEach(System.out::println);
    //2. Imprima el nombre completo de cualquier desarrollador cuyo nombre
    //comience con "A".
        desarrolladores.stream()
            .filter(desarrollador -> desarrollador.getNombres().startsWith("A"))
            .forEach(desarrollador -> System.out.println(desarrollador.getNombres() + " " + desarrollador.getApellidos()));
            
    //3. Liste todos los desarrolladores que se unieron en el año 2023 (el año
    //se extraerá del código del desarrollador, es decir, los primeros 4 caracteres)
           // Utilizar Streams para filtrar y mostrar los desarrolladores que se unieron en el año 2023
        desarrolladores.stream()
            .filter(desarrollador -> {
                String codigo = desarrollador.getCodigo();
                String yearJoined = codigo.substring(0, 4);
                return yearJoined.equals("2023");
            })
            .forEach(desarrollador -> System.out.println(desarrollador.getNombres() + " " + desarrollador.getApellidos())); 
    //4. Ordene los desarrolladores según el nombre; y luego ordene por
    //salario.
        desarrolladores.stream()
                .sorted(Comparator
                        .comparing(Desarrollador::getNombres)
                        .thenComparingInt(Desarrollador::getSalario)
                        
                )
                .collect(Collectors.toList());
        desarrolladores.forEach(desarrollador -> System.out.println(desarrollador.getNombres() + " -Salario: " + desarrollador.getSalario()));
    // 5. Imprimir los nombres de todos los desarrolladores con el tercer salario más alto.
        employeeList.stream()
                .sorted(Comparator.comparingInt(Desarrollador::getSalario).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(tercerDesarrollador -> System.out.println("Tercer salario más alto: " + tercerDesarrollador.getNombres()));

    // 6. Imprimir salario mínimo.
        int salarioMinimo = employeeList.stream()
                .mapToInt(Desarrollador::getSalario)
                .min()
                .orElse(0);
        System.out.println("Salario mínimo: " + salarioMinimo);

    // 7. Imprimir la lista de todos los desarrolladores con salario mínimo.
        List<Desarrollador> desarrolladoresSalarioMinimo = employeeList.stream()
                .filter(d -> d.getSalario() == salarioMinimo)
                .collect(Collectors.toList());
        System.out.println("Desarrolladores con salario mínimo:");
        desarrolladoresSalarioMinimo.forEach(d -> System.out.println(d.getNombres()));

    // 8. Liste a todas las personas que trabajan en más de 2 proyectos.
        List<Desarrollador> desarrolladoresMasDeDosProyectos = employeeList.stream()
                .filter(d -> d.getIniciativas().size() > 2)
                .collect(Collectors.toList());
        System.out.println("Desarrolladores con más de 2 proyectos:");
        desarrolladoresMasDeDosProyectos.forEach(d -> System.out.println(d.getNombres()));

    // 9. Conteo del total de laptops asignadas a los desarrolladores.
        int totalLaptopsAsignadas = employeeList.stream()
                .mapToInt(Desarrollador::getTotalLaptopsAsignados)
                .sum();
        System.out.println("Total de laptops asignadas a los desarrolladores: " + totalLaptopsAsignadas);
    


    //10. Recuento de todas las iniciativas con Luis Carrillo Lopez.
    //11. Lista de todas las personas que trabajan con Luis Carrillo Lopez.
    //12. Cree un mapa basado en estos datos, el key debe ser el año de
    //incorporación y el valor debe ser la lista de todos los desarrolladores que se
    //incorporaron en ese año en particular.
    //14. Cree un mapa basado en estos datos, el key debe ser el año de
    ///incorporación y el valor debe ser el recuento de personas que se unieron en ese año
    //en particular.
    }
}
