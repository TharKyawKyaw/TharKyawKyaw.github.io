#include<iostream>
using namespace std;

class Account {
///data
public:
    string accountHolder;
    string accountNo;
    int balance;
///actions
    void createAccount(string holder,string no,int initBalance){
        accountHolder = holder;
        accountNo = no;
        balance = initBalance;
    }

    void deposit(int depositAmt){
        balance += depositAmt;
    }

    bool withdraw(int withdrawAmt){
        if(withdrawAmt > balance)
            return false;
        else{
            balance -= withdrawAmt;
            return true;
        }
    }

    void showData(){
        cout << "\n_______Current Information_______\n\n";
        cout << "Holder name: " << accountHolder << endl;
        cout << "Account number: " << accountNo << endl;
        cout << "Current Balance: " << balance << endl;
    }
};

int main(){
    ///create object
    Account acc1;

    acc1.createAccount("TKK" , "1345678" , 1000000);

    acc1.showData();

    cout << "\n_______deposit(200000ks)_______\n";
    acc1.deposit(200000);
    cout << "Account after deposit " << acc1.balance << " ks" << endl;

    cout << "\n_______Withdraw(1500000ks)_______\n";
    if(acc1.withdraw(1500000)){
        cout << "Success..." << endl;
        cout << "Current Balance: " << acc1.balance << endl;
    }
    else{
        cout << "Sorry not enough money!" << endl;
        cout << "Current Balance: " << acc1.balance << endl;
    }

        cout << "\n_______Withdraw(1000000ks)_______\n";
    if(acc1.withdraw(1000000)){
        cout << "Success..." << endl;
        cout << "Current Balance: " << acc1.balance << endl;
    }
    else{
        cout << "Sorry not enough money!" << endl;
        cout << "Current Balance: " << acc1.balance << endl;
    }
    return 0;
}
