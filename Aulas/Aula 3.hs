--Glaucio Sales Santos
--local onde esta o history C:\Users\Usuário\AppData\Roaming\ghc
add10toall :: [Int] -> [Int]
add10toall x = map (\y -> 10 + y ) x
------------------------------------------------------------------
multN :: Int -> [Int] -> [Int]
multN x y = map(\z -> x*z ) y
------------------------------------------------------------------
applyExpr :: [Int] -> [Int]
applyExpr x = map(\z -> 3*z+2 ) x
------------------------------------------------------------------
addSuffix :: String -> [String] -> [String]
addSuffix x y = map(\s -> s ++ x ) y
------------------------------------------------------------------
selectgt5 :: [Int] -> [Int]
selectgt5 x = filter(>5)x
------------------------------------------------------------------
sumOdds :: [Int] -> Int
sumOdds x = sum (filter (odd) x)
------------------------------------------------------------------
selectExpr :: [Int] -> [Int]
selectExpr n = [x | x <- filter (even) n  , x >= 20, x < 50] 
------------------------------------------------------------------
countShorts :: [String] -> Int
countShorts n = lenght [x | x <- n lenght n >= 5]

