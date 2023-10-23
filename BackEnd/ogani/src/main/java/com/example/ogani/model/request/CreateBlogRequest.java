package com.example.ogani.model.request;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBlogRequest {
    
    @NotNull(message="Tiêu đề rỗng")
    @NotEmpty(message = "Tiêu đề rỗng")
    @Size(min=5,max=300,message="Độ dài tiêu đề từ 1-300 ký tự")
    private String title;


    @NotNull(message = "Mô tả rỗng")
    @NotEmpty(message = "Mô tả rỗng")
    @Size(min=5,max=300,message= "Độ dài mô tả từ 1-300 ký tự")
    private String description;

    @NotNull(message="Nội dung rỗng")
    @NotEmpty(message="Nội dung rỗng")
    @Size(min=5,message="Độ dài nội dung tối thiểu từ 5 ký tự")
    private String content;

    @NotNull(message="Ảnh đang rỗng")
    @NotEmpty(message="Ảnh đang rỗng")
    private Long imageId;

    private String username;

    private Set<Long> tags = new HashSet<>();

	public CreateBlogRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateBlogRequest(
			@NotNull(message = "Tiêu đề rỗng") @NotEmpty(message = "Tiêu đề rỗng") @Size(min = 5, max = 300, message = "Độ dài tiêu đề từ 1-300 ký tự") String title,
			@NotNull(message = "Mô tả rỗng") @NotEmpty(message = "Mô tả rỗng") @Size(min = 5, max = 300, message = "Độ dài mô tả từ 1-300 ký tự") String description,
			@NotNull(message = "Nội dung rỗng") @NotEmpty(message = "Nội dung rỗng") @Size(min = 5, message = "Độ dài nội dung tối thiểu từ 5 ký tự") String content,
			@NotNull(message = "Ảnh đang rỗng") @NotEmpty(message = "Ảnh đang rỗng") Long imageId, String username,
			Set<Long> tags) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
		this.imageId = imageId;
		this.username = username;
		this.tags = tags;
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

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Long> getTags() {
		return tags;
	}

	public void setTags(Set<Long> tags) {
		this.tags = tags;
	}
    
    

}
