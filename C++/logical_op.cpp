#include<iostream>
using namespace std;

int main(){
    ///Logical Operators

    bool result = ( 3 != 5 ) && ( 3 < 5 ); /// true && true
    cout << " ( 3 != 5 ) && ( 3 < 5 ) is " << result  << endl;

    result = ( 3 == 5 ) && ( 3< 5 ); /// false &&
    cout << " ( 3 == 5 ) && ( 3 < 5 ) is " << result << endl ;

    result = ( 3 == 5 ) && ( 3 > 5 ); /// true && false
    cout << " ( 3 == 5 ) && ( 3 > 5 ) is " << result << endl;

    result = ( 3 != 5) || ( 3 < 5 ); /// true ||
    cout << " ( 3 != 5) || ( 3 < 5 ) is " << result << endl;

    result = ( 3 != 5 ) || ( 3 < 5 ); /// true ||
    cout << " ( 3 != 5 ) && ( 3 < 5 ) is " << result  << endl;

    result = ( 3 == 5 ) || ( 3 > 5 ); /// false && false
    cout << " ( 3 == 5 ) && ( 3 > 5 ) is " << result << endl;

    result = !( 3 == 5 ); /// !(false) = true
    cout << " !( 3 == 5 ) is " << result << endl;

    result = !(( 3 != 5) || ( 3 < 5 )); /// !(true || true) = false
    cout << " !( 3 != 5) || ( 3 < 5 ) is " << result << endl;



    return 0;
}

