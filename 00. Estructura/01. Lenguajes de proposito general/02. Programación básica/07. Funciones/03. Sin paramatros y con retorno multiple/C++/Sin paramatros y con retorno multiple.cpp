
// Estructura de retorno
struct Return {
    tipo return1;
    tipo return2;
    tipo returnN;
};

// Creaci�n
Return funcion() {
    // Contenido
    return (Return) {valor1, valor2, valorN};
}

int main() {
    
    // Llamado
    /*Contexto*/ funcion() /*Contexto*/

    // Llamado en asignaci�n
    Return variables = funcion();
    tipo varible1 = variables.return1;
    tipo varible2 = variables.return2;
    tipo varibleN = variables.returnN;

    // Eliminaci�n
    NO SOPORTADO (SE ELIMINAN AL SALIR DE LOS CORCHETES CONTENEDORES)

}

