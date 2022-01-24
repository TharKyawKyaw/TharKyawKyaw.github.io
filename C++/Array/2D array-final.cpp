#include<iostream>
using namespace std;
int main(){
    int row = 3,col = 4;
    string subjects[col] = {"html","javascript","database","c++"};
    string students[row] = {"aung aung","cherry","yuki"};

    int marks[row][col] = {
                        {
                           100,74,80,88
                        },
                        {
                            88,90,90,56
                        },
                        {
                            90,80,77,100
                        }
                    };

    /// find students who got javascript mark is greater than 80
    cout<<"\n______Students(javascript > 80)______\n\n";
    for(int r = 0; r < row;r++){
        if(marks[r][1] > 80){
               cout<<students[r]<<"("<<marks[r][1]<<" marks)";
               cout<<"\n";
        }
    }
    cout<<"\n______________________________\n";
    /// find max sub & min sub for each student
    for(int r = 0; r < row;r++){/// loop for student

        int max_mark = marks[r][0];
        int min_mark = marks[r][0];
        int max_sub_index = 0;
        int min_sub_index = 0;
        for(int c = 1; c < col;c++){/// loop for subject
            if(max_mark < marks[r][c]){/// mix
                max_mark = marks[r][c];
                max_sub_index = c;
            }
            /// min
            if(min_mark > marks[r][c]){
                min_mark = marks[r][c];
                min_sub_index = c;
            }
        }
        cout<<"\n\nName - "<<students[r];
        cout<<"\nMaximum subject: "<<subjects[max_sub_index]<<"("<<max_mark<<" marks)";
        cout<<"\nMinimum subject: "<<subjects[min_sub_index]<<"("<<min_mark<<" marks)";


    }

    cout<<"\n_________________________\n\n";
    /// find mark
    string search_std;
    string search_sub;
    cout<<"Enter student name: ";
    getline(cin,search_std);
    cout<<"Enter subject name: ";
    getline(cin,search_sub);

    /// find index of student name (row)
    int student_index = - 1;
    for(int i = 0;i < row; i++){
        if(search_std == students[i]){
            student_index = i;
            break;
        }
    }
    /// find index of subject name (col)
    int subject_index = -1;
    for(int i = 0;i < col;i++){
        if(search_sub == subjects[i]){
            subject_index = i;
            break;
        }
    }

    /// display mark[row][col]
    cout<<"Mark: "<<marks[student_index][subject_index];

    return 0;
}
