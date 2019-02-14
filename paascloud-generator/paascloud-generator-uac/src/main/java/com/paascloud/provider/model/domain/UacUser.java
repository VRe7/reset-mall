package com.paascloud.provider.model.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "uac_user")
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

    /**
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取工号
     *
     * @return user_code - 工号
     */
    public String getUser_code() {
        return user_code;
    }

    /**
     * 设置工号
     *
     * @param user_code 工号
     */
    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    /**
     * 获取用户名(登录名)
     *
     * @return username - 用户名(登录名)
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名(登录名)
     *
     * @param username 用户名(登录名)
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取头像
     *
     * @return icon - 头像
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     *
     * @param icon 头像
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取状态: DISABLE-禁用, ENABLE-可用
     *
     * @return status - 状态: DISABLE-禁用, ENABLE-可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态: DISABLE-禁用, ENABLE-可用
     *
     * @param status 状态: DISABLE-禁用, ENABLE-可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取性别: 0-未知,1-女,2-男
     *
     * @return sex - 性别: 0-未知,1-女,2-男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别: 0-未知,1-女,2-男
     *
     * @param sex 性别: 0-未知,1-女,2-男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取生日 (yyyy-MM-dd)
     *
     * @return birthday - 生日 (yyyy-MM-dd)
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日 (yyyy-MM-dd)
     *
     * @param birthday 生日 (yyyy-MM-dd)
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取所在城市
     *
     * @return city - 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在城市
     *
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取个性签名
     *
     * @return person_sign - 个性签名
     */
    public String getPerson_sign() {
        return person_sign;
    }

    /**
     * 设置个性签名
     *
     * @param person_sign 个性签名
     */
    public void setPerson_sign(String person_sign) {
        this.person_sign = person_sign;
    }

    /**
     * 获取用户类型(判断用户是否是会员): 10-否(后台用户),20-是(会员),30-未知
     *
     * @return is_member - 用户类型(判断用户是否是会员): 10-否(后台用户),20-是(会员),30-未知
     */
    public Integer getIs_member() {
        return is_member;
    }

    /**
     * 设置用户类型(判断用户是否是会员): 10-否(后台用户),20-是(会员),30-未知
     *
     * @param is_member 用户类型(判断用户是否是会员): 10-否(后台用户),20-是(会员),30-未知
     */
    public void setIs_member(Integer is_member) {
        this.is_member = is_member;
    }

    /**
     * 获取用户是会员,此字段必填: 判断会员等级
     *
     * @return level_id - 用户是会员,此字段必填: 判断会员等级
     */
    public Long getLevel_id() {
        return level_id;
    }

    /**
     * 设置用户是会员,此字段必填: 判断会员等级
     *
     * @param level_id 用户是会员,此字段必填: 判断会员等级
     */
    public void setLevel_id(Long level_id) {
        this.level_id = level_id;
    }

    /**
     * 获取用户来源
     *
     * @return user_source - 用户来源
     */
    public String getUser_source() {
        return user_source;
    }

    /**
     * 设置用户来源
     *
     * @param user_source 用户来源
     */
    public void setUser_source(String user_source) {
        this.user_source = user_source;
    }

    /**
     * 获取最后登录的IP
     *
     * @return last_login_ip - 最后登录的IP
     */
    public String getLast_login_ip() {
        return last_login_ip;
    }

    /**
     * 设置最后登录的IP
     *
     * @param last_login_ip 最后登录的IP
     */
    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    /**
     * 获取最后登录时间
     *
     * @return last_ligin_time - 最后登录时间
     */
    public Date getLast_ligin_time() {
        return last_ligin_time;
    }

    /**
     * 设置最后登录时间
     *
     * @param last_ligin_time 最后登录时间
     */
    public void setLast_ligin_time(Date last_ligin_time) {
        this.last_ligin_time = last_ligin_time;
    }

    /**
     * 获取是否更改过密码: 0-未更改,1-已更改
     *
     * @return is_changed_pwd - 是否更改过密码: 0-未更改,1-已更改
     */
    public Short getIs_changed_pwd() {
        return is_changed_pwd;
    }

    /**
     * 设置是否更改过密码: 0-未更改,1-已更改
     *
     * @param is_changed_pwd 是否更改过密码: 0-未更改,1-已更改
     */
    public void setIs_changed_pwd(Short is_changed_pwd) {
        this.is_changed_pwd = is_changed_pwd;
    }

    /**
     * 获取(暂不使用)连续输错密码次数(连续5次输错冻结账号)
     *
     * @return pwd_error_count - (暂不使用)连续输错密码次数(连续5次输错冻结账号)
     */
    public Short getPwd_error_count() {
        return pwd_error_count;
    }

    /**
     * 设置(暂不使用)连续输错密码次数(连续5次输错冻结账号)
     *
     * @param pwd_error_count (暂不使用)连续输错密码次数(连续5次输错冻结账号)
     */
    public void setPwd_error_count(Short pwd_error_count) {
        this.pwd_error_count = pwd_error_count;
    }

    /**
     * 获取最后输错密码时间
     *
     * @return pwd_error_time - 最后输错密码时间
     */
    public Date getPwd_error_time() {
        return pwd_error_time;
    }

    /**
     * 设置最后输错密码时间
     *
     * @param pwd_error_time 最后输错密码时间
     */
    public void setPwd_error_time(Date pwd_error_time) {
        this.pwd_error_time = pwd_error_time;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建人ID
     *
     * @return create_id - 创建人ID
     */
    public Long getCreate_id() {
        return create_id;
    }

    /**
     * 设置创建人ID
     *
     * @param create_id 创建人ID
     */
    public void setCreate_id(Long create_id) {
        this.create_id = create_id;
    }

    /**
     * 获取创建时间(yyyy-MM-dd HH:mm:ss)
     *
     * @return create_time - 创建时间(yyyy-MM-dd HH:mm:ss)
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * 设置创建时间(yyyy-MM-dd HH:mm:ss)
     *
     * @param create_time 创建时间(yyyy-MM-dd HH:mm:ss)
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 获取最近操作人
     *
     * @return last_operator - 最近操作人
     */
    public String getLast_operator() {
        return last_operator;
    }

    /**
     * 设置最近操作人
     *
     * @param last_operator 最近操作人
     */
    public void setLast_operator(String last_operator) {
        this.last_operator = last_operator;
    }

    /**
     * 获取最后操作人ID
     *
     * @return last_operator_id - 最后操作人ID
     */
    public Long getLast_operator_id() {
        return last_operator_id;
    }

    /**
     * 设置最后操作人ID
     *
     * @param last_operator_id 最后操作人ID
     */
    public void setLast_operator_id(Long last_operator_id) {
        this.last_operator_id = last_operator_id;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * 设置更新时间
     *
     * @param update_time 更新时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}