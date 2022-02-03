//program to generate a random no & then guess it!
# include<stdio.h>
# include<stdlib.h>
# include<time.h>


int main(){
    int number , guess , nguess=1;
    srand(time(0));
    number =rand()%100 + 1; // generate a random no betwn 1-100
    //printf("the number is %d\n", number);
    do{
        printf("guess the number between 1 to 100\n");
        scanf("%d", &guess);
        if (guess>number){
             printf(" Lower no plz!\n");

        }
        else if (guess<number){
             printf("Higher no plz!\n");

        }
        else{
             printf("You guessed it in %d attempts\n", nguess);
            
        }
        nguess++;
       
        
    }while (guess!=number);
    
    return 0;
}
