package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * studentMapper接口
 * 
 * @author ruoyi
 * @date 2023-11-19
 */
public interface StudentMapper 
{
    /**
     * 查询student
     * 
     * @param id student主键
     * @return student
     */
    public Student selectStudentById(Long id);

    /**
     * 查询student列表
     * 
     * @param student student
     * @return student集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增student
     * 
     * @param student student
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改student
     * 
     * @param student student
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除student
     * 
     * @param id student主键
     * @return 结果
     */
    public int deleteStudentById(Long id);

    /**
     * 批量删除student
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStudentByIds(Long[] ids);
}
