if [[ -e demo.txt ]];
then
    cat demo.txt | grep "bro"
    
else
    echo "pattern not found"
fi        
