cd ..

del build\libs\*.jar

call gradlew build

if EXIST build\libs\*.jar (
  echo jest plik
  copy build\libs\*.jar kodilla-stream\projekt
) else (
  echo nie ma pliku
)

cd kodilla-stream




