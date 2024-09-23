#include<stdio.h>
#include<ctype.h>
#define MAX 100

int top = -1;
int a[MAX];

void push(int n){
    if(top == MAX - 1){
        printf("Stack is full.\n");
    } else {
        top++;
        a[top] = n;
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

void evalPositive(char postfix[]){
    char ch;
    int a, b, value;
    for(int i = 0; postfix[i] != ')'; i++){
        ch = postfix[i];
        if(isdigit(ch)){
            push(ch - '0'); // Corrected from 'o' to '0'
        } else if((ch == '+') || (ch == '*') || (ch == '-') || (ch == '/')){
            a = pop();
            b = pop();
            switch(ch){
                case '+':
                    value = b + a; // Corrected order for proper evaluation
                    break;
                case '*':
                    value = b * a;
                    break;
                case '-':
                    value = b - a;
                    break;
                case '/':
                    value = b / a; // Corrected from '\' to '/'
                    break;
            }
            push(value);
        }
    }
    printf("Evaluated result is %d\n", pop());
}

int main(){
    int i;
    char postfix[MAX];
    printf("Enter the postfix expression ending with ')':\n");
    for(i = 0; i < MAX - 1; i++){
        scanf(" %c", &postfix[i]);
        if(postfix[i] == ')'){
            break;
        }
    }
    // Null-terminate the string
    evalPositive(postfix);
    return 0;
}
