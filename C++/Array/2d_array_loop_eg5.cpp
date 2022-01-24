#include<iostream>
using namespace std;

int main(){
    int row = 2;
    int col = 3;

    float prices[row][col] = {
                                {1200.9,340,600.2},
                                {1100,4900,500.5}
                            };

    /// find max price in each row
    for(int r = 0;r < row;r++){
        float max_price = prices[r][0];
        for(int c = 1;c < col ;c++){
            if(max_price < prices[r][c]){
                    max_price = prices[r][c];
            }
        }
        cout << "Maximum price in " << (r + 1) << " row is " << max_price << endl;
    }

    /// find max price in each col
    for(int c = 0;c < col;c++){
        float max_price = prices[0][c];
        for(int r = 1;r < row ;r++){
            if(max_price < prices[r][c]){
                    max_price = prices[r][c];
            }
        }
        cout << "Maximum price in " << (c + 1) << " col is " << max_price << endl;
    }


    return 0;
}
