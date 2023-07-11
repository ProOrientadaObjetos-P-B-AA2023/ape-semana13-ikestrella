/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaColegio extends Matricula{
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double costoDeportes, double costoFolletos, double costoUniformes, double costoLaboratorios) {
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
        this.costoLaboratorios = costoLaboratorios;
    }

    public void establecerTarifa(){
        super.setTarifa(costoDeportes + costoFolletos + costoUniformes + costoLaboratorios);
    }

    @Override
    public String toString() {
        return "MatriculaColegio{" +
                "costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                ", costoLaboratorios=" + costoLaboratorios +
                '}'+super.toString();
    }
}
