set serveroutput ON
declare

b integer:=&b;

l integer:=&l;
a integer;
begin
a:=b*l;
dbms_output.put_line('enter the area of the rectangle:'||a);
end;
/
