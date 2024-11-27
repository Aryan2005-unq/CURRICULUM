#include <stdio.h>
#include <stdlib.h>

// Node structure
struct node {
    int data;
    struct node *left;
    struct node *right;
};

// Function prototypes
void inorder(struct node *root);
struct node* insert(struct node *root, int value);
struct node* deleteNode(struct node *root, int value);
struct node* findMin(struct node *root);

// In-order traversal function
void inorder(struct node *root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

// Insert function to add a node to the BST
struct node* insert(struct node *root, int value) {
    if (root == NULL) {
        struct node* newNode = (struct node*)malloc(sizeof(struct node));
        newNode->data = value;
        newNode->left = newNode->right = NULL;
        return newNode;
    }
    if (value < root->data) {
        root->left = insert(root->left, value);
    } else if (value > root->data) {
        root->right = insert(root->right, value);
    }
    return root;
}

// Find the minimum value node in the tree
struct node* findMin(struct node *root) {
    while (root && root->left != NULL) {
        root = root->left;
    }
    return root;
}

// Delete function to remove a node from the BST
struct node* deleteNode(struct node *root, int value) {
    if (root == NULL) {
        return root; // Node not found
    }

    if (value < root->data) {
        root->left = deleteNode(root->left, value);
    } else if (value > root->data) {
        root->right = deleteNode(root->right, value);
    } else {
        // Node found
        if (root->left == NULL) {
            struct node* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            struct node* temp = root->left;
            free(root);
            return temp;
        }

        // Node with two children
        struct node* temp = findMin(root->right);
        root->data = temp->data; // Replace with in-order successor
        root->right = deleteNode(root->right, temp->data);
    }
    return root;
}

// Main function
int main() {
    // Tree initialization
    struct node* root = (struct node*)malloc(sizeof(struct node));
    struct node* n1 = (struct node*)malloc(sizeof(struct node));
    struct node* n2 = (struct node*)malloc(sizeof(struct node));
    struct node* n3 = (struct node*)malloc(sizeof(struct node));
    struct node* n4 = (struct node*)malloc(sizeof(struct node));
    struct node* n5 = (struct node*)malloc(sizeof(struct node));
    struct node* n6 = (struct node*)malloc(sizeof(struct node));
    struct node* n7 = (struct node*)malloc(sizeof(struct node));
    struct node* n8 = (struct node*)malloc(sizeof(struct node));

    root->data = 85;
    root->left = n1;
    root->right = n2;
    n1->data = 40;
    n1->left = n3;
    n1->right = n4;
    n2->data = 95;
    n2->left = NULL;
    n2->right = NULL;
    n3->data = 23;
    n3->left = n5;
    n3->right = n6;
    n4->data = 64;
    n4->left = NULL;
    n4->right = n8;
    n5->data = 10;
    n5->left = NULL;
    n5->right = n7;
    n6->data = 36;
    n6->left = NULL;
    n6->right = NULL;
    n7->data = 15;
    n7->left = NULL;
    n7->right = NULL;
    n8->data = 72;
    n8->left = NULL;
    n8->right = NULL;

    printf("\n---Inorder traversal output (Initial tree)---\n");
    inorder(root);

    // Insert a new node
    printf("\n\nInserting 50 into the tree...\n");
    root = insert(root, 50);
    printf("---Inorder traversal output (After insertion)---\n");
    inorder(root);

    // Delete a node
    printf("\n\nDeleting 40 from the tree...\n");
    root = deleteNode(root, 40);
    printf("---Inorder traversal output (After deletion)---\n");
    inorder(root);

    return 0;
}

       
      
   
