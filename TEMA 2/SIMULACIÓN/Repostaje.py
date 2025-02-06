import random

def imprimeMenu():
    print("1 -- Asignar coche a surtidor y repostar")
    print("2 -- Consultar estado de surtidor")
    print("3 -- Asignar precio al surtidor")
    print("4 -- Recargar surtidor")
    print("5 -- Cerrar el programa y salir")
    opcion = input("Indique que opción desea realizar: ").upper()
    while not(opcion== 1 or opcion== 2 or opcion== 3 or opcion== 4 or opcion== 5):
        print("1 -- Asignar coche a surtidor y repostar")
        print("2 -- Consultar estado de surtidor")
        print("3 -- Asignar precio al surtidor")
        print("4 -- Recargar surtidor")
        print("5 -- Cerrar el programa y salir")
        opcion = input("Indique que opción desea realizar: ").upper()
    return opcion

def validaMatricula(matricula):
    valida = False
    while len(matricula) !=7:
        for i in range(0,4):
            if matricula[i] < '0':
                print()

    return valida

def asiganSurtidor(matricula,dinero,combustible,surtidores):
    matricula = input()
    validaMatricula(matricula)
    tipo = input()
    dinero = input()

    if combustible == "diesel":
        repostaje = calculaLitro(dinero,precioDiesel)
    
    else:
        repostaje = calculaLitro(dinero,precioGasolina)
    
    surtidor = getSurtidor()

    return numsurtidor

def calculaLitro(dinero,precioLitro):
    numLitros = (dinero*100)/precioLitro
    return numLitros

def getSurtidor(numLitro, combustible, surtidor, precio):
    
    if combustible == "diesel":
        if surtidor[0] >= surtidor[1]:
            surtidores[0] = surtidores[0] - numLitro
            numSurtidor = 1
        else:
            surtidores[1] >= surtidores[1] - numLitro
    
    else:
        if surtidores[2]>= surtidores[3]:
            surtidores[2] = surtidores[2] - numLitro
        else:
            surtidores[3]>= surtidores[3] - numLitro

    return numSurtidor

def estadoSurtidor(surtidores):
    capacidadTotal = surtidores[0]+surtidores[1]+surtidores+[2]+surtidores[3]

    return capacidadTotal

def actualizaPrecio():
    preciodiesel = random.randint(100,150)
    preciogasolina = random.randint(100,150)
    
    return preciodiesel, preciogasolina

surtidores = [5000,5000,5000,5000]

opcion = " "
preciodiesel = random.randint(100,150)
preciogasolina = random.randint(100,150)

while opcion !=5:
    opcion = imprimeMenu()
    match opcion:
        case "1":
            matricula = []
            matricula = input("Indique su matrícula: ")
            dinero = int(input("Dime cuanto dinero quieres gastar: "))
            combustible = input("Dime el tipo de combustible: ")
            asiganSurtidor(matricula,dinero,combustible ,surtidores, precio)
            print(estadoSurtidor(surtidores))

        case "2":
            preciodiesel, preciogasolina = actualizaPrecio()
            print("Precio gasolina:", preciogasolina)
            print("precio diesel:", preciodiesel)
        
        case "3":
            print(precioSurtidor())
        
        case "4":
            print(recargarSurtidor())
        
        case "5":
            print("Cierra Programa")