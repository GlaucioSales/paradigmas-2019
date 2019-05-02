repete(0, _, []).
repete(N, C, L) :- 
 N > 0,
 L = [C | T],
 N1 is N - 1,
 repete(N1, C, T).

impar(X):-Z is mod(X,2), Z = 1.

hasN([],0).
hasN([H|T],N) :- 
	hasN(T, AUX),
	(	number(H) 
	-> N is AUX + 1 
	; N = AUX
	).

inc99([], []).
inc99([H|T], [X|Y]) :- inc99(T, Y), X is H + 99.
 
incN([],[],_).
incN([H|T],[X|Y],N) :- incN(T, Y, N), X is H + N.

comment([],[]).
comment([H|T], [X|Y]) :- comment(T, Y), atom_concat("%%", H, X).

onlyEven([],[]).
onlyEven([H|T], [X|Y]) :- not(impar(H)), X = H, onlyEven(T, Y).
onlyEven([H|T], [X|Y]) :- impar(H), X = Y ,onlyEven(T, Y).

countdown(0,[]).
countdown(N,L) :- N >= 0, L = [H|T], H = N , X is N-1, countdown(X,T).

nRandoms(0,[]).
nRandoms(N,L) :- N >= 0, L = [H|T], random(0,1000,H),X is N-1, nRandoms(X,T).

potN0(0,[]).
potN0(N,L) :- N >= 0, L = [H|T], pow(2,N,H),X is N-1, potN0(X,T).

zipMult([],[],[]).
zipMult(L1,L2,L3) :- L1 = [H1|T1],L2 = [H2|T2], L3 = [H3|T3], H3 is H2 * H1, zipMult(T1,T2,T3).

potencias(0,[0]).
potencias(1,[1]).
potencias(N,L) :- potencias(0,N,L).
potencias(I,N,[]) :- N == I.
potencias(I,N,L) :- N > I, L = [H|T], pow(2,I,H),I1 is I+1, potencias(I1,N,T).

cedulas(_,[],[]).
cedulas(V,[H|T],[X|Y]):- Aux is div(V,H), Aux1 is mod(V,H), X = Aux, cedulas(Aux1,T,Y).