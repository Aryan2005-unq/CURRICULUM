#include<stdio.h>
int num,top=-1,num;
int a[100];
void push(int max){
    if(top==max-1){
        printf("Stack is full.\n");
    }
    else{
        printf("Enter the number:\n");
        scanf("%d",&num);
        top++;
        a[top]=num;
}
}
void pop(){
    if(top==-1){
        printf("Stack is empty.\n");
    }
    else{
        num=a[top];
        top--;
        printf("%d is deleted.\n",num);
    }
}
void display(){
    if(top==-1){
     printf("Stack is empty.\n");
    }
    else{
        printf("Contents of the stack are:\n");
        for(int i=top;i>-1;i--){
            printf("%d\n",a[i]);
        }
    }
}
int main(){
    int max;
    printf("Enter the size of stack you want:\n");
    scanf("%d",&max);
    for(int i=0;i<max;i++){
    push(max);
    }
    display();
    pop();
    pop();
    display();
    return 0;
}