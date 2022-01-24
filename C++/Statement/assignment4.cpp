#include<iostream>
using namespace std;

int main(){

    int pro_mark , eng_mark , math_mark;
    int total_mark , avg_mark;
    int dist_mark = 80;

    string programming = "Programming";
    string english = "English";
    string math = "Math";
    string max_sub , min_sub;


    cout << "Enter Programming mark: ";
    cin >> pro_mark;

    cout << "Enter English mark: ";
    cin >> eng_mark;

    cout << "Enter Math mark: ";
    cin >> math_mark;

    int max_mark = pro_mark;
    int min_mark = pro_mark;

    total_mark = pro_mark + eng_mark + math_mark;
    avg_mark = total_mark / 3;

    max_mark = (max_mark < eng_mark) ? ((eng_mark < math_mark) ? math_mark : eng_mark)  : ((max_mark < math_mark) ? math_mark : max_mark);
    min_mark = (min_mark > eng_mark) ? ((eng_mark > math_mark) ? math_mark : eng_mark)  : ((min_mark > math_mark) ? math_mark : min_mark);

    max_sub = (max_mark == pro_mark) ? programming  : ((max_mark == eng_mark) ? english : math);
    min_sub = (min_mark == pro_mark) ? programming : ((min_mark == eng_mark) ? english : math);

/*
    if(max_mark < eng_mark){
        max_mark = eng_mark;
        max_sub = english;
    }

    if(max_mark < math_mark){
        max_mark = math_mark;
        max_sub = math;
    }

    if(min_mark > eng_mark){
        min_mark = eng_mark;
        min_sub = english;
    }

    if(min_mark > math_mark){
        min_mark = math_mark;
        min_sub = math;
    }
*/

/*
    if(max_mark == pro_mark){
        max_sub = programming;

        if(min_mark == eng_mark)
            min_sub = english;

        else
            min_sub = math;

    }
    else if(max_mark == eng_mark){
        max_sub = english;

        if(min_mark == pro_mark )
            min_sub = programming;

        else
            min_sub = math;
    }
    else{
        max_sub = math;

        if(min_mark == pro_mark)
            min_sub = programming;

        else
            min_sub = english;
    }

*/


    cout << "Subject that got maximum mark is " << max_sub <<endl;
    cout << "Subject that got minimum mark is " << min_sub <<endl;

    cout << "Total mark: " << total_mark <<endl;
    cout << "Average mark: " << avg_mark << endl;

    /*
    if(pro_mark >= dist_mark && eng_mark >= dist_mark && math_mark >= dist_mark){
        cout << "Distinction subjects- " << programming << " , " << english << " , " << math << endl;
    }
    else if(pro_mark >= dist_mark && eng_mark >= dist_mark){
        cout << "Distinction subjects- " << programming << " , " << english << endl;
    }
    else if(pro_mark >= dist_mark && math_mark >= dist_mark){
        cout << "Distinction subjects- " << programming << " , " << math << endl;
    }
    else if(eng_mark >= dist_mark && math_mark >= dist_mark){
        cout << "Distinction subjects- " << english << " , " << math << endl;
    }
    else if(pro_mark >= dist_mark){
        cout << "Distinction subjects- " << programming;
    }
    else if(eng_mark >= dist_mark){
        cout << "Distinction subjects- " << english;
    }
    else if(math_mark >= dist_mark){
        cout << "Distinction subjects- " << math;
    }
    */

    if(pro_mark >= dist_mark){

        if(eng_mark >= dist_mark){

            if(math_mark >= dist_mark)
                cout << "Distinction subjects- " << programming << " , " << english << " , " << math << endl;

            else
                cout << "Distinction subjects- " << programming << " , " << english << endl;

        }

        else if(math_mark >= dist_mark){
            cout << "Distinction subjects- " << programming << " , " << math << endl;
        }

        else{
            cout << "Distinction subject- " << programming << endl;
        }

    }

    else if(eng_mark >= dist_mark){

        if(math_mark >= dist_mark)
            cout << "Distinction subjects- " << english << " , " << math << endl;

        else
            cout << "Distinction subject- " << english << endl;
    }

    else if(math_mark >= dist_mark){
        cout << "Distinction subject- " << math << endl;
    }

    return 0;
}
