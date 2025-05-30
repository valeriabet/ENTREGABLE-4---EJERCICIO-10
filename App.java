import java.util.Scanner;
import java.util.Stack;
public class App {
    static String historial;
    static String respuesta;
    static String paginaVisitada;
    static int opcion;
            
                public static void main(String[] args) throws Exception {
                    Scanner scanner = new Scanner (System.in);//Ceación objeto scanner
                    Stack <String> pilaURLs = new Stack<>();//Creación pila
            
                
                    System.out.println("Listado de opciones: ");
                
                    do{
                        System.out.println("1). Visitar URL nueva");
                    System.out.println("2). Desapilar");
                    System.out.println("3). Visitar URL actual");
                    System.out.println("4). Salir");
                    System.out.println("Seleccione una opción: ");
                    opcion = scanner.nextInt();
        
                if(opcion < 1 || opcion > 4){
                    System.out.println("Seleccione una opción correcta");
                }
        
                switch (opcion){
                    case 1:
                    scanner.nextLine();
                    do{
                        System.out.println("Escriba la URL de la página que desa visitar: ");
                        paginaVisitada = scanner.nextLine();
                        pilaURLs.push(paginaVisitada);//Inserta la pagina visitada en la pila 
                        System.out.println(pilaURLs);
            
    
                        System.out.println("Página visitada");
                        System.out.println("¿Desea visitar otra página? si/no: ");
                        respuesta = scanner.nextLine();

                    }while(respuesta == "no");//Permite al usuario seguir visitando mas URLs siempre y cuando la respuesta sea no
    
    
                    case 2:
                    scanner.nextLine();
                    while(!pilaURLs.isEmpty()){//Verifica si la pila está vacía
                        historial = pilaURLs.pop();
                        System.out.println("Se está saliendo de la página. ");
                    }
                    break;

                    case 3:
                    scanner.nextLine();
                    System.out.println("Página actual: " + historial);
                    break;
                }
            }while(opcion == 4);
                System.out.println("Se está saliendo del programa");
            }
    }

