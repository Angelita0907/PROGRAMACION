# pida dos numeros al usuario y si alguno de ellos es multiplo del otro

def esmultiplo (num1,num2):
    multiplo = False
    if num1 % num2 == 0:
        multiplo = True
    elif num2 % num1 == 0:
        multiplo = True
    
    return multiplo

num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))

resultado = esmultiplo(num1,num2)
print(resultado)
