
#Quantidade de items
n = int(input("Digite a quantidade de números e pesos: "))

numeros = []
pesos = []
#Loop para adicionar os valores
for elemento in range(n):
	numeros.append(float(input("Digite o próximo número: ")))
for elemento in range(n):
	pesos.append(float(input("Digite o próximo peso conforme a ordem dos números digitados: ")))
#Números * Pesos
nxp = []
for i in range(n):
	nxp.append(numeros[i]*pesos[i])
soma_nxp = sum(nxp)
soma_pesos = sum(pesos)
media_ponderada = (soma_nxp/soma_pesos)
print (f"A Média Ponderada é: {media_ponderada}")