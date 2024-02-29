-- 1. Вивести всі можливі пари рядків викладачів та груп.
select teachers.name,teachers.surname,`groups`.name,subjects.Name
from lectures
         inner join teachers on lectures.TeacherId = teachers.id_teachers
         inner join subjects on lectures.SubjectId = subjects.Id
         inner join groupslectures on lectures.Id = groupslectures.LectureId
         inner join `groups` on groupslectures.GroupId = `groups`.id_groups;
--  4. Вивести імена та прізвища викладачів, які читають лекції
-- у групі “P107”.
    select teachers.name,teachers.surname,`groups`.name
    from teachers
    inner join lectures on teachers.id_teachers = lectures.TeacherId
    inner join academy.groupslectures g on lectures.Id = g.LectureId
    inner join academy.`groups`  on g.GroupId = `groups`.id_groups
    where `groups`.name = 'Java-31';
--  6. Вивести назви кафедр та назви груп, які до них належать.
    select departments.name,gr.name
    from departments
    inner join academy.`groups` gr on departments.id_departments = gr.DepartmentId;
--  7. Вивести назви дисциплін, які читає викладач “Samantha
-- Adams”.
    select subjects.Name
    from subjects
    inner join lectures on subjects.Id = lectures.SubjectId
    inner join teachers on lectures.TeacherId = teachers.id_teachers
    where teachers.name = 'Ben' and teachers.surname = 'Back';
--  9. Вивести назви груп, що належать до факультету Computer
-- Science.
select `groups`.name
from `groups`
inner join departments d on `groups`.DepartmentId = d.id_departments
inner join facultet f on d.FacultyId = f.id_facultet
where f.name = 'Computer sciences';