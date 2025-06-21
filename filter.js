let a=[10,15,17,20,22,25,27,32,35,39];
let b=a.filter(x=>x%2==0);
console.log(b);
let sum=a.reduce((x,y)=>x+y,0);
console.log(sum);
let sumc=a.filter(x=>x%2==0).reduce((x,y)=>x+y,0);
console.log(sumc);
