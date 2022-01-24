#include<iostream>
using namespace std;

int main(){

    int numbers[2][3] ={
                        {100,50,90},
                        {50,40,100}
                        };


    /// find total in each column
    for(int c = 0;c < 3;c++){
        int total = 0;
        for(int r = 0;r < 2;r++){
            total += numbers[r][c];
        }
        cout << "Sum of " << (c + 1) << " column is " << total << endl;
    }


    /// find total in each row
    for(int r = 0;r < 2;r++){
        int sum = 0;
        for(int c = 0;c < 3;c++){
            sum += numbers[r][c];
        }
        cout << "Sum of " << (r+ 1) << " row is " << sum << endl;
    }

    return 0;
}
