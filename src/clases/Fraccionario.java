/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author jparedes2
 */
public class Fraccionario 
{
    private int numerador;
    private int denominador;
    private int mixto;
public Fraccionario (int numerador, int denominador, int mixto) throws DenominadorCeroException
{
   this.numerador= numerador;
   this.denominador= denominador;
   this.mixto= mixto;
   if (denominador == 0)
   {
       throw new DenominadorCeroException();
   }
}
    public int getMixto ()
    {
      return mixto;  
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void setMixto (int mixto)
    {
     this.mixto= mixto;   
    }
   
    
public Fraccionario sumar (Fraccionario f2) throws DenominadorCeroException
{
    Fraccionario f;
    int num, den, mix;
 
    num = this.numerador* f2.denominador + this.denominador* f2.numerador;
    den= this.denominador * f2.denominador;
    f= new Fraccionario (num, den, 1);
    return f;
}
public Fraccionario restar (Fraccionario f2) throws DenominadorCeroException
{
    Fraccionario f;
    int num, den;
 
    num = this.numerador* f2.denominador - this.denominador* f2.numerador;
    den= this.denominador * f2.denominador;
    f= new Fraccionario (num, den, 1);
    return f;
}
public Fraccionario multiplicar (Fraccionario f2) throws DenominadorCeroException
{
    Fraccionario f;
    int num, den;
 
    num = this.numerador*f2.numerador;
    den= this.denominador * f2.denominador;
    f= new Fraccionario (num, den, 1);
    return f;
}
public Fraccionario division (Fraccionario f2) throws DenominadorCeroException
{
    Fraccionario f;
    int num, den;
 
    num = this.numerador*f2.denominador;
    den= this.denominador * f2.numerador;
    f= new Fraccionario (num, den, 1);
    return f;
}

    public Fraccionario convertir (Fraccionario f4) throws DenominadorCeroException 
{
    Fraccionario f;
    int num, den,num2,den2, mix;
    num= f4.numerador%f4.denominador;
    den= f4.denominador;
    mix= f4.numerador/f4.denominador;
    
    f= new Fraccionario (num, den, mix);
    return f;
}
}

