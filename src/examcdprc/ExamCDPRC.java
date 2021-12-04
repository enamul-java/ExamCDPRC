/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examcdprc;

/**
 *
 * @author ehaque
 */
public class ExamCDPRC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //**************Problem 1**************
        String employees[][] = {
            {"1", "Alice"},
            {"2", "John"},
            {"3", "Jane"},
            {"4", "Alice"},
            {"5", "Bob"}};

        String files[][] = {
            {"100", "jpeg"},
            {"Alice", "png"},
            {"3", "jpg"},
            {"1", "jpg"},
            {"John", "jpeg"}
        };

        Problem1 p1 = new Problem1();
        String[][] EmployeeList = p1.findEmployeeList(employees, files);
        int totalUniqueFile = EmployeeList.length;

        /*
        System.out.println("Employee_id------ File Type");
        for (int i = 0; i < res.length; i++) {
            String re = res[i][0]+"------ "+res[i][1];
            System.out.println(""+re);
            
        }*/
        //********************Problem 2********************
        //[id, name, scroe]
        String[][] students = {
            {"1", "John", "25"},
            {"2", "Jane", "43"},
            {"3", "Bob", "61"},
            {"4", "Jake", "78"},
            {"5", "Reed", "88"}
        };

        //[category, min, max]
        int categorys[][] = {
            {1, 0, 30},
            {2, 31, 45},
            {3, 46, 65},
            {4, 66, 85},
            {5, 86, 100}
        };
        
        
        //SQL Queruy 
        String query = "SELECT Name, "
                + "(SELECT Category form Categories where Score <= Min_Score AND Score <= Max_Score) Category ,"
                + "DECODE(((SELECT Category form Categories where Score <= Min_Score AND Score <= Max_Score)>3), true, 'Passed', 'Failed')"
                + "FROM Students "
                + "ORDER BY DESC ";
        
        System.out.println("Query : "+ query);
        
    }

}
