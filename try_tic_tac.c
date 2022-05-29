#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void play(char, char);
char a[9] = {'1','2','3','4','5','6','7','8','9'};
void show()
{
    printf("\n\t\t\t ---|---|---\n");
    printf("\t\t\t   %c  %c   %c",a[0],a[1],a[2]);
    printf("\n\t\t\t ---|---|---\n");
    printf("\t\t\t   %c  %c   %c",a[3],a[6],a[5]);
    printf("\n\t\t\t ---|---|---\n");
    printf("\t\t\t   %c  %c   %c",a[6],a[7],a[8]);
    printf("\n\t\t\t ---|---|---\n");
}
void playersymbol()
{
    printf("\nplayer 1 symbol is X\n");
    printf("player 2 symbol is 0");
}
char st;
void start()
{
   printf("\n entere who will start the game player 1 or 2: \n"); 
    scanf("%c",&st);
}

int count=0;
void player()
{
    char p;
    char s;
    char cho;
    printf("enter the player position and symbol  ");
    fflush(stdin);
     scanf("%c",&p);
     fflush(stdin);
     scanf("%c",&s);
     count++;
    play(p,s);
}

void play(char P,char S)
{
    for(int i=0;i<=8;i++)
    {
        if(a[i]==P)
        {
        a[i]=S;
        break;
        }
    }           
}
void message()
{
  printf("enter position for player:\n");   
}

int end()
{
    if(a[0]=='X' && a[1]=='X' && a[2]=='X' || a[0]=='X' && a[3]=='X' && a[6]=='X')
    return (100);
    if(a[0]=='0' && a[1]=='0' && a[2]=='0' || a[0]=='0' && a[3]=='0' && a[6]=='0')
    return (200);
    if(a[3]=='X' && a[4]=='X' && a[5]=='X' || a[3]=='X' && a[0]=='X' && a[6]=='X')
    return (100);
    if(a[3]=='0' && a[4]=='0' && a[5]=='0' || a[3]=='0' && a[0]=='0' && a[6]=='0')
    return (200);
    if(a[6]=='X' && a[7]=='X' && a[8]=='X' || a[6]=='X' && a[3]=='X' && a[0]=='X')
    return (100);
    if(a[6]=='0' && a[7]=='0' && a[8]=='0' || a[6]=='0' && a[3]=='0' && a[0]=='0')
    return (200);
    if(a[1]=='X' && a[4]=='X' && a[7]=='X' || a[2]=='X' && a[5]=='X' && a[8]=='X')
    return (100);
    if(a[1]=='0' && a[4]=='0' && a[7]=='0' || a[2]=='0' && a[5]=='0' && a[8]=='0')
    return (200);
    if(a[0]=='X' && a[4]=='X' && a[8]=='X' || a[2]=='X' && a[4]=='X' && a[6]=='X')
    return (100);
    if(a[0]=='0' && a[4]=='0' && a[8]=='0' || a[2]=='0' && a[4]=='0' && a[6]=='0')
    return (200);

    return(300);
}
void main()
{
    int k;
    char ch;
    label1:
    system("CLS");
    playersymbol();
    show();
    
    start();
    player();
    label:
    system("CLS");
    show();
    message();
    player();
   k=end();
   system("CLS");
   show();
   if(count<9)
   {
       if(k==100)
       {
           printf("\nplay 1 is win:");
           count=0;
       }
           else if(k==200)
           {
               printf("\n player 2 is win:");
               count=0;
           }
           else
           goto label;
   }
           else
           {
               printf("GAME DRAW:\n");
               count=0;
           }

           printf("\n\n do u want play continue:   enter y for YES  and n for NO:");
           fflush(stdin);
           scanf("%c",&ch);
           if(ch=='y' || ch=='Y')
           {
             a[0]='1';
             a[1]='2';
             a[2]='3';
             a[3]='4';
             a[4]='5';
             a[5]='6';
             a[6]='7';
             a[7]='8'; 
             a[8]='9';
             goto label1; 
           }
    printf("\n press any ker for exit:");
    getch();
}