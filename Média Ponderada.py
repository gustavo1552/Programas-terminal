v1 = float(input("Digite o primeiro valor: "))
p1 = float(input("Digite seu peso: "))
v2 = float(input("Digite o segundo valor: "))
p2 = float(input("Digite seu peso: "))
v3 = float(input("Digite o terceiro valor: "))
p3 = float(input("Digite seu peso: "))

f1 = ((v1*p1)+(v2*p2)+(v3*p3))
f2 = (p1+p2+p3)
res = (f1/f2)

print(f"A média ponderada é: {res}")