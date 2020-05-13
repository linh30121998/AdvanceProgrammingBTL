/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_qlnv;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class EmployeeDAO {
    public int add(Emplyee ee){
        Connection conn = null;
        PreparedStatement sttm = null;
        try{
            String sSQL = "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            if (sttm.executeUpdate() > 0){
                System.out.println("add thanh cong");
                return 1;
            }
        }catch(Exception e) {
            System.out.println("Error:"+e.toString());
        }finally{
            try {
                conn.close();
                sttm.close();
            }catch(Exception e){
            }
        }
        return -1;
    }
}
