#include<iostream>
#include<cctype>
#include<cmath>
#include<iomanip>

using namespace std;

int main(){

    cout << "\n_______Function of cctype_______\n";
    cout << "Is aplha('9'): " << isalpha('9');
    cout << "\nIs alpha('a'): " << isalpha('a');
    cout << "\nLower case of 'A': " << (char)tolower('A');

    cout << "\n_______Function of cmath\n" <<endl;
    cout << "3 power 5 is: " << pow(3,5) << endl;
    cout << "Square root of 81 is: " << sqrt(81) << endl;
    cout << "Value of sin(30) is: " << sin(30) << endl;
    cout << "Value of log(10) is: " << log(10) << endl;

    cout << "\n_______Function of iomanip_______\n" << endl;
    cout << "Spring" << setw(20) << "Day" << endl;
    cout << "Love" << setw(27) << "Yourself" << endl;

    return 0;
}
