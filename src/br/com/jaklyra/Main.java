package br.com.jaklyra;

public class Main {

    public static void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //&& - and(e) - CONJUNÇÃO
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));

        //|| - or(ou) - DISJUNÇÃO
        System.out.println("b2 || b3 = " + (b2 || b3));
        System.out.println("b2 || b4 = " + (b2 || b4));

        //^ - xor - DISJUNÇÃO EXCLUSIVA
        System.out.println("b1 ^ b3 = " + (b1 ^ b3));
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));

        //! - INVERSÃO -NEGAÇÃO
        System.out.println("!b1 =" + (b1));
        System.out.println("!b2 =" + (b2));


        int i1 = 10;
        int i2 = 5;

        float f1 = 20f;
        float f2 = 50f;

        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));
        System.out.println("(i1 + i2) <  (f2 - f1) && true " + ((i1 + i2) <  (f2 - f1) && true));

        double salarioMensal = 15456.90d;
        double mediaSalario = 11997.90d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes =  quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("recebeAuxilio " + recebeAuxilio);


    }
}
