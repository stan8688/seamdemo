package com.seam.register.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import javax.persistence.Version;
import org.hibernate.validator.Length;

import org.hibernate.validator.NotNull;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Entity
@Scope(ScopeType.EVENT)
@Table(name="USER", schema = "public")
public class User implements Serializable
{
    // seam-gen attributes (you should probably edit these)
    @Id 
    @SequenceGenerator(name="UserSeq", sequenceName="public.user_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UserSeq")
    private Long id;
  
    
    @NotNull @Length(min=1)
    private String name;
    
    @NotNull @Length(min=1)
    private String realname;
    
    @NotNull @Length(min=1)
    private String password;

    // add additional entity attributes

    // seam-gen attribute getters/setters with annotations (you probably should edit)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}
