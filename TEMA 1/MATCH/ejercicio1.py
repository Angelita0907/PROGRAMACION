# Escribe el horario de la semana

dia = input("Indica un día de la semana: ")
dia = dia.upper()

match dia:
    case "LUNES":
        print("=============== \n LUNES \n===============")
        print("8-9 LENGUAJE DE MARCAS \n10-11 dIGITALIZACIÓN")
        print("===============")

    case "MARTES":
        print("=============== \n MARTES \n===============")
        print("8-9 PROGRAMACIÓN \n10-11 BASE DE DATOS")
        print("===============")

    case "MIÉRCOLES":
        print("=============== \n MIÉRCOLES \n===============")
        print("8-9 PROGRAMACIÓN \n10-11 FOL")
        print("===============")

    case "JUEVES":
        print("=============== \n JUEVES \n===============")
        print("8-9 PROGRAMACIÓN \n10-11 ENTORNOS")
        print("===============")

    case "VIERNES":
        print("=============== \n VIERNES \n===============")
        print("8-9 PROGRAMACIÓN \n10-11 SISTEMAS")
        print("===============")
    
    case "SÁBADO" | "DOMINGO":
        print("Día de descanso")
    case _ :
        print("Incorrecto")
    