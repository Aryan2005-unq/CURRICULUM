#include<stdio.h>
#include<ctype.h>
#define MAX 100

int top = -1;
int a[MAX];

void push(char ch){
    if(top == MAX - 1){
        printf("Stack is full.\n");
    } else {
        top++;
        a[top] = ch;
    }
}

int pop(){
    int num;
    if(top == -1){
        printf("Stack is empty.\n");
        return -1; // Returning -1 to indicate the stack is empty
    } else {
        num=a[top];
        top--;
        return num;
    }
}

int priority(char ch){
    if(ch=='+' || ch=='-'){
        return 1;
    }
    else if(ch=='*' || ch=='/' || ch=='%' ){
        return 2;
    }
    else if(ch=='^'){
        return 3;
    }
    else{
        return 0;
    }
}

void conversionpostfix(char postfix[]){
    char ch,x;
    int i;
    for(i=0;postfix[i]!='@';i++){
        ch=postfix[i];
        if(ch=='('){
            push(ch);
        }
        else if(ch==')'){
            while((x=pop())!='('){
                printf("%c",x);
            }
        }
        else if(isalnum(ch)){
            printf("%c",ch);
        }
        else{
            while(priority(a[top])>=priority(ch)){
                printf("%c",pop());
            }
            push(ch);
        }
    }
    while(top!=-1){
        printf("%c",pop());
    }
        
    }

int main(){
    int i;
    char postfix[MAX];
    printf("Enter the infix expression ending with '@':\n");
    for(i = 0; i < MAX - 1; i++){
        scanf(" %c", &postfix[i]);
        if(postfix[i] == '@'){
            break;
        }
    }
    // Null-terminate the string
    conversionpostfix(postfix);
    return 0;
}
