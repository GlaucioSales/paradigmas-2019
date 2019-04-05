-- Eleva um numero ao quadrado
-- Aqui temos um comentario!

quadrado :: Int -> Int
quadrado x = x^2

soma x y = x + y

sumSquares :: Int -> Int -> Int
sumSquares x y = x^2 + y^2

hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = if (head x) == (head y) then True else False

addSuper :: [String]-> [String]
addSuper  x =  map ("Super" ++) x


noSpace :: Char -> Bool
noSpace x = if x == ' ' then True else False

countSpace :: String -> Int
countSpace x = length (filter (noSpace) x)

funcao :: [Int] -> [Int]
funcao n = map(\x -> 3* x^2 + (div 2 x) + 1) n

negativos :: [Int] -> [Int]
negativos x = filter (<0) x

entre :: [Int] -> [Int]
entre x = map (\n-> n > 1 && n < 100 )x
--------------------------------------------------------  Estudos Pessoais  --------------------------------------------------------
fatorial :: Int -> Int
fatorial 0 = 1
fatorial x = fatorial (x-1)*x

fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci x = fibonacci (x-1) + fibonacci (x-2)

guarda x | (x == 1) = 10 |(x == 2) = 20 | (x == 3)= 30 | otherwise = 100

portaEnd :: Bool -> Bool -> Bool
portaEnd _ False = False
portaEnd False _ = False
portaEnd True True = True

portaOr :: Bool -> Bool -> Bool
portaOr _ True = True
portaOr True _ = True
portaOr False False = False
