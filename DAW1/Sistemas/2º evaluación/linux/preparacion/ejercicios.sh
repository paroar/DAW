#!bin/bash
#Muestre los nombres de los usuarios del sistema que comiencen por la letra a
cut -f1 -d: /etc/passwd | grep "^a"

#Muestre los nombres de los usuarios del sistema que no contengan vocales
cut -f1 -d: /etc/passwd | grep -v "[aeiou]"

#Muestre los nombres de los usuarios del sistema de más de 5 char
cut -f1 -d: /etc/passwd | grep ".\{5,\}"

#Muestre los nombres de los usuarios del sistema que comiencen y terminen por la misma letra
cut -f1 -d: /etc/passwd | xargs -I {} ;  "grep "^\{\}" | grep "\{\}$""
cut -f1 -d: /etc/passwd | xargs -I {} bash -c "echo [a..z] "grep "^\{\}" | grep "\{\}$""
echo {a..z} | xargs -I {} "grep "^\{\}*"| grep "*\{\}$""


#Muestre los nombres de los usuarios del sistema cuyo uid(identificador de sistema) sea distinto del gid(identificador de grupo)
#Muestre una lista que contenga el "nombre de usuario : nombre del grupo"
#Muestre el nombre de grupo y separado por comas los nombres de usuarios
cut -f1,4 -d: /etc/group

#Muestre el nombre de grupo que tiene más usuarios
cut -f1,4 -d: /etc/group | uniq |tr -s ',' ' ' | xargs -I {} bash -c "echo -n {} : ; echo {} | wc -w" | sort -k3 | tail -1 | cut -f1 -d:

#Muestre el usuario que pertenece a más grupos
cut -f4 -d : /etc/group | xargs -I {} bash -c "echo -n {} $'\n'" | tr -s ',' '\n' | sort -k2 | uniq -c | sort -k1 | tail -1

