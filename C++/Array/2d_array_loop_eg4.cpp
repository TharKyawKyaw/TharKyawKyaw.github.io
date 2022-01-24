#include<iostream>
using namespace std;

int main(){

    int row = 2;
    int col = 3;

    float prices[row][col] = {
                                {1200.9,340,600.2},
                                {1100,4900,500.5}
                            };

    /// find max and min
    float max_price = prices[0][0];
    float min_price = prices[0][0];

    for(int r = 0;r < row;r++){
        for(int c = 0;c < col;c++){
            /// Max
            if(max_price < prices[r][c]){
                max_price = prices[r][c];
            }
            /// Min
            else if(min_price > prices[r][c]){
                min_price = prices[r][c];
            }

        }
    }

    cout << "Maximum Price: " << max_price << endl;
    cout << "Minimum Price: " << min_price  << endl;

    return 0;
}
