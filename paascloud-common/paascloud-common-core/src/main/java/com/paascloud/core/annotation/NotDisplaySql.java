package com.paascloud.core.annotation;

import java.lang.annotation.*;

/**
 * description: 配合 SqlLogInterceptor 对指定方法 禁止打印SQL到控制台<br>
 * version: 1.0 <br>
 * date: 2019/2/14 10:09 <br>
 * author: vnaLc <br>
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface NotDisplaySql {
}
