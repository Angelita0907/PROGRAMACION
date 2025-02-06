def validarMatricula(matricula):
    if len(matricula) != 7:
        return False
    for i in range(4):  
        if not ("0" <= matricula[i] <= "9"):
            return False
    for i in range(4, 7):  
        if not ("A" <= matricula[i].upper() <= "Z"):
            return False
    return True


def repostarSurtidor():
    matricula = input("Introduce la matrícula del coche (formato 4 números y 3 letras): ")
    if not validarMatricula(matricula):
        print("Matrícula no válida. Inténtalo de nuevo.")
        return

    tipo_combustible = input("Introduce el tipo de combustible (gasolina o diesel): ").lower()
    if tipo_combustible not in ["gasolina", "diesel"]:
        print("Tipo de combustible no válido. Inténtalo de nuevo.")
        return

    dinero = float(input("¿Cuánto dinero quieres gastar? (mínimo 10 euros): "))
    if dinero < 10:
        print("El importe mínimo es 10 euros. Inténtalo de nuevo.")
        return

    precios = precio[0] if tipo_combustible == "gasolina" else precio[1]
    litros = dinero / precios

    inicio = 0 if tipo_combustible == "gasolina" else 2
    fin = inicio + 2

    surtidor_seleccionado = -1
    menor_combustible = float("inf")
    for i in range(inicio, fin):
        if surtidores_actual[i] < menor_combustible:
            surtidor_seleccionado = i
            menor_combustible = surtidores_actual[i]

    if surtidor_seleccionado != -1 and surtidores_actual[surtidor_seleccionado] >= litros:
        surtidores_actual[surtidor_seleccionado] -= litros
        print(f"Repostando {litros:.2f} litros de {tipo_combustible.upper()} en el surtidor {surtidor_seleccionado + 1}")
    else:
        print("No hay suficiente combustible en el surtidor")


def estadoSurtidor():
    for i in range(len(surtidores_actual)):
        tipo_combustible = "gasolina" if i < 2 else "diesel"
        print(f"Surtidor {i + 1} ({tipo_combustible}): {surtidores_actual[i]} litros disponibles")


def PrecioRepostar():
    tipo_combustible = input("¿Qué combustible quieres cambiar el precio? (gasolina o diesel): ").lower()
    if tipo_combustible not in ["gasolina", "diesel"]:
        print("Tipo de combustible no válido. Inténtalo de nuevo.")
        return

    nuevo_precio = float(input(f"Introduce el nuevo precio para {tipo_combustible}: "))
    if nuevo_precio <= 0:
        print("El precio debe ser mayor que 0. Inténtalo de nuevo.")
        return

    if tipo_combustible == "gasolina":
        precio[0] = nuevo_precio
    else:
        precio[1] = nuevo_precio
    print("Nuevo precio de {tipo_combustible}: {nuevo_precio} €/litro")


def recargaSurtidor():
    surtidor_id = int(input("Introduce el número del surtidor a recargar (1-4): ")) - 1
    if surtidor_id < 0 or surtidor_id >= len(surtidores_actual):
        print("Surtidor no válido. Inténtalo de nuevo.")
        return

    surtidores_actual[surtidor_id] = 5000
    tipo_combustible = "gasolina" if surtidor_id < 2 else "diesel"
    print("Surtidor {surtidor_id + 1} recargado. Ahora tiene 5000 litros de {tipo_combustible}.")


def imprimeMenu():
    continuar = True  
    while continuar:
        print("\n--- Menú Principal ---")
        print("1. Asignar coche a surtidor y repostar")
        print("2. Consultar estado de surtidores")
        print("3. Asignar precio al surtidor")
        print("4. Recargar surtidor")
        print("5. Salir")
        opcion = input("Elige una opción (1-5): ")

        if opcion == "1":
            repostarSurtidor()
        elif opcion == "2":
            estadoSurtidor()
        elif opcion == "3":
            PrecioRepostar()
        elif opcion == "4":
            recargaSurtidor()
        elif opcion == "5":
            print("Cierra Programa")
            continuar = False

imprimeMenu()

surtidores_actual = [5000, 5000, 5000, 5000] 
precio = [1.5, 1.3]  