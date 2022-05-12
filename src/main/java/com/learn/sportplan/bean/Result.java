package com.learn.sportplan.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

//作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
@Data
@ApiModel(value = "相应参数")
public class Result implements Serializable {
    /**
     * 响应给前端的数据：是否成功的标志、响应消息、响应数据
     */
    @ApiModelProperty(value = "成功标识", dataType = "boolean")
    private boolean flag;

    @ApiModelProperty(value = "相应信息", dataType = "String")
    private String message;

    @ApiModelProperty(value = "相应数据", dataType = "Object")
    private Object data;
//    使用lombok就不需要手动创建getter setter toString方法

    public Result() {
    }

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    // 响应成功 且 无返回值
    public static Result success(String message){
        return new Result(true, message);
    }

    // 响应成功 且 有返回值
    public static Result success(String message, Object data){
        return new Result(true, message, data);
    }

    // 响应失败的结果
    public static Result fail(String message){
        return new Result(false, message);
    }
}
