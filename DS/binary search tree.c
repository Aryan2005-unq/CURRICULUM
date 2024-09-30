
#include <stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *left;
    struct node *right;
};
void inorder(struct node *root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}
void postorder(struct node *root){
    if(root!=NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d ",root->data);
    }
}
void preorder(struct node *root){
    if(root!=NULL){
        printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
    }
}
int main(){
    struct node* root=(struct node *)malloc(sizeof(struct node));
    struct node* n1=(struct node *)malloc(sizeof(struct node));
    struct node* n2=(struct node *)malloc(sizeof(struct node));
    struct node* n3=(struct node *)malloc(sizeof(struct node));
    struct node* n4=(struct node *)malloc(sizeof(struct node));
    struct node* n5=(struct node *)malloc(sizeof(struct node));
    struct node* n6=(struct node *)malloc(sizeof(struct node));
    struct node* n7=(struct node *)malloc(sizeof(struct node));
    struct node* n8=(struct node *)malloc(sizeof(struct node));
    root->data=85;
    root->left=n1;
    root->right=n2;
    n1->data=40;
    n1->left=n3;
    n1->right=n4;
    n2->data=95;
    n2->left=NULL;
    n2->right=NULL;
    n3->data=23;
    n3->left=n5;
    n3->right=n6;
    n4->data=64;
    n4->left=NULL;
    n4->right=n8;
    n5->data=10;
    n5->left=NULL;
    n5->right=n7;
    n6->data=36;
    n6->left=NULL;
    n6->right=NULL;
    n7->data=15;
    n7->left=NULL;
    n7->right=NULL;
    n8->data=72;
    n8->left=NULL;
    n8->right=NULL;
     printf("\n---Inorder traversal output---\n");
    inorder(root);
    printf("\n---Preorder traversal output---\n");
    preorder(root);
    printf("\n---Postorder traversal output---\n");
    postorder(root);
    return 0;
}