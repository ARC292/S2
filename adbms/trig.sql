
set SERVEROUTPUT on;

Create or replace trigger t2 after insert or update on xy
begin
If inserting
      then insert into tt values('insert done', SYSDATE);
  else
      insert into tt values('update done', SYSDATE);
End if;
End;
/
