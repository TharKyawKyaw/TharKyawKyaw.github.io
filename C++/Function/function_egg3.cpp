#include<iostream>
using namespace std;

int salaries[5] = {100000,700000,900000,300000,1500000};

int findMaxSalary(){
    int max_sal = salaries[0];
    for(int i = 1;i < 5;i++){
        if(max_sal < salaries[i])
            max_sal = salaries[i];
    }

    return max_sal;
}

int findTotalSalary(){

    int total = 0;
    for(int i = 0;i < 5;i++){
        total += salaries[i];
    }

    return total;
}

int main(){

    int maximums_sal = findMaxSalary();
    cout << "Maximum salary is " << maximums_sal << " ks." << endl;

    int total_sal = findTotalSalary();
    cout << "Total salary is " << total_sal << " ks." << endl;

    return 0;
}
