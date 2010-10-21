package com.seam.message.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Entity
@Name("message")
@Scope(ScopeType.EVENT)
public class Message implements Serializable
{
    // seam-gen attributes (you should probably edit these)
	@Id @GeneratedValue
    private Long id;
    
	@NotNull
	private boolean read;
	
    @NotNull  @Length(max=100)  
    private String title;
    
    @NotNull @Lob
    private String text;
    
    @NotNull @Basic @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;

    // add additional entity attributes

    // seam-gen attribute getters/setters with annotations (you probably should edit)

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

    
}
