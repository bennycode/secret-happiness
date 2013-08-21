secret-happiness
================
1. Create MySQL database:
mysql -uroot -pabc123 -e "CREATE DATABASE IF NOT EXISTS coding DEFAULT CHARACTER SET = 'utf8' DEFAULT COLLATE 'utf8_general_ci'"

2. Start Grails project

3. Create an "author"

4. Check if the "author" is stored in the database:
echo "USE coding; SELECT * FROM author;" | mysql -pabc123 -uroot

