#include<stdio.h>
#define MAX 50
int front=-1,rear=-1;
int num;

int a[MAX];
void enqueue(){
    
    if(rear==MAX-1){
        printf("Queue is full\n");
    }
    else{
    if(front==-1){
        front++;
    }
    printf("Enter the element:\n");
    scanf("%d",&num);
    rear++;
    a[rear]=num;
    
    }

}
void dequeue(){
    if(front==-1){
        printf("Queue is empty.\n");
    }
    else{
        num=a[front];
        front++;
        printf("\n%d is deleted.\n",num);
    }
}
void display(){
    
    if(front==-1 && rear==-1){
        printf("Queue is empty.\n");
    }
    else{
        printf("\n----Elements of the stack----\n");
        for(int i=front;i<=rear;i++){
        
        printf("%d ",a[i]);
    }
}
}
int main(){
    int n;
    printf("Enter the size of the Queue you desire:\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
    enqueue();
    }
    display();
    dequeue();
    display();
    dequeue();
    display();
    return 0;
}