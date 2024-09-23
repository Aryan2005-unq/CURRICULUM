
#include<stdio.h>
#define MAX 5
int q[MAX],front=-1,rear=-1;
int num;
void enqueue(){
    if(front==(rear+1)%MAX){
        printf("Queue is full.\n");
    }
    else{
        if(front==-1){
            front++;
        }
        printf("Enter the number:\n");
        scanf("%d",&num);
        rear=(rear+1)%MAX;
        q[rear]=num;
    }
}
void dequeue(){
    if(front==-1 && rear==-1){
        printf("Queue is empty.\n");
    }
    else{
        num=q[front];
        printf("\n%d is deleted.\n",num);
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%MAX;
        }
    }
}
void display(){
    if(front==-1 && rear==-1){
        printf("Queue is empty.\n");
    }
    else{
        printf("\n-----Elements of circular queue-----\n");
        for(int i=front;i<=rear;i=(i+1)%MAX){
            printf("%d ",q[i]);
        }
    }
}
int main(){
    enqueue();
    enqueue();
    enqueue();
   enqueue();
   display();
   dequeue();
   dequeue();
   display();
   dequeue();
   display();
   dequeue();
   display();
}