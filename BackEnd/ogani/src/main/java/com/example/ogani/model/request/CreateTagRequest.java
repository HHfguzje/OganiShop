package com.example.ogani.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTagRequest {
    

    @NotNull(message = "Tên nhãn rỗng")
    @NotEmpty(message = "Tên nhãn rỗng")
    @Schema(description = "Tên nhãn",example="Beauty",required=true)
    private String name;

	public CreateTagRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateTagRequest(@NotNull(message = "Tên nhãn rỗng") @NotEmpty(message = "Tên nhãn rỗng") String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
