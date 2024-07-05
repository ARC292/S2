create function abc(x in float,y in float)
return float is z float;
begin
if x>y then
 z:=x;
else 
 z:=y;
end if;  
return z; 
end a3;
/
select abc(4,5) from dual;



  
