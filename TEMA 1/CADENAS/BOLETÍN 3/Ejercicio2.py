# Diseñar el juego "Acierta la contraseña". El primer jugador introduce una
# contraseña, el segundo, debe insertar otra intentando acertarla con las pistas
# que le dará el programa: número de caracteres, primera y última letra. El
# programa debe escribir "Acertaste" o "Fallaste"

print("ADIVINA LA CONTRASEÑA")

contraseña = input("Introduzca una clave: ")
adivinar = input("Intenta adiviniar: ")

while adivinar != contraseña:
    print("Pista 1: la contraseña tiene ",len(contraseña),"dígitos")
    print("Pista 2: el primer número es ", contraseña[0], "y el último es", contraseña[-1])

    adivinar = input("Intenta adiviniar: ")

print("Correcto! La adivinaste, la contraseña es", contraseña)

        
