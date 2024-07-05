create or replace function ad01(x in number,y in number)
return number is 
z number;
begin
z:= x + y;
dbms_output.put_line('sum:'||z);
return z;
end ad01;
/
select  ad01(4,5) as from dual



