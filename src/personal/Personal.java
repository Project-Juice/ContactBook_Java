/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author kornelia
 */
public class Personal {

    private String name;
    private String sex;
    private Integer age;
    private Boolean games;
    
    public Personal(String name, String sex, Integer age, Boolean games){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.games = games;
    }
    public Personal(String name, String sex, Integer age){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.games = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGames(Boolean games) {
        this.games = games;
    }
    
    public String getName(){
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getGames() {
        return games;
    }
    
    
}
