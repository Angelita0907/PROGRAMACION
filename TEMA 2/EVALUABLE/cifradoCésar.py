def cifrarCesar(alfabeto, texto, numDesplazamiento):
    cifrado = []
    for i in range (len(texto)):  
        posicion = alfabeto.index(texto[i])
        posicion_nueva = posicion + numDesplazamiento
        if posicion > 27:
            posicion_nueva = posicion_nueva - len(alfabeto) + numDesplazamiento
        nuevaletra = alfabeto[posicion_nueva]

        cifrado.append(nuevaletra)

    return cifrado

def descifrarCesar(alfabeto, texto, numDesplazamiento):
    descifrado = []
    for i in range (len(texto)):  
        posicion = alfabeto.index(texto[i])
        posicion_nueva = posicion - numDesplazamiento
        if posicion < 0:
            posicion_nueva = posicion_nueva + len(alfabeto) - numDesplazamiento
        nuevaletra = alfabeto[posicion_nueva]

        descifrado.append(nuevaletra)

    return descifrado

def validaNumcaracteres():
    validaCaracteres = False

    return validaCaracteres

def validaNumDesplazamiento():
    validaClave = False

    return validaClave

def imprimeMenu():
    print("A -- Introducir nuevo usuario")
    print("B -- Modificar palabra clave de cifrado")
    print("C -- Asignar precio al surtidor")
    print("D -- Recargar surtidor")
    print("E -- Cerrar el programa y salir")
    print("F -- Terminar")
    opcion = input("Indique que opción desea realizar: ").upper()
    while not(opcion== "A" or opcion== "B" or opcion== "C" or opcion== "D" or opcion== "E" or opcion=="F"):
        print("A -- Introducir nuevo usuario")
        print("B -- Modificar palabra clave de cifrado")
        print("C -- Asignar precio al surtidor")
        print("D -- Recargar surtidor")
        print("E -- Cerrar el programa y salir")
        print("F -- Terminar")
        opcion = input("Indique que opción desea realizar: ").upper()
    return opcion

def nuevoUsuario():
    nuevoUsuario = input("Indique su nombre de usuario: ")
    if nuevoUsuario not in usuarios:
        usuarios.append(nuevoUsuario)
        nuevaClave = int(input("Indique su clave (NumDes que va a usar): "))
        clave.append(nuevaClave)   
    else:
        print("El usuario ya está registrado")

    return usuarios, clave

def modificarClave ():
    usuario = input("Indique nombre de usuario: ")

    if usuario in usuarios:
        posUsuario = usuarios.index(usuario)
        nuevaClave = int(input("Indique su nueva clave: "))
        mensaje = input("Clave modificada")
    
    else:
        mensaje = input("Usuario no encontrado")

    return mensaje

alfabeto = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"]
usuarios = []
clave = []
opcion =""
while opcion !="F":
    opcion = imprimeMenu()
    match opcion:
        case "A":
            print(nuevoUsuario())
            
        case "B":
            print(modificarClave())
        
        case "C":
            print()
        
        case "D":
            print()
        
        case "E":
            print()
        
        case "F":
            print("Fin del programa")