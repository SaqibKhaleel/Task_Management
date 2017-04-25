/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workflowmanagement;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hatim
 */
public class WFMdatabase {
    
    Connection con;
    Statement st;
    String password = "licensedtokill";
    Component context;
    
    
    public WFMdatabase(Component context){
        
        this.context = context;
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/workflow_management","merhaba_96",password);
            st = con.createStatement();
        }
        catch(Exception e){}
        
    }
    
    public int check_password(String uname , String pass){
           String query = "select password from user where username = '"+ uname + "'";
           try{
           ResultSet rs = st.executeQuery(query);
           rs.next();
           if(pass.equals(rs.getString(1)))
               return 1;
           else
               return 2;
           }
           catch(Exception e){
           return 0;
           }
           
          }
      public int check_user_exists(String u_name){
           String query = "select count(*) from user where username = \""+ u_name + "\"";
           
           try{
           ResultSet rs = st.executeQuery(query);
           rs.next();
           int count = rs.getInt(1);
           if(count==0)
               return 0;
            else
               return 1;
           }
           catch(Exception e){
           return -1;
           }
          }
        public int check_sm_exists(){
             String query = "select count(*) from user where designation = 'seniormanager'";
             try{
           ResultSet rs = st.executeQuery(query);
           rs.next();
           int count = rs.getInt(1);
           if(count==0)
               return 0;
            else
               return 1;
           }
           catch(Exception e){
           return -1;
           }
        }
        
        public String get_sm(){
            String query = "select username from user where designation = 'seniormanager'";
            try{
           ResultSet rs = st.executeQuery(query);
           rs.next();
           return rs.getString(1);
           }
           catch(Exception e){
           return null;
           }
        }
        
        public String get_desig(String uname){
            String query = "select designation from user where username = '"+ uname + "'";
             try{
           ResultSet rs = st.executeQuery(query);
           rs.next();
           return rs.getString(1);
           }
           catch(Exception e){
           return null;
           }
        }
        
        public void appoint_sm(String sm_name){
            
            String query = "update user set designation = 'seniormanager' where (username = '"+sm_name+"')";
            try{
                st.executeUpdate(query);
            }
            catch(Exception e){
                
            }
        }
        public void replace_sm(String sm_name){
            String query1 = "update table user set designation = '' where designation = 'seniormanager'";
            String query2 = "update table user set designation = 'seniormanager' where username = '"+sm_name+"'";
            try{
             st.executeUpdate(query1);
             st.executeUpdate(query2);
            }
             catch(Exception e){
                
            }
        }
      
      
      public UserInfo get_user_info(String u_name){
    
    String query = "select * from user where username =  \""+ u_name + "\"";
    try{
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String firstname = rs.getString(1);
        String lastname = rs.getString(2);
        String uname = rs.getString(3);
        int age = rs.getInt(5);
        String sex = rs.getString(6);
        String email = rs.getString(7);
        String desig = rs.getString(8);
        return new UserInfo(firstname, lastname ,uname,age, sex, email, desig);
    }
    catch(Exception e){
        return null;
    }
    
}
      
      public ResultSet get_emp_list(){
          String query = "select fname, lname , designation from user";
          try{
              ResultSet rs = st.executeQuery(query);
              rs.next();
              return rs;
          }
          catch(Exception e){
              return null;
          }
      }
      
      public ResultSet get_emp_list_no_desig(){
          
           String query = "select username from user where designation = ''";
           try{
               ResultSet rs = st.executeQuery(query);
              rs.next();
              return rs;
           }
            catch(Exception e){
              return null;
          }
      }
       public void insert(String firstname , String lastname ,String u_name , String password, int age , String sex , String email,String designation){
           String query="INSERT INTO user VALUES('"+firstname+"','"+lastname+"','"+u_name+"','"+password+"',"+age+",'"+sex+"','"+email+"','"+designation+"')";
           try{
               st.executeUpdate(query);
           }
           catch(Exception e){}
} 
public void insert_project_info(String p_name,String pm){
    String query="INSERT INTO project_info VALUES('"+p_name+"','"+pm+"')";
    try{
        st.executeUpdate(query);
    }
    catch(Exception e){}
}

public ResultSet get_project_info(){
    String query = "select * from project_info";
    try{
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs;
    }
    catch(Exception e){
        return null;
    }
    
}
public ResultSet get_project_info_nopm(){
    String query = "select project_name from project_info where project_manager = ''";
    try{
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs;
    }
    catch(Exception e){
        return null;
    }
}

public String get_project_name(String pm_name){
    String query = "select project_name from project_info where project_manager = '"+ pm_name + "'";
      try{
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getString(1);
    }
    catch(Exception e){
        return null;
    }
}
    
public void update_proj_manager(String projname, String projmanager){
        String query = "update project_info set project_manager = '"+projmanager+"' where project_name = '"+projname+"'";
        String query2 = "update user set designation = 'projectmanager' where username = '"+projmanager+"'";
        try{
            st.executeUpdate(query);
            st.executeUpdate(query2);
        }
         catch(Exception e){
       
    }
        
    }

public void insert_team_info(String projname , String teamtitle, String teamleader){
      String query="INSERT INTO team_info VALUES('"+projname+"','"+teamtitle+"','"+teamleader+"')";
      String query2 = "update user set designation = 'teamleader' where username = '"+teamleader+"'"; 
         try{
             st.executeUpdate(query);
             st.executeUpdate(query2);
            } 
           catch(Exception e){
     }
}
    
public ResultSet get_team_info(String proj_name){
    String query = "select team_title, team_leader from team_info where project_name = '"+ proj_name + "'";
     try{
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs;
    }
    catch(Exception e){
        return null;
    }      
}

}