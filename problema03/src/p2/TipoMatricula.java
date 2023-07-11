/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    ArrayList<Matricula> matriculas;

    public TipoMatricula(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public double establecerPromedioTarifas(){
        double promedioMatriculas=0;
        for (Matricula matricula:matriculas){
            promedioMatriculas+=matricula.getTarifa();
        }
        return promedioMatriculas/matriculas.size();
    }
}
