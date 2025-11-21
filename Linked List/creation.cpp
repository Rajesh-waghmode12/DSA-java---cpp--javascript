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

    ~Node(){

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

void insertAtPosition(Node* &head , int position , int data){
    Node *temp = head;
    int count = 1;
    
    if(position <= 0){
        return;
    }
    if(position == 1){
        insertAtHead(head, data);
        return;
    }
    
    while(count < position -1 && temp != NULL){
        count++;
        temp = temp->next;
    }

    if(temp == NULL){
        return;
    }

    Node *nodeToInsert = new Node(data);
    nodeToInsert->next = temp->next;
    temp->next = nodeToInsert;
}


void deleteNode(Node* &head , int position){
    if(head == nullptr || position <= 0){
        cout << "Invlalid Deletion" << endl;
        return;
    }
    if(position == 1){
        Node *temp = head;
        head = head->next;
        delete temp;
        return;
    }

    Node *prev = nullptr;
    Node *curr = head;
    int count = 1;
    
    while(count < position && curr != nullptr){
        prev = curr;
        curr = curr->next;
        count++;
    }
    if(curr == nullptr){
        cout << "Invalid Position to Delete" << endl;
        return;
    }

    prev->next = curr->next;
    curr->next = nullptr;
    delete curr;
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
    insertAtHead(head, 100);
    insertAtTail(tail, 54);
    insertAtTail(tail, 67);
    insertAtTail(tail, 87);
    insertAtPosition(head, 3, 90);
    insertAtPosition(head, 1, 90);
    insertAtPosition(head, 8, 80);
    print(head);
    

    return 0;
}