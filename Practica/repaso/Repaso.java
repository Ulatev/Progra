package com.mycompany.repaso;

/**
 *
 * @author Luis Ulate 23/02/2023
 */
public class Repaso {

 
    
    public static void main(String[] args) {
        
    //Ejercicio (1) (a) Area de un triangulo
 
    int base = 057;
    int alto = 064;
    double area = base*alto/2;       
    
   
    System.out.println ("El area del triangulo es de: "+ area);    
    System.out.println ("------------------------------------");
           
            
    //Ejercicio (b) Area de un circulo 
   
    
    double PI = 3.141592;
    double radio = 0xC;
    double areaa1;
    
    areaa1 = PI * Math.pow(radio,2);
    
    System.out.println("El area del circulo es de: " +areaa1);
    
    System.out.println ("------------------------------------");
    
    
    //Ejercicio (c) IMC
    
   
    int peso=86;
    int altura=180;
    double imc = peso/altura^2;
        
    System.out.println("El IMC de la persona es de: "+ imc);
    
    System.out.println ("------------------------------------");
    
    //Ejercicio (2)  Expreciones aritmeticas
    
    int a = 8;
    int b = 3;
    int c = 5;
    double opa, opb, opc, opd, ope, opf, opg, oph, opi, opj;
    
    opa = a + b + c; 
    opb = a/b;
    opc = a/c;
    opd = 2*b+3*(a-c);
    ope = a%b;
    opf = a%c;
    opg = a*opb/c;
    oph = a*c/b;
    opi = a*b/c;
    opj = (a-c*b)%(c+2*a)/(a-c);
    
    System.out.println ("El resultado de la primera operacion es de: "+opa);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la segunda operacion es de: "+opb );
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la tercer operacion es de: "+opc);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la cuarta operacion es de: "+opd);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la quinta operacion es de: "+ope);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la sexta operacion es de: "+opf);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la septima operacion es de: "+opg);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la octava operacion es de: "+oph);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la novena operacion es de: "+opi);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la decima operacion es de: "+opj);
    System.out.println ("------------------------------------");
    
    //Ejercicio (3) Variables tipo String
    
    int c1, c2, c3;
    double op1, op2, op3, op4;
    
    c1 =54;
    c2 =20;
    c3 =36;
    
    op1 = c1 + c2;
    op2 = c1 / c3;
    op3 = c1 * c3 + c2;
    op4 = c2^2 * c1 - c2;
    
    System.out.println ("El resultado de la primera operacion es de: "+op1);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la segunda operacion es de: "+op2);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la tercera operacion es de: "+op3);
    System.out.println ("------------------------------------");
    System.out.println ("El resultado de la cuarta operacion es de: "+op4);
    System.out.println ("------------------------------------");
    
    //Ejercicio (4) Variables tipo Boolen
    
    boolean x,y,z;
    boolean ope1, ope2, ope3, ope4;
   
    x = true;
    y = false;
    z = true;
    
    ope1 = (x && y) || (x && z);
    ope2 = x & z && y;
    ope3 = x & !y & !x && !x &z;       
    ope4 = !x & z & (!z & !x);
    
    System.out.println("El valor de la expresion logica es: "+ope1);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion logica es: "+ope2);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion logica es: " +ope3);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion logica es: "+ope4);
    System.out.println ("------------------------------------");
    
    //Ejercicio (5) y (6) Variables tipo flotantes
    
    int L, J;
    float X, Y;
    boolean num1, num2, num3, num4, num5, num6, num7;
    char C, D;
    
    L = 9;
    J = 4;
    C = 5;
    D = 3;
    
    X = 0.005F;
    Y = -0.01F;
    
    num1 = (L <= J);
    num2 = !(L <= J);
    num3 = !(X > 0);
    num4 = (L < 0 && J < 9);
    num5 = (J == (L - 10));
    num6 = (X != L);
    num7 = ((a + b) == 99);
    
    System.out.println("El valor de la expresion es: "+num1);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num2);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num3);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num4);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num5);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num6);
    System.out.println ("------------------------------------");
    System.out.println("El valor de la expresion es: "+num7);
    System.out.println ("------------------------------------");


    
    }
}



