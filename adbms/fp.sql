set serveroutput ON
declare
a float;
b float;
c float;

begin
a:=12;
b:=13;
c:=a3(a,b);
dbms_output.put_line('max is  '||c);
end;
/

