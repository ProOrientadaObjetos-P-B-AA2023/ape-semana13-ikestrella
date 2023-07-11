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
public class MatriculaEscuela extends Matricula{
    private double costoLibros;
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;

    public MatriculaEscuela(double costoLibros, double costoDeportes, double costoFolletos, double costoUniformes) {
        this.costoLibros = costoLibros;
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
    }

    public void establecerTarifa(){
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        super.setTarifa(costoLibros+costoDeportes+costoFolletos+costoUniformes);
    }

    @Override
    public String toString() {
        return "MatriculaEscuela{" +
                "costoLibros=" + costoLibros +
                ", costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                '}'+super.toString();
    }
}
