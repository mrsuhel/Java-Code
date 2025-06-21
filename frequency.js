let frequency=function(str){
        for(let i=1;i<str.length;i++){
                let count=0;
                for(let j=0;j<str.length;j++){
                        if((j>=i)&&(str.charAt(i)===str.charAt(j))){
                                count++;
                        }else if((j<i)&&(str.charAt(i)===str.charAt(j))){
                                break;
                        }
                }if(count>0){
                        console.log(`${str.charAt(i)} ${count}`);
                }
        }
};
let s="lucknow junction";
frequency(s);
