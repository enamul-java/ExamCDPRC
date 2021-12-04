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
public class Problem1 {

    public String[][] findEmployeeList(String[][] employees, String[][] files) {

        String dupCheck = "";
        String resTemp = "";
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i][0];
            //System.out.println("" + file);

            for (int j = 0; j < employees.length; j++) {
                String employee_id_name = employees[j][0] + employees[j][1];
                //System.out.println(fileName+"---" + employee_id_name);
                if (employee_id_name.contains(fileName)) {
                    //System.out.println(fileName+"---" + employee_id_name);
                    if(dupCheck.contains("'"+employees[j][0]+"'") || dupCheck.contains("'"+employees[j][1]+"'")){
                       //Already Added 
                    }else{
                        dupCheck += "'"+employees[j][0]+"'"+"'"+employees[j][1]+"'";
                        //System.out.println(fileName+"---" + employee_id_name);
                        resTemp += employees[j][0]+","+files[i][1]+"-";
                    }
                }

            }

        }

       
        //System.out.println("" + resTemp);
        String[] res = resTemp.split("-");
        //System.out.println(""+res.length);
        String[][] resWithImage = new String [res.length][];
        for (int i = 0; i < res.length; i++) {
            //System.out.println(""+res[i]);
            resWithImage[i] = res[i].split(","); 
            
        }

        return resWithImage;
    }

}
