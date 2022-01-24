#include<iostream>
using namespace std;

int main(){

    string brands[4] = {"samsung","iPhone","vivo","oppo"};
    string search_name;
    bool found = false;
    cout << "Enter brand to search: ";
    cin >> search_name;

    for(int i = 0;i < 4 ; i++){

        if(search_name == brands[i]){
            found = true;
            break;
        }
    }

    if(found)
        cout << search_name << " is found!";
    else
        cout << search_name << " is not found!";

    return 0;
}
