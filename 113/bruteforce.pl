increasing(0,_,[]).
increasing(L,N,[N|T]):- L > 0, N >= 0, NL is L-1, increasing(NL,N,T).
increasing(L,N,T):- L > 0, N >= 0, NN is N-1, increasing(L,NN,T).

decreasing(0,_,[]).
decreasing(L,N,[N|T]):- L > 0, N =< 9, NL is L-1, decreasing(NL,N,T).
decreasing(L,N,T):- L > 0, N =< 9, NN is N+1, decreasing(L,NN,T).

nincreasing(Count):- aggregate_all(count,increasing(100,9,_),Count).
ndecreasing(Count):- aggregate_all(count,decreasing(100,0,_),Count).