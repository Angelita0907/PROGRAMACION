# Estaciones del Año: Escribe un programa que, dado un número de mes 
# (1 para enero, 2 para febrero, etc.), determine la estación del año correspondiente 
# (por ejemplo, "Invierno", "Primavera", etc.) 

estaciones = int(input("Indica un día del mes: "))

match estaciones:
    case 1 | 2 | 3:
        print("INVIERNO")
    case 4 | 5 | 6:
        print("PRIMAVERA")
    case 7 | 8 | 9:
        print("VERANO")
    case 10 | 11 | 12:
        print("OTOÑO")