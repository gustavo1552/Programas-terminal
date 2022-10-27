#Desafio FizzBuzz by Gustavo Marques

value = int(input("Quantos números você quer checar? "))
num = 0
for x in range(value):
    num= num+1
    if num%3==0 and num%5==0:print ("FizzBuzz")
    elif num%3==0:print ("Fizz")
    elif num%5==0:print ("Buzz")
    else: print(num)