package operaciones;

import java.util.Scanner;

public class operaciones {
      public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          
          boolean continuar=true;
          int opc, numero;
          
    while (continuar){
         
         System.out.println("************* MENÚ *************** ");
         System.out.print("");
         System.out.println("     1.-Números del 1 al 10  ");
         System.out.println("     2.-Factorial            ");
         System.out.println("     3.-Fibonacci            ");
         System.out.println("     4.-Palindromo           ");
         System.out.println("     5.-Desaparecer numeros  ");
         System.out.println("     6.-Salir                ");
         System.out.println("");
         System.out.println("Elige alguna de las siguientes opciones:");
         opc=leer.nextInt();
         switch (opc){
                 
             case 1:
                 
                 System.out.println(""); 
                 System.out.println("OPCIÓN 1: Números del 1 al 10");
                 recursividad(1);
                 System.out.println("");
                 System.out.println("");
                 
                 break;
                  
             case 2:
                 
                 System.out.println(""); 
                 System.out.println("OPCIÓN 2: Factorial");    
                 System.out.println("Ingrese un número");
                      numero=leer.nextInt();
                 System.out.println("El factorial de " +numero+  " es: " +Factorial(numero));
                 System.out.println("");
                 break;
           
             case 3:
                 
                System.out.println(""); 
                System.out.println("OPCIÓN 3: Fibonacci");
                Fibonacci(8);
                long posición = Fibonacci(8);
		System.out.println("El numero de la posición 8 en Fibonacci es: ");
                System.out.println("              " + posición);
                             
                    
                 System.out.println("");
                  break;
                  
             case 4:
                 
                 System.out.println(""); 
                 System.out.println("OPCIÓN 4: Palindromo");   
                 String cadena;
                 System.out.println("Escribe el texto:");
                 cadena=leer.next();
                 cadena= cadena.replace("","");
                 if(operaciones.Palindromo(cadena,0,cadena.length()-1)){
                 System.out.println("Es palindromo");
                      }
                             else{
                             System.out.println("No es palindromo");
                            
                         }
                      System.out.println("");  
                      break;
                         
             case 5:
                    
                 System.out.println(""); 
                 System.out.println("OPCIÓN 5: Desaparecer numeros");
                 Desaparecer(10);
                 System.out.println("");    
                     break;
                     
             case 6:
                  System.out.println("El programa ha finalizado..... "); 
                     System.exit(0);
                     break;  
                     default:
                     System.out.println("Valor no existente");
                     
       
          }
       } 
    }
            // metodos
            private static void recursividad(int r){
            if (r==11){
           }
               
            else{
            System.out.print(" "+r);
            recursividad (r+1);
            
       }
    }
          
            public static int Factorial (int i){
               
                if(i<=0){
                    return 1;
                } else {
                    return i*Factorial(i-1);
}
    }
               
            public static boolean Palindromo(String palabra, int i, int j){
               if(i !=palabra.length()/2){
                    if (palabra.charAt(i) ==palabra.charAt(j)){
                      return Palindromo(palabra,++i,--j);
                }
                    else
                        return false;
                    }
                            return true;
      
            
   }
            
            public static int Fibonacci( int f){
                if (f==0||f==1)
                      return f;
                  return Fibonacci(f-1)+Fibonacci(f-2);
           
     }       
            public static void Desaparecer(int n){
                 if (n>-1){
                   for (int i=0; i<=n; i++){
                      System.out.print("["+i+"]");
                              }
                System.out.println("");
                Desaparecer(n-1);
                
          }
     }
}
