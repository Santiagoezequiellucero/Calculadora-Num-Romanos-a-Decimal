import com.sun.xml.internal.messaging.saaj.soap.ver1_1.SOAPFactory1_1Impl;
import java.util.Scanner;

public class CalculadoraRomanoArabica {
    
//metodos de las operaciones
    public static int Suma(int factor1, int factor2){
        
            return factor1 + factor2;
        }
    public static int Resta(int factor1, int factor2){
        
            return factor1 - factor2;
        }
    public static int Multiplicacion(int factor1, int factor2){
        
            return factor1 * factor2;
        }
    public static int Division(int factor1, int factor2){
        
            return factor1 / factor2;
        }
    
    public static int main(String[] args) {
        System.out.println("Ingrese la operacion deseada: (+,-,*,/)");
        Scanner tec = new Scanner(System.in);//objeto para que ingrese datos el usuario
        String op = null; 
        String nRom1 = null; 
        String nRom2 = null; 
        int factor1 = 0;
        int factor2 = 0;
        
        //si ingresa una operacion valida la bandera va a cambiar a "false"
        boolean correcto = true;
        do{
             
             op = tec.nextLine();
             op = op.trim();//elimina espacios antes y despues
           switch(op){
               case "+":
                   correcto=false;
                   break;
               case "-":
                   correcto=false;
                   break;
               case "*":
                   correcto=false;
                   break;
               case "/":
                   correcto=false;
                   break;
           }
           //Si la bandera sigue en "true" no ingreso una operacion correcta
          if (correcto){
               System.out.println("OPERACION NO VALIDA");
               System.out.println("Ingrese la operacion deseada: (+,-,*,/)");
               
           }
           
        } 
        //mientras no cumpla esa condicion seguira ejecutando en Do
        while (!"+".equals(op)&&!"-".equals(op)&&!"*".equals(op)&&!"/".equals(op));
        
        //pides los valores
       System.out.println("Ingrese primer numero romano [I, V, X, L, C, D, M]"); 
       nRom1 = tec.nextLine();
       
       System.out.println("Ingrese segundo numero romano [I, V, X, L, C, D, M]"); 
       nRom2 = tec.nextLine( );
       
       //usa el metodo conversion para regular lo ingresado por el usuario
        factor1 =  Conversion(nRom1);
        factor2 =  Conversion(nRom2);
        int result = 0;
        
         
        
        //genera la operacion con los factores ya en romano
        switch(op){
               case "+":
                   return Suma(factor1, factor2);
               case "-":
                   return Resta(factor1, factor2);
               case "*":
                   return Multiplicacion(factor1, factor2);
               case "/":
                   if(factor2 ==0){
                       System.out.println("EL DIVISOR NO PUEDE SER CERO"); 
                   }else{
                   result = factor1/factor2;}
                   break;
        }
        System.out.println("El resultado es: "+result);
        return 0;
    }
    
    //metodo para regular el ingreso de los caracteres por el usuario
    public static int Conversion(String num){
        num = num.toUpperCase();
        int result = 0;
        for (char c: num.toCharArray()){
             //if ( !"I".equals(c) && !"V".equals(c) && !"X".equals(c) && !"L".equals(c) && !"C".equals(c) && !"D".equals(c) && !"M".equals(c) ) {
                // System.out.println("CARACTER NO VALIDO ");
               // System.exit(0);
            //+}
            result = RomADec(c);
         
        }
        //Este if ordena en caso de que haya mas de un caracter romano(unidades, decenas, centenas)
        if(num.contains("IV")|| num.contains("IX")){
            result -=2;
        }
        if(num.contains("XL")||num.contains("XC")){
            result -=20;
        }
        if(num.contains("CD")||num.contains("CM")){
            result -=200;
        }
        return result;
    }
    
    //metodo para pasar de romanoa decimal
    public static int RomADec(char letra){
        switch(letra)
		{
			case 'I': return  1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default:System.err.println("Numero no valido");
                        break;
		}
        return 0;
		
				
    }
    
}
    

