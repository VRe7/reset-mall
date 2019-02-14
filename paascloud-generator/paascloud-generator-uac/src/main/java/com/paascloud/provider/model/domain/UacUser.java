package com.paascloud.provider.model.domain;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Table(name = "uac_user")
@Data
public class UacUser {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 工号
     */
    private String user_code;

    /**
     * 用户名(登录名)
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String icon;

    /**
     * 状态: DISABLE-禁用, ENABLE-可用
     */
    private String status;

    /**
     * 性别: 0-未知,1-女,2-男
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 生日 (yyyy-MM-dd)
     */
    private String birthday;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 个性签名
     */
    private String person_sign;

    /**
     * 用户类型(判断用户是否是会员): 10-否(后台用户),20-是(会员),30-未知
     */
    private Integer is_member;

    /**
     * 用户是会员,此字段必填: 判断会员等级
     */
    private Long level_id;

    /**
     * 用户来源
     */
    private String user_source;

    /**
     * 最后登录的IP
     */
    private String last_login_ip;

    /**
     * 最后登录时间
     */
    private Date last_ligin_time;

    /**
     * 是否更改过密码: 0-未更改,1-已更改
     */
    private Short is_changed_pwd;

    /**
     * (暂不使用)连续输错密码次数(连续5次输错冻结账号)
     */
    private Short pwd_error_count;

    /**
     * 最后输错密码时间
     */
    private Date pwd_error_time;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    private Long create_id;

    /**
     * 创建时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date create_time;

    /**
     * 最近操作人
     */
    private String last_operator;

    /**
     * 最后操作人ID
     */
    private Long last_operator_id;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 备注
     */
    private String remark;
}