#select  (case when id%2=1 and id=(select count(1) from seat) then id when id%2=1 then id+1  else id-1 end) as id,student from seat order by id

#select if(id=(select count(1)from seat) and id%2=1,id,if(id%2=1,id+1,id-1)) as id ,student from seat order by id

SELECT a.id, IFNULL(b.student,a.student) student FROM seat a LEFT JOIN seat b ON if(a.id%2=1,a.id=b.id-1,a.id=b.id+1) ORDER BY id;