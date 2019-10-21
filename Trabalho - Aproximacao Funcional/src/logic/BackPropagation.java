/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author lab6
 */
public class BackPropagation {
    
    double[] t = new double[300];
    double w0 = 0.02074;
    double[][] v = { {0.085}, {-0.033}, {0.074}, {-0.075}, {0.088}, {-0.077}};
    double[][] w = { {0.082}, {-0.09}, {0.064}, {-0.08}, {0.084}, {-0.075}};
    double[][] v0 = { {0.09}, {-0.08}, {0.063}, {-0.065}, {0.076}, {-0.072}};
    double alpha = 0.00035;
    double [][]z = new double[6][1];
    double [][]zf = new double[6][1];
    double [][]zff = new double[6][1];
    double[]y =  new double [300];
    double[]yf =  new double [300];
    double[]yff =  new double [300];
    double[]erro =  new double [300];
    double[]errow =  new double [300];
    double[][]deltaw =  new double [6][1];
    double deltaw0 = 0.0;
    double[][]deltav =  new double [6][1];
    double[][]deltav0 =  new double [6][1];
    double[][]zz =  new double [6][1];
    double[][]zzf =  new double [6][1];
    double[][]zzff =  new double [6][1];
    double[]yy =  new double [300];
    double[]yyf =  new double [300];
    double[]HitomiTanaka =  new double [600];
    
    public void Iteration(){
        for (int i = 0; i < 300; i++) 
            t[i] = Math.sin(2*i*Math.PI/180) * Math.sin(i*Math.PI/180);
        
        int n = 0;
        while(n < 109000){
        //TERMINAR ESSE MÉTODO
        }
        
        
    }
}
