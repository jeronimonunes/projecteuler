/**
 *  Prolog solution for euler project 181
 *  author Jerônimo Nunes Rocha
 *  this software solves the problem by burte force, so it takes a very long time to give a result
 *  I also belive that the solution (60,40) could not be found since it's a number that does not fit
 *  in a 32 bit integer.
 *  usage: solution((60,40),N).
 **/

range(L, L, _).
range(O, L, H):- N is L+1, N =< H, range(O, N, H).

group((B,W),(MB,MW)):- range(B,1,MB), range(W,1,MW).
group((0,W),(_,MW)):- range(W,1,MW).
group((B,0),(MB,_)):- range(B,1,MB).

candidate([],(0,0)).
candidate([(B,W)|T],(MB,MW)):- group((B,W),(MB,MW)),
                                NB is MB - B, NB > -1,
                                NW is MW - W, NW > -1,
                                candidate(T,(NB, NW)).

equals([],[]).
equals([H1|T1],[H2|T2]):- select(E,[H1|T1],R1), select(E,[H2|T2],R2), equals(R1,R2).

contains(E, [H|T]):- equals(E, H); contains(E, T).

unique([],[]).
unique([H|T],[H|TT]):- not(contains(H,T)), unique(T,TT).
unique([H|T],TT):- contains(H,T), unique(T,TT).

solution(P,N):- findall(C, candidate(C,P), A), unique(A, L), length(L, N).