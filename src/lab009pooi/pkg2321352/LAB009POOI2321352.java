/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab009pooi.pkg2321352;

import classes.Desarrollador;
import classes.IniciativaFactory;
import java.util.ArrayList;
import java.util.List;

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
    //2. Imprima el nombre completo de cualquier desarrollador cuyo nombre
    //comience con "A".
    //3. Liste todos los desarrolladores que se unieron en el año 2023 (el año
    //se extraerá del código del desarrollador, es decir, los primeros 4 caracteres)
    //4. Ordene los desarrolladores según el nombre; y luego ordene por
    //salario.
    //5. Imprima los nombres de todos los desarrolladores con el tercer salario
   // más alto. (Generalícelo para el enésimo salario más alto).
    //6. Imprimir salario mínimo.
    //7. Imprima la lista de todos los desarrolladores con salario mínimo.
    //8. Liste a todas las personas que trabajan en más de 2 proyectos.
    //9. Conteo del total de laptops asignadas a los desarrolladores.
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
