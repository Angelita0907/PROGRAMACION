# función login con usuario y contraseña, tenemos 3 intentos debemos de contarlos

def login (usuario, contraseña, intentos):
    acceso = False
    
    while intentos <= 4 and acceso:
        if usuario == "usuario1" and contraseña == "asdasd":
            acceso = True

        else:
            acceso = False
            intentos +=1
            usuario = input("Indique nombre de usuario: ")
            contraseña = input("Indique contraseña: ")

    return [acceso, intentos]

usuario = input("Indique nombre de usuario: ")
contraseña = input("Indique contraseña: ")
intentos = 1

entrar = login(usuario,contraseña,intentos)

print(entrar[1])