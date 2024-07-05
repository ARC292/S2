set serveroutput ON
declare
i int;
begin
i:=&i;
for i in 4..9
loop
dbms_output.put_line(i);
end loop;
end;
/

