let i,j;
let mat=[[1,2,3],
         [4,5,6],
         [7,8,9]
        ];
let row=2,col=2;
for(i=0;i<=row;i++){
    let output = ""
    for(j=0;j<=col;j++){
       output+=mat[i][j]+" ";
    }
   
  console.log((output))   
}
for(i=0;i<=col;i++){
    let transpose=""
    for(j=0;j<=row;j++){
        transpose+=mat[j][i]+" ";
    }
    console.log(transpose);
}