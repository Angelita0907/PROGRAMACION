# según el texto introducido
# por cada frase con un punto meter salto de línea
# cuantas farses hay y cuantas palabras

texto = "La inyección de SQL es un tipo de ciberataque encubierto en el cual un hacker inserta código propio en un sitio web con el fin de quebrantar las medidas de seguridad y acceder a datos protegidos. Una vez dentro, puede controlar la base de datos del sitio web y secuestrar la información de los usuarios. Le explicamos cómo funcionan los ataques de inyección de SQL, cómo combatirlos y cómo una herramienta antivirus potente lo puede proteger contra las consecuencias."

separacion = texto.split(".")

espacio = texto.split()

for texto1 in separacion:
    if texto1 !="":
        print(texto1+".")

print(len(separacion)) # frases
print(len(espacio)) # palabras