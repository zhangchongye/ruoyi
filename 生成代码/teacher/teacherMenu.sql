-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher', '2012', '1', 'teacher', 'teacher/teacher/index', 1, 0, 'C', '0', '0', 'teacher:teacher:list', '#', 'admin', sysdate(), '', null, 'teacher菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'teacher:teacher:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'teacher:teacher:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'teacher:teacher:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'teacher:teacher:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('teacher导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'teacher:teacher:export',       '#', 'admin', sysdate(), '', null, '');