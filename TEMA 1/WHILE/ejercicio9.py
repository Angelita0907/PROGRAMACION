# Construye un programa que pida al usuario una contraseña, de forma repetitiva 
# mientras que no introduzca "1234". Cuando finalmente escriba la contraseña correcta, 
# se le dirá "Bienvenido" y terminará el programa.

correcto = 1234
contraseña = int(input("Escribe la contraseña (números del 1 al 10): "))

while not (contraseña == correcto):
    contraseña = int(input("Escribe la contraseña: "))
print("Bienvenido")