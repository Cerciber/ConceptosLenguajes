#include <iostream>
#include <string>

using namespace std;

/* Funci�n */
void funcion1() {
    cout << "Hola Mundo" << endl;
}

/* Funci�n con atributos */
void funcion2(string atributo1, string atributo2) {
    cout << atributo1+" "+atributo2 << endl;
}

/* Funci�n con retorno */
string funcion3() {
    return "Hola Mundo";
}

/* Funci�n con atributos y retorno*/
string funcion4(string atributo1, string atributo2) {
    return atributo1 + " " + atributo2;
}

int main() {

    /* Funci�n 1 */
    funcion1();

    /* Funci�n 2 */
    funcion2("Hola","Mundo");

    /* Funci�n 3 */
    cout << funcion3() << endl;

    /* Funci�n 4 */
    cout << funcion4("Hola","Mundo") << endl;

}
