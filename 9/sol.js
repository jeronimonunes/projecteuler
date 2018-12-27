let n = 1000;
for(let a = 1; a < n; a++) {
    for(let b = 1; b < n-a; b++) {
        let c = n - a - b;
        if(a*a+b*b==c*c) {
            console.log(a*b*c);
            return;
        }
    }
}