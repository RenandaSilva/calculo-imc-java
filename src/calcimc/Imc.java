/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcimc;

import java.text.DecimalFormat;


public class Imc {
    
    public double calcular(double peso, double altura){
        return  peso / (altura * altura);
    }
            
}
