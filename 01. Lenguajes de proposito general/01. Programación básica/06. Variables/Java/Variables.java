package prueba;

public class Prueba {

    public static void main(String[] args) {

        // Creaci�n
    	tipo variable;                                 // Creaci�n simple
        tipo var1, var2, varN;                         // Creaci�n multiple
        tipo variable = valor;                         // Creaci�n simple con asignaci�n
        tipo var1 = val1, var2 = val2, varN = valN;    // Creaci�n multiple con asignaci�n

        // Asignaci�n
    	variable = valor;                      // Asignaci�n simple
        var1 = val1; var2 = val1; var3 = valN; // Asignaci�n de multiples valores en multiples variables
        var1 = var2 = var3 = valor;            // Asignaci�n de un valor en multiples variables

    	// Llamado
        /*Contexto*/ variable /*Contexto*/

    	// Eliminaci�n
    	NO SOPORTADO (EL GARBAGE COLLECTOR LA ELIMINA AUTOMATICAMENTE CUANDO YA ES INACCESIBLE)

        // Informaci�n
        variable.getClass().getName()       // Obtener tipo de la variable (Solo aplica para objetos)

    }
    
}
