
#glaucio Sales Santos

dinheiro(alice, rico).
dinheiro(henrique, rico).
dinheiro(adriano, rico).
dinheiro(caren, rico).

insano(adriano).
insano(maria).

ciumes(alice).
ciumes(caren).

santaMaria(pedro, Dias) :- Dias = segunda ; Dias = terca ; Dias = quinta.
santaMaria(bernardo, Dias) :- Dias = segunda ; Dias = terca ; Dias = quinta.
santaMaria(maria, Dias) :- Dias = terca ; Dias = quarta ; Dias = quinta.
santaMaria(adriano, quarta).
santaMaria(caren, quinta).
santaMaria(bia, quinta).

portoAlegre(caren, Dias) :- Dias = segunda ; Dias = terca ; Dias = quarta.
portoAlegre(henrique, terca).
portoAlegre(bia, Dias) :- Dias = terca ; Dias = quarta.
portoAlegre(alice, Dias) :- Dias = terca ; Dias = quarta.
portoAlegre(bernardo, quarta).
portoAlegre(pedro, quarta).

apartamento(bia, Dias) :- Dias = segunda ; Dias = sexta.
apartamento(maria, Dias) :- Dias = segunda ; Dias = sexta.
apartamento(alice, Dias) :- Dias = segunda ; Dias = quinta ; Dias = sexta.
apartamento(henrique, Dias) :- Dias \= terca.
apartamento(adriano, Dias) :- Dias \= quarta.
apartamento(caren, sexta).
apartamento(bernardo, sexta).

bastao(X) :- portoAlegre(X, quinta) ; santaMaria(X, quarta).

martelo(X) :- apartamento(X, quarta) ; apartamento(X, quinta).

chave(X) :- santaMaria(X, segunda) ; portoAlegre(X, terca).

arma(X) :- bastao(X) ; martelo(X).

motivo(X) :- dinheiro(X, pobre) ; insano(X) ; ciumes(X).

acesso(X) :- (apartamento(X, sexta) ; apartamento(X, quinta)) , chave(X).

assassino(X) :- motivo(X) , acesso(X) , arma(X).