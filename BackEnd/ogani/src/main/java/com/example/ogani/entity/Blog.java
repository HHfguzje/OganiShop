package com.example.ogani.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="blog")
public class Blog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(name = "description",columnDefinition = "TEXT")
    private String description;


    @Column(name = "content",columnDefinition = "TEXT")
    private String content;

    private Timestamp createAt;

    @ManyToOne
    @JoinColumn(name="image_id")
    private Image image;


    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="blog_tag",joinColumns = @JoinColumn(name="blog_id"),inverseJoinColumns = @JoinColumn(name="tag_id"))
    private Set<Tag> tags = new HashSet<>();


	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Blog(long id, String title, String description, String content, Timestamp createAt, Image image, User user,
			Set<Tag> tags) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
		this.createAt = createAt;
		this.image = image;
		this.user = user;
		this.tags = tags;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Timestamp getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Set<Tag> getTags() {
		return tags;
	}


	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
    
    

}
