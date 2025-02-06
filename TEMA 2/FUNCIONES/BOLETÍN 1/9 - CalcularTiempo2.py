# Escribir dos funciones que permitan calcular:
# La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
# con un menu para elegir que deseas hacer

def conversorsegundos(tiempo):
    segundos = tiempo % 60
    return segundos


def segundos_horas(tiempo):
    horas = int(tiempo / 3600)
    return horas


def segundos_minutos(tiempo):
    minutos = int((tiempo % 3600) / 60)
    return minutos

tiempo_calcular = input("Indica la opción que desee realizar (s/m/h): ").upper()

while tiempo_calcular != 1:
    
    seg = int(input("Introduce los segundos: "))
    
    if tiempo_calcular == "H":
        print(segundos_horas(seg), "horas")
    elif tiempo_calcular == "M":
        print(segundos_minutos(seg), "minutos")
    elif tiempo_calcular == 1:
        print("Saliendo del programa")

    tiempo_calcular = input("Indica la opción que desee realizar (s/m/h): ").upper()

assert(segundos_horas(3600)==1)
assert(segundos_minutos(7200)==2)
