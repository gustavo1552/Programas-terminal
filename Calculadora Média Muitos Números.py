#Quantidade de items
n = int(input("Digite a quantidade de números: "))

items = []
#Loop para adicionar os valores
for elemento in range(n):
	items.append(float(input("Digite o próximo número: ")))
média = (sum(items)/n)

#Resultado
print (f"A média é: {média}")