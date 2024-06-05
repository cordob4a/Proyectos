#include <stdio.h>
const float N=25;
int i,mayor,pos,suma;
float estatura[25],prom; 
int main(){suma=0;
          for(i=0; i<N; i++){
     do{
          printf("%d Ingrese la estatura:",i+1); 
          scanf("%f",&estatura[i]); fflush(stdin);
          if(estatura[i]<0)
          {printf("valor invalido");}
          }while(estatura[i]<0);
          }
          mayor=estatura[i];
          pos=0;
          for(i=0; i<N; i++)
          {suma+=estatura[i];
          if(estatura[i]>prom)
            {pos++;}
          if(i==0)
            {mayor = estatura[i]; 
             pos=i;}
             else if(estatura[i] > mayor)
                    {mayor = estatura[i]; 
		             pos=i;}
        }
        prom=suma/N;
        printf("\nLa cantidad de personas que superan el promedio es: %.2f",prom);
        printf("\nLa medida de la persona mas alta es: %d",mayor);
	
 return 0;
}


