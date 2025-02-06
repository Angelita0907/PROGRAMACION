# incidentes Eso y Post-Obligatoria

# el aparatado dos lo hice en otro fichero al final para no cargarme este, las variables para contabilizar son del otro apartado

incidente = input("¿Desea registrar un nuevo incidente? S (para sí) o N (para No): ").upper()

eso = 0
postobligatoria = 0
leves = 0
graves = 0
total_incidentes = 0

while incidente!="S" or incidente!="N":
    
    if incidente == "S":
        nivel = input("¿En que nivel ha ocurrido: E (para los incidentes de la ESO) y P (para los incidentes de Post-Obligatoria)?: ").upper()

        if nivel !="E" and nivel !="P":
                print("Introduzca de nuevo lo solicitado.")
                nivel = input("¿En que nivel ha ocurrido: E (para los incidentes de la ESO) y P (para los incidentes de Post-Obligatoria)?").upper()

        match nivel:
            case "E":
                tipo = input("¿Qué tipo de incidente ha ocurrido: L (para incidente Leve) o G (para incidente Grave)?: ").upper()
                eso +=1
                if tipo == "L":
                    leves+=1
                elif tipo == "G":
                    graves +=1
                
            case "P":
                tipo = input("¿Qué tipo de incidente ha ocurrido: L (para incidente Leve) o G (para incidente Grave): ?").upper()
                postobligatoria +=1
                if tipo == "L":
                    leves+=1
                elif tipo == "G":
                    graves +=1

    elif incidente == "N":
        print("Incidentes registrados")

incidente = input("¿Desea registrar un nuevo incidente? S (para sí) o N (para No): ").upper()
