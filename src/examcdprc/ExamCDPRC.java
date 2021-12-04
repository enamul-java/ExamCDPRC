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
        String [][] EmployeeList = p1.findEmployeeList(employees, files);
        int totalUniqueFile = EmployeeList.length;
        
        /*
        System.out.println("Employee_id------ File Type");
        for (int i = 0; i < res.length; i++) {
            String re = res[i][0]+"------ "+res[i][1];
            System.out.println(""+re);
            
        }*/
    }

}
