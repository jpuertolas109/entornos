/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

/**
 *
 * @author Profesor
 */
public class CuentaAhorro extends CuentaCorriente {


    private double interes;

    public CuentaAhorro(String titular, String numCuenta) {
        super(titular, numCuenta);
        this.interes = 2.5;
    }

    public double getInteres() {
        return this.interes;
    }

    public void calcularInteres() {
        setSaldo(getSaldo() - (getSaldo() * (this.interes / 100)));
    }

   public CuentaAhorro (String nombre, String cuenta, double saldo, double interes){
       super(nombre,cuenta,saldo,0);
       this.interes=interes;
       
   }
    
   

}
