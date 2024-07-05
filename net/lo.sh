
 echo "read two numbers"
read one 
read two
if [[ $one -gt $two ]] ; then
  echo "the $one is greater than $two"
elif [[ $one -lt $two ]] ; then
   echo "the $one is lesser than $two"
else
    echo "they are equal"
fi       
