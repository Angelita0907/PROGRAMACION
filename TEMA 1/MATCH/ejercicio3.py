# Modifica el programa anterior:

estaciones = int(input("Indica un mes: "))
dia = int(input("Introduce un día del mes: "))

match estaciones:
    case 1 | 2 | 3:
        if estaciones == 3 and dia > 20:
            print("PRIMAVERA")
        else:
            print("INVIERNO")
    case 4 | 5 | 6:
        if estaciones == 6 and dia > 20:
            print("VERANO")
        else:
            print("PRIMAVERA")
    case 7 | 8 | 9:
        if estaciones == 9 and dia > 20:
            print("OTOÑO")
        else:
            print("VERANO")
    case 10 | 11 | 12:
        if estaciones == 3 and dia > 20:
            print("INVIERNO")
        else:
            print("OTOÑO")