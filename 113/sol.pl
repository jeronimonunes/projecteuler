number(0,A,A).
number(N,A,O):- N > 0, NN is N - 1, AA is A * 10, number(NN, AA, O).

increasing(0,_,1).
increasing(N,M,O):- N > 0, NN is N - 1, increasing(NN,M,O1), MM is M - 1, increasing(NN,MM,O2), O is O1 + O2.

nincreasing(X):- increasing(100,9)