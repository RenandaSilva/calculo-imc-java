/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcimc;

import java.util.Set;
import javax.swing.JFrame;
import static sun.net.www.http.HttpClient.New;
import static sun.net.www.http.HttpClient.New;
import static sun.net.www.http.HttpClient.New;
import telas.PainelPrincipal;

/**
 *
 * @author Aluno
 */
public class CalcImc {

   
    public static void main(String[] args) {
        // renan baitolinha
        JFrame janela = new JFrame("Calculadora IMC");
        PainelPrincipal painel = new PainelPrincipal();
        
        //defini atributos da tela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(500,500);
        janela.add(painel);
        janela.setVisible(true);
        
        
    }
    
}
