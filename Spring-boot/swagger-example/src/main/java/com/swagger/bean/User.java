package com.swagger.bean;

/**
 * Created by daizhao.
 * User: tony
 * Date: 2018-3-21
 * Time: 10:56
 * info:
 */
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户基本信息")
public class User {

    @ApiModelProperty("姓名")
    @Size(max = 20)
    private String name;
    @ApiModelProperty("年龄")
    @Max(150)
    @Min(1)
    private Integer age;
    @NotNull
    private String address;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;

}