# En una segunda versión del programa anterior, se debe escribir "Acertaste" o
# "Menor" o "Mayor", según la palabra introducida sea menor alfabéticamente
# que la contraseña, o mayor

print("ADIVINA LA CONTRASEÑA")

contraseña = input("Introduzca una clave: ")
adivinar = input("Intenta adiviniar: ")

while adivinar != contraseña:
    print("Pista 1: la contraseña tiene ",len(contraseña),"dígitos")
    print("Pista 2: el primer número es ", contraseña[0], "y el último es", contraseña[-1])

    if len(adivinar) < len(contraseña):
        print("La longitud introducida es más pequeña que la contraseña") 
    
    elif len(adivinar) > len(contraseña):
        print("La longitud introducida es mayor que la contraseña")

    adivinar = input("Intenta adiviniar: ")

print("Correcto! La adivinaste, la contraseña es", contraseña)