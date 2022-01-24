#include<iostream>
using namespace std;

int main(){

    int row = 3;
    int col = 4;
    string subjects[col] = {"html" , "javascript" , "database" , "c++"};
    string students[row] = {"aung aung" , "cherry" , "yuki"};
    int marks[row][col] = {
                            {100,75,80,100},
                            {88,90,90,56},
                            {90,80,77,100}
                          };

    ///find students who got javascript mark is greater than 80
    cout << "\n________Students (javascript > 80)_______\n\n";
    for(int r = 0;r < row;r++){
        if(marks[r][1] > 80)
            cout << students[r] << " (" << marks[r][1] << " marks" << ")" << endl << endl;
    }
    cout << "______________" << endl;
    for(int r = 0;r < row;r++){
        int max_mark = marks[r][0];
        int min_mark = marks[r][0];
        int max_sub_index = 0;
        int min_sub_index = 0;
        for(int c = 1;c < col;c++){
                if(max_mark < marks[r][c]){
                    max_mark = marks[r][c];
                    max_sub_index = c;
                }
                else if(min_mark > marks[r][c]){
                    min_mark = marks[r][c];
                    min_sub_index = c;
                }
        }
        cout << "Name - " << students[r] << endl;
        cout << "\tMaximum subject: " << subjects[max_sub_index] << "(" << max_mark << " marks)" << endl;
        cout << "\tMinimum subject: " << subjects[min_sub_index] << "(" << min_mark << " marks)" << endl << endl;

    }
    string search_stu;
    string search_sub;
    cout << "Enter search name: ";
    getline(cin , search_stu);

    cout << "Enter search subject: ";
    getline(cin,search_sub);

    ///find index of student name (row)
    int index_stu;
    int index_sub;

    for(int r = 0;r < row;r++){
        if(search_stu == students[r]){
            index_stu = r;
            break;
        }
    }
    ///find index of subject name (col)
    for(int c = 0;c < col;c++){
        if(search_sub == subjects[c]){
            index_sub = c;
            break;
        }
    }
    cout << search_stu << " " << search_sub << " mark is " << marks[index_stu][index_sub];

    ///find student who got maximum mark of database
    cout << "\nStudent who get maximum mark of database is ";
    int max_db = marks[0][2];
    int index_db;
    for(int r = 0;r < row;r++){
        if(max_db < marks[r][2]){
            max_db = marks[r][2];
            index_db = r;
        }
    }
    cout << students[index_db] << endl;
    ///find average mark for each student
    for(int r = 0;r < row;r++){
        int total_mark = 0;
        for(int c = 0;c < col;c++){
            total_mark += marks[r][c];
        }
        cout << students[r] << " average mark is " << (float)(total_mark/col) << endl;
    }

    ///find no of students who got the same mark in c++



    return 0;
}
