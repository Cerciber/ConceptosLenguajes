#include <iostream>
#include <string>

using namespace std;

int main()
{

        /* Asignaci�n */
        string variable = "texto"; 
        cout<<"Asignaci�n = "<<variable<<endl;

        /* Asignaci�n con suma */
        int suma = 5; 
        suma += 3;
        cout<<"5 + 3 = "<<suma<<endl;

        /* Asignaci�n con resta */
        int resta = 5; 
        resta -= 3;
        cout<<"5 - 3 = "<<resta<<endl;

        /* Asignaci�n con multiplicaci�n */
        int multiplicacion = 5; 
        multiplicacion *= 3;
        cout<<"5 * 3 = "<<multiplicacion<<endl;

        /* Asignaci�n con divisi�n */
        double division = 5; 
        division /= 3;
        cout<<"5 / 3 = "<<division<<endl;

        /* Asignaci�n con modulo */
        int modulo = 5; 
        modulo %= 3;
        cout<<"5 % 3 = "<<modulo<<endl;

        /* Asignaci�n con incremento prefijo (incrementa y luego retorna) */
        int incrementoPrefijo = 5; 
        cout<<"5 incremento prefijo = "<<++incrementoPrefijo<<endl;

        /* Asignaci�n con incremento posfijo (retorna y luego incrementa) */
        int incrementoPosfijo = 5; 
        cout<<"5 incremento posfijo = "<<incrementoPosfijo++<<endl;

        /* Asignaci�n con decremento prefijo (decrementa y luego retorna) */
        int decrementoPrefijo = 5; 
        cout<<"5 decremento prefijo = "<<--decrementoPrefijo<<endl;

        /* Asignaci�n con decremento posfijo (retorna y luego decrementa) */
        int decrementoPosfijo = 5; 
        cout<<"5 decremento posfijo = "<<decrementoPosfijo--<<endl;
	
}
