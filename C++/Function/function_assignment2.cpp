#include<iostream>
using namespace std;

int calculateDiscountItem(int price,int discount){

    return (price - ((price/100)* discount));

}

void calculateInterest(int amount,int rate,int months){

    int monthlyRate = ((amount/100) * rate );
    int totalInterest = monthlyRate * months;
    cout << "Monthly interest: " << monthlyRate << endl;
    cout << "Total interest: " << totalInterest << endl;

}

void countZeroOccurence(){
    int noOfCount , zeroCount;
    cout << "Enter no of count: ";
    cin >> noOfCount;
    int num[noOfCount];
    for(int i = 0;i < noOfCount; i++){

        cout << "Enter number: ";
        cin >> num[i];

    }
    for(int i = 0;i < noOfCount; i++){
        if(num[i] == 0){
            zeroCount++;
        }
    }

    cout << "There is " << zeroCount << " zero.";

}

int main(){

    int choose;
    userInput:

    cout << "1. Calculate Discount Item" << endl;
    cout << "2. Calculate Interest" << endl;
    cout << "3. Count Zero Occurence" << endl;
    cout << "Choose 1,2 or 3: ";
    cin >> choose;

    if(choose == 1){
        int price , disount;

        cout << "Item price: ";
        cin >> price;
        cout << "Discount value: ";
        cin >> disount;
        cout << "After discount price: ";
        cout << calculateDiscountItem(price,disount)<< endl;
    }
    else if(choose == 2){
        int loanAmt , interestRate , noOfMonths;
        cout << "Enter loan amount: ";
        cin >> loanAmt;
        cout << "Enter interest rate: ";
        cin >> interestRate;
        cout << "Enter no of months: ";
        cin >> noOfMonths;
        calculateInterest(loanAmt , interestRate , noOfMonths);
    }
    else if(choose == 3){
        countZeroOccurence();
    }
    else{
        cout << "_____Invalid number_____" << endl;
    }

    char ch;
    cout << "\nDo you want to continue?" << endl;
    cout << "If continue, press 'y': ";
    cin >> ch;
    if(ch == 'y'){
        cout <<endl;
        goto userInput;
    }

    return 0;
}
