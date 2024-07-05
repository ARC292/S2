Set serveroutput ON
declare 
area float;
pi constant float:=3.14;
r float;
begin
dbms_output.put_line('enter the radius data');
r:=&r;
area:=pi*power(r,2);
dbms_output.put_line('area='||area);
end;
/
