package com.sky.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Ningxb
 * @Date: 2021-01-12 12:40
 * @description: 用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("USER_INFO")
public class User implements Serializable{
    private static final long serialVersionUID = -1L;
    //@TableId(type= IdType.AUTO)
    private Integer id;//主键
    private String name;//姓名
    private Integer gender;//性别
    private Integer age;//年龄
    private String phoneNumber;//手机号码
    private String email;//邮箱地址
    private String avatar;//头像',
    private String jobType;// '工作类型',
    private String state;
    private String city;//市;
    private Date crtdate;
    private Date upddate;
}
