set serveroutput ON
declare 
cont varchar(10);
rev varchar(10);
i number(5);
len number(2);
begin
cont:='&cont';
len:=length(cont);
for i in reverse 1..len
loop
rev:=rev || substr(cont,i,1);
end loop;
dbms_output.put_line('the reversed string:'||rev);
end;
/
