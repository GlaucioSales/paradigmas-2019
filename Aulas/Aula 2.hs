--Glaucio Sales Santos
--local onde esta o history C:\Users\Usuário\AppData\Roaming\ghc

-- 1. Crie uma função isVowel :: Char -> Bool que verifique se um caracter é uma vogal ou não.
isVowel :: Char -> Bool
isVowel x = if x == 'a' || x == 'e' || x == 'i'|| x == 'o'|| x == 'u' then True else False
-- 2. Escreva uma função addComma, que adicione uma vírgula no final de cada string contida numa lista.
addComma :: [String] -> [String]
addComma x = map (++ ",") x
-- 3. Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings formatadas como itens de lista em HTML. Resolva este exercício COM e SEM funções anônimas (lambda). Exemplo de uso da função:
subHtmlListItems :: String -> String
subHtmlListItems x = "<LI>"++ x ++ "<LI>"
htmlListItems :: [String] -> [String]
htmlListItems x =  map (subHtmlListItems) x
--Função que adiciona uma função HTML <LI> COM a utilização de função LAMBDA
htmlListItems2 :: [String] -> [String]
htmlListItems2 x = map (\y -> "<LI>" ++ y ++ "<LI>") x
-- 4.Defina uma função que receba uma string e produza outra retirando as vogais, conforme os exemplos abaixo. Resolva este exercício COM e SEM funções anônimas (lambda).
semVogais :: String -> String
semVogais [] = ""
semVogais (x:xs) | elem x ['a','e','i','o','u'] = semVogais xs | otherwise = (x:(semVogais xs))
-- 5. Defina uma função que receba uma string, possivelmente contendo espaços, e que retorne outra string substituindo os demais caracteres por '-', mas mantendo os espaços. Resolva este exercício COM e SEM funções anônimas (lambda). Exemplos:
codifica :: String -> String
codifica [] = ""
codifica (x:xs) | elem x ['a'..'z'] = ('-':(codifica xs)) | otherwise = (x:(codifica xs))
-- 6. Escreva uma função firstName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu primeiro nome. Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome.
firstName :: String -> String
firstName [] = ""
firstName (x:xs) | elem x ['a'..'z'] = (x:(firstName xs)) | elem x ['A'..'Z'] = (x:(firstName xs))  | otherwise = []
-- 7. Escreva uma função isInt :: String -> Bool que verifique se uma dada string só contém dígitos de 0 a 9. Exemplos:
isInt :: String -> Bool
isInt [] = True
isInt (x:xs) | elem x ['0'..'9'] = (isInt xs) | elem x ['a'..'z'] = False| elem x [' '] = False| elem x ['.'] = False | elem x ['A'..'Z'] = False
-- 8. Escreva uma função lastName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu último sobrenome. Suponha que cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome. Exemplos de uso da função:
lastName :: String -> String
lastName x = last (words x)

-- 9. Escreva uma função userName :: String -> String que, dado o nome completo de uma pessoa, crie um nome de usuário (login) da pessoa, formado por: primeira letra do nome seguida do sobrenome, tudo em minúsculas. Dica: estude as funções pré-definidas no módulo Data.Char, para manipulação de maiúsculas e minúsculas. Você precisará carregar este módulo usando import Data.Char no interpretador ou no início do arquivo do programa.
userName :: String -> String
userName (x:xs) | elem x ['a'..'z'] = (x:(lastName xs))
-- 10. Escreva uma função encodeName :: String -> String que substitua vogais em uma string, conforme o esquema a seguir: a = 4, e = 3, i = 2, o = 1, u = 0.Escreva uma função encodeName :: String -> String que substitua vogais em uma string, conforme o esquema a seguir: a = 4, e = 3, i = 2, o = 1, u = 0.
encodeName :: String -> String
encodeName x = map (\y -> subEncodeName y) x
subEncodeName :: Char -> Char
subEncodeName x =  if (x == 'a') || (x == 'A') then '4' else if (x == 'e') || (x == 'E') then '3' else if (x == 'i') || (x == 'I') then '2' else if (x == 'o') || (x == 'O') then '1' else if (x == 'u') || (x == 'U') then '0' else x

-- 11. Escreva uma função betterEncodeName :: String -> String que substitua vogais em uma string, conforme este esquema: a = 4, e = 3, i = 1, o = 0, u = 00. Exemplos de uso da função:
betterEncodeName :: String -> String
betterEncodeName x = concatMap (\y -> subBetterEncodeName y) x
subBetterEncodeName :: Char -> String
subBetterEncodeName x = if (x == 'a') || (x == 'A') then "4" else if (x == 'e') || (x == 'E') then "3" else if (x == 'i') || (x == 'I') then "1" else if (x == 'o') || (x == 'O') then "0" else if (x == 'u') || (x == 'U') then "00" else [x]

-- 12. Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres. Exemplo:
onlyTen :: [String] -> [String]
onlyTen x = map (\y -> if length y >= 10 then take 10 y else take 10 (concat [y, ".........."])) x
