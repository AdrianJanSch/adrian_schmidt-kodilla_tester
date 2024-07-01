cd C:\Kodilla-curse\Kodilla-course\kodilla-stream

if EXIST build\libs\*.jar (
 echo Usuwanie istniejących plikow .jar...
 del build\libs\*.jar
)

echo Budowanie projektu za pomocą Gradle...
call ..\gradlew build

if EXIST build\libs\*.jar (
     echo Kopiowanie pliku .jar do katalogu projekty
     copy build\libs\*.jar projekt
     echo Plik .jar został skopiowany do katalogu projekty
) else (
     echo Blad: Plik .jar nie zostal wygenerowany. Sprawdz logi budowania.
)

