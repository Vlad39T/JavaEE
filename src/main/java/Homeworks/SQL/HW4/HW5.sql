-- 1. Вивести кількість викладачів кафедри «Software Development».
select count(TeacherId) as кількість_викладачів_кафедри_Computer_Systems from teachers
join lectures l on teachers.id_teachers = l.TeacherId
join groupslectures gr on l.Id = gr.LectureId
join academy.groups g on gr.GroupId = g.id_groups
join academy.departments d on g.DepartmentId = d.id_departments
where d.name = 'Computer Systems';


-- 2. Вивести кількість лекцій, які читає викладач “Dave McQueen”.
select count(l.TeacherId) from teachers
join academy.lectures l on teachers.id_teachers = l.TeacherId
where teachers.name = 'Bread' and teachers.surname = 'Sweet';

-- 3. Вивести кількість занять, які проводяться в аудиторії “D201”.
select count(groupslectures.LectureId) from groupslectures
join academy.lectures l on l.Id = groupslectures.LectureId
where l.LectureRoom = '201';

-- 6. Вивести середню ставку викладачів факультету Computer Science.
select avg(teachers.salary) from teachers
join academy.lectures l on teachers.id_teachers = l.TeacherId
join academy.groupslectures g on l.Id = g.LectureId
join academy.`groups` g2 on g2.id_groups = g.GroupId
join academy.departments d on d.id_departments = g2.DepartmentId
join academy.facultet f on f.id_facultet = d.FacultyId
where f.name = 'Computer sciences';

 -- 7. Вивести мінімальну та максимальну кількість студентів серед усіх груп
 select max(`groups`.numOfStudents) as максимальна_кількість_студентів,
        min(`groups`.numOfStudents) as мінімальна_кількість_студентів from `groups`;
