

#Crie uma função sumSquares :: Int -> Int -> Int que calcule a soma dos quadrados de dois números x e y.
def sumSquares(x, y):
    return(x*x + y*y)

#Crie uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifique se 2 listas possuem o mesmo primeiro elemento. Use a função head e o operador lógico == para verificar igualdade.
def hasEqHeads(x,y):
    if x[0]==y[0]:
        return True
    else:
        return False

#Escreva uma função que receba uma lista de nomes e adicione a string "Super " no início de cada nome. Use o operador ++ para concatenar strings (ou qualquer lista).
def addSuper(s):
    return (s + "Super")

#Crie uma função que receba uma string e retorne o número de espaços nela contidos. Dica: aplique 2 funções consecutivamente.
def contSpace (s):
    return s.count(' ')
#Escreva uma função que, dada uma lista de números, calcule 3*n^2 + 2/n + 1 para cada número n da lista. Dica: defina uma função anônima.
def lista (s):
    newList = []
    for n in s:
        newList.append((3*n*n) + (2/n + 1))
    return newList

#Escreva uma função que, dada uma lista de números, selecione somente os que forem negativos.
def negativos (x):
    newList = []
    for n in x:
        if n < 0:
           newList.append(n)
    return newList

#Escreva uma função que receba uma lista de números e retorne somente os que estiverem entre 1 e 100, inclusive. Dica 1: defina uma função anônima. Dica 2: use o operador && para expressar um 'E' lógico.
def entre (x):
    newList = []
    for n in x:
        if n > 1 and n < 100:
            newList.append(n)
    return newList

#Escreva uma função que, dada uma lista de idades de pessoas no ano atual, retorne uma lista somente com as idades de quem nasceu depois de 1980. Para testar a condição, sua função deverá subtrair a idade do ano atual.
def idade (x):
    newList = []
    for n in x:
        if 2019 - n > 1980:
            newList.append(n)
    return newList

#Escreva uma função que receba uma lista de números e retorne somente aqueles que forem pares
def pares(x):
    newList = []
    for n in x:
        if n % 2 == 0:
            newList.append (n)
    return newList

#Crie uma função charFound :: Char -> String -> Bool que verifique se o caracter (primeiro argumento) está contido na string (segundo argumento). Exemplos de uso da função:
def charFound (c, s):
    if c in s :
        return True
    else:
        return False

#Crie uma função que receba uma lista de nomes e retorne outra lista com somente aqueles nomes que terminarem com a letra 'a'. Dica: conheça o list monster, do autor Miran Lipovača :-)
def terminaEmA(x):
    def termina(s):
        if s[len(s)-1] == 'a':
            return True
        else: 
            return False
    newList = []
    for n in x:
        if termina(n):
            newList.append (n)
    return newList

print(sumSquares(3, 4))

print(hasEqHeads([1,0], [1,0]))

print (addSuper("Glaucio"))

print(contSpace("Glaucio Sales Santos"))

print(lista([1,2]))

print(negativos([-1,0,1]))

print(entre([-50,0,50,100]))

print(idade([19,20,21,22,23,24,25,26,27,28,29,30,60,61,62,63]))

print(pares([1,2,3,4,5,6,7,8,9]))

print(charFound('a',"Glaucio"))

print(terminaEmA(["Glaucio","Ana","Fabricio","Bruno","Rafaela"]))

