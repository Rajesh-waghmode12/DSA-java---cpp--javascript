#include<iostream>
using namespace std;


class Node{
public:
    int data;
    Node *next;

    Node(int data){
        this->data = data;
        this->next = NULL;
    }
};

void insertAtHead(Node *&head, int data){
    Node *temp = new Node(data);
    temp->next = head;
    head = temp;
}

void insertAtTail(Node* &tail , int data){

    Node *temp = new Node(data);
    tail->next = temp;
    tail = tail-> next;
}

void print(Node* &head){
    Node *temp = head;
    while(temp != NULL){
        cout << temp->data << " ";
        temp = temp->next;
    }
}

int main(){

    Node *head = new Node(23);
    Node *tail = head;
    insertAtTail(tail, 54);
    insertAtTail(tail, 67);
    insertAtTail(tail, 87);
    print(head);
    

    return 0;
}