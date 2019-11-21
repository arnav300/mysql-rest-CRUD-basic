package com.exercise.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	
	
    @Id
    private String survived;
    private String pclass;
    private String name;
    private String sex;
    private String age;
    private String siblings;
    private String parents;
    private String fare;
    
    public String getPclass() {
		return pclass;
	}

	public void setPclass(String pclass) {
		this.pclass = pclass;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSiblings() {
		return siblings;
	}

	public void setSiblings(String siblings) {
		this.siblings = siblings;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getParents() {
		return parents;
	}

	public void setParents(String parents) {
		this.parents = parents;
	}

    
    public String getSurvived() {
        return survived;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  

   

    @Override
    public String toString() {
       return "Person{" + "survived='" + survived + '\'' + ", pclass='" + pclass + '\'' + ", name='" + name + '\''
               + ", sex='" + sex + '\'' + ", age='" + age + '\'' + " , siblings='" + siblings + '\'' + ", parents='" + parents + '\'' + ",  fare='" + fare + '\'' + '}';
    }
}