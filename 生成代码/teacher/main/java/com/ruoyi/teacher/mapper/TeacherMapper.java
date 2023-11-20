package com.ruoyi.teacher.mapper;

import java.util.List;
import com.ruoyi.teacher.domain.Teacher;

/**
 * teacherMapper接口
 * 
 * @author ruoyi
 * @date 2023-11-20
 */
public interface TeacherMapper 
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
     * 删除teacher
     * 
     * @param id teacher主键
     * @return 结果
     */
    public int deleteTeacherById(Long id);

    /**
     * 批量删除teacher
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeacherByIds(Long[] ids);
}
