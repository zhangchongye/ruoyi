package com.ruoyi.teacher.service;

import java.util.List;
import com.ruoyi.teacher.domain.Teacher;

/**
 * teacherService接口
 * 
 * @author ruoyi
 * @date 2023-11-20
 */
public interface ITeacherService 
{
    /**
     * 查询teacher
     * 
     * @param id teacher主键
     * @return teacher
     */
    public Teacher selectTeacherById(Long id);

    /**
     * 查询teacher列表
     * 
     * @param teacher teacher
     * @return teacher集合
     */
    public List<Teacher> selectTeacherList(Teacher teacher);

    /**
     * 新增teacher
     * 
     * @param teacher teacher
     * @return 结果
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 修改teacher
     * 
     * @param teacher teacher
     * @return 结果
     */
    public int updateTeacher(Teacher teacher);

    /**
     * 批量删除teacher
     * 
     * @param ids 需要删除的teacher主键集合
     * @return 结果
     */
    public int deleteTeacherByIds(Long[] ids);

    /**
     * 删除teacher信息
     * 
     * @param id teacher主键
     * @return 结果
     */
    public int deleteTeacherById(Long id);
}
