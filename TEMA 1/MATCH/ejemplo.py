# ejerciciio 9 de while pero con match

"""correcto = 1234
contraseña = int(input("Escribe la contraseña (números del 1 al 10): "))

while not (contraseña == correcto):
    contraseña = int(input("Escribe la contraseña: "))
print("Bienvenido")"""

clave = int(input("Introduce la contraseña: "))

match clave:
    case 1234 | 4321:
        print("Correcto")
    case _:
        print("No es correcto")

