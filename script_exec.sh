Execute=False;

if [ $# -ge 1 ]; then
    if [ $1 == "-h" ]; then
        echo "script_exec.sh s'utilise avec \"script_exec.sh fichier1 fichier2 ...\""
        echo "script_exec.sh s'utilise avec \"script_exec.sh -e fichier1 fichier2 ...\" pour exécuter les fichiers compilés"
        echo "script_exec.sh s'utilise avec \"script_exec.sh -h\" pour afficher l'aide"
    fi
    else
        if [ $1 == "-e" ]; then
            shift  
            Execute=True;
        fi
        for Fichier in "$@"; do 
            if [ -f "$Fichier" ]; then
                NomBase=$(basename "$Fichier" .while)
                echo "Compilation de $NomBase pour compiler le while en java ..."
                java -cp ./bin Main "$Fichier"
                echo "Compilation du fichier $NomBase.java ..."
                javac "./java_source/src/$NomBase.java" -d ./java_source/bin
                if [ $Execute == True ]; then
                echo "Exécution du fichier $NomBase.java ..."
                java -cp ./java_source/bin $NomBase
                fi
            else
                echo "$Fichier n'est pas un nom de fichier existant"
            fi
        done
    fi
else
    echo "script_exec.sh s'utilise avec \"script_exec.sh fichier1 fichier2 ...\""
fi