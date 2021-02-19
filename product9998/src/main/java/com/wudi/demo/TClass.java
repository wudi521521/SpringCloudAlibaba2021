package com.wudi.demo;

import lombok.Data;

import java.util.List;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/18 17:26
 */
@Data
public class TClass {

    /**
     * 班级得id
     */
    private Integer classId;

    /**
     * 班级名
     */
    private String name;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 级别名称
     */
    private String courseName;

    /**
     * 数据
     */
    private List list;

    /**
     * 班级列表
     */
    private List listClass;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 教师头像
     */
    private String pictureUrl;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 职位(0.教师 1.学管 2.辅教 3.成长顾问）
     */
    private Integer positionId;

    /**
     * token
     */
    private String token;

    /**
     * 老师英文名
     *
     */
    private String teacherEnName;

    /**
     * 0:直营校区 1:加盟校区 2:直盟校区 3:其它
     */
    private Integer type;

    /**
     * 学校名
     */
    private String schoolName;

    /**
     * 0为该小区可用
     */
    private Integer state;

}
