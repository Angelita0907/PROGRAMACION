# Escribir dos funciones que permitan calcular:
# La cantidad de horas, minutos y segundos de un tiempo dado en segundos.

def conversorTiempo(tiempo):
    horas = int(tiempo / 3600)
    minutos = int((tiempo % 3600) / 60)
    segundos = tiempo % 60
    return horas, minutos, segundos

tiempo_calcular = int(input("Indica el segundos que deseas calcular: "))
horas, minutos, segundos = conversorTiempo(tiempo_calcular)

print(horas,"horas", minutos, "minutos y", segundos, "segundos")
