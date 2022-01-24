#include<iostream>
using namespace std;

int main(){

    int mark[5] = {100,50,60,90,80};

    int a = mark[0];

    cout << a << endl;
    mark[0] = 90;

    cout << "mark[0] = " << mark[0] << endl;
    cout << "mark[1] = " << mark[1] << endl;
    cout << "mark[2] = " << mark[2] << endl;
    cout << "mark[3] = " << mark[3] << endl;
    cout << "mark[4] = " << mark[4] << endl;

    int total = mark[0] + mark[1] + mark[2] + mark[3] + mark[4] ;
    cout << "Total: " << total << endl;

    return 0;
}
