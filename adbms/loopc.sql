set serveroutput ON
declare 
i int;
area float;
r float;
pi float:=3.14;
begin
r:=&r;
if(r>0) then
area:=pi;
for i in 1..2
loop
area:=area*r;
end loop;
dbms_output.put_line('the area:'||area);
else
dbms_output.put_line('the area cant be found:');
end if;
end;
/


