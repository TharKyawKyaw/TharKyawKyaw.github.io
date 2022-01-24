#include<iostream>
using namespace std;
int findLargestNumber(int num1,int num2,int num3){
    int max_num = num1;
    if(max_num < num2)
        max_num = num2;

    if(max_num < num3)
        max_num = num3;

    return max_num;
}

int findSmallestNumber(int num1,int num2,int num3){
    int min_num = num1;
    if(min_num > num2)
        min_num = num2;

    if(min_num > num3)
        min_num = num3;

    return min_num;
}

bool checkLogin(string uName,string uPass){
    if(uName == "mmit" && uPass == "admin123")
        return true;

    else
        return false;
}

int main(){

    int choose;
    userInput:

    cout << "1. Find Largest Number" << endl;
    cout << "2. Find Smallest Number" << endl;
    cout << "3. Check Login" << endl;
    cout << "Choose 1,2 or 3: ";
    cin >> choose;

    if(choose == 1){
        int num1,num2,num3;
        cout << "\n_______Find Largest Number_______\n";
        cout << "Enter three number: " << endl;
        cin >> num1 >> num2 >> num3;
        cout << "Largest number is ";
        cout << findLargestNumber(num1,num2,num3)<< endl;
    }
    else if(choose == 2){
        int num1,num2,num3;
        cout << "\n_______Find Smallest Number_______\n";
        cout << "Enter three number: " << endl;
        cin >> num1 >> num2 >> num3;
        cout << "Smallest number is ";
        cout << findSmallestNumber(num1,num2,num3)<< endl;
    }
    else if(choose == 3){
        string userName,userPass;
        cout << "\n_______Check Login_______\n";
        cout << "Enter user name: ";
        cin >> userName;
        cout << "Enter password: ";
        cin >> userPass;
        bool result = checkLogin(userName,userPass);
        if(result){
            cout << "Login Successful!"<< endl;
        }
        else{
            cout << "Login Fail!"<< endl;
        }
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
