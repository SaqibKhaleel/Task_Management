/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workflowmanagement;

/**
 *
 * @author hatim
 */
public class UserInfo {
    
    String first_name;
    String last_name;
    String uname;
    int age;
    String sex;
    String email;
    String desig;
    
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getDesig() {
        return desig;
    }
    
    public UserInfo(String first_name, String last_name, String uname, int age, String sex, String email, String desig) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.uname = uname;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.desig = desig;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUname() {
        return uname;
    }

  
    
    
    
    
    
}
