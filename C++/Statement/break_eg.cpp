#include<iostream>
using namespace std;

int main(){

    int i = 1;
    while(i <= 10){
        i++;
        if(i == 4){
            continue; ///go to end of loop
            //break;
        }

        cout << "Statement " << i << endl;

    }
    cout << "Program End....." ;
    return 0;
}
