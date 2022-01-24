#include<iostream>
using namespace std;
/*
int max(int n1,int n2){
    return (n1 > n2)? n1 : n2;
}

int max(int n1,int n2,int n3){
    int max_num = n1;
    if(max_num < n2)
        max_num = n2;

    if(max_num < n3)
        max_num = n3;

    return max_num;
}
*/
int max(int n1,int n2,int n3 = 0){
    int max_num = n1;
    if(max_num < n2)
        max_num = n2;

    if(max_num < n3)
        max_num = n3;

    return max_num;
}

int main(){

    int a,b,c;

    cout << "Enter two numbers: ";
    cin >> a >>b;

    cout << "\nMaximum number: " << max(a,b);

    cout << "\nEnter three numbers: ";
    cin >> a >> b>> c;

    cout << "Maximum number: "<< max(a,b,c);

    return 0;
}
