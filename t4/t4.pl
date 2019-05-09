dinheiro(alice, rico).
dinheiro(henrique, rico).
dinheiro(adriano, rico).
dinheiro(caren, rico).
dinheiro(bia, pobre).
dinheiro(pedro, pobre).
dinheiro(maria, pobre).
dinheiro(bernardo, pobre).

insano(adriano).
insano(maria).

santaMaria(pedro, Y) :- Y = segunda,! ; Y = terca,! ; Y = quinta,!.
santaMaria(bernardo, Y) :- Y = segunda,! ; Y = terca,! ; Y = quinta,!.
santaMaria(maria, Y) :- Y = terca,! ; Y = quarta,! ; Y = quinta,!.
santaMaria(adriano, quarta).
santaMaria(caren, quinta).
santaMaria(bia, quinta).

portoAlegre(caren, Y) :- Y = segunda,! ; Y = terca,! ; Y = quarta,!.
portoAlegre(henrique, terca).
portoAlegre(bia, Y) :- Y = terca,! ; Y = quarta,!.
portoAlegre(alice, Y) :- Y = terca,! ; Y = quarta,!.
portoAlegre(bernardo, quarta).
portoAlegre(pedro, quarta).

apartamento(bia, Y) :- Y = segunda,! ; Y = sexta,!.
apartamento(maria, Y) :- Y = segunda,! ; Y = sexta,!.
apartamento(alice, Y) :- Y = segunda,! ; Y = quinta,! ; Y = sexta,!.
apartamento(henrique, Y) :- Y \= terca.
apartamento(adriano, Y) :- Y \= quarta.
apartamento(caren, sexta).
apartamento(bernardo, sexta).

ciumes(alice).
ciumes(caren).

bastao(X) :- portoAlegre(X, quinta) ; santaMaria(X, quarta).

martelo(X) :- apartamento(X, quarta) ; apartamento(X, quinta).

chave(X) :- santaMaria(X, segunda) ; portoAlegre(X, terca).

arma(X) :- bastao(X) ; martelo(X).

motivo(X) :- dinheiro(X, pobre) ; insano(X) ; ciumes(X).

acesso(X) :- (apartamento(X, sexta) ; apartamento(X, quinta)) , chave(X).

assassino(X) :- motivo(X) , acesso(X) , arma(X).