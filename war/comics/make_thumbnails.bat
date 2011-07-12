mkdir temp
for %%i in (*.jpg) do convert %%i -resize 960x200 temp\%%~ni_thumbnail.jpg
move temp\* .
rmdir temp
