#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* prev;
    struct node* next;
};
void insertatbegin(struct node **head){
    int num;
    struct node *temp=(struct node *)malloc(sizeof(struct node));
    temp->prev=NULL;
    temp->next=*head;
    printf("Enter the number:\n");
    scanf("%d",&temp->data);
    *head=temp;
}
void insertatend( struct node *head){
    int num;
    struct node *temp=(struct node *)malloc(sizeof(struct node));
    struct node *p= head;
    printf("Enter the number:\n");
    scanf("%d",&temp->data);
    while(p->next!=NULL){
        p=p->next;
    }
    p->next=temp;
    temp->prev=p;
    temp->next=NULL;
}
void deleteatbegin(struct node** head){
    struct node *p=*head;
    *head =(*head)->next;
    p->next=NULL;
    free(p);
    (*head)->prev= NULL;
}
void deleteatend(struct node *head){
    struct node* p ,*q;
    p=head;
    while(p->next!=NULL){
        q=p;
        p=p->next;
    }
    p->prev=NULL;
    q->next=NULL;
    free(p);
}
void display(struct node *head){
    struct node *display=head;
    while(display!=NULL){
        printf("%d ",display->data);
        display=display->next;
    }
}
int main(){
    int size,n;
    
    struct node* one=(struct node *)malloc(sizeof(struct node));
    struct node* two=(struct node *)malloc(sizeof(struct node));
    struct node* three=(struct node *)malloc(sizeof(struct node));
    struct node *head=one;
    one->prev=NULL;
    one->next=two;
    one->data=100;
    two->prev=one;
    two->next=three;
    two->data=200;
    three->prev=two;
    three->next=NULL;
    three->data=300;
    printf("------Original linked list-----\n");
    display(head);
    printf("\nEnter the size how many times you have to add at beginning:\n");
    scanf("%d",&size);
    for(int i=0;i<size;i++){
        insertatbegin(&head);
    }
    display(head);
     printf("\nEnter the size how many times you have to add at end:\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        insertatend(head);
    }
    display(head);
   
    printf("\nAfter deletion at beginning:\n");
    deleteatbegin(&head);
    printf("\n");
    deleteatbegin(&head);
    display(head);
    printf("\nAfter deletion at end:\n");
    deleteatend(head);
    display(head);
    deleteatend(head);
    printf("\n");
    display(head);
    return 0;

    
}