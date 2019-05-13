#Crie uma função isVowel :: Char -> Bool que verifique se um caracter é uma vogal ou não.
def isVowel(c):
    if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
        return True
    else:
        return False

#Escreva uma função addComma, que adicione uma vírgula no final de cada string contida numa lista.
def addComma (x):
    newList = []
    for n in x:
        newList.append (n + ',')
    return newList

#Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings formatadas como itens de lista em HTML. Resolva este exercício COM e SEM funções anônimas (lambda). Exemplo de uso da função:
def htmlListItems(x):
    newList = []
    for n in x:
        newList.append ('<LI>' + n + '</LI>')
    return newList

#Defina uma função que receba uma string e produza outra retirando as vogais, conforme os exemplos abaixo. Resolva este exercício COM e SEM funções anônimas (lambda).
def semVogais(x):
    newList = []
    for n in x:
        if n != 'a' and n != 'e' and n != 'i' and n != 'o' and n != 'u':
            newList.append(n)
    newList = ''.join(newList)
    return newList

#Defina uma função que receba uma string, possivelmente contendo espaços, e que retorne outra string substituindo os demais caracteres por '-', mas mantendo os espaços. Resolva este exercício COM e SEM funções anônimas (lambda). Exemplos:
def codifica (x):
    newList = []
    for n in x:
        if n == ' ':
            newList.append(' ')
        else:
            newList.append('-')
    newList = ''.join(newList)
    return newList

#Escreva uma função firstName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu primeiro nome. Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome. Dica: estude funções pré-definidas em Haskell (List operations -> Sublists) em http://hackage.haskell.org/package/base-4.10.1.0/docs/Prelude.html#g:18. Exemplos de uso da função:
def firstName (x):
    newList = []
    for n in x:
        if n != ' ':
            newList.append(n)
        else:
            newList = ''.join(newList)
            return newList

#Escreva uma função isInt :: String -> Bool que verifique se uma dada string só contém dígitos de 0 a 9. Exemplos:

def isInt (x):
    newList = []
    for n in x:
        if n != '0' and n != '1' and n != '2' and n != '3' and n != '4' and n != '5' and n != '6' and n != '7' and n != '8' and n != '9':
            return False
    return True
            
#Escreva uma função lastName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu último sobrenome. Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome. Exemplos de uso da função:
def lastName(x):
    newList = []
    x = x[::-1]
    x = firstName(x)
    x = x[::-1]
    return x
    
#Escreva uma função userName :: String -> String que, dado o nome completo de uma pessoa, crie um nome de usuário (login) da pessoa, formado por: primeira letra do nome seguida do sobrenome, tudo em minúsculas. Dica: estude as funções pré-definidas no módulo Data.Char, para manipulação de maiúsculas e minúsculas. Você precisará carregar este módulo usando import Data.Char no interpretador ou no início do arquivo do programa.
def userName (x):
    newList = []
    x = x.lower()
    newList.append(x[0])
    newList.append(lastName(x))
    newList = ''.join(newList)
    return newList

#Escreva uma função encodeName :: String -> String que substitua vogais em uma string, conforme o esquema a seguir: a = 4, e = 3, i = 2, o = 1, u = 0.
def encodeName (x):
    newList = []
    for n in x:
        if n == 'a':
            newList.append('4')
        elif n == 'e':
            newList.append('3')
        elif n == 'i':
            newList.append('2')
        elif n == 'o':
            newList.append('1')
        elif n == 'u':
            newList.append('0')
        else:
            newList.append(n)
    newList = ''.join(newList)
    return newList

#Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres. Exemplo:
def func (x):
    newList = []
    for n in x:
        if len(n) >= 10:
            newList.append(n[:10])
        else:
            n = n + '...............'
            newList.append(n[:10])
    return newList


print(isVowel('a'))

print(addComma(["Glaucio", "Sales", "Santos"]))

print(htmlListItems(["Glaucio", "Sales", "Santos"]))

print(semVogais("Glaucio"))

print(codifica("Glaucio Sales Santos"))

print(firstName("Glaucio Sales Santos"))

print(isInt("9595559a"))

print (lastName ("Glaucio Sales Santos"))

print( userName("Glaucio Sales Santos"))

print (encodeName("Glaucio Sales Santos"))

print (func (["glauciosalessantos","g"]))

