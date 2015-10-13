/* 
 * File:   bst.cpp
 * Author: Ajay C J
 *
 * Created on 23 August, 2015, 4:41 PM
 */
#include <iostream>
#include <cstdlib>

using namespace std;

struct Node{
    int data;
    Node* left;
    Node* right;
};
Node* root;

Node* getnewnode(int data){
    Node* newnode = new Node;
    newnode->data = data;
    newnode->left = newnode->right = NULL;
    return newnode;
}
Node* insert(Node* root, int data){
    if(root = NULL){
        root = getnewnode(data);
        return root;        
    }
    else if(data <= root->data){
        root->left = insert(root->left, data);
        return root;
    }
    else {
        root->right = insert(root->right, data);
    }
}

bool search(Node* root, int data){
    if (root = NULL) return false;
    else if (data == root->data) return true;
    else if (data <= root->data) return search(root->left, data);
    else return search(root->right, data);
}

int main() {
    root = NULL;
    int element, search_ele;
    for(int i = 0; i < 10; i++ )
    {
        cout<<"Enter element: "<<endl;
        cin>>element;
        insert(root, element);
    }
    cout<<"Insert element to search: "<<endl;
    cin>>search_ele;
    search(root, search_ele);
    return 0;
}

