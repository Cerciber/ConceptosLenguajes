Module Module1

    ' Funci�n 
    Sub funcion1()

        Console.WriteLine("Hola Mundo")

    End Sub

    ' Funci�n con atributos
    Sub funcion2(atributo1 As String, atributo2 As String)

        Console.WriteLine(atributo1 + " " + atributo2)

    End Sub

    ' Funci�n con retorno
    Function funcion3()

        Return "Hola Mundo"

    End Function

    ' Funci�n con atributos y retorno
    Function funcion4(atributo1 As String, atributo2 As String)

        Return atributo1 + " " + atributo2

    End Function

    Sub Main()

        ' Funci�n 1 
        funcion1()

        ' Funci�n 2 
        funcion2("Hola", "Mundo")

        ' Funci�n 3
        Console.WriteLine(funcion3())

        ' Funci�n 4
        Console.WriteLine(funcion4("Hola", "Mundo"))

        Console.In.ReadLine()

    End Sub

End Module
