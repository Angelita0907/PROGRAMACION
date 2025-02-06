# Realizar un programa que lea la edad de una persona menor a 100 años e informe de si 
# es un niño (0-12 años), un adolescente (13-17), un joven (18- 29) o un adulto.

edad = int(input("Dime tu edad: "))

if 0 <= edad <= 12:
    print("Es un niño")

if 13 <= edad <= 17:
    print("Es un adolescente")

if 18 <= edad <= 29:
    print("Es un joven")

if 29 <= edad <= 100:
    print("Es Adulto")