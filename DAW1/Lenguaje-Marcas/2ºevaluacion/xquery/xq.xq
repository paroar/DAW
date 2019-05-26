"1. Listar el título de todos los libros.",
for $a in doc("bib.xml")/bib/libro
return <libro>{$a/titulo}</libro>,
"-------------------------------",
"2. Listar año y título de todos los libros, ordenados por el año.",
for $a in doc("bib.xml")/bib/libro
order by $a/@anyo
return <libro>{$a/@anyo, $a/titulo}</libro>,
"-------------------------------",
"3. Listar los libros cuyo precio sea 65.95",
for $a in doc("bib.xml")/bib/libro
where $a/precio=65.95
return <libro>{$a/titulo}{$a/precio}</libro>,
"-------------------------------",
"4. Listar los libros publicados antes del año 2000",
for $a in doc("bib.xml")/bib/libro
where $a/@anyo<2000
return <libro>{$a/@anyo}{$a/titulo}</libro>,
"-------------------------------",
"5. Listar año y título de los libros publicados por Addison-Wesley después del año 1992.",
for $a in doc("bib.xml")/bib/libro
where $a/editorial="Addison-Wesley" and $a/@anyo>1992
return <libro>{$a/@anyo}{$a/titulo}</libro>,
"-------------------------------",
"6. Listar año y título de los libros que tienen más de un autor.",
for $a in doc("bib.xml")/bib/libro
where count($a/autor)>1
return <libro>{$a/@anyo}{$a/titulo}</libro>,
"-------------------------------",
"7. Listar año y título de los libros que tienen no tienen autor.",
for $a in doc("bib.xml")/bib/libro
where count($a/autor)<1
return <libro>{$a/@anyo}{$a/titulo}</libro>,
"-------------------------------",
"8. Mostrar los apellidos de los autores que aparecen en el documento, sin repeticiones, ordenados alfabéticamente.",
for $a in distinct-values (doc("bib.xml")//apellido)
return <apellido>{$a}</apellido>,
"-------------------------------",
"9. Por cada libro, listar agrupado en un elemento <result> su titulo y autores",
for $a in doc("bib.xml")//libro
return <result>{$a/titulo}{$a/autor}</result>,
"-------------------------------",
"10. Por cada libro, obtener su título y el número de autores, agrupados en un elemento <libro>",
for $a in doc("bib.xml")//libro
return <result><libro>{$a/titulo}{$a/autor}</libro></result>,
"-------------------------------",
"11. Generar un documento html con un encabezado que diga “Listado de libros” seguido de una tabla de 3 columnas, en la que se muestre el titulo, editorial y precio de cada libro. La tabla deberá tener bordes y la primera fila tendrá un formato especial con los nombres de las columnas. Las columnas de título y editorial irán alineadas a la izquierda, y el precio a la derecha.",
<html>
<body>
  <table>
    <tr>
      <th>Título</th>
      <th>Editorial</th>
      <th>Precio</th>
    </tr>
    {
      for $a in doc("bib.xml")/bib/libro
      return <tr>
              <td align="left">{$a/titulo/data()}</td>
              <td align="left">{$a/editorial/data()}</td>
              <td align="right">{$a/precio/data()}</td>
             </tr>
    }
</table>
</body>
</html>,
"---------------------------------",
"12. Generar el siguiente documento html con la información de los libros del autor Stevens. El valor precio total es un campo calculado utilizando una consulta con una cláusula let.",
<html>
<body>
  <table>
    <tr>
      <th>Título</th>
      <th>Precio</th>
    </tr>
    {
      for $a in doc("bib.xml")/bib/libro
      where $a/autor/apellido="Stevens"
      return <tr>
              <td align="left">{$a/titulo/data()}</td>
              <td align="right">{$a/precio/data()}</td>
             </tr>,
      let $b:=sum(for $a in doc("bib.xml")/bib/libro
      where $a/autor/apellido="Stevens" return $a/precio)
      return <tr>
              <td align="rigth">Precio Total</td>
              <td align="rigth">{$b}</td>
             </tr>       
    }
</table>
</body>
</html>