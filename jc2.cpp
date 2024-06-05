#include <stdio.h>
const int N=8;
const int M=8;
int i,j,sum,vfilas[N],vcolumnas[M];
int m[N][M];
float prom;
int main(){    for(i=0;i<N;i++){
               for(j=0;j<M;j++){
          do{
          printf("\nCargar por teclado una matriz de enteros 8x8 con valores positivos menores o iguales a 20:",i,j);
          scanf("%d",&m[i][j]); fflush(stdin);
          if ((m[i][j]<0)||(m[i][j]>20)) 
	      printf("Valor invalido"); 
          }while((m[i][j]<0)||(m[i][j]>20));
            }
        }
    vcolumnas[i]=0;  
    vfilas[j]=0; 
    sum=0;       
    for(i=0;i<N; i++){
    for(j=0;j<M; j++){
        vcolumnas[i] += m[i][j];
        vfilas[j] += m[i][j];
        sum += m[i][j];
           }
		   }
    prom = sum / N;
    printf("\nVector de sumatoria de filas:");
    for (i=0; i<N ; i++) {
        printf("%d", vfilas[i]);
    }

    printf("\nVector de sumatoria de columnas:");
    for ( j=0; j<M; j++) {
        printf("%d", vcolumnas[j]);
    }

    printf("\nPromedio de los valores ingresados: %.2f", prom);     
	
  return 0; 
 }


