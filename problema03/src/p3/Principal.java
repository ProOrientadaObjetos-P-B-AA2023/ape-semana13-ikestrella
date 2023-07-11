/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> matriculas= new ArrayList<>();
        matriculas.add(new MatriculaCampamento(100,200,50));
        matriculas.add(new MatriculaColegio(333,123,421,3));
        matriculas.add( new MatriculaEscuela(123,345,567,45));
        matriculas.add (new MatriculaJardin(345,123,65));
        matriculas.add(new MatriculaMaternal(567,12,30));
        matriculas.add(new MatriculaMaternal(231,34,54));
        for (Matricula matricula: matriculas){
            matricula.establecerTarifa();
        }
        TipoMatricula tipos= new TipoMatricula(matriculas);
        for (Matricula matricula: matriculas)
            System.out.println(matricula);
        System.out.printf("Promedio Tarifas: %s\n", tipos.establecerPromedioTarifas());
    }
}
