
// Estructura de retorno
struct Return {
    tipo return1;
    tipo return2;
    tipo returnN;
};


// Creaci�n con parametros limitados
Return funcion(tipo var1, tipo var2, tipo varN) {
    // Contenido
    return (Return) {valor1, valor2, valorN};
}

// Creaci�n con parametros ilimitados
Return funcion(tipo variables, ...) {
    // Contenido
    return (Return) {valor1, valor2, valorN};
}

// Creaci�n con parametros por defecto (Los valores por defecto de pueden omitir en el llamado)
NO SOPORTADO

int main() {
    
    // Llamado
    /*Contexto*/ funcion(valor1, valor2, valorN) /*Contexto*/

    // Llamado con asignaci�n
    Return variables = funcion(valor1, valor2, valorN);
    tipo varible1 = variables.return1;
    tipo varible2 = variables.return2;
    tipo varibleN = variables.returnN;

    // Eliminaci�n
    NO SOPORTADO (SE ELIMINAN AL SALIR DE LOS CORCHETES CONTENEDORES)

}
