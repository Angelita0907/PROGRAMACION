# Crea un programa que reciba una lista de cadenas y construya una lista sin 
# cadenas repetidas. Utiliza funciones de manera que tu programa sea lo más modular posible.
import random

def generaNumero ():
    listanum = []
    for i in range (0,100):
        listanum.append(random.randint(0,1000))
    return listanum

def numMayor(listanum):
    mayor = -9999
    for numero in listanum:
        if numero > mayor:
            mayor = numero
    return mayor

def numMenor(listanum):
    menor = 9999
    for numero in listanum:
        if numero < menor:
            menor = numero
    return menor

def sumaTotal(listanum):
    suma = 0
    for numero in listanum:
        suma = numero + suma
    return suma

def numMedia(listanum):
    media = sumaTotal(listanum)/len(listanum)
    return media

def SustituirNum(listanum):
    elemento = int(input("Que numero quieres sustituir de la lista: "))
    numeroSus = int(input("Indica que número deseas: "))
    for i in range(len(listanum)):
        if elemento == listanum[i]:
            listanum[i] = numeroSus
    return listanum

def imprimeMenu():
    print("A--Conoce el mayor")
    print("B--Conoce el menor")
    print("C--Obten la suma de todos los números")
    print("D--Obtener la media")
    print("E--Sustituir el valor de un elemento")
    print("F--Mostrar todos los números")
    opcion = input("Indique que opción desea realizar: ").upper()
    while not(opcion=="A" or opcion=="B" or opcion=="C" or opcion=="D" or opcion=="E" or opcion=="F"):
        print("A--Conoce el mayor")
        print("B--Conoce el menor")
        print("C--Obten la suma de todos los números")
        print("D--Obtener la media")
        print("E--Sustituir el valor de un elemento")
        print("F--Mostrar todos los números")
        opcion = input("Indique que opción desea realizar: ").upper()
    return opcion

opcion = imprimeMenu()
listanum = generaNumero()
print(listanum) 

match opcion:
    case "A":
        print("El número mas grande es:", numMayor(listanum))
    case "B":
        print("El número más pequeño es:", numMenor(listanum))
    case "C":
        print("La suma total es:", sumaTotal(listanum))
    case "D":
        print("La media es:", numMedia(listanum))
    case "E":
        print("El número sustituido es:", SustituirNum(listanum))
    case "F":
        print("Lista:")